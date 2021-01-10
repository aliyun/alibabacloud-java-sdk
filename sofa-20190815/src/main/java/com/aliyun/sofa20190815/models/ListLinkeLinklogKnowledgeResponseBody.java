// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinklogKnowledgeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("ResponseContentRange")
    public String responseContentRange;

    @NameInMap("ResponseContentType")
    public String responseContentType;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public ListLinkeLinklogKnowledgeResponseBodyResult result;

    public static ListLinkeLinklogKnowledgeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinklogKnowledgeResponseBody self = new ListLinkeLinklogKnowledgeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinklogKnowledgeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkeLinklogKnowledgeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkeLinklogKnowledgeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkeLinklogKnowledgeResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListLinkeLinklogKnowledgeResponseBody setResponseContentRange(String responseContentRange) {
        this.responseContentRange = responseContentRange;
        return this;
    }
    public String getResponseContentRange() {
        return this.responseContentRange;
    }

    public ListLinkeLinklogKnowledgeResponseBody setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public ListLinkeLinklogKnowledgeResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ListLinkeLinklogKnowledgeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLinkeLinklogKnowledgeResponseBody setResult(ListLinkeLinklogKnowledgeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListLinkeLinklogKnowledgeResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListLinkeLinklogKnowledgeResponseBodyResult extends TeaModel {
        @NameInMap("Pagination")
        public String pagination;

        @NameInMap("List")
        public java.util.List<String> list;

        public static ListLinkeLinklogKnowledgeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeLinklogKnowledgeResponseBodyResult self = new ListLinkeLinklogKnowledgeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListLinkeLinklogKnowledgeResponseBodyResult setPagination(String pagination) {
            this.pagination = pagination;
            return this;
        }
        public String getPagination() {
            return this.pagination;
        }

        public ListLinkeLinklogKnowledgeResponseBodyResult setList(java.util.List<String> list) {
            this.list = list;
            return this;
        }
        public java.util.List<String> getList() {
            return this.list;
        }

    }

}
