// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutReleaseswithfastResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutReleaseswithfastResponseBodyResult> result;

    @NameInMap("Paginator")
    public GetLinkeBahamutReleaseswithfastResponseBodyPaginator paginator;

    public static GetLinkeBahamutReleaseswithfastResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutReleaseswithfastResponseBody self = new GetLinkeBahamutReleaseswithfastResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutReleaseswithfastResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutReleaseswithfastResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutReleaseswithfastResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutReleaseswithfastResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutReleaseswithfastResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutReleaseswithfastResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutReleaseswithfastResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutReleaseswithfastResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutReleaseswithfastResponseBody setResult(java.util.List<GetLinkeBahamutReleaseswithfastResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutReleaseswithfastResponseBodyResult> getResult() {
        return this.result;
    }

    public GetLinkeBahamutReleaseswithfastResponseBody setPaginator(GetLinkeBahamutReleaseswithfastResponseBodyPaginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public GetLinkeBahamutReleaseswithfastResponseBodyPaginator getPaginator() {
        return this.paginator;
    }

    public static class GetLinkeBahamutReleaseswithfastResponseBodyResult extends TeaModel {
        @NameInMap("AoneReleaseId")
        public String aoneReleaseId;

        @NameInMap("AppGroupName")
        public String appGroupName;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ReleaseDate")
        public Long releaseDate;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("Managers")
        public java.util.List<String> managers;

        public static GetLinkeBahamutReleaseswithfastResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutReleaseswithfastResponseBodyResult self = new GetLinkeBahamutReleaseswithfastResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutReleaseswithfastResponseBodyResult setAoneReleaseId(String aoneReleaseId) {
            this.aoneReleaseId = aoneReleaseId;
            return this;
        }
        public String getAoneReleaseId() {
            return this.aoneReleaseId;
        }

        public GetLinkeBahamutReleaseswithfastResponseBodyResult setAppGroupName(String appGroupName) {
            this.appGroupName = appGroupName;
            return this;
        }
        public String getAppGroupName() {
            return this.appGroupName;
        }

        public GetLinkeBahamutReleaseswithfastResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public GetLinkeBahamutReleaseswithfastResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetLinkeBahamutReleaseswithfastResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public GetLinkeBahamutReleaseswithfastResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutReleaseswithfastResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeBahamutReleaseswithfastResponseBodyResult setReleaseDate(Long releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }
        public Long getReleaseDate() {
            return this.releaseDate;
        }

        public GetLinkeBahamutReleaseswithfastResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLinkeBahamutReleaseswithfastResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLinkeBahamutReleaseswithfastResponseBodyResult setManagers(java.util.List<String> managers) {
            this.managers = managers;
            return this;
        }
        public java.util.List<String> getManagers() {
            return this.managers;
        }

    }

    public static class GetLinkeBahamutReleaseswithfastResponseBodyPaginator extends TeaModel {
        @NameInMap("ItemCount")
        public Long itemCount;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("PageSize")
        public Long pageSize;

        public static GetLinkeBahamutReleaseswithfastResponseBodyPaginator build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutReleaseswithfastResponseBodyPaginator self = new GetLinkeBahamutReleaseswithfastResponseBodyPaginator();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutReleaseswithfastResponseBodyPaginator setItemCount(Long itemCount) {
            this.itemCount = itemCount;
            return this;
        }
        public Long getItemCount() {
            return this.itemCount;
        }

        public GetLinkeBahamutReleaseswithfastResponseBodyPaginator setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public GetLinkeBahamutReleaseswithfastResponseBodyPaginator setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public GetLinkeBahamutReleaseswithfastResponseBodyPaginator setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

}
