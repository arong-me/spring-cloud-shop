package quick.pager.shop.activity.service;

import java.util.List;
import quick.pager.shop.activity.model.DiscountCoupon;
import quick.pager.shop.activity.param.coupon.DiscountCouponPageParam;
import quick.pager.shop.activity.request.coupon.DiscountCouponPageRequest;
import quick.pager.shop.activity.response.coupon.DiscountCouponResponse;
import quick.pager.shop.response.Response;
import quick.pager.shop.service.IPageService;

/**
 * 优惠券服务
 *
 * @author siguiyang
 * @version 3.0
 */
public interface DiscountCouponService extends IPageService<DiscountCoupon> {

    /**
     * 优惠券列表
     */
    Response<List<DiscountCouponResponse>> queryPage(DiscountCouponPageRequest request);

    /**
     * 获取一张优惠券详情
     */
    Response<DiscountCouponResponse> info(Long id);

    /**
     * 发送优惠券
     *
     * @param file       远程文件地址
     * @param templateId 优惠券模版主键
     */
    Response publish(String file, Long templateId);

}
