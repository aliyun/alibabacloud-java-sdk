// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseSceneConfigResponseBody extends TeaModel {
    /**
     * <p>The value of the configuration item. For more information, see the <strong>ConfigValue</strong> parameter in <a href="https://help.aliyun.com/document_detail/2968435.html">ModifyDefenseSceneConfig</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ConfigValue")
    public String configValue;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDefenseSceneConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseSceneConfigResponseBody self = new DescribeDefenseSceneConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseSceneConfigResponseBody setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

    public DescribeDefenseSceneConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
