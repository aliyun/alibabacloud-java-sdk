// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOmsObSyncDatahubProjectShrinkRequest extends TeaModel {
    @NameInMap("DatabaseInfos")
    public String databaseInfosShrink;

    @NameInMap("DatabaseVerbTypes")
    public String databaseVerbTypesShrink;

    @NameInMap("DatahubTopic")
    public String datahubTopic;

    @NameInMap("DestEndpointId")
    public String destEndpointId;

    @NameInMap("EnableLogicTable")
    public Boolean enableLogicTable;

    @NameInMap("Kinds")
    public String kindsShrink;

    @NameInMap("LogicTableETL")
    public String logicTableETLShrink;

    @NameInMap("LogicTableId")
    public String logicTableId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("ShardColumns")
    public String shardColumnsShrink;

    @NameInMap("SourceEndpointId")
    public String sourceEndpointId;

    @NameInMap("StoreStartTimestamp")
    public Long storeStartTimestamp;

    @NameInMap("WorkerGradeId")
    public String workerGradeId;

    public static CreateOmsObSyncDatahubProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOmsObSyncDatahubProjectShrinkRequest self = new CreateOmsObSyncDatahubProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateOmsObSyncDatahubProjectShrinkRequest setDatabaseInfosShrink(String databaseInfosShrink) {
        this.databaseInfosShrink = databaseInfosShrink;
        return this;
    }
    public String getDatabaseInfosShrink() {
        return this.databaseInfosShrink;
    }

    public CreateOmsObSyncDatahubProjectShrinkRequest setDatabaseVerbTypesShrink(String databaseVerbTypesShrink) {
        this.databaseVerbTypesShrink = databaseVerbTypesShrink;
        return this;
    }
    public String getDatabaseVerbTypesShrink() {
        return this.databaseVerbTypesShrink;
    }

    public CreateOmsObSyncDatahubProjectShrinkRequest setDatahubTopic(String datahubTopic) {
        this.datahubTopic = datahubTopic;
        return this;
    }
    public String getDatahubTopic() {
        return this.datahubTopic;
    }

    public CreateOmsObSyncDatahubProjectShrinkRequest setDestEndpointId(String destEndpointId) {
        this.destEndpointId = destEndpointId;
        return this;
    }
    public String getDestEndpointId() {
        return this.destEndpointId;
    }

    public CreateOmsObSyncDatahubProjectShrinkRequest setEnableLogicTable(Boolean enableLogicTable) {
        this.enableLogicTable = enableLogicTable;
        return this;
    }
    public Boolean getEnableLogicTable() {
        return this.enableLogicTable;
    }

    public CreateOmsObSyncDatahubProjectShrinkRequest setKindsShrink(String kindsShrink) {
        this.kindsShrink = kindsShrink;
        return this;
    }
    public String getKindsShrink() {
        return this.kindsShrink;
    }

    public CreateOmsObSyncDatahubProjectShrinkRequest setLogicTableETLShrink(String logicTableETLShrink) {
        this.logicTableETLShrink = logicTableETLShrink;
        return this;
    }
    public String getLogicTableETLShrink() {
        return this.logicTableETLShrink;
    }

    public CreateOmsObSyncDatahubProjectShrinkRequest setLogicTableId(String logicTableId) {
        this.logicTableId = logicTableId;
        return this;
    }
    public String getLogicTableId() {
        return this.logicTableId;
    }

    public CreateOmsObSyncDatahubProjectShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateOmsObSyncDatahubProjectShrinkRequest setShardColumnsShrink(String shardColumnsShrink) {
        this.shardColumnsShrink = shardColumnsShrink;
        return this;
    }
    public String getShardColumnsShrink() {
        return this.shardColumnsShrink;
    }

    public CreateOmsObSyncDatahubProjectShrinkRequest setSourceEndpointId(String sourceEndpointId) {
        this.sourceEndpointId = sourceEndpointId;
        return this;
    }
    public String getSourceEndpointId() {
        return this.sourceEndpointId;
    }

    public CreateOmsObSyncDatahubProjectShrinkRequest setStoreStartTimestamp(Long storeStartTimestamp) {
        this.storeStartTimestamp = storeStartTimestamp;
        return this;
    }
    public Long getStoreStartTimestamp() {
        return this.storeStartTimestamp;
    }

    public CreateOmsObSyncDatahubProjectShrinkRequest setWorkerGradeId(String workerGradeId) {
        this.workerGradeId = workerGradeId;
        return this;
    }
    public String getWorkerGradeId() {
        return this.workerGradeId;
    }

}
