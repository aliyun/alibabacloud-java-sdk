// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecStatisticsResponseBody extends TeaModel {
    /**
     * <p>The returned results.</p>
     */
    @NameInMap("Data")
    public DescribeApisecStatisticsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>221F0F14-54C6-59A1-9967-72***81B61A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApisecStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecStatisticsResponseBody self = new DescribeApisecStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApisecStatisticsResponseBody setData(DescribeApisecStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeApisecStatisticsResponseBodyData getData() {
        return this.data;
    }

    public DescribeApisecStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeApisecStatisticsResponseBodyData extends TeaModel {
        /**
         * <p>The number of handled events.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Actioned")
        public Long actioned;

        /**
         * <p>The number of APIs.</p>
         * 
         * <strong>example:</strong>
         * <p>/api/v1/login</p>
         */
        @NameInMap("Api")
        public Long api;

        /**
         * <p>The number of confirmed events.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Confirmed")
        public Long confirmed;

        /**
         * <p>The number of domain names.</p>
         * 
         * <strong>example:</strong>
         * <p>a.aliyun.com</p>
         */
        @NameInMap("Domain")
        public Long domain;

        /**
         * <p>The number of fixed risks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Fixed")
        public Long fixed;

        /**
         * <p>The number of high-risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("High")
        public Long high;

        /**
         * <p>The number of ignored risks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Ignore")
        public Long ignore;

        /**
         * <p>The number of low-risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Low")
        public Long low;

        /**
         * <p>The number of moderate-risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Medium")
        public Long medium;

        /**
         * <p>The number of events to be confirmed.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ToBeConfirmed")
        public Long toBeConfirmed;

        /**
         * <p>The number of risks to be fixed.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ToBeFixed")
        public Long toBeFixed;

        /**
         * <p>The number of new high-risk events today.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TodayHigh")
        public String todayHigh;

        /**
         * <p>The number of new low-risk events today.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TodayLow")
        public Long todayLow;

        /**
         * <p>The number of new moderate-risk events today.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TodayMedium")
        public String todayMedium;

        /**
         * <p>The total number of new events today.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TodayTotal")
        public String todayTotal;

        /**
         * <p>The total number of events.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Total")
        public Long total;

        public static DescribeApisecStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisecStatisticsResponseBodyData self = new DescribeApisecStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApisecStatisticsResponseBodyData setActioned(Long actioned) {
            this.actioned = actioned;
            return this;
        }
        public Long getActioned() {
            return this.actioned;
        }

        public DescribeApisecStatisticsResponseBodyData setApi(Long api) {
            this.api = api;
            return this;
        }
        public Long getApi() {
            return this.api;
        }

        public DescribeApisecStatisticsResponseBodyData setConfirmed(Long confirmed) {
            this.confirmed = confirmed;
            return this;
        }
        public Long getConfirmed() {
            return this.confirmed;
        }

        public DescribeApisecStatisticsResponseBodyData setDomain(Long domain) {
            this.domain = domain;
            return this;
        }
        public Long getDomain() {
            return this.domain;
        }

        public DescribeApisecStatisticsResponseBodyData setFixed(Long fixed) {
            this.fixed = fixed;
            return this;
        }
        public Long getFixed() {
            return this.fixed;
        }

        public DescribeApisecStatisticsResponseBodyData setHigh(Long high) {
            this.high = high;
            return this;
        }
        public Long getHigh() {
            return this.high;
        }

        public DescribeApisecStatisticsResponseBodyData setIgnore(Long ignore) {
            this.ignore = ignore;
            return this;
        }
        public Long getIgnore() {
            return this.ignore;
        }

        public DescribeApisecStatisticsResponseBodyData setLow(Long low) {
            this.low = low;
            return this;
        }
        public Long getLow() {
            return this.low;
        }

        public DescribeApisecStatisticsResponseBodyData setMedium(Long medium) {
            this.medium = medium;
            return this;
        }
        public Long getMedium() {
            return this.medium;
        }

        public DescribeApisecStatisticsResponseBodyData setToBeConfirmed(Long toBeConfirmed) {
            this.toBeConfirmed = toBeConfirmed;
            return this;
        }
        public Long getToBeConfirmed() {
            return this.toBeConfirmed;
        }

        public DescribeApisecStatisticsResponseBodyData setToBeFixed(Long toBeFixed) {
            this.toBeFixed = toBeFixed;
            return this;
        }
        public Long getToBeFixed() {
            return this.toBeFixed;
        }

        public DescribeApisecStatisticsResponseBodyData setTodayHigh(String todayHigh) {
            this.todayHigh = todayHigh;
            return this;
        }
        public String getTodayHigh() {
            return this.todayHigh;
        }

        public DescribeApisecStatisticsResponseBodyData setTodayLow(Long todayLow) {
            this.todayLow = todayLow;
            return this;
        }
        public Long getTodayLow() {
            return this.todayLow;
        }

        public DescribeApisecStatisticsResponseBodyData setTodayMedium(String todayMedium) {
            this.todayMedium = todayMedium;
            return this;
        }
        public String getTodayMedium() {
            return this.todayMedium;
        }

        public DescribeApisecStatisticsResponseBodyData setTodayTotal(String todayTotal) {
            this.todayTotal = todayTotal;
            return this;
        }
        public String getTodayTotal() {
            return this.todayTotal;
        }

        public DescribeApisecStatisticsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
