// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetFeatureViewResponseBody extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("FeatureEntityId")
    public String featureEntityId;

    @NameInMap("FeatureEntityName")
    public String featureEntityName;

    @NameInMap("Fields")
    public java.util.List<GetFeatureViewResponseBodyFields> fields;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

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

    @NameInMap("RegisterDatasourceName")
    public String registerDatasourceName;

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

    public static GetFeatureViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFeatureViewResponseBody self = new GetFeatureViewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFeatureViewResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public GetFeatureViewResponseBody setFeatureEntityId(String featureEntityId) {
        this.featureEntityId = featureEntityId;
        return this;
    }
    public String getFeatureEntityId() {
        return this.featureEntityId;
    }

    public GetFeatureViewResponseBody setFeatureEntityName(String featureEntityName) {
        this.featureEntityName = featureEntityName;
        return this;
    }
    public String getFeatureEntityName() {
        return this.featureEntityName;
    }

    public GetFeatureViewResponseBody setFields(java.util.List<GetFeatureViewResponseBodyFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<GetFeatureViewResponseBodyFields> getFields() {
        return this.fields;
    }

    public GetFeatureViewResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetFeatureViewResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetFeatureViewResponseBody setGmtSyncTime(String gmtSyncTime) {
        this.gmtSyncTime = gmtSyncTime;
        return this;
    }
    public String getGmtSyncTime() {
        return this.gmtSyncTime;
    }

    public GetFeatureViewResponseBody setJoinId(String joinId) {
        this.joinId = joinId;
        return this;
    }
    public String getJoinId() {
        return this.joinId;
    }

    public GetFeatureViewResponseBody setLastSyncConfig(String lastSyncConfig) {
        this.lastSyncConfig = lastSyncConfig;
        return this;
    }
    public String getLastSyncConfig() {
        return this.lastSyncConfig;
    }

    public GetFeatureViewResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetFeatureViewResponseBody setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public GetFeatureViewResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetFeatureViewResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetFeatureViewResponseBody setRegisterDatasourceId(String registerDatasourceId) {
        this.registerDatasourceId = registerDatasourceId;
        return this;
    }
    public String getRegisterDatasourceId() {
        return this.registerDatasourceId;
    }

    public GetFeatureViewResponseBody setRegisterDatasourceName(String registerDatasourceName) {
        this.registerDatasourceName = registerDatasourceName;
        return this;
    }
    public String getRegisterDatasourceName() {
        return this.registerDatasourceName;
    }

    public GetFeatureViewResponseBody setRegisterTable(String registerTable) {
        this.registerTable = registerTable;
        return this;
    }
    public String getRegisterTable() {
        return this.registerTable;
    }

    public GetFeatureViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFeatureViewResponseBody setSyncOnlineTable(Boolean syncOnlineTable) {
        this.syncOnlineTable = syncOnlineTable;
        return this;
    }
    public Boolean getSyncOnlineTable() {
        return this.syncOnlineTable;
    }

    public GetFeatureViewResponseBody setTTL(Integer TTL) {
        this.TTL = TTL;
        return this;
    }
    public Integer getTTL() {
        return this.TTL;
    }

    public GetFeatureViewResponseBody setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public GetFeatureViewResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetFeatureViewResponseBody setWriteMethod(String writeMethod) {
        this.writeMethod = writeMethod;
        return this;
    }
    public String getWriteMethod() {
        return this.writeMethod;
    }

    public static class GetFeatureViewResponseBodyFields extends TeaModel {
        @NameInMap("Attributes")
        public java.util.List<String> attributes;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static GetFeatureViewResponseBodyFields build(java.util.Map<String, ?> map) throws Exception {
            GetFeatureViewResponseBodyFields self = new GetFeatureViewResponseBodyFields();
            return TeaModel.build(map, self);
        }

        public GetFeatureViewResponseBodyFields setAttributes(java.util.List<String> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<String> getAttributes() {
            return this.attributes;
        }

        public GetFeatureViewResponseBodyFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetFeatureViewResponseBodyFields setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
