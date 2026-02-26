// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetMultiAccountResourceCenterServiceStatusResponseBody extends TeaModel {
    @NameInMap("InitialStatus")
    public String initialStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceStatus")
    public String serviceStatus;

    public static GetMultiAccountResourceCenterServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMultiAccountResourceCenterServiceStatusResponseBody self = new GetMultiAccountResourceCenterServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMultiAccountResourceCenterServiceStatusResponseBody setInitialStatus(String initialStatus) {
        this.initialStatus = initialStatus;
        return this;
    }
    public String getInitialStatus() {
        return this.initialStatus;
    }

    public GetMultiAccountResourceCenterServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMultiAccountResourceCenterServiceStatusResponseBody setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public String getServiceStatus() {
        return this.serviceStatus;
    }

}
