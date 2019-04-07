package com.capgemini.capstore.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.capstore.beans.MerchantFeedback;
import com.capgemini.capstore.beans.Product;
import com.capgemini.capstore.beans.ProductFeedback;
import com.capgemini.capstore.dao.CapStoreProductFeedback;
import com.capgemini.capstore.dao.ICapStoreCustomerDAO;
import com.capgemini.capstore.dao.ICapStoreMerchantFeedbackDAO;
import com.capgemini.capstore.dao.ICapStoreProductDAO;



@Transactional
@Service
public class CapstoreService {

	@Autowired
	private CapStoreProductFeedback capStoreFeedback;

	@Autowired
	private ICapStoreProductDAO capStoreProduct;

	@Autowired
	private ICapStoreCustomerDAO capStoreCustomer;
	
	@Autowired
	private ICapStoreMerchantFeedbackDAO merchantFeedback;
	
	

	public MerchantFeedback setMerchantFeedback(MerchantFeedback feedback) {
	
		//entityManager.persist(feedback);
		merchantFeedback.save(feedback);

		return feedback;

	}

	
	public List<MerchantFeedback> getFinalMerchantFeedback()
	{
		List<MerchantFeedback> feedback = new ArrayList<MerchantFeedback>();
		feedback = merchantFeedback.findByStatus("R");
		//merchantFeedback.saveAll(feedback);
		return feedback;
	}

	public ProductFeedback setFeedback(ProductFeedback productFeedback) {

		// entityManager.persist(feedback);
		capStoreFeedback.save(productFeedback);

		return productFeedback;

	}

	public List<ProductFeedback> getAll(int product_Id) {

		// List<ProductFeedback> product_feedback = new ArrayList<ProductFeedback>();

		List<ProductFeedback> product_feedback = capStoreFeedback.findByProduct(capStoreProduct.findById(product_Id).get());
		//List<ProductFeedback> prod = capStoreFeedback.findAll();
		return product_feedback;
	}

	public List<ProductFeedback> getProductFeedBack( int customerId) {
		List<ProductFeedback> productFeedBack;

		productFeedBack = capStoreFeedback.findByCustomer(capStoreCustomer.findById(customerId).get());
		
		return productFeedBack;
	}
	
	public ProductFeedback updateFeedback(int feedback_Id, ProductFeedback productFeedBack)
	{

		ProductFeedback productFeedBack_update;
		
		productFeedBack_update = capStoreFeedback.findById(feedback_Id);
		productFeedBack.setId(productFeedBack_update.getId());
		capStoreFeedback.save(productFeedBack);
		return productFeedBack;
	}
	
	
	
	
	
	public List<Product> getProductByBrandName(String productBrand)
	{
		return capStoreProduct.findByProductBrand(productBrand);
	}
	public List<Product> getProductByCategory(String category)
	{
		return capStoreProduct.findByProductCategory(category);
	}
	public List<Product> getProductByName(String productName)
	{
		return capStoreProduct.findByProductName(productName);
	}
	
	
	
	
	
	
}
