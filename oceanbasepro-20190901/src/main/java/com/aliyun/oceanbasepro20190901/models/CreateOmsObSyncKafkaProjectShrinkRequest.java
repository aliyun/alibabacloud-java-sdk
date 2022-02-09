// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOmsObSyncKafkaProjectShrinkRequest extends TeaModel {
    @NameInMap("DatabaseInfos")
    public String databaseInfosShrink;

    @NameInMap("DatabaseVerbTypes")
    public String databaseVerbTypesShrink;

    @NameInMap("DestEndpointId")
    public String destEndpointId;

    @NameInMap("EnableLogicTable")
    public Boolean enableLogicTable;

    @NameInMap("KafkaTopic")
    public String kafkaTopic;

    @NameInMap("Kinds")
    public String kindsShrink;

    @NameInMap("LogicTableETL")
    public String logicTableETLShrink;

    @NameInMap("LogicTableId")
    public String logicTableId;

    @NameInMap("OrderWithinTransaction")
    public Boolean orderWithinTransaction;

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

    public static CreateOmsObSyncKafkaProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOmsObSyncKafkaProjectShrinkRequest self = new CreateOmsObSyncKafkaProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateOmsObSyncKafkaProjectShrinkRequest setDatabaseInfosShrink(String databaseInfosShrink) {
        this.databaseInfosShrink = databaseInfosShrink;
        return this;
    }
    public String getDatabaseInfosShrink() {
        return this.databaseInfosShrink;
    }

    public CreateOmsObSyncKafkaProjectShrinkRequest setDatabaseVerbTypesShrink(String databaseVerbTypesShrink) {
        this.databaseVerbTypesShrink = databaseVerbTypesShrink;
        return this;
    }
    public String getDatabaseVerbTypesShrink() {
        return this.databaseVerbTypesShrink;
    }

    public CreateOmsObSyncKafkaProjectShrinkRequest setDestEndpointId(String destEndpointId) {
        this.destEndpointId = destEndpointId;
        return this;
    }
    public String getDestEndpointId() {
        return this.destEndpointId;
    }

    public CreateOmsObSyncKafkaProjectShrinkRequest setEnableLogicTable(Boolean enableLogicTable) {
        this.enableLogicTable = enableLogicTable;
        return this;
    }
    public Boolean getEnableLogicTable() {
        return this.enableLogicTable;
    }

    public CreateOmsObSyncKafkaProjectShrinkRequest setKafkaTopic(String kafkaTopic) {
        this.kafkaTopic = kafkaTopic;
        return this;
    }
    public String getKafkaTopic() {
        return this.kafkaTopic;
    }

    public CreateOmsObSyncKafkaProjectShrinkRequest setKindsShrink(String kindsShrink) {
        this.kindsShrink = kindsShrink;
        return this;
    }
    public String getKindsShrink() {
        return this.kindsShrink;
    }

    public CreateOmsObSyncKafkaProjectShrinkRequest setLogicTableETLShrink(String logicTableETLShrink) {
        this.logicTableETLShrink = logicTableETLShrink;
        return this;
    }
    public String getLogicTableETLShrink() {
        return this.logicTableETLShrink;
    }

    public CreateOmsObSyncKafkaProjectShrinkRequest setLogicTableId(String logicTableId) {
        this.logicTableId = logicTableId;
        return this;
    }
    public String getLogicTableId() {
        return this.logicTableId;
    }

    public CreateOmsObSyncKafkaProjectShrinkRequest setOrderWithinTransaction(Boolean orderWithinTransaction) {
        this.orderWithinTransaction = orderWithinTransaction;
        return this;
    }
    public Boolean getOrderWithinTransaction() {
        return this.orderWithinTransaction;
    }

    public CreateOmsObSyncKafkaProjectShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateOmsObSyncKafkaProjectShrinkRequest setShardColumnsShrink(String shardColumnsShrink) {
        this.shardColumnsShrink = shardColumnsShrink;
        return this;
    }
    public String getShardColumnsShrink() {
        return this.shardColumnsShrink;
    }

    public CreateOmsObSyncKafkaProjectShrinkRequest setSourceEndpointId(String sourceEndpointId) {
        this.sourceEndpointId = sourceEndpointId;
        return this;
    }
    public String getSourceEndpointId() {
        return this.sourceEndpointId;
    }

    public CreateOmsObSyncKafkaProjectShrinkRequest setStoreStartTimestamp(Long storeStartTimestamp) {
        this.storeStartTimestamp = storeStartTimestamp;
        return this;
    }
    public Long getStoreStartTimestamp() {
        return this.storeStartTimestamp;
    }

    public CreateOmsObSyncKafkaProjectShrinkRequest setWorkerGradeId(String workerGradeId) {
        this.workerGradeId = workerGradeId;
        return this;
    }
    public String getWorkerGradeId() {
        return this.workerGradeId;
    }

}
