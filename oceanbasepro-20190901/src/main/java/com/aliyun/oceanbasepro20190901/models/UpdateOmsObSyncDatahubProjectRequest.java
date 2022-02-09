// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class UpdateOmsObSyncDatahubProjectRequest extends TeaModel {
    @NameInMap("DatabaseInfos")
    public java.util.Map<String, ?> databaseInfos;

    @NameInMap("LogicTableETL")
    public java.util.Map<String, ?> logicTableETL;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ShardColumns")
    public java.util.Map<String, ?> shardColumns;

    public static UpdateOmsObSyncDatahubProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOmsObSyncDatahubProjectRequest self = new UpdateOmsObSyncDatahubProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOmsObSyncDatahubProjectRequest setDatabaseInfos(java.util.Map<String, ?> databaseInfos) {
        this.databaseInfos = databaseInfos;
        return this;
    }
    public java.util.Map<String, ?> getDatabaseInfos() {
        return this.databaseInfos;
    }

    public UpdateOmsObSyncDatahubProjectRequest setLogicTableETL(java.util.Map<String, ?> logicTableETL) {
        this.logicTableETL = logicTableETL;
        return this;
    }
    public java.util.Map<String, ?> getLogicTableETL() {
        return this.logicTableETL;
    }

    public UpdateOmsObSyncDatahubProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateOmsObSyncDatahubProjectRequest setShardColumns(java.util.Map<String, ?> shardColumns) {
        this.shardColumns = shardColumns;
        return this;
    }
    public java.util.Map<String, ?> getShardColumns() {
        return this.shardColumns;
    }

}
