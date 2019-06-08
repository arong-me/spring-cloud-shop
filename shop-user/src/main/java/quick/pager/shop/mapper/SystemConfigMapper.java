package quick.pager.shop.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import quick.pager.shop.model.SystemConfig;

import java.util.List;

@Mapper
public interface SystemConfigMapper {

    /**
     * 查询指定模块的可用所有配置
     *
     * @param module 模块
     */
    List<SystemConfig> selectByModule(@Param("module") String module);

    /**
     * 根据模块与配置项名称查询配置
     *
     * @param module     模块
     * @param configName 配置项
     */
    SystemConfig selectByConfigName(@Param("module") String module, @Param("configName") String configName);
}
