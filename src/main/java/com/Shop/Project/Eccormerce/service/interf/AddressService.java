package com.Shop.Project.Eccormerce.service.interf;

import com.Shop.Project.Eccormerce.dto.AddressDto;
import com.Shop.Project.Eccormerce.dto.Response;

public interface AddressService {
    Response saveAndUpdateAddress(AddressDto addressDto);
}
