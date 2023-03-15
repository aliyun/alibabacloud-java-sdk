// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateEstimateCostResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details of the resource.</p>
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
