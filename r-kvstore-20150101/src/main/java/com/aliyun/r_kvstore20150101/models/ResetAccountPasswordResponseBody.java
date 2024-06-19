// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ResetAccountPasswordResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8BE02313-5395-4EBE-BAE7-E90A053F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResetAccountPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetAccountPasswordResponseBody self = new ResetAccountPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetAccountPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
