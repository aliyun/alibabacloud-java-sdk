// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListAppGroupMetricsRequest extends TeaModel {
    @NameInMap("metricType")
    public String metricType;

    @NameInMap("startTime")
    public Integer startTime;

    @NameInMap("endTime")
    public Integer endTime;

    @NameInMap("indexes")
    public String indexes;

    public static ListAppGroupMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppGroupMetricsRequest self = new ListAppGroupMetricsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppGroupMetricsRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public ListAppGroupMetricsRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public ListAppGroupMetricsRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public ListAppGroupMetricsRequest setIndexes(String indexes) {
        this.indexes = indexes;
        return this;
    }
    public String getIndexes() {
        return this.indexes;
    }

}
