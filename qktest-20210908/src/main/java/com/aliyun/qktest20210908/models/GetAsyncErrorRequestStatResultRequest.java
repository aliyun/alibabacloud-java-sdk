// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qktest20210908.models;

import com.aliyun.tea.*;

public class GetAsyncErrorRequestStatResultRequest extends TeaModel {
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("End")
    public Long end;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("SqlIdList")
    public String sqlIdList;

    @NameInMap("Start")
    public Long start;

    public static GetAsyncErrorRequestStatResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncErrorRequestStatResultRequest self = new GetAsyncErrorRequestStatResultRequest();
        return TeaModel.build(map, self);
    }

    public GetAsyncErrorRequestStatResultRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public GetAsyncErrorRequestStatResultRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetAsyncErrorRequestStatResultRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAsyncErrorRequestStatResultRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetAsyncErrorRequestStatResultRequest setSqlIdList(String sqlIdList) {
        this.sqlIdList = sqlIdList;
        return this;
    }
    public String getSqlIdList() {
        return this.sqlIdList;
    }

    public GetAsyncErrorRequestStatResultRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
