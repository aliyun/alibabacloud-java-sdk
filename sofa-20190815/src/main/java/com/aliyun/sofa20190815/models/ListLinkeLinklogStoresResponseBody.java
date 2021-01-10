// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinklogStoresResponseBody extends TeaModel {
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
    public ListLinkeLinklogStoresResponseBodyResult result;

    public static ListLinkeLinklogStoresResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinklogStoresResponseBody self = new ListLinkeLinklogStoresResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinklogStoresResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkeLinklogStoresResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkeLinklogStoresResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkeLinklogStoresResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListLinkeLinklogStoresResponseBody setResponseContentRange(String responseContentRange) {
        this.responseContentRange = responseContentRange;
        return this;
    }
    public String getResponseContentRange() {
        return this.responseContentRange;
    }

    public ListLinkeLinklogStoresResponseBody setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public ListLinkeLinklogStoresResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ListLinkeLinklogStoresResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLinkeLinklogStoresResponseBody setResult(ListLinkeLinklogStoresResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListLinkeLinklogStoresResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListLinkeLinklogStoresResponseBodyResult extends TeaModel {
        @NameInMap("Pagination")
        public String pagination;

        @NameInMap("List")
        public java.util.List<String> list;

        public static ListLinkeLinklogStoresResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeLinklogStoresResponseBodyResult self = new ListLinkeLinklogStoresResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListLinkeLinklogStoresResponseBodyResult setPagination(String pagination) {
            this.pagination = pagination;
            return this;
        }
        public String getPagination() {
            return this.pagination;
        }

        public ListLinkeLinklogStoresResponseBodyResult setList(java.util.List<String> list) {
            this.list = list;
            return this;
        }
        public java.util.List<String> getList() {
            return this.list;
        }

    }

}
