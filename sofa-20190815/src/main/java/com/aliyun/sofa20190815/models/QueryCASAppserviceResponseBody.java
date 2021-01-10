// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCASAppserviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryCASAppserviceResponseBodyData> data;

    public static QueryCASAppserviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCASAppserviceResponseBody self = new QueryCASAppserviceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCASAppserviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCASAppserviceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCASAppserviceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryCASAppserviceResponseBody setData(java.util.List<QueryCASAppserviceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCASAppserviceResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryCASAppserviceResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("BuildpackFullVersion")
        public String buildpackFullVersion;

        @NameInMap("BuildpackId")
        public String buildpackId;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExtendProperties")
        public String extendProperties;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("IsService")
        public Boolean isService;

        @NameInMap("LastDeployStatus")
        public String lastDeployStatus;

        @NameInMap("LastDeployVersion")
        public String lastDeployVersion;

        @NameInMap("LastOpsOrderId")
        public String lastOpsOrderId;

        @NameInMap("Name")
        public String name;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("TechstackId")
        public Long techstackId;

        @NameInMap("TechstackIdentity")
        public String techstackIdentity;

        @NameInMap("TechstackName")
        public String techstackName;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("CellIds")
        public java.util.List<String> cellIds;

        public static QueryCASAppserviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCASAppserviceResponseBodyData self = new QueryCASAppserviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCASAppserviceResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryCASAppserviceResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryCASAppserviceResponseBodyData setBuildpackFullVersion(String buildpackFullVersion) {
            this.buildpackFullVersion = buildpackFullVersion;
            return this;
        }
        public String getBuildpackFullVersion() {
            return this.buildpackFullVersion;
        }

        public QueryCASAppserviceResponseBodyData setBuildpackId(String buildpackId) {
            this.buildpackId = buildpackId;
            return this;
        }
        public String getBuildpackId() {
            return this.buildpackId;
        }

        public QueryCASAppserviceResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryCASAppserviceResponseBodyData setExtendProperties(String extendProperties) {
            this.extendProperties = extendProperties;
            return this;
        }
        public String getExtendProperties() {
            return this.extendProperties;
        }

        public QueryCASAppserviceResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCASAppserviceResponseBodyData setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public QueryCASAppserviceResponseBodyData setIsService(Boolean isService) {
            this.isService = isService;
            return this;
        }
        public Boolean getIsService() {
            return this.isService;
        }

        public QueryCASAppserviceResponseBodyData setLastDeployStatus(String lastDeployStatus) {
            this.lastDeployStatus = lastDeployStatus;
            return this;
        }
        public String getLastDeployStatus() {
            return this.lastDeployStatus;
        }

        public QueryCASAppserviceResponseBodyData setLastDeployVersion(String lastDeployVersion) {
            this.lastDeployVersion = lastDeployVersion;
            return this;
        }
        public String getLastDeployVersion() {
            return this.lastDeployVersion;
        }

        public QueryCASAppserviceResponseBodyData setLastOpsOrderId(String lastOpsOrderId) {
            this.lastOpsOrderId = lastOpsOrderId;
            return this;
        }
        public String getLastOpsOrderId() {
            return this.lastOpsOrderId;
        }

        public QueryCASAppserviceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryCASAppserviceResponseBodyData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public QueryCASAppserviceResponseBodyData setTechstackId(Long techstackId) {
            this.techstackId = techstackId;
            return this;
        }
        public Long getTechstackId() {
            return this.techstackId;
        }

        public QueryCASAppserviceResponseBodyData setTechstackIdentity(String techstackIdentity) {
            this.techstackIdentity = techstackIdentity;
            return this;
        }
        public String getTechstackIdentity() {
            return this.techstackIdentity;
        }

        public QueryCASAppserviceResponseBodyData setTechstackName(String techstackName) {
            this.techstackName = techstackName;
            return this;
        }
        public String getTechstackName() {
            return this.techstackName;
        }

        public QueryCASAppserviceResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryCASAppserviceResponseBodyData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryCASAppserviceResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryCASAppserviceResponseBodyData setCellIds(java.util.List<String> cellIds) {
            this.cellIds = cellIds;
            return this;
        }
        public java.util.List<String> getCellIds() {
            return this.cellIds;
        }

    }

}
