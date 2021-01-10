// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsDrmDrmResourceTplResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Result")
    public Long result;

    public static UpdateMsDrmDrmResourceTplResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsDrmDrmResourceTplResponseBody self = new UpdateMsDrmDrmResourceTplResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMsDrmDrmResourceTplResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMsDrmDrmResourceTplResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateMsDrmDrmResourceTplResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateMsDrmDrmResourceTplResponseBody setResult(Long result) {
        this.result = result;
        return this;
    }
    public Long getResult() {
        return this.result;
    }

}
