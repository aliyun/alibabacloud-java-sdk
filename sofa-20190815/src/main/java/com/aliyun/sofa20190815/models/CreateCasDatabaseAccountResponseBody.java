// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCasDatabaseAccountResponseBody extends TeaModel {
    @NameInMap("AccountSequence")
    public String accountSequence;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateCasDatabaseAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCasDatabaseAccountResponseBody self = new CreateCasDatabaseAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCasDatabaseAccountResponseBody setAccountSequence(String accountSequence) {
        this.accountSequence = accountSequence;
        return this;
    }
    public String getAccountSequence() {
        return this.accountSequence;
    }

    public CreateCasDatabaseAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCasDatabaseAccountResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateCasDatabaseAccountResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
