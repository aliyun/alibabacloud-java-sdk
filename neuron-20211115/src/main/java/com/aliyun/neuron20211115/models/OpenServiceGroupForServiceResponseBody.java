// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class OpenServiceGroupForServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("serviceIds")
    public java.util.List<Long> serviceIds;

    public static OpenServiceGroupForServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenServiceGroupForServiceResponseBody self = new OpenServiceGroupForServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenServiceGroupForServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpenServiceGroupForServiceResponseBody setServiceIds(java.util.List<Long> serviceIds) {
        this.serviceIds = serviceIds;
        return this;
    }
    public java.util.List<Long> getServiceIds() {
        return this.serviceIds;
    }

}
