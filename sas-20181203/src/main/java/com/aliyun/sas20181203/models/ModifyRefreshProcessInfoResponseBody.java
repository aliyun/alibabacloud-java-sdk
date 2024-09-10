// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyRefreshProcessInfoResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>814FCBBC-3A02-5555-8D05-F8D9FD62A295</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRefreshProcessInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRefreshProcessInfoResponseBody self = new ModifyRefreshProcessInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRefreshProcessInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
