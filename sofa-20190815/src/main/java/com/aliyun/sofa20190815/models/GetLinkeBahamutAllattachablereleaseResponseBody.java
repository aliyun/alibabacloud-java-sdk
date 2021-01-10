// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAllattachablereleaseResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutAllattachablereleaseResponseBodyResult> result;

    @NameInMap("Paginator")
    public GetLinkeBahamutAllattachablereleaseResponseBodyPaginator paginator;

    public static GetLinkeBahamutAllattachablereleaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAllattachablereleaseResponseBody self = new GetLinkeBahamutAllattachablereleaseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAllattachablereleaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutAllattachablereleaseResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutAllattachablereleaseResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutAllattachablereleaseResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutAllattachablereleaseResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutAllattachablereleaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutAllattachablereleaseResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutAllattachablereleaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutAllattachablereleaseResponseBody setResult(java.util.List<GetLinkeBahamutAllattachablereleaseResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutAllattachablereleaseResponseBodyResult> getResult() {
        return this.result;
    }

    public GetLinkeBahamutAllattachablereleaseResponseBody setPaginator(GetLinkeBahamutAllattachablereleaseResponseBodyPaginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public GetLinkeBahamutAllattachablereleaseResponseBodyPaginator getPaginator() {
        return this.paginator;
    }

    public static class GetLinkeBahamutAllattachablereleaseResponseBodyResult extends TeaModel {
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

        public static GetLinkeBahamutAllattachablereleaseResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutAllattachablereleaseResponseBodyResult self = new GetLinkeBahamutAllattachablereleaseResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutAllattachablereleaseResponseBodyResult setAoneReleaseId(String aoneReleaseId) {
            this.aoneReleaseId = aoneReleaseId;
            return this;
        }
        public String getAoneReleaseId() {
            return this.aoneReleaseId;
        }

        public GetLinkeBahamutAllattachablereleaseResponseBodyResult setAppGroupName(String appGroupName) {
            this.appGroupName = appGroupName;
            return this;
        }
        public String getAppGroupName() {
            return this.appGroupName;
        }

        public GetLinkeBahamutAllattachablereleaseResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public GetLinkeBahamutAllattachablereleaseResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetLinkeBahamutAllattachablereleaseResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public GetLinkeBahamutAllattachablereleaseResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutAllattachablereleaseResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeBahamutAllattachablereleaseResponseBodyResult setReleaseDate(Long releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }
        public Long getReleaseDate() {
            return this.releaseDate;
        }

        public GetLinkeBahamutAllattachablereleaseResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLinkeBahamutAllattachablereleaseResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLinkeBahamutAllattachablereleaseResponseBodyResult setManagers(java.util.List<String> managers) {
            this.managers = managers;
            return this;
        }
        public java.util.List<String> getManagers() {
            return this.managers;
        }

    }

    public static class GetLinkeBahamutAllattachablereleaseResponseBodyPaginator extends TeaModel {
        @NameInMap("ItemCount")
        public Long itemCount;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("PageSize")
        public Long pageSize;

        public static GetLinkeBahamutAllattachablereleaseResponseBodyPaginator build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutAllattachablereleaseResponseBodyPaginator self = new GetLinkeBahamutAllattachablereleaseResponseBodyPaginator();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutAllattachablereleaseResponseBodyPaginator setItemCount(Long itemCount) {
            this.itemCount = itemCount;
            return this;
        }
        public Long getItemCount() {
            return this.itemCount;
        }

        public GetLinkeBahamutAllattachablereleaseResponseBodyPaginator setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public GetLinkeBahamutAllattachablereleaseResponseBodyPaginator setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public GetLinkeBahamutAllattachablereleaseResponseBodyPaginator setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

}
