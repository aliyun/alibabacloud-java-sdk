// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetMultiAccountResourceCenterServiceStatusResponseBody extends TeaModel {
    /**
     * <p>The initialization status of the feature. Valid values:</p>
     * <ul>
     * <li>Pending: The feature is being initialized.</li>
     * <li>Finished: The feature is initialized.</li>
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
     * <p>81671397-1425-51F1-A144-4799E01BEBFF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the feature. Valid values:</p>
     * <ul>
     * <li>Enabled: The feature is enabled.</li>
     * <li>Disabled: The feature is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
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
