// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetResourceCenterServiceStatusResponseBody extends TeaModel {
    /**
     * <p>The initialization status. Valid values:</p>
     * <ul>
     * <li><p>Pending</p>
     * </li>
     * <li><p>Finished</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Pending</p>
     */
    @NameInMap("InitialStatus")
    public String initialStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AD5F848D-CCDC-5464-93E1-4BA50A4826DD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The service status. Valid values:</p>
     * <ul>
     * <li><p>Enabled</p>
     * </li>
     * <li><p>Disabled</p>
     * </li>
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
