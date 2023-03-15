// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class SendTTSVerifyLinkResult extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public Boolean result;

    public static SendTTSVerifyLinkResult build(java.util.Map<String, ?> map) throws Exception {
        SendTTSVerifyLinkResult self = new SendTTSVerifyLinkResult();
        return TeaModel.build(map, self);
    }

    public SendTTSVerifyLinkResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendTTSVerifyLinkResult setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
