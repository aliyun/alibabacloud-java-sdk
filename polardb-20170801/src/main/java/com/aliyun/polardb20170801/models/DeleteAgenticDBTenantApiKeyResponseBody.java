// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAgenticDBTenantApiKeyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E5F6A7B8-C9D0-1234-EFAB-345678901234</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAgenticDBTenantApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgenticDBTenantApiKeyResponseBody self = new DeleteAgenticDBTenantApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAgenticDBTenantApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
