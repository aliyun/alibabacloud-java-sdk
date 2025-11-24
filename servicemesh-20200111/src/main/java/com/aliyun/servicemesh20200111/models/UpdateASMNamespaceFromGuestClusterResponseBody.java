// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateASMNamespaceFromGuestClusterResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9DEC6122-ACEC-183D-8451-8E0A1A******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateASMNamespaceFromGuestClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateASMNamespaceFromGuestClusterResponseBody self = new UpdateASMNamespaceFromGuestClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateASMNamespaceFromGuestClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
