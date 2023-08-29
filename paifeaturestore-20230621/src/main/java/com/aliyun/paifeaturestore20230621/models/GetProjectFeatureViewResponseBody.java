// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetProjectFeatureViewResponseBody extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("FeatureEntityId")
    public String featureEntityId;

    @NameInMap("FeatureEntityName")
    public String featureEntityName;

    @NameInMap("FeatureViewId")
    public String featureViewId;

    @NameInMap("Fields")
    public java.util.List<GetProjectFeatureViewResponseBodyFields> fields;

    @NameInMap("GmtSyncTime")
    public String gmtSyncTime;

    @NameInMap("JoinId")
    public String joinId;

    @NameInMap("LastSyncConfig")
    public String lastSyncConfig;

    @NameInMap("Name")
    public String name;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("RegisterDatasourceId")
    public String registerDatasourceId;

    @NameInMap("RegisterTable")
    public String registerTable;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SyncOnlineTable")
    public Boolean syncOnlineTable;

    @NameInMap("TTL")
    public Integer TTL;

    @NameInMap("Tags")
    public java.util.List<String> tags;

    @NameInMap("Type")
    public String type;

    @NameInMap("WriteMethod")
    public String writeMethod;

    public static GetProjectFeatureViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectFeatureViewResponseBody self = new GetProjectFeatureViewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectFeatureViewResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public GetProjectFeatureViewResponseBody setFeatureEntityId(String featureEntityId) {
        this.featureEntityId = featureEntityId;
        return this;
    }
    public String getFeatureEntityId() {
        return this.featureEntityId;
    }

    public GetProjectFeatureViewResponseBody setFeatureEntityName(String featureEntityName) {
        this.featureEntityName = featureEntityName;
        return this;
    }
    public String getFeatureEntityName() {
        return this.featureEntityName;
    }

    public GetProjectFeatureViewResponseBody setFeatureViewId(String featureViewId) {
        this.featureViewId = featureViewId;
        return this;
    }
    public String getFeatureViewId() {
        return this.featureViewId;
    }

    public GetProjectFeatureViewResponseBody setFields(java.util.List<GetProjectFeatureViewResponseBodyFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<GetProjectFeatureViewResponseBodyFields> getFields() {
        return this.fields;
    }

    public GetProjectFeatureViewResponseBody setGmtSyncTime(String gmtSyncTime) {
        this.gmtSyncTime = gmtSyncTime;
        return this;
    }
    public String getGmtSyncTime() {
        return this.gmtSyncTime;
    }

    public GetProjectFeatureViewResponseBody setJoinId(String joinId) {
        this.joinId = joinId;
        return this;
    }
    public String getJoinId() {
        return this.joinId;
    }

    public GetProjectFeatureViewResponseBody setLastSyncConfig(String lastSyncConfig) {
        this.lastSyncConfig = lastSyncConfig;
        return this;
    }
    public String getLastSyncConfig() {
        return this.lastSyncConfig;
    }

    public GetProjectFeatureViewResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetProjectFeatureViewResponseBody setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public GetProjectFeatureViewResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetProjectFeatureViewResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetProjectFeatureViewResponseBody setRegisterDatasourceId(String registerDatasourceId) {
        this.registerDatasourceId = registerDatasourceId;
        return this;
    }
    public String getRegisterDatasourceId() {
        return this.registerDatasourceId;
    }

    public GetProjectFeatureViewResponseBody setRegisterTable(String registerTable) {
        this.registerTable = registerTable;
        return this;
    }
    public String getRegisterTable() {
        return this.registerTable;
    }

    public GetProjectFeatureViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectFeatureViewResponseBody setSyncOnlineTable(Boolean syncOnlineTable) {
        this.syncOnlineTable = syncOnlineTable;
        return this;
    }
    public Boolean getSyncOnlineTable() {
        return this.syncOnlineTable;
    }

    public GetProjectFeatureViewResponseBody setTTL(Integer TTL) {
        this.TTL = TTL;
        return this;
    }
    public Integer getTTL() {
        return this.TTL;
    }

    public GetProjectFeatureViewResponseBody setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public GetProjectFeatureViewResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetProjectFeatureViewResponseBody setWriteMethod(String writeMethod) {
        this.writeMethod = writeMethod;
        return this;
    }
    public String getWriteMethod() {
        return this.writeMethod;
    }

    public static class GetProjectFeatureViewResponseBodyFields extends TeaModel {
        @NameInMap("Attributes")
        public java.util.List<String> attributes;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static GetProjectFeatureViewResponseBodyFields build(java.util.Map<String, ?> map) throws Exception {
            GetProjectFeatureViewResponseBodyFields self = new GetProjectFeatureViewResponseBodyFields();
            return TeaModel.build(map, self);
        }

        public GetProjectFeatureViewResponseBodyFields setAttributes(java.util.List<String> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<String> getAttributes() {
            return this.attributes;
        }

        public GetProjectFeatureViewResponseBodyFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProjectFeatureViewResponseBodyFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
