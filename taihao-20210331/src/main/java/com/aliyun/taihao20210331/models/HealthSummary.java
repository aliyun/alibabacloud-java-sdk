// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class HealthSummary extends TeaModel {
    // 异常数
    @NameInMap("badCount")
    public Integer badCount;

    // 良好数
    @NameInMap("goodCount")
    public Integer goodCount;

    // 无状态数
    @NameInMap("noneCount")
    public Integer noneCount;

    // 资源类型
    @NameInMap("resourceType")
    public String resourceType;

    // 停止数
    @NameInMap("stoppedCount")
    public Integer stoppedCount;

    // 组件实例总数
    @NameInMap("totalCount")
    public Integer totalCount;

    // 未知数
    @NameInMap("unknownCount")
    public Integer unknownCount;

    // 警告数
    @NameInMap("warningCount")
    public Integer warningCount;

    public static HealthSummary build(java.util.Map<String, ?> map) throws Exception {
        HealthSummary self = new HealthSummary();
        return TeaModel.build(map, self);
    }

    public HealthSummary setBadCount(Integer badCount) {
        this.badCount = badCount;
        return this;
    }
    public Integer getBadCount() {
        return this.badCount;
    }

    public HealthSummary setGoodCount(Integer goodCount) {
        this.goodCount = goodCount;
        return this;
    }
    public Integer getGoodCount() {
        return this.goodCount;
    }

    public HealthSummary setNoneCount(Integer noneCount) {
        this.noneCount = noneCount;
        return this;
    }
    public Integer getNoneCount() {
        return this.noneCount;
    }

    public HealthSummary setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public HealthSummary setStoppedCount(Integer stoppedCount) {
        this.stoppedCount = stoppedCount;
        return this;
    }
    public Integer getStoppedCount() {
        return this.stoppedCount;
    }

    public HealthSummary setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public HealthSummary setUnknownCount(Integer unknownCount) {
        this.unknownCount = unknownCount;
        return this;
    }
    public Integer getUnknownCount() {
        return this.unknownCount;
    }

    public HealthSummary setWarningCount(Integer warningCount) {
        this.warningCount = warningCount;
        return this;
    }
    public Integer getWarningCount() {
        return this.warningCount;
    }

}
