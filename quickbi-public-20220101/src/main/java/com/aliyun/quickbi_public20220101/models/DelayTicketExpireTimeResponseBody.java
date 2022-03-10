// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DelayTicketExpireTimeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    @NameInMap("Success")
    public Boolean success;

    public static DelayTicketExpireTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DelayTicketExpireTimeResponseBody self = new DelayTicketExpireTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public DelayTicketExpireTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DelayTicketExpireTimeResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public DelayTicketExpireTimeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
