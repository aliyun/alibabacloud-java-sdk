// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyApplicationEndpointAddressResponseBody extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The endpoint ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>155462B9-205F-4FFC-BB43-4855FE******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyApplicationEndpointAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationEndpointAddressResponseBody self = new ModifyApplicationEndpointAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationEndpointAddressResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ModifyApplicationEndpointAddressResponseBody setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public ModifyApplicationEndpointAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
