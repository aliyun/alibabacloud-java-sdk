// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetResourceCenterServiceStatusResponseBody extends TeaModel {
    /**
     * <p>The initialization status of the service. Valid values:</p>
     * <ul>
     * <li>Pending: The service is being initialized.</li>
     * <li>Finished: The service is initialized.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Pending</p>
     */
    @NameInMap("InitialStatus")
    public String initialStatus;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AD5F848D-CCDC-5464-93E1-4BA50A4826DD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the service. Valid values:</p>
     * <ul>
     * <li>Enabled: The service is activated.</li>
     * <li>Disabled: The service is deactivated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
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
