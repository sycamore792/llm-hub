package org.sycamore.llm.hub.service.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.sycamore.llm.hub.service.dao.BaseDO;

/**
 * @author: Sycamore
 * @date: 2024/4/26 14:36
 * @version: 1.0
 * @description: TODO
 */
@Data
@TableName("api_key_model")
public class ApiKeyModelDO extends BaseDO {
    private Long id;
    private String apiKey ;
    private String modelName;
    private String serviceUrl;
}
