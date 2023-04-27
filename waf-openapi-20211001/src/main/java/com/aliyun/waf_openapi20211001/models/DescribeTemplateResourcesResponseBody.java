// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeTemplateResourcesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array of protected objects or protected object groups that are associated to the protection rule template.</p>
     */
    @NameInMap("Resources")
    public java.util.List<String> resources;

    public static DescribeTemplateResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateResourcesResponseBody self = new DescribeTemplateResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTemplateResourcesResponseBody setResources(java.util.List<String> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<String> getResources() {
        return this.resources;
    }

}
