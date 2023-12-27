// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20210112.models;

import com.aliyun.tea.*;

public class SendFeedbackResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SendFeedbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendFeedbackResponseBody self = new SendFeedbackResponseBody();
        return TeaModel.build(map, self);
    }

    public SendFeedbackResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SendFeedbackResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendFeedbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
