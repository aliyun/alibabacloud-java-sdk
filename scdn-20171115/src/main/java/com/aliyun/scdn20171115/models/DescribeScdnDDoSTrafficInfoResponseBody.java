// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDDoSTrafficInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TimeScopes")
    public DescribeScdnDDoSTrafficInfoResponseBodyTimeScopes timeScopes;

    @NameInMap("BpsDrops")
    public DescribeScdnDDoSTrafficInfoResponseBodyBpsDrops bpsDrops;

    @NameInMap("PpsDrops")
    public DescribeScdnDDoSTrafficInfoResponseBodyPpsDrops ppsDrops;

    @NameInMap("BpsTotals")
    public DescribeScdnDDoSTrafficInfoResponseBodyBpsTotals bpsTotals;

    @NameInMap("PpsTotals")
    public DescribeScdnDDoSTrafficInfoResponseBodyPpsTotals ppsTotals;

    public static DescribeScdnDDoSTrafficInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDDoSTrafficInfoResponseBody self = new DescribeScdnDDoSTrafficInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDDoSTrafficInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnDDoSTrafficInfoResponseBody setTimeScopes(DescribeScdnDDoSTrafficInfoResponseBodyTimeScopes timeScopes) {
        this.timeScopes = timeScopes;
        return this;
    }
    public DescribeScdnDDoSTrafficInfoResponseBodyTimeScopes getTimeScopes() {
        return this.timeScopes;
    }

    public DescribeScdnDDoSTrafficInfoResponseBody setBpsDrops(DescribeScdnDDoSTrafficInfoResponseBodyBpsDrops bpsDrops) {
        this.bpsDrops = bpsDrops;
        return this;
    }
    public DescribeScdnDDoSTrafficInfoResponseBodyBpsDrops getBpsDrops() {
        return this.bpsDrops;
    }

    public DescribeScdnDDoSTrafficInfoResponseBody setPpsDrops(DescribeScdnDDoSTrafficInfoResponseBodyPpsDrops ppsDrops) {
        this.ppsDrops = ppsDrops;
        return this;
    }
    public DescribeScdnDDoSTrafficInfoResponseBodyPpsDrops getPpsDrops() {
        return this.ppsDrops;
    }

    public DescribeScdnDDoSTrafficInfoResponseBody setBpsTotals(DescribeScdnDDoSTrafficInfoResponseBodyBpsTotals bpsTotals) {
        this.bpsTotals = bpsTotals;
        return this;
    }
    public DescribeScdnDDoSTrafficInfoResponseBodyBpsTotals getBpsTotals() {
        return this.bpsTotals;
    }

    public DescribeScdnDDoSTrafficInfoResponseBody setPpsTotals(DescribeScdnDDoSTrafficInfoResponseBodyPpsTotals ppsTotals) {
        this.ppsTotals = ppsTotals;
        return this;
    }
    public DescribeScdnDDoSTrafficInfoResponseBodyPpsTotals getPpsTotals() {
        return this.ppsTotals;
    }

    public static class DescribeScdnDDoSTrafficInfoResponseBodyTimeScopesTimeScope extends TeaModel {
        @NameInMap("Start")
        public String start;

        @NameInMap("Interval")
        public String interval;

        public static DescribeScdnDDoSTrafficInfoResponseBodyTimeScopesTimeScope build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDDoSTrafficInfoResponseBodyTimeScopesTimeScope self = new DescribeScdnDDoSTrafficInfoResponseBodyTimeScopesTimeScope();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDDoSTrafficInfoResponseBodyTimeScopesTimeScope setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public DescribeScdnDDoSTrafficInfoResponseBodyTimeScopesTimeScope setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

    }

    public static class DescribeScdnDDoSTrafficInfoResponseBodyTimeScopes extends TeaModel {
        @NameInMap("TimeScope")
        public java.util.List<DescribeScdnDDoSTrafficInfoResponseBodyTimeScopesTimeScope> timeScope;

        public static DescribeScdnDDoSTrafficInfoResponseBodyTimeScopes build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDDoSTrafficInfoResponseBodyTimeScopes self = new DescribeScdnDDoSTrafficInfoResponseBodyTimeScopes();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDDoSTrafficInfoResponseBodyTimeScopes setTimeScope(java.util.List<DescribeScdnDDoSTrafficInfoResponseBodyTimeScopesTimeScope> timeScope) {
            this.timeScope = timeScope;
            return this;
        }
        public java.util.List<DescribeScdnDDoSTrafficInfoResponseBodyTimeScopesTimeScope> getTimeScope() {
            return this.timeScope;
        }

    }

    public static class DescribeScdnDDoSTrafficInfoResponseBodyBpsDrops extends TeaModel {
        @NameInMap("BpsDrop")
        public java.util.List<String> bpsDrop;

        public static DescribeScdnDDoSTrafficInfoResponseBodyBpsDrops build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDDoSTrafficInfoResponseBodyBpsDrops self = new DescribeScdnDDoSTrafficInfoResponseBodyBpsDrops();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDDoSTrafficInfoResponseBodyBpsDrops setBpsDrop(java.util.List<String> bpsDrop) {
            this.bpsDrop = bpsDrop;
            return this;
        }
        public java.util.List<String> getBpsDrop() {
            return this.bpsDrop;
        }

    }

    public static class DescribeScdnDDoSTrafficInfoResponseBodyPpsDrops extends TeaModel {
        @NameInMap("PpsDrop")
        public java.util.List<String> ppsDrop;

        public static DescribeScdnDDoSTrafficInfoResponseBodyPpsDrops build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDDoSTrafficInfoResponseBodyPpsDrops self = new DescribeScdnDDoSTrafficInfoResponseBodyPpsDrops();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDDoSTrafficInfoResponseBodyPpsDrops setPpsDrop(java.util.List<String> ppsDrop) {
            this.ppsDrop = ppsDrop;
            return this;
        }
        public java.util.List<String> getPpsDrop() {
            return this.ppsDrop;
        }

    }

    public static class DescribeScdnDDoSTrafficInfoResponseBodyBpsTotals extends TeaModel {
        @NameInMap("BpsTotal")
        public java.util.List<String> bpsTotal;

        public static DescribeScdnDDoSTrafficInfoResponseBodyBpsTotals build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDDoSTrafficInfoResponseBodyBpsTotals self = new DescribeScdnDDoSTrafficInfoResponseBodyBpsTotals();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDDoSTrafficInfoResponseBodyBpsTotals setBpsTotal(java.util.List<String> bpsTotal) {
            this.bpsTotal = bpsTotal;
            return this;
        }
        public java.util.List<String> getBpsTotal() {
            return this.bpsTotal;
        }

    }

    public static class DescribeScdnDDoSTrafficInfoResponseBodyPpsTotals extends TeaModel {
        @NameInMap("PpsTotal")
        public java.util.List<String> ppsTotal;

        public static DescribeScdnDDoSTrafficInfoResponseBodyPpsTotals build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDDoSTrafficInfoResponseBodyPpsTotals self = new DescribeScdnDDoSTrafficInfoResponseBodyPpsTotals();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDDoSTrafficInfoResponseBodyPpsTotals setPpsTotal(java.util.List<String> ppsTotal) {
            this.ppsTotal = ppsTotal;
            return this;
        }
        public java.util.List<String> getPpsTotal() {
            return this.ppsTotal;
        }

    }

}
