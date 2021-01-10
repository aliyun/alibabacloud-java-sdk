// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutCeasingaoneblocknetresultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public GetLinkeBahamutCeasingaoneblocknetresultResponseBodyResult result;

    public static GetLinkeBahamutCeasingaoneblocknetresultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutCeasingaoneblocknetresultResponseBody self = new GetLinkeBahamutCeasingaoneblocknetresultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutCeasingaoneblocknetresultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutCeasingaoneblocknetresultResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutCeasingaoneblocknetresultResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutCeasingaoneblocknetresultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutCeasingaoneblocknetresultResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutCeasingaoneblocknetresultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutCeasingaoneblocknetresultResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutCeasingaoneblocknetresultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutCeasingaoneblocknetresultResponseBody setResult(GetLinkeBahamutCeasingaoneblocknetresultResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutCeasingaoneblocknetresultResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutCeasingaoneblocknetresultResponseBodyResult extends TeaModel {
        @NameInMap("Approved")
        public Boolean approved;

        @NameInMap("BlockList")
        public java.util.List<String> blockList;

        public static GetLinkeBahamutCeasingaoneblocknetresultResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutCeasingaoneblocknetresultResponseBodyResult self = new GetLinkeBahamutCeasingaoneblocknetresultResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutCeasingaoneblocknetresultResponseBodyResult setApproved(Boolean approved) {
            this.approved = approved;
            return this;
        }
        public Boolean getApproved() {
            return this.approved;
        }

        public GetLinkeBahamutCeasingaoneblocknetresultResponseBodyResult setBlockList(java.util.List<String> blockList) {
            this.blockList = blockList;
            return this;
        }
        public java.util.List<String> getBlockList() {
            return this.blockList;
        }

    }

}
