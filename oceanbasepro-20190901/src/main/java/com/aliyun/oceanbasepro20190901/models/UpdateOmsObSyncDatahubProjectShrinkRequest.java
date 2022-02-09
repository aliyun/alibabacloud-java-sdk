// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class UpdateOmsObSyncDatahubProjectShrinkRequest extends TeaModel {
    @NameInMap("DatabaseInfos")
    public String databaseInfosShrink;

    @NameInMap("LogicTableETL")
    public String logicTableETLShrink;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ShardColumns")
    public String shardColumnsShrink;

    public static UpdateOmsObSyncDatahubProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOmsObSyncDatahubProjectShrinkRequest self = new UpdateOmsObSyncDatahubProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOmsObSyncDatahubProjectShrinkRequest setDatabaseInfosShrink(String databaseInfosShrink) {
        this.databaseInfosShrink = databaseInfosShrink;
        return this;
    }
    public String getDatabaseInfosShrink() {
        return this.databaseInfosShrink;
    }

    public UpdateOmsObSyncDatahubProjectShrinkRequest setLogicTableETLShrink(String logicTableETLShrink) {
        this.logicTableETLShrink = logicTableETLShrink;
        return this;
    }
    public String getLogicTableETLShrink() {
        return this.logicTableETLShrink;
    }

    public UpdateOmsObSyncDatahubProjectShrinkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateOmsObSyncDatahubProjectShrinkRequest setShardColumnsShrink(String shardColumnsShrink) {
        this.shardColumnsShrink = shardColumnsShrink;
        return this;
    }
    public String getShardColumnsShrink() {
        return this.shardColumnsShrink;
    }

}
