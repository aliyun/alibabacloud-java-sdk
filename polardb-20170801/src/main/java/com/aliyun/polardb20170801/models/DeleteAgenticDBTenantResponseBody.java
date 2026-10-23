// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAgenticDBTenantResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>01A13E8C-3773-1A76-BA95-96EA81D260DC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAgenticDBTenantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgenticDBTenantResponseBody self = new DeleteAgenticDBTenantResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAgenticDBTenantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
