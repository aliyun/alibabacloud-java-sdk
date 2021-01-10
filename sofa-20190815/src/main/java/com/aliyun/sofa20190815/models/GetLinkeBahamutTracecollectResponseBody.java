// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutTracecollectResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutTracecollectResponseBodyResult> result;

    @NameInMap("Paginator")
    public GetLinkeBahamutTracecollectResponseBodyPaginator paginator;

    public static GetLinkeBahamutTracecollectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutTracecollectResponseBody self = new GetLinkeBahamutTracecollectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutTracecollectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutTracecollectResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutTracecollectResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutTracecollectResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutTracecollectResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutTracecollectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutTracecollectResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutTracecollectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutTracecollectResponseBody setResult(java.util.List<GetLinkeBahamutTracecollectResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutTracecollectResponseBodyResult> getResult() {
        return this.result;
    }

    public GetLinkeBahamutTracecollectResponseBody setPaginator(GetLinkeBahamutTracecollectResponseBodyPaginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public GetLinkeBahamutTracecollectResponseBodyPaginator getPaginator() {
        return this.paginator;
    }

    public static class GetLinkeBahamutTracecollectResponseBodyResult extends TeaModel {
        @NameInMap("Env")
        public String env;

        @NameInMap("Id")
        public Long id;

        @NameInMap("SaveTime")
        public String saveTime;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TraceDescribe")
        public String traceDescribe;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("TraceName")
        public String traceName;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("Url")
        public String url;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static GetLinkeBahamutTracecollectResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutTracecollectResponseBodyResult self = new GetLinkeBahamutTracecollectResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutTracecollectResponseBodyResult setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public GetLinkeBahamutTracecollectResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetLinkeBahamutTracecollectResponseBodyResult setSaveTime(String saveTime) {
            this.saveTime = saveTime;
            return this;
        }
        public String getSaveTime() {
            return this.saveTime;
        }

        public GetLinkeBahamutTracecollectResponseBodyResult setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetLinkeBahamutTracecollectResponseBodyResult setTraceDescribe(String traceDescribe) {
            this.traceDescribe = traceDescribe;
            return this;
        }
        public String getTraceDescribe() {
            return this.traceDescribe;
        }

        public GetLinkeBahamutTracecollectResponseBodyResult setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public GetLinkeBahamutTracecollectResponseBodyResult setTraceName(String traceName) {
            this.traceName = traceName;
            return this;
        }
        public String getTraceName() {
            return this.traceName;
        }

        public GetLinkeBahamutTracecollectResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetLinkeBahamutTracecollectResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetLinkeBahamutTracecollectResponseBodyResult setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetLinkeBahamutTracecollectResponseBodyResult setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public GetLinkeBahamutTracecollectResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class GetLinkeBahamutTracecollectResponseBodyPaginator extends TeaModel {
        @NameInMap("ItemCount")
        public Long itemCount;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("PageSize")
        public Long pageSize;

        public static GetLinkeBahamutTracecollectResponseBodyPaginator build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutTracecollectResponseBodyPaginator self = new GetLinkeBahamutTracecollectResponseBodyPaginator();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutTracecollectResponseBodyPaginator setItemCount(Long itemCount) {
            this.itemCount = itemCount;
            return this;
        }
        public Long getItemCount() {
            return this.itemCount;
        }

        public GetLinkeBahamutTracecollectResponseBodyPaginator setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public GetLinkeBahamutTracecollectResponseBodyPaginator setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public GetLinkeBahamutTracecollectResponseBodyPaginator setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

}
