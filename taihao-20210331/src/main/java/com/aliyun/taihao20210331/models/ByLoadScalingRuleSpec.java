// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ByLoadScalingRuleSpec extends TeaModel {
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

    public static ByLoadScalingRuleSpec build(java.util.Map<String, ?> map) throws Exception {
        ByLoadScalingRuleSpec self = new ByLoadScalingRuleSpec();
        return TeaModel.build(map, self);
    }

    public ByLoadScalingRuleSpec setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }
    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    public ByLoadScalingRuleSpec setEvaluationCount(Integer evaluationCount) {
        this.evaluationCount = evaluationCount;
        return this;
    }
    public Integer getEvaluationCount() {
        return this.evaluationCount;
    }

    public ByLoadScalingRuleSpec setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public ByLoadScalingRuleSpec setStatistics(String statistics) {
        this.statistics = statistics;
        return this;
    }
    public String getStatistics() {
        return this.statistics;
    }

    public ByLoadScalingRuleSpec setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

    public ByLoadScalingRuleSpec setTimeWindow(Integer timeWindow) {
        this.timeWindow = timeWindow;
        return this;
    }
    public Integer getTimeWindow() {
        return this.timeWindow;
    }

}
