// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListServiceMetricsRequest extends TeaModel {
    @NameInMap("endTime")
    public String endTime;

    @NameInMap("env")
    public String env;

    @NameInMap("groupId")
    public Long groupId;

    @NameInMap("intervalInSec")
    public Integer intervalInSec;

    @NameInMap("ip")
    public String ip;

    @NameInMap("measures")
    public String measures;

    @NameInMap("serviceId")
    public Long serviceId;

    @NameInMap("startTime")
    public String startTime;

    @NameInMap("topicId")
    public Long topicId;

    @NameInMap("type")
    public String type;

    public static ListServiceMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceMetricsRequest self = new ListServiceMetricsRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceMetricsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListServiceMetricsRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ListServiceMetricsRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public ListServiceMetricsRequest setIntervalInSec(Integer intervalInSec) {
        this.intervalInSec = intervalInSec;
        return this;
    }
    public Integer getIntervalInSec() {
        return this.intervalInSec;
    }

    public ListServiceMetricsRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ListServiceMetricsRequest setMeasures(String measures) {
        this.measures = measures;
        return this;
    }
    public String getMeasures() {
        return this.measures;
    }

    public ListServiceMetricsRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public ListServiceMetricsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListServiceMetricsRequest setTopicId(Long topicId) {
        this.topicId = topicId;
        return this;
    }
    public Long getTopicId() {
        return this.topicId;
    }

    public ListServiceMetricsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
