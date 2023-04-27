// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeResourcePortResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array of HTTP and HTTPS listener ports that are added to the WAF instance.</p>
     */
    @NameInMap("ResourcePorts")
    public java.util.List<String> resourcePorts;

    public static DescribeResourcePortResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcePortResponseBody self = new DescribeResourcePortResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourcePortResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourcePortResponseBody setResourcePorts(java.util.List<String> resourcePorts) {
        this.resourcePorts = resourcePorts;
        return this;
    }
    public java.util.List<String> getResourcePorts() {
        return this.resourcePorts;
    }

}
