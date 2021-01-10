// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMSDdcsPushHistoryRequest extends TeaModel {
    @NameInMap("DataId")
    public String dataId;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Size")
    public Long size;

    @NameInMap("StartId")
    public Long startId;

    @NameInMap("StartTime")
    public Long startTime;

    public static QueryMSDdcsPushHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMSDdcsPushHistoryRequest self = new QueryMSDdcsPushHistoryRequest();
        return TeaModel.build(map, self);
    }

    public QueryMSDdcsPushHistoryRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public QueryMSDdcsPushHistoryRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryMSDdcsPushHistoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMSDdcsPushHistoryRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public QueryMSDdcsPushHistoryRequest setStartId(Long startId) {
        this.startId = startId;
        return this;
    }
    public Long getStartId() {
        return this.startId;
    }

    public QueryMSDdcsPushHistoryRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
