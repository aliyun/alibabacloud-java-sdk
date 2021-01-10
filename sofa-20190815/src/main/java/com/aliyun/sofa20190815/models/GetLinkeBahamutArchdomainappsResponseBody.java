// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutArchdomainappsResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutArchdomainappsResponseBodyResult> result;

    @NameInMap("Paginator")
    public GetLinkeBahamutArchdomainappsResponseBodyPaginator paginator;

    public static GetLinkeBahamutArchdomainappsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutArchdomainappsResponseBody self = new GetLinkeBahamutArchdomainappsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutArchdomainappsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutArchdomainappsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutArchdomainappsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutArchdomainappsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutArchdomainappsResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutArchdomainappsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutArchdomainappsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutArchdomainappsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutArchdomainappsResponseBody setResult(java.util.List<GetLinkeBahamutArchdomainappsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutArchdomainappsResponseBodyResult> getResult() {
        return this.result;
    }

    public GetLinkeBahamutArchdomainappsResponseBody setPaginator(GetLinkeBahamutArchdomainappsResponseBodyPaginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public GetLinkeBahamutArchdomainappsResponseBodyPaginator getPaginator() {
        return this.paginator;
    }

    public static class GetLinkeBahamutArchdomainappsResponseBodyResult extends TeaModel {
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

        public static GetLinkeBahamutArchdomainappsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutArchdomainappsResponseBodyResult self = new GetLinkeBahamutArchdomainappsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutArchdomainappsResponseBodyResult setAppGroupName(String appGroupName) {
            this.appGroupName = appGroupName;
            return this;
        }
        public String getAppGroupName() {
            return this.appGroupName;
        }

        public GetLinkeBahamutArchdomainappsResponseBodyResult setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public GetLinkeBahamutArchdomainappsResponseBodyResult setFirstArchDomain(String firstArchDomain) {
            this.firstArchDomain = firstArchDomain;
            return this;
        }
        public String getFirstArchDomain() {
            return this.firstArchDomain;
        }

        public GetLinkeBahamutArchdomainappsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutArchdomainappsResponseBodyResult setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetLinkeBahamutArchdomainappsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeBahamutArchdomainappsResponseBodyResult setRecentLiveTime(String recentLiveTime) {
            this.recentLiveTime = recentLiveTime;
            return this;
        }
        public String getRecentLiveTime() {
            return this.recentLiveTime;
        }

        public GetLinkeBahamutArchdomainappsResponseBodyResult setSecondArchDomain(String secondArchDomain) {
            this.secondArchDomain = secondArchDomain;
            return this;
        }
        public String getSecondArchDomain() {
            return this.secondArchDomain;
        }

        public GetLinkeBahamutArchdomainappsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLinkeBahamutArchdomainappsResponseBodyResult setOwners(java.util.List<String> owners) {
            this.owners = owners;
            return this;
        }
        public java.util.List<String> getOwners() {
            return this.owners;
        }

        public GetLinkeBahamutArchdomainappsResponseBodyResult setOwnerObjs(java.util.List<String> ownerObjs) {
            this.ownerObjs = ownerObjs;
            return this;
        }
        public java.util.List<String> getOwnerObjs() {
            return this.ownerObjs;
        }

    }

    public static class GetLinkeBahamutArchdomainappsResponseBodyPaginator extends TeaModel {
        @NameInMap("ItemCount")
        public Long itemCount;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("PageSize")
        public Long pageSize;

        public static GetLinkeBahamutArchdomainappsResponseBodyPaginator build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutArchdomainappsResponseBodyPaginator self = new GetLinkeBahamutArchdomainappsResponseBodyPaginator();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutArchdomainappsResponseBodyPaginator setItemCount(Long itemCount) {
            this.itemCount = itemCount;
            return this;
        }
        public Long getItemCount() {
            return this.itemCount;
        }

        public GetLinkeBahamutArchdomainappsResponseBodyPaginator setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public GetLinkeBahamutArchdomainappsResponseBodyPaginator setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public GetLinkeBahamutArchdomainappsResponseBodyPaginator setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

}
