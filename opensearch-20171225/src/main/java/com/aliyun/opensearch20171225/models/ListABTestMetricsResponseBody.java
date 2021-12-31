// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListABTestMetricsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListABTestMetricsResponseBodyResult> result;

    public static ListABTestMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListABTestMetricsResponseBody self = new ListABTestMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListABTestMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListABTestMetricsResponseBody setResult(java.util.List<ListABTestMetricsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListABTestMetricsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListABTestMetricsResponseBodyResult extends TeaModel {
        @NameInMap("ctr")
        public Float ctr;

        @NameInMap("date")
        public String date;

        @NameInMap("experimentName")
        public String experimentName;

        @NameInMap("ipv")
        public Integer ipv;

        @NameInMap("ipvUv")
        public Integer ipvUv;

        @NameInMap("pv")
        public Integer pv;

        @NameInMap("uv")
        public Integer uv;

        @NameInMap("zeroHitRate")
        public Float zeroHitRate;

        public static ListABTestMetricsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListABTestMetricsResponseBodyResult self = new ListABTestMetricsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListABTestMetricsResponseBodyResult setCtr(Float ctr) {
            this.ctr = ctr;
            return this;
        }
        public Float getCtr() {
            return this.ctr;
        }

        public ListABTestMetricsResponseBodyResult setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public ListABTestMetricsResponseBodyResult setExperimentName(String experimentName) {
            this.experimentName = experimentName;
            return this;
        }
        public String getExperimentName() {
            return this.experimentName;
        }

        public ListABTestMetricsResponseBodyResult setIpv(Integer ipv) {
            this.ipv = ipv;
            return this;
        }
        public Integer getIpv() {
            return this.ipv;
        }

        public ListABTestMetricsResponseBodyResult setIpvUv(Integer ipvUv) {
            this.ipvUv = ipvUv;
            return this;
        }
        public Integer getIpvUv() {
            return this.ipvUv;
        }

        public ListABTestMetricsResponseBodyResult setPv(Integer pv) {
            this.pv = pv;
            return this;
        }
        public Integer getPv() {
            return this.pv;
        }

        public ListABTestMetricsResponseBodyResult setUv(Integer uv) {
            this.uv = uv;
            return this;
        }
        public Integer getUv() {
            return this.uv;
        }

        public ListABTestMetricsResponseBodyResult setZeroHitRate(Float zeroHitRate) {
            this.zeroHitRate = zeroHitRate;
            return this;
        }
        public Float getZeroHitRate() {
            return this.zeroHitRate;
        }

    }

}
