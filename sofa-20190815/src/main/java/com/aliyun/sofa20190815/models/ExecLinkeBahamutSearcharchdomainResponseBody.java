// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeBahamutSearcharchdomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Paginator")
    public ExecLinkeBahamutSearcharchdomainResponseBodyPaginator paginator;

    @NameInMap("Result")
    public java.util.List<ExecLinkeBahamutSearcharchdomainResponseBodyResult> result;

    public static ExecLinkeBahamutSearcharchdomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeBahamutSearcharchdomainResponseBody self = new ExecLinkeBahamutSearcharchdomainResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecLinkeBahamutSearcharchdomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecLinkeBahamutSearcharchdomainResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecLinkeBahamutSearcharchdomainResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ExecLinkeBahamutSearcharchdomainResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public ExecLinkeBahamutSearcharchdomainResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ExecLinkeBahamutSearcharchdomainResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecLinkeBahamutSearcharchdomainResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExecLinkeBahamutSearcharchdomainResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecLinkeBahamutSearcharchdomainResponseBody setPaginator(ExecLinkeBahamutSearcharchdomainResponseBodyPaginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public ExecLinkeBahamutSearcharchdomainResponseBodyPaginator getPaginator() {
        return this.paginator;
    }

    public ExecLinkeBahamutSearcharchdomainResponseBody setResult(java.util.List<ExecLinkeBahamutSearcharchdomainResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ExecLinkeBahamutSearcharchdomainResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ExecLinkeBahamutSearcharchdomainResponseBodyPaginator extends TeaModel {
        @NameInMap("ItemCount")
        public Long itemCount;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("Page")
        public Long page;

        public static ExecLinkeBahamutSearcharchdomainResponseBodyPaginator build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeBahamutSearcharchdomainResponseBodyPaginator self = new ExecLinkeBahamutSearcharchdomainResponseBodyPaginator();
            return TeaModel.build(map, self);
        }

        public ExecLinkeBahamutSearcharchdomainResponseBodyPaginator setItemCount(Long itemCount) {
            this.itemCount = itemCount;
            return this;
        }
        public Long getItemCount() {
            return this.itemCount;
        }

        public ExecLinkeBahamutSearcharchdomainResponseBodyPaginator setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ExecLinkeBahamutSearcharchdomainResponseBodyPaginator setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public ExecLinkeBahamutSearcharchdomainResponseBodyPaginator setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

    }

    public static class ExecLinkeBahamutSearcharchdomainResponseBodyResult extends TeaModel {
        @NameInMap("Owner")
        public String owner;

        @NameInMap("BakOwner")
        public String bakOwner;

        @NameInMap("BakTestOwner")
        public String bakTestOwner;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("TestOwner")
        public String testOwner;

        @NameInMap("AppMetaIds")
        public java.util.List<String> appMetaIds;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("Description")
        public String description;

        @NameInMap("LinkcGroups")
        public java.util.List<String> linkcGroups;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("Level")
        public String level;

        @NameInMap("TenantId")
        public String tenantId;

        public static ExecLinkeBahamutSearcharchdomainResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeBahamutSearcharchdomainResponseBodyResult self = new ExecLinkeBahamutSearcharchdomainResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ExecLinkeBahamutSearcharchdomainResponseBodyResult setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ExecLinkeBahamutSearcharchdomainResponseBodyResult setBakOwner(String bakOwner) {
            this.bakOwner = bakOwner;
            return this;
        }
        public String getBakOwner() {
            return this.bakOwner;
        }

        public ExecLinkeBahamutSearcharchdomainResponseBodyResult setBakTestOwner(String bakTestOwner) {
            this.bakTestOwner = bakTestOwner;
            return this;
        }
        public String getBakTestOwner() {
            return this.bakTestOwner;
        }

        public ExecLinkeBahamutSearcharchdomainResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public ExecLinkeBahamutSearcharchdomainResponseBodyResult setTestOwner(String testOwner) {
            this.testOwner = testOwner;
            return this;
        }
        public String getTestOwner() {
            return this.testOwner;
        }

        public ExecLinkeBahamutSearcharchdomainResponseBodyResult setAppMetaIds(java.util.List<String> appMetaIds) {
            this.appMetaIds = appMetaIds;
            return this;
        }
        public java.util.List<String> getAppMetaIds() {
            return this.appMetaIds;
        }

        public ExecLinkeBahamutSearcharchdomainResponseBodyResult setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ExecLinkeBahamutSearcharchdomainResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ExecLinkeBahamutSearcharchdomainResponseBodyResult setLinkcGroups(java.util.List<String> linkcGroups) {
            this.linkcGroups = linkcGroups;
            return this;
        }
        public java.util.List<String> getLinkcGroups() {
            return this.linkcGroups;
        }

        public ExecLinkeBahamutSearcharchdomainResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public ExecLinkeBahamutSearcharchdomainResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ExecLinkeBahamutSearcharchdomainResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ExecLinkeBahamutSearcharchdomainResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecLinkeBahamutSearcharchdomainResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ExecLinkeBahamutSearcharchdomainResponseBodyResult setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ExecLinkeBahamutSearcharchdomainResponseBodyResult setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
