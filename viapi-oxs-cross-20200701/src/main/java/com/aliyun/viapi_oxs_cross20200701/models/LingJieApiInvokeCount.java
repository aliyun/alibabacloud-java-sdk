// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_oxs_cross20200701.models;

import com.aliyun.tea.*;

public class LingJieApiInvokeCount extends TeaModel {
    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("Metrics")
    public java.util.List<LingJieApiInvokeCountMetrics> metrics;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Region")
    public String region;

    @NameInMap("StatisticsUnit")
    public String statisticsUnit;

    @NameInMap("TimeUnit")
    public String timeUnit;

    public static LingJieApiInvokeCount build(java.util.Map<String, ?> map) throws Exception {
        LingJieApiInvokeCount self = new LingJieApiInvokeCount();
        return TeaModel.build(map, self);
    }

    public LingJieApiInvokeCount setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public LingJieApiInvokeCount setMetrics(java.util.List<LingJieApiInvokeCountMetrics> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<LingJieApiInvokeCountMetrics> getMetrics() {
        return this.metrics;
    }

    public LingJieApiInvokeCount setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public LingJieApiInvokeCount setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public LingJieApiInvokeCount setStatisticsUnit(String statisticsUnit) {
        this.statisticsUnit = statisticsUnit;
        return this;
    }
    public String getStatisticsUnit() {
        return this.statisticsUnit;
    }

    public LingJieApiInvokeCount setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }
    public String getTimeUnit() {
        return this.timeUnit;
    }

    public static class LingJieApiInvokeCountMetrics extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Day")
        public String day;

        @NameInMap("Hour")
        public String hour;

        public static LingJieApiInvokeCountMetrics build(java.util.Map<String, ?> map) throws Exception {
            LingJieApiInvokeCountMetrics self = new LingJieApiInvokeCountMetrics();
            return TeaModel.build(map, self);
        }

        public LingJieApiInvokeCountMetrics setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public LingJieApiInvokeCountMetrics setDay(String day) {
            this.day = day;
            return this;
        }
        public String getDay() {
            return this.day;
        }

        public LingJieApiInvokeCountMetrics setHour(String hour) {
            this.hour = hour;
            return this;
        }
        public String getHour() {
            return this.hour;
        }

    }

}
