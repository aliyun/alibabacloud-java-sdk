// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ByLoadScalingRule extends TeaModel {
    // 比较符号
    @NameInMap("comparisonOperator")
    public String comparisonOperator;

    // 评估次数
    @NameInMap("evaluationCount")
    public Integer evaluationCount;

    // 指标名称
    @NameInMap("metricName")
    public String metricName;

    // 统计方式
    @NameInMap("statistics")
    public String statistics;

    // 阈值
    @NameInMap("threshold")
    public Float threshold;

    // 时间窗口
    @NameInMap("timeWindow")
    public Integer timeWindow;

    public static ByLoadScalingRule build(java.util.Map<String, ?> map) throws Exception {
        ByLoadScalingRule self = new ByLoadScalingRule();
        return TeaModel.build(map, self);
    }

    public ByLoadScalingRule setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }
    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    public ByLoadScalingRule setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public ByLoadScalingRule setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public ByLoadScalingRule setStatistics(String statistics) {
        this.statistics = statistics;
        return this;
    }
    public String getStatistics() {
        return this.statistics;
    }

    public ByLoadScalingRule setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

    public ByLoadScalingRule setTimeWindow(Integer timeWindow) {
        this.timeWindow = timeWindow;
        return this;
    }
    public Integer getTimeWindow() {
        return this.timeWindow;
    }

}
