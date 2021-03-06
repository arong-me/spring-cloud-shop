package quick.pager.shop.user.service;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quick.pager.shop.dto.BaseDTO;
import quick.pager.shop.response.Response;
import quick.pager.shop.service.IService;
import quick.pager.shop.user.mapper.AddressMapper;
import quick.pager.shop.user.model.Address;

/**
 * 地址管理服务
 *
 * @author siguiyang
 */
@Service
@Slf4j
public class UserAddressService implements IService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public Response doService(BaseDTO dto) {
//        AddressDTO addressDTO = (AddressDTO) dto;
//
//        Response response = null;
//        switch (addressDTO.getEvent()) {
//            case Constants.Event.LIST:
//                response = getList(addressDTO.getUserId());
//                break;
//            case Constants.Event.INFO:
//                response = new Response<>(addressMapper.selectByPrimaryKey(dto.getId()));
//                break;
//            case Constants.Event.MODIFY:
//                response = modify(addressDTO);
//                break;
//        }
//        return response;
        return null;
    }

    private Response<List<Address>> getList(Long userId) {
        List<Address> address = addressMapper.selectAddressByUserId(userId);
        return new Response<>(address);

    }

//    private Response modify(AddressDTO addressDTO) {
//        // 新增一个地址
//        if (null == addressDTO.getId() || 0 == addressDTO.getId()) {
//            log.info("用户新增地址 userId = {}", addressDTO.getUserId());
//            Address address = new Address();
//            address.setArea(address.getArea());
//            address.setDefaultAddress(addressDTO.getDefaultAddress());
//            address.setDetailAddress(addressDTO.getDetailAddress());
//            address.setLabel(addressDTO.getLabel());
//            address.setPhone(addressDTO.getPhone());
//            address.setUserId(addressDTO.getUserId());
//            address.setUsername(addressDTO.getUsername());
//            address.setCreateTime(DateUtils.dateTime());
//            addressMapper.insertSelective(address);
//            return new Response();
//        }
//
//        Address address = addressMapper.selectByPrimaryKey(addressDTO.getId());
//        // 未找到要修改的地址
//        if (ObjectUtils.isEmpty(address)) {
//            log.info("客户端入参异常，未知地址 userId = {}", addressDTO.getUserId());
//            return new Response<>(ResponseStatus.Code.FAIL_CODE, ResponseStatus.PARAMS_EXCEPTION);
//        }
//
//        // 修改地址
//        ShippingAddress updateAddress = new ShippingAddress();
//        updateAddress.setArea(address.getArea());
//        updateAddress.setDefaultAddress(addressDTO.getDefaultAddress());
//        updateAddress.setDetailAddress(addressDTO.getDetailAddress());
//        updateAddress.setLabel(addressDTO.getLabel());
//        updateAddress.setPhone(addressDTO.getPhone());
//        updateAddress.setUserId(addressDTO.getUserId());
//        updateAddress.setUsername(addressDTO.getUsername());
//        updateAddress.setId(address.getId());
//
//        addressMapper.updateByPrimaryKeySelective(address);
//
//        return new Response();
//    }
}
