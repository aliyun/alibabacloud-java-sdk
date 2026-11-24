// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAccessConfigResponseBody extends TeaModel {
    /**
     * <p>The value of the queried configuration item. For more information, see the <strong>ConfigValue</strong> parameter in <a href="~~ModifyAccessConfig~~">ModifyAccessConfig</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;status&quot;:1,&quot;products&quot;:[&quot;alb&quot;]}</p>
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

    public static DescribeAccessConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessConfigResponseBody self = new DescribeAccessConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccessConfigResponseBody setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

    public DescribeAccessConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
