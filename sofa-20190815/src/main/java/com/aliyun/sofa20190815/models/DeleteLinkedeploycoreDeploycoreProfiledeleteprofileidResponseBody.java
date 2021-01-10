// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkedeploycoreDeploycoreProfiledeleteprofileidResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Data")
    public Boolean data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DeleteLinkedeploycoreDeploycoreProfiledeleteprofileidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkedeploycoreDeploycoreProfiledeleteprofileidResponseBody self = new DeleteLinkedeploycoreDeploycoreProfiledeleteprofileidResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLinkedeploycoreDeploycoreProfiledeleteprofileidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteLinkedeploycoreDeploycoreProfiledeleteprofileidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteLinkedeploycoreDeploycoreProfiledeleteprofileidResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public DeleteLinkedeploycoreDeploycoreProfiledeleteprofileidResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteLinkedeploycoreDeploycoreProfiledeleteprofileidResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteLinkedeploycoreDeploycoreProfiledeleteprofileidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteLinkedeploycoreDeploycoreProfiledeleteprofileidResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
