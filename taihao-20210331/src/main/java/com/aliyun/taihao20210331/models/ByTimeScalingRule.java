// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ByTimeScalingRule extends TeaModel {
    // 结束时间戳（秒）
    @NameInMap("endTime")
    public Long endTime;

    // 启动时间戳（秒）
    @NameInMap("launchTime")
    public Long launchTime;

    // 指定时间规则的执行类型
    @NameInMap("recurrenceType")
    public String recurrenceType;

    // 重复执行定时任务的数值
    @NameInMap("recurrenceValue")
    public String recurrenceValue;

    public static ByTimeScalingRule build(java.util.Map<String, ?> map) throws Exception {
        ByTimeScalingRule self = new ByTimeScalingRule();
        return TeaModel.build(map, self);
    }

    public ByTimeScalingRule setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ByTimeScalingRule setLaunchTime(Long launchTime) {
        this.launchTime = launchTime;
        return this;
    }
    public Long getLaunchTime() {
        return this.launchTime;
    }

    public ByTimeScalingRule setRecurrenceType(String recurrenceType) {
        this.recurrenceType = recurrenceType;
        return this;
    }
    public String getRecurrenceType() {
        return this.recurrenceType;
    }

    public ByTimeScalingRule setRecurrenceValue(String recurrenceValue) {
        this.recurrenceValue = recurrenceValue;
        return this;
    }
    public String getRecurrenceValue() {
        return this.recurrenceValue;
    }

}
