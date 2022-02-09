// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOmsObSyncDatahubProjectRequest extends TeaModel {
    @NameInMap("DatabaseInfos")
    public java.util.Map<String, ?> databaseInfos;

    @NameInMap("DatabaseVerbTypes")
    public java.util.Map<String, ?> databaseVerbTypes;

    @NameInMap("DatahubTopic")
    public String datahubTopic;

    @NameInMap("DestEndpointId")
    public String destEndpointId;

    @NameInMap("EnableLogicTable")
    public Boolean enableLogicTable;

    @NameInMap("Kinds")
    public java.util.Map<String, ?> kinds;

    @NameInMap("LogicTableETL")
    public java.util.Map<String, ?> logicTableETL;

    @NameInMap("LogicTableId")
    public String logicTableId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("ShardColumns")
    public java.util.Map<String, ?> shardColumns;

    @NameInMap("SourceEndpointId")
    public String sourceEndpointId;

    @NameInMap("StoreStartTimestamp")
    public Long storeStartTimestamp;

    @NameInMap("WorkerGradeId")
    public String workerGradeId;

    public static CreateOmsObSyncDatahubProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOmsObSyncDatahubProjectRequest self = new CreateOmsObSyncDatahubProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateOmsObSyncDatahubProjectRequest setDatabaseInfos(java.util.Map<String, ?> databaseInfos) {
        this.databaseInfos = databaseInfos;
        return this;
    }
    public java.util.Map<String, ?> getDatabaseInfos() {
        return this.databaseInfos;
    }

    public CreateOmsObSyncDatahubProjectRequest setDatabaseVerbTypes(java.util.Map<String, ?> databaseVerbTypes) {
        this.databaseVerbTypes = databaseVerbTypes;
        return this;
    }
    public java.util.Map<String, ?> getDatabaseVerbTypes() {
        return this.databaseVerbTypes;
    }

    public CreateOmsObSyncDatahubProjectRequest setDatahubTopic(String datahubTopic) {
        this.datahubTopic = datahubTopic;
        return this;
    }
    public String getDatahubTopic() {
        return this.datahubTopic;
    }

    public CreateOmsObSyncDatahubProjectRequest setDestEndpointId(String destEndpointId) {
        this.destEndpointId = destEndpointId;
        return this;
    }
    public String getDestEndpointId() {
        return this.destEndpointId;
    }

    public CreateOmsObSyncDatahubProjectRequest setEnableLogicTable(Boolean enableLogicTable) {
        this.enableLogicTable = enableLogicTable;
        return this;
    }
    public Boolean getEnableLogicTable() {
        return this.enableLogicTable;
    }

    public CreateOmsObSyncDatahubProjectRequest setKinds(java.util.Map<String, ?> kinds) {
        this.kinds = kinds;
        return this;
    }
    public java.util.Map<String, ?> getKinds() {
        return this.kinds;
    }

    public CreateOmsObSyncDatahubProjectRequest setLogicTableETL(java.util.Map<String, ?> logicTableETL) {
        this.logicTableETL = logicTableETL;
        return this;
    }
    public java.util.Map<String, ?> getLogicTableETL() {
        return this.logicTableETL;
    }

    public CreateOmsObSyncDatahubProjectRequest setLogicTableId(String logicTableId) {
        this.logicTableId = logicTableId;
        return this;
    }
    public String getLogicTableId() {
        return this.logicTableId;
    }

    public CreateOmsObSyncDatahubProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateOmsObSyncDatahubProjectRequest setShardColumns(java.util.Map<String, ?> shardColumns) {
        this.shardColumns = shardColumns;
        return this;
    }
    public java.util.Map<String, ?> getShardColumns() {
        return this.shardColumns;
    }

    public CreateOmsObSyncDatahubProjectRequest setSourceEndpointId(String sourceEndpointId) {
        this.sourceEndpointId = sourceEndpointId;
        return this;
    }
    public String getSourceEndpointId() {
        return this.sourceEndpointId;
    }

    public CreateOmsObSyncDatahubProjectRequest setStoreStartTimestamp(Long storeStartTimestamp) {
        this.storeStartTimestamp = storeStartTimestamp;
        return this;
    }
    public Long getStoreStartTimestamp() {
        return this.storeStartTimestamp;
    }

    public CreateOmsObSyncDatahubProjectRequest setWorkerGradeId(String workerGradeId) {
        this.workerGradeId = workerGradeId;
        return this;
    }
    public String getWorkerGradeId() {
        return this.workerGradeId;
    }

}
