// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOmsObSyncKafkaProjectRequest extends TeaModel {
    @NameInMap("DatabaseInfos")
    public java.util.Map<String, ?> databaseInfos;

    @NameInMap("DatabaseVerbTypes")
    public java.util.Map<String, ?> databaseVerbTypes;

    @NameInMap("DestEndpointId")
    public String destEndpointId;

    @NameInMap("EnableLogicTable")
    public Boolean enableLogicTable;

    @NameInMap("KafkaTopic")
    public String kafkaTopic;

    @NameInMap("Kinds")
    public java.util.Map<String, ?> kinds;

    @NameInMap("LogicTableETL")
    public java.util.Map<String, ?> logicTableETL;

    @NameInMap("LogicTableId")
    public String logicTableId;

    @NameInMap("OrderWithinTransaction")
    public Boolean orderWithinTransaction;

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

    public static CreateOmsObSyncKafkaProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOmsObSyncKafkaProjectRequest self = new CreateOmsObSyncKafkaProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateOmsObSyncKafkaProjectRequest setDatabaseInfos(java.util.Map<String, ?> databaseInfos) {
        this.databaseInfos = databaseInfos;
        return this;
    }
    public java.util.Map<String, ?> getDatabaseInfos() {
        return this.databaseInfos;
    }

    public CreateOmsObSyncKafkaProjectRequest setDatabaseVerbTypes(java.util.Map<String, ?> databaseVerbTypes) {
        this.databaseVerbTypes = databaseVerbTypes;
        return this;
    }
    public java.util.Map<String, ?> getDatabaseVerbTypes() {
        return this.databaseVerbTypes;
    }

    public CreateOmsObSyncKafkaProjectRequest setDestEndpointId(String destEndpointId) {
        this.destEndpointId = destEndpointId;
        return this;
    }
    public String getDestEndpointId() {
        return this.destEndpointId;
    }

    public CreateOmsObSyncKafkaProjectRequest setEnableLogicTable(Boolean enableLogicTable) {
        this.enableLogicTable = enableLogicTable;
        return this;
    }
    public Boolean getEnableLogicTable() {
        return this.enableLogicTable;
    }

    public CreateOmsObSyncKafkaProjectRequest setKafkaTopic(String kafkaTopic) {
        this.kafkaTopic = kafkaTopic;
        return this;
    }
    public String getKafkaTopic() {
        return this.kafkaTopic;
    }

    public CreateOmsObSyncKafkaProjectRequest setKinds(java.util.Map<String, ?> kinds) {
        this.kinds = kinds;
        return this;
    }
    public java.util.Map<String, ?> getKinds() {
        return this.kinds;
    }

    public CreateOmsObSyncKafkaProjectRequest setLogicTableETL(java.util.Map<String, ?> logicTableETL) {
        this.logicTableETL = logicTableETL;
        return this;
    }
    public java.util.Map<String, ?> getLogicTableETL() {
        return this.logicTableETL;
    }

    public CreateOmsObSyncKafkaProjectRequest setLogicTableId(String logicTableId) {
        this.logicTableId = logicTableId;
        return this;
    }
    public String getLogicTableId() {
        return this.logicTableId;
    }

    public CreateOmsObSyncKafkaProjectRequest setOrderWithinTransaction(Boolean orderWithinTransaction) {
        this.orderWithinTransaction = orderWithinTransaction;
        return this;
    }
    public Boolean getOrderWithinTransaction() {
        return this.orderWithinTransaction;
    }

    public CreateOmsObSyncKafkaProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateOmsObSyncKafkaProjectRequest setShardColumns(java.util.Map<String, ?> shardColumns) {
        this.shardColumns = shardColumns;
        return this;
    }
    public java.util.Map<String, ?> getShardColumns() {
        return this.shardColumns;
    }

    public CreateOmsObSyncKafkaProjectRequest setSourceEndpointId(String sourceEndpointId) {
        this.sourceEndpointId = sourceEndpointId;
        return this;
    }
    public String getSourceEndpointId() {
        return this.sourceEndpointId;
    }

    public CreateOmsObSyncKafkaProjectRequest setStoreStartTimestamp(Long storeStartTimestamp) {
        this.storeStartTimestamp = storeStartTimestamp;
        return this;
    }
    public Long getStoreStartTimestamp() {
        return this.storeStartTimestamp;
    }

    public CreateOmsObSyncKafkaProjectRequest setWorkerGradeId(String workerGradeId) {
        this.workerGradeId = workerGradeId;
        return this;
    }
    public String getWorkerGradeId() {
        return this.workerGradeId;
    }

}
