// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutTaskResponseBody extends TeaModel {
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
    public java.util.List<ListLinkeBahamutTaskResponseBodyResult> result;

    @NameInMap("Paginator")
    public ListLinkeBahamutTaskResponseBodyPaginator paginator;

    public static ListLinkeBahamutTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutTaskResponseBody self = new ListLinkeBahamutTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkeBahamutTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkeBahamutTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkeBahamutTaskResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLinkeBahamutTaskResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public ListLinkeBahamutTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLinkeBahamutTaskResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ListLinkeBahamutTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLinkeBahamutTaskResponseBody setResult(java.util.List<ListLinkeBahamutTaskResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListLinkeBahamutTaskResponseBodyResult> getResult() {
        return this.result;
    }

    public ListLinkeBahamutTaskResponseBody setPaginator(ListLinkeBahamutTaskResponseBodyPaginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public ListLinkeBahamutTaskResponseBodyPaginator getPaginator() {
        return this.paginator;
    }

    public static class ListLinkeBahamutTaskResponseBodyResult extends TeaModel {
        @NameInMap("AssignedTo")
        public String assignedTo;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Id")
        public String id;

        @NameInMap("StatusName")
        public String statusName;

        @NameInMap("Title")
        public String title;

        @NameInMap("Url")
        public String url;

        public static ListLinkeBahamutTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutTaskResponseBodyResult self = new ListLinkeBahamutTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutTaskResponseBodyResult setAssignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public String getAssignedTo() {
            return this.assignedTo;
        }

        public ListLinkeBahamutTaskResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListLinkeBahamutTaskResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListLinkeBahamutTaskResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLinkeBahamutTaskResponseBodyResult setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public ListLinkeBahamutTaskResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListLinkeBahamutTaskResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListLinkeBahamutTaskResponseBodyPaginator extends TeaModel {
        @NameInMap("ItemCount")
        public Long itemCount;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("PageSize")
        public Long pageSize;

        public static ListLinkeBahamutTaskResponseBodyPaginator build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutTaskResponseBodyPaginator self = new ListLinkeBahamutTaskResponseBodyPaginator();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutTaskResponseBodyPaginator setItemCount(Long itemCount) {
            this.itemCount = itemCount;
            return this;
        }
        public Long getItemCount() {
            return this.itemCount;
        }

        public ListLinkeBahamutTaskResponseBodyPaginator setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public ListLinkeBahamutTaskResponseBodyPaginator setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public ListLinkeBahamutTaskResponseBodyPaginator setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

}
