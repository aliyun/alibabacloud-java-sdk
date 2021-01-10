// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCasComputerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ComputerSequences")
    public java.util.List<String> computerSequences;

    public static CreateCasComputerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCasComputerResponseBody self = new CreateCasComputerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCasComputerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCasComputerResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateCasComputerResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateCasComputerResponseBody setComputerSequences(java.util.List<String> computerSequences) {
        this.computerSequences = computerSequences;
        return this;
    }
    public java.util.List<String> getComputerSequences() {
        return this.computerSequences;
    }

}
