// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutArchdomaininterationsResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutArchdomaininterationsResponseBodyResult> result;

    @NameInMap("Paginator")
    public GetLinkeBahamutArchdomaininterationsResponseBodyPaginator paginator;

    public static GetLinkeBahamutArchdomaininterationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutArchdomaininterationsResponseBody self = new GetLinkeBahamutArchdomaininterationsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutArchdomaininterationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutArchdomaininterationsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutArchdomaininterationsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutArchdomaininterationsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutArchdomaininterationsResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutArchdomaininterationsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutArchdomaininterationsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutArchdomaininterationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutArchdomaininterationsResponseBody setResult(java.util.List<GetLinkeBahamutArchdomaininterationsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutArchdomaininterationsResponseBodyResult> getResult() {
        return this.result;
    }

    public GetLinkeBahamutArchdomaininterationsResponseBody setPaginator(GetLinkeBahamutArchdomaininterationsResponseBodyPaginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public GetLinkeBahamutArchdomaininterationsResponseBodyPaginator getPaginator() {
        return this.paginator;
    }

    public static class GetLinkeBahamutArchdomaininterationsResponseBodyResult extends TeaModel {
        @NameInMap("Created")
        public Long created;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("Finished")
        public Boolean finished;

        @NameInMap("Id")
        public String id;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("OwnerObj")
        public String ownerObj;

        @NameInMap("Project")
        public String project;

        @NameInMap("Release")
        public String release;

        @NameInMap("Stage")
        public String stage;

        @NameInMap("StageStep")
        public String stageStep;

        public static GetLinkeBahamutArchdomaininterationsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutArchdomaininterationsResponseBodyResult self = new GetLinkeBahamutArchdomaininterationsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutArchdomaininterationsResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public GetLinkeBahamutArchdomaininterationsResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetLinkeBahamutArchdomaininterationsResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public GetLinkeBahamutArchdomaininterationsResponseBodyResult setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public GetLinkeBahamutArchdomaininterationsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutArchdomaininterationsResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public GetLinkeBahamutArchdomaininterationsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeBahamutArchdomaininterationsResponseBodyResult setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetLinkeBahamutArchdomaininterationsResponseBodyResult setOwnerObj(String ownerObj) {
            this.ownerObj = ownerObj;
            return this;
        }
        public String getOwnerObj() {
            return this.ownerObj;
        }

        public GetLinkeBahamutArchdomaininterationsResponseBodyResult setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public GetLinkeBahamutArchdomaininterationsResponseBodyResult setRelease(String release) {
            this.release = release;
            return this;
        }
        public String getRelease() {
            return this.release;
        }

        public GetLinkeBahamutArchdomaininterationsResponseBodyResult setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

        public GetLinkeBahamutArchdomaininterationsResponseBodyResult setStageStep(String stageStep) {
            this.stageStep = stageStep;
            return this;
        }
        public String getStageStep() {
            return this.stageStep;
        }

    }

    public static class GetLinkeBahamutArchdomaininterationsResponseBodyPaginator extends TeaModel {
        @NameInMap("ItemCount")
        public Long itemCount;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("PageSize")
        public Long pageSize;

        public static GetLinkeBahamutArchdomaininterationsResponseBodyPaginator build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutArchdomaininterationsResponseBodyPaginator self = new GetLinkeBahamutArchdomaininterationsResponseBodyPaginator();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutArchdomaininterationsResponseBodyPaginator setItemCount(Long itemCount) {
            this.itemCount = itemCount;
            return this;
        }
        public Long getItemCount() {
            return this.itemCount;
        }

        public GetLinkeBahamutArchdomaininterationsResponseBodyPaginator setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public GetLinkeBahamutArchdomaininterationsResponseBodyPaginator setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public GetLinkeBahamutArchdomaininterationsResponseBodyPaginator setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

}
