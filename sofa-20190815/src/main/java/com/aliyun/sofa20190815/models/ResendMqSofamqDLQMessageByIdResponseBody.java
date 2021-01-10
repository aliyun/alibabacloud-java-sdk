// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ResendMqSofamqDLQMessageByIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ResendMqSofamqDLQMessageByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResendMqSofamqDLQMessageByIdResponseBody self = new ResendMqSofamqDLQMessageByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ResendMqSofamqDLQMessageByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResendMqSofamqDLQMessageByIdResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ResendMqSofamqDLQMessageByIdResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

}
