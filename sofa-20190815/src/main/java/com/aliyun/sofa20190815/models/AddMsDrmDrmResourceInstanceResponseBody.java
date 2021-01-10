// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsDrmDrmResourceInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public Long result;

    public static AddMsDrmDrmResourceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMsDrmDrmResourceInstanceResponseBody self = new AddMsDrmDrmResourceInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMsDrmDrmResourceInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMsDrmDrmResourceInstanceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddMsDrmDrmResourceInstanceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddMsDrmDrmResourceInstanceResponseBody setResult(Long result) {
        this.result = result;
        return this;
    }
    public Long getResult() {
        return this.result;
    }

}
