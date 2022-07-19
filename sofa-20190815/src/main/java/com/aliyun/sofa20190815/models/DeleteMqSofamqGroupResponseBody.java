// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMqSofamqGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static DeleteMqSofamqGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMqSofamqGroupResponseBody self = new DeleteMqSofamqGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMqSofamqGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMqSofamqGroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteMqSofamqGroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

}
