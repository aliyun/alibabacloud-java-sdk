// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateASMGatewayImportedServicesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateASMGatewayImportedServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateASMGatewayImportedServicesResponseBody self = new UpdateASMGatewayImportedServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateASMGatewayImportedServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
