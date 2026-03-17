// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteSnatEntryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>68CE10C0-2EFF-4B82-9907-10AB7E2B0A6C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSnatEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnatEntryResponseBody self = new DeleteSnatEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSnatEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
