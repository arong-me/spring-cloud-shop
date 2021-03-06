package quick.pager.shop.risk.fallback;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import quick.pager.shop.risk.client.RiskClient;
import quick.pager.shop.constants.ResponseStatus;
import quick.pager.shop.response.Response;
import quick.pager.shop.risk.request.BlackListPageRequest;
import quick.pager.shop.risk.request.BlackListSaveRequest;

/**
 * 风控服务熔断
 *
 * @author siguiyang
 */
@Component
public class RiskClientFallbackFactory implements FallbackFactory<RiskClient> {
    @Override
    public RiskClient create(Throwable cause) {
        return new RiskClient() {
            @Override
            public Response getBlackLists(BlackListPageRequest request) {
                return new Response<>(ResponseStatus.Code.EXCEPTION_CODE, ResponseStatus.TELNET_EXCEPTION);
            }

            @Override
            public Response addBlackLists(BlackListSaveRequest request) {
                return new Response<>(ResponseStatus.Code.EXCEPTION_CODE, ResponseStatus.TELNET_EXCEPTION);
            }

            @Override
            public Response modifyBlackLists(BlackListSaveRequest request) {
                return new Response<>(ResponseStatus.Code.EXCEPTION_CODE, ResponseStatus.TELNET_EXCEPTION);
            }

            @Override
            public Response delBlackLists(Long id) {
                return new Response<>(ResponseStatus.Code.EXCEPTION_CODE, ResponseStatus.TELNET_EXCEPTION);
            }
        };
    }
}
