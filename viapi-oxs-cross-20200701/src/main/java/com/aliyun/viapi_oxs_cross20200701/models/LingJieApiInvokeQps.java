// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_oxs_cross20200701.models;

import com.aliyun.tea.*;

public class LingJieApiInvokeQps extends TeaModel {
    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("Metrics")
    public java.util.List<LingJieApiInvokeQpsMetrics> metrics;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Region")
    public String region;

    @NameInMap("StatisticsUnit")
    public String statisticsUnit;

    @NameInMap("TimeUnit")
    public String timeUnit;

    public static LingJieApiInvokeQps build(java.util.Map<String, ?> map) throws Exception {
        LingJieApiInvokeQps self = new LingJieApiInvokeQps();
        return TeaModel.build(map, self);
    }

    public LingJieApiInvokeQps setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public LingJieApiInvokeQps setMetrics(java.util.List<LingJieApiInvokeQpsMetrics> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<LingJieApiInvokeQpsMetrics> getMetrics() {
        return this.metrics;
    }

    public LingJieApiInvokeQps setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public LingJieApiInvokeQps setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public LingJieApiInvokeQps setStatisticsUnit(String statisticsUnit) {
        this.statisticsUnit = statisticsUnit;
        return this;
    }
    public String getStatisticsUnit() {
        return this.statisticsUnit;
    }

    public LingJieApiInvokeQps setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }
    public String getTimeUnit() {
        return this.timeUnit;
    }

    public static class LingJieApiInvokeQpsMetrics extends TeaModel {
        @NameInMap("Day")
        public String day;

        @NameInMap("Hour")
        public String hour;

        @NameInMap("MaxQps")
        public Integer maxQps;

        public static LingJieApiInvokeQpsMetrics build(java.util.Map<String, ?> map) throws Exception {
            LingJieApiInvokeQpsMetrics self = new LingJieApiInvokeQpsMetrics();
            return TeaModel.build(map, self);
        }

        public LingJieApiInvokeQpsMetrics setDay(String day) {
            this.day = day;
            return this;
        }
        public String getDay() {
            return this.day;
        }

        public LingJieApiInvokeQpsMetrics setHour(String hour) {
            this.hour = hour;
            return this;
        }
        public String getHour() {
            return this.hour;
        }

        public LingJieApiInvokeQpsMetrics setMaxQps(Integer maxQps) {
            this.maxQps = maxQps;
            return this;
        }
        public Integer getMaxQps() {
            return this.maxQps;
        }

    }

}
