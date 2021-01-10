// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinklogTagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("ResponseContentRange")
    public String responseContentRange;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("ResponseContentType")
    public String responseContentType;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public String result;

    public static DeleteLinkeLinklogTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinklogTagResponseBody self = new DeleteLinkeLinklogTagResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinklogTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteLinkeLinklogTagResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public DeleteLinkeLinklogTagResponseBody setResponseContentRange(String responseContentRange) {
        this.responseContentRange = responseContentRange;
        return this;
    }
    public String getResponseContentRange() {
        return this.responseContentRange;
    }

    public DeleteLinkeLinklogTagResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public DeleteLinkeLinklogTagResponseBody setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public DeleteLinkeLinklogTagResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteLinkeLinklogTagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteLinkeLinklogTagResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteLinkeLinklogTagResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
