// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinklogNothitlogsResponseBody extends TeaModel {
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
    public ExecLinkeLinklogNothitlogsResponseBodyResult result;

    public static ExecLinkeLinklogNothitlogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinklogNothitlogsResponseBody self = new ExecLinkeLinklogNothitlogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinklogNothitlogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecLinkeLinklogNothitlogsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ExecLinkeLinklogNothitlogsResponseBody setResponseContentRange(String responseContentRange) {
        this.responseContentRange = responseContentRange;
        return this;
    }
    public String getResponseContentRange() {
        return this.responseContentRange;
    }

    public ExecLinkeLinklogNothitlogsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ExecLinkeLinklogNothitlogsResponseBody setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public ExecLinkeLinklogNothitlogsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecLinkeLinklogNothitlogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExecLinkeLinklogNothitlogsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecLinkeLinklogNothitlogsResponseBody setResult(ExecLinkeLinklogNothitlogsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ExecLinkeLinklogNothitlogsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ExecLinkeLinklogNothitlogsResponseBodyResult extends TeaModel {
        @NameInMap("Pagination")
        public String pagination;

        @NameInMap("List")
        public java.util.List<String> list;

        public static ExecLinkeLinklogNothitlogsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeLinklogNothitlogsResponseBodyResult self = new ExecLinkeLinklogNothitlogsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ExecLinkeLinklogNothitlogsResponseBodyResult setPagination(String pagination) {
            this.pagination = pagination;
            return this;
        }
        public String getPagination() {
            return this.pagination;
        }

        public ExecLinkeLinklogNothitlogsResponseBodyResult setList(java.util.List<String> list) {
            this.list = list;
            return this;
        }
        public java.util.List<String> getList() {
            return this.list;
        }

    }

}
