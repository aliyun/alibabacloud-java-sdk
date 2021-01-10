// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutListprojectsprojectsauthorizedResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyResult> result;

    @NameInMap("Paginator")
    public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyPaginator paginator;

    public static QueryLinkeBahamutListprojectsprojectsauthorizedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutListprojectsprojectsauthorizedResponseBody self = new QueryLinkeBahamutListprojectsprojectsauthorizedResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBody setResult(java.util.List<QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyResult> getResult() {
        return this.result;
    }

    public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBody setPaginator(QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyPaginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyPaginator getPaginator() {
        return this.paginator;
    }

    public static class QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyResult extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Encoding")
        public String encoding;

        @NameInMap("HttpUrlToRepo")
        public String httpUrlToRepo;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("PublicStatus")
        public Boolean publicStatus;

        @NameInMap("SshUrlToRepo")
        public String sshUrlToRepo;

        @NameInMap("Visibility")
        public String visibility;

        @NameInMap("VisibilityLevel")
        public Long visibilityLevel;

        @NameInMap("WebUrl")
        public String webUrl;

        public static QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyResult self = new QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyResult setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyResult setHttpUrlToRepo(String httpUrlToRepo) {
            this.httpUrlToRepo = httpUrlToRepo;
            return this;
        }
        public String getHttpUrlToRepo() {
            return this.httpUrlToRepo;
        }

        public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyResult setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyResult setPublicStatus(Boolean publicStatus) {
            this.publicStatus = publicStatus;
            return this;
        }
        public Boolean getPublicStatus() {
            return this.publicStatus;
        }

        public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyResult setSshUrlToRepo(String sshUrlToRepo) {
            this.sshUrlToRepo = sshUrlToRepo;
            return this;
        }
        public String getSshUrlToRepo() {
            return this.sshUrlToRepo;
        }

        public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyResult setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

        public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyResult setVisibilityLevel(Long visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Long getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyResult setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

    public static class QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyPaginator extends TeaModel {
        @NameInMap("ItemCount")
        public Long itemCount;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("PageSize")
        public Long pageSize;

        public static QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyPaginator build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyPaginator self = new QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyPaginator();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyPaginator setItemCount(Long itemCount) {
            this.itemCount = itemCount;
            return this;
        }
        public Long getItemCount() {
            return this.itemCount;
        }

        public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyPaginator setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyPaginator setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public QueryLinkeBahamutListprojectsprojectsauthorizedResponseBodyPaginator setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

}
