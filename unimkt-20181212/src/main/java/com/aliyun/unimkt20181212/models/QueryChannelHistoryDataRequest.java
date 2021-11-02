// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryChannelHistoryDataRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TaskType")
    public String taskType;

    public static QueryChannelHistoryDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChannelHistoryDataRequest self = new QueryChannelHistoryDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryChannelHistoryDataRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public QueryChannelHistoryDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryChannelHistoryDataRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryChannelHistoryDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryChannelHistoryDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryChannelHistoryDataRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
