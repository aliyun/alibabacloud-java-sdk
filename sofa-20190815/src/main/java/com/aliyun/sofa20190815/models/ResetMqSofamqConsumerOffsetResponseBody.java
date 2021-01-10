// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ResetMqSofamqConsumerOffsetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ResetMqSofamqConsumerOffsetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetMqSofamqConsumerOffsetResponseBody self = new ResetMqSofamqConsumerOffsetResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetMqSofamqConsumerOffsetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetMqSofamqConsumerOffsetResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ResetMqSofamqConsumerOffsetResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

}
