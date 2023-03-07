// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetResourceCenterServiceStatusResponseBody extends TeaModel {
    @NameInMap("InitialStatus")
    public String initialStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceStatus")
    public String serviceStatus;

    public static GetResourceCenterServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceCenterServiceStatusResponseBody self = new GetResourceCenterServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceCenterServiceStatusResponseBody setInitialStatus(String initialStatus) {
        this.initialStatus = initialStatus;
        return this;
    }
    public String getInitialStatus() {
        return this.initialStatus;
    }

    public GetResourceCenterServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceCenterServiceStatusResponseBody setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public String getServiceStatus() {
        return this.serviceStatus;
    }

}
