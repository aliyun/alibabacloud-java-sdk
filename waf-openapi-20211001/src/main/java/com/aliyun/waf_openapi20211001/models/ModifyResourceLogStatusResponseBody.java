// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyResourceLogStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the log collection feature is enabled for the protected object. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Status")
    public Boolean status;

    public static ModifyResourceLogStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourceLogStatusResponseBody self = new ModifyResourceLogStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyResourceLogStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyResourceLogStatusResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
