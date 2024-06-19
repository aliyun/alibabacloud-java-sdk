// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DeleteAccountResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8129F11A-D70B-43A6-9455-CE9EAA71****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccountResponseBody self = new DeleteAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
