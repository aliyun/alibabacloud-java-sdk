// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutArchdomainsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public AddLinkeBahamutArchdomainsResponseBodyResult result;

    public static AddLinkeBahamutArchdomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutArchdomainsResponseBody self = new AddLinkeBahamutArchdomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutArchdomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLinkeBahamutArchdomainsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddLinkeBahamutArchdomainsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddLinkeBahamutArchdomainsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddLinkeBahamutArchdomainsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddLinkeBahamutArchdomainsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddLinkeBahamutArchdomainsResponseBody setResult(AddLinkeBahamutArchdomainsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddLinkeBahamutArchdomainsResponseBodyResult getResult() {
        return this.result;
    }

    public static class AddLinkeBahamutArchdomainsResponseBodyResult extends TeaModel {
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

        public static AddLinkeBahamutArchdomainsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddLinkeBahamutArchdomainsResponseBodyResult self = new AddLinkeBahamutArchdomainsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddLinkeBahamutArchdomainsResponseBodyResult setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public AddLinkeBahamutArchdomainsResponseBodyResult setBakOwner(String bakOwner) {
            this.bakOwner = bakOwner;
            return this;
        }
        public String getBakOwner() {
            return this.bakOwner;
        }

        public AddLinkeBahamutArchdomainsResponseBodyResult setBakTestOwner(String bakTestOwner) {
            this.bakTestOwner = bakTestOwner;
            return this;
        }
        public String getBakTestOwner() {
            return this.bakTestOwner;
        }

        public AddLinkeBahamutArchdomainsResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public AddLinkeBahamutArchdomainsResponseBodyResult setTestOwner(String testOwner) {
            this.testOwner = testOwner;
            return this;
        }
        public String getTestOwner() {
            return this.testOwner;
        }

        public AddLinkeBahamutArchdomainsResponseBodyResult setAppMetaIds(java.util.List<String> appMetaIds) {
            this.appMetaIds = appMetaIds;
            return this;
        }
        public java.util.List<String> getAppMetaIds() {
            return this.appMetaIds;
        }

        public AddLinkeBahamutArchdomainsResponseBodyResult setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public AddLinkeBahamutArchdomainsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddLinkeBahamutArchdomainsResponseBodyResult setLinkcGroups(java.util.List<String> linkcGroups) {
            this.linkcGroups = linkcGroups;
            return this;
        }
        public java.util.List<String> getLinkcGroups() {
            return this.linkcGroups;
        }

        public AddLinkeBahamutArchdomainsResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public AddLinkeBahamutArchdomainsResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public AddLinkeBahamutArchdomainsResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public AddLinkeBahamutArchdomainsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddLinkeBahamutArchdomainsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddLinkeBahamutArchdomainsResponseBodyResult setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public AddLinkeBahamutArchdomainsResponseBodyResult setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
