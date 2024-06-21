// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateEstimateCostResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6DEA36EF-C97D-5658-A4AC-4F5DB08D1A89</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource details.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;LogicalResourceIdPattern\&quot;: \&quot;wait1\&quot;, \&quot;ResourceType\&quot;: \&quot;time_sleep\&quot;, \&quot;ResourcePath\&quot;: \&quot;wait1\&quot;}, {\&quot;LogicalResourceIdPattern\&quot;: \&quot;wait2\&quot;, \&quot;ResourceType\&quot;: \&quot;time_sleep\&quot;, \&quot;ResourcePath\&quot;: \&quot;wait2\&quot;}]</p>
     */
    @NameInMap("Resources")
    public java.util.Map<String, ?> resources;

    public static GetTemplateEstimateCostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateEstimateCostResponseBody self = new GetTemplateEstimateCostResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateEstimateCostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateEstimateCostResponseBody setResources(java.util.Map<String, ?> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.Map<String, ?> getResources() {
        return this.resources;
    }

}
