// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class MoveAccountResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MoveAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveAccountResponseBody self = new MoveAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
