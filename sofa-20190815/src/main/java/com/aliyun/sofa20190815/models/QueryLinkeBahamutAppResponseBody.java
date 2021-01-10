// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeBahamutAppResponseBodyResult> result;

    @NameInMap("Paginator")
    public QueryLinkeBahamutAppResponseBodyPaginator paginator;

    public static QueryLinkeBahamutAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppResponseBody self = new QueryLinkeBahamutAppResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutAppResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutAppResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutAppResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutAppResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutAppResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutAppResponseBody setResult(java.util.List<QueryLinkeBahamutAppResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeBahamutAppResponseBodyResult> getResult() {
        return this.result;
    }

    public QueryLinkeBahamutAppResponseBody setPaginator(QueryLinkeBahamutAppResponseBodyPaginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public QueryLinkeBahamutAppResponseBodyPaginator getPaginator() {
        return this.paginator;
    }

    public static class QueryLinkeBahamutAppResponseBodyResult extends TeaModel {
        @NameInMap("AppGroupName")
        public String appGroupName;

        @NameInMap("AppType")
        public String appType;

        @NameInMap("FirstArchDomain")
        public String firstArchDomain;

        @NameInMap("Id")
        public String id;

        @NameInMap("Level")
        public String level;

        @NameInMap("Name")
        public String name;

        @NameInMap("RecentLiveTime")
        public String recentLiveTime;

        @NameInMap("SecondArchDomain")
        public String secondArchDomain;

        @NameInMap("Status")
        public String status;

        @NameInMap("Owners")
        public java.util.List<String> owners;

        @NameInMap("OwnerObjs")
        public java.util.List<String> ownerObjs;

        public static QueryLinkeBahamutAppResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutAppResponseBodyResult self = new QueryLinkeBahamutAppResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutAppResponseBodyResult setAppGroupName(String appGroupName) {
            this.appGroupName = appGroupName;
            return this;
        }
        public String getAppGroupName() {
            return this.appGroupName;
        }

        public QueryLinkeBahamutAppResponseBodyResult setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public QueryLinkeBahamutAppResponseBodyResult setFirstArchDomain(String firstArchDomain) {
            this.firstArchDomain = firstArchDomain;
            return this;
        }
        public String getFirstArchDomain() {
            return this.firstArchDomain;
        }

        public QueryLinkeBahamutAppResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutAppResponseBodyResult setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryLinkeBahamutAppResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeBahamutAppResponseBodyResult setRecentLiveTime(String recentLiveTime) {
            this.recentLiveTime = recentLiveTime;
            return this;
        }
        public String getRecentLiveTime() {
            return this.recentLiveTime;
        }

        public QueryLinkeBahamutAppResponseBodyResult setSecondArchDomain(String secondArchDomain) {
            this.secondArchDomain = secondArchDomain;
            return this;
        }
        public String getSecondArchDomain() {
            return this.secondArchDomain;
        }

        public QueryLinkeBahamutAppResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryLinkeBahamutAppResponseBodyResult setOwners(java.util.List<String> owners) {
            this.owners = owners;
            return this;
        }
        public java.util.List<String> getOwners() {
            return this.owners;
        }

        public QueryLinkeBahamutAppResponseBodyResult setOwnerObjs(java.util.List<String> ownerObjs) {
            this.ownerObjs = ownerObjs;
            return this;
        }
        public java.util.List<String> getOwnerObjs() {
            return this.ownerObjs;
        }

    }

    public static class QueryLinkeBahamutAppResponseBodyPaginator extends TeaModel {
        @NameInMap("ItemCount")
        public Long itemCount;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("PageSize")
        public Long pageSize;

        public static QueryLinkeBahamutAppResponseBodyPaginator build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutAppResponseBodyPaginator self = new QueryLinkeBahamutAppResponseBodyPaginator();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutAppResponseBodyPaginator setItemCount(Long itemCount) {
            this.itemCount = itemCount;
            return this;
        }
        public Long getItemCount() {
            return this.itemCount;
        }

        public QueryLinkeBahamutAppResponseBodyPaginator setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public QueryLinkeBahamutAppResponseBodyPaginator setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public QueryLinkeBahamutAppResponseBodyPaginator setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

}
