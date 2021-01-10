// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutAllarchdomainsfromlinkmResponseBody extends TeaModel {
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
    public java.util.List<ListLinkeBahamutAllarchdomainsfromlinkmResponseBodyResult> result;

    public static ListLinkeBahamutAllarchdomainsfromlinkmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutAllarchdomainsfromlinkmResponseBody self = new ListLinkeBahamutAllarchdomainsfromlinkmResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutAllarchdomainsfromlinkmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkeBahamutAllarchdomainsfromlinkmResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkeBahamutAllarchdomainsfromlinkmResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkeBahamutAllarchdomainsfromlinkmResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLinkeBahamutAllarchdomainsfromlinkmResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public ListLinkeBahamutAllarchdomainsfromlinkmResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLinkeBahamutAllarchdomainsfromlinkmResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ListLinkeBahamutAllarchdomainsfromlinkmResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLinkeBahamutAllarchdomainsfromlinkmResponseBody setResult(java.util.List<ListLinkeBahamutAllarchdomainsfromlinkmResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListLinkeBahamutAllarchdomainsfromlinkmResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListLinkeBahamutAllarchdomainsfromlinkmResponseBodyResult extends TeaModel {
        @NameInMap("BakOwner")
        public String bakOwner;

        @NameInMap("BakTestOwner")
        public String bakTestOwner;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("Id")
        public String id;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Level")
        public String level;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TestOwner")
        public String testOwner;

        @NameInMap("AppMetaIds")
        public java.util.List<String> appMetaIds;

        @NameInMap("LinkcGroups")
        public java.util.List<String> linkcGroups;

        public static ListLinkeBahamutAllarchdomainsfromlinkmResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutAllarchdomainsfromlinkmResponseBodyResult self = new ListLinkeBahamutAllarchdomainsfromlinkmResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutAllarchdomainsfromlinkmResponseBodyResult setBakOwner(String bakOwner) {
            this.bakOwner = bakOwner;
            return this;
        }
        public String getBakOwner() {
            return this.bakOwner;
        }

        public ListLinkeBahamutAllarchdomainsfromlinkmResponseBodyResult setBakTestOwner(String bakTestOwner) {
            this.bakTestOwner = bakTestOwner;
            return this;
        }
        public String getBakTestOwner() {
            return this.bakTestOwner;
        }

        public ListLinkeBahamutAllarchdomainsfromlinkmResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ListLinkeBahamutAllarchdomainsfromlinkmResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListLinkeBahamutAllarchdomainsfromlinkmResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLinkeBahamutAllarchdomainsfromlinkmResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public ListLinkeBahamutAllarchdomainsfromlinkmResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLinkeBahamutAllarchdomainsfromlinkmResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public ListLinkeBahamutAllarchdomainsfromlinkmResponseBodyResult setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListLinkeBahamutAllarchdomainsfromlinkmResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLinkeBahamutAllarchdomainsfromlinkmResponseBodyResult setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListLinkeBahamutAllarchdomainsfromlinkmResponseBodyResult setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ListLinkeBahamutAllarchdomainsfromlinkmResponseBodyResult setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListLinkeBahamutAllarchdomainsfromlinkmResponseBodyResult setTestOwner(String testOwner) {
            this.testOwner = testOwner;
            return this;
        }
        public String getTestOwner() {
            return this.testOwner;
        }

        public ListLinkeBahamutAllarchdomainsfromlinkmResponseBodyResult setAppMetaIds(java.util.List<String> appMetaIds) {
            this.appMetaIds = appMetaIds;
            return this;
        }
        public java.util.List<String> getAppMetaIds() {
            return this.appMetaIds;
        }

        public ListLinkeBahamutAllarchdomainsfromlinkmResponseBodyResult setLinkcGroups(java.util.List<String> linkcGroups) {
            this.linkcGroups = linkcGroups;
            return this;
        }
        public java.util.List<String> getLinkcGroups() {
            return this.linkcGroups;
        }

    }

}
