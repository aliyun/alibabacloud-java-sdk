// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktRelatableworkitemsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorCode")
    public Long errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public GetLinkeLinktRelatableworkitemsResponseBodyData data;

    public static GetLinkeLinktRelatableworkitemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktRelatableworkitemsResponseBody self = new GetLinkeLinktRelatableworkitemsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktRelatableworkitemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeLinktRelatableworkitemsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeLinktRelatableworkitemsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeLinktRelatableworkitemsResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public GetLinkeLinktRelatableworkitemsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeLinktRelatableworkitemsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeLinktRelatableworkitemsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeLinktRelatableworkitemsResponseBody setData(GetLinkeLinktRelatableworkitemsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLinkeLinktRelatableworkitemsResponseBodyData getData() {
        return this.data;
    }

    public static class GetLinkeLinktRelatableworkitemsResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("PageTotal")
        public Long pageTotal;

        @NameInMap("Total")
        public Long total;

        @NameInMap("Items")
        public java.util.List<String> items;

        public static GetLinkeLinktRelatableworkitemsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeLinktRelatableworkitemsResponseBodyData self = new GetLinkeLinktRelatableworkitemsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLinkeLinktRelatableworkitemsResponseBodyData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public GetLinkeLinktRelatableworkitemsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetLinkeLinktRelatableworkitemsResponseBodyData setPageTotal(Long pageTotal) {
            this.pageTotal = pageTotal;
            return this;
        }
        public Long getPageTotal() {
            return this.pageTotal;
        }

        public GetLinkeLinktRelatableworkitemsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public GetLinkeLinktRelatableworkitemsResponseBodyData setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

}
