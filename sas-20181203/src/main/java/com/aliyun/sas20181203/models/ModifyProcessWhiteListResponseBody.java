// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyProcessWhiteListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>11C96623-E106-59C9-866D-A6C82911****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyProcessWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyProcessWhiteListResponseBody self = new ModifyProcessWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyProcessWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
