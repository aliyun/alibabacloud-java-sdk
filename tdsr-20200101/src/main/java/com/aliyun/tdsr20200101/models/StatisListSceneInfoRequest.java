// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class StatisListSceneInfoRequest extends TeaModel {
    // 开始时间
    @NameInMap("StartTime")
    public Long startTime;

    // 结束时间
    @NameInMap("EndTime")
    public Long endTime;

    // 页码
    @NameInMap("PageNum")
    public Integer pageNum;

    // 一页显示数量
    @NameInMap("PageSize")
    public Integer pageSize;

    public static StatisListSceneInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        StatisListSceneInfoRequest self = new StatisListSceneInfoRequest();
        return TeaModel.build(map, self);
    }

    public StatisListSceneInfoRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public StatisListSceneInfoRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public StatisListSceneInfoRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public StatisListSceneInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
