package com.dxctraining.suppliermgt.supplier.util;

import org.springframework.stereotype.Component;

import com.dxctraining.suppliermgt.supplier.dto.SupplierDto;
import com.dxctraining.suppliermgt.supplier.entities.Supplier;



@Component
public class SupplierUtil {

	public SupplierDto supplierDto(Supplier supplier) {
		SupplierDto dto = new SupplierDto(supplier.getId(), supplier.getName(), supplier.getPassword());
		return dto;
	}
}