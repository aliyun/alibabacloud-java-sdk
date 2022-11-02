// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeResourcePortResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
