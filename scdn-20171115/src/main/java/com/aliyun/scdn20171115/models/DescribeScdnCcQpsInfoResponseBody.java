// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnCcQpsInfoResponseBody extends TeaModel {
    @NameInMap("Attacks")
    public DescribeScdnCcQpsInfoResponseBodyAttacks attacks;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TimeScopes")
    public DescribeScdnCcQpsInfoResponseBodyTimeScopes timeScopes;

    @NameInMap("Totals")
    public DescribeScdnCcQpsInfoResponseBodyTotals totals;

    public static DescribeScdnCcQpsInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnCcQpsInfoResponseBody self = new DescribeScdnCcQpsInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnCcQpsInfoResponseBody setAttacks(DescribeScdnCcQpsInfoResponseBodyAttacks attacks) {
        this.attacks = attacks;
        return this;
    }
    public DescribeScdnCcQpsInfoResponseBodyAttacks getAttacks() {
        return this.attacks;
    }

    public DescribeScdnCcQpsInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnCcQpsInfoResponseBody setTimeScopes(DescribeScdnCcQpsInfoResponseBodyTimeScopes timeScopes) {
        this.timeScopes = timeScopes;
        return this;
    }
    public DescribeScdnCcQpsInfoResponseBodyTimeScopes getTimeScopes() {
        return this.timeScopes;
    }

    public DescribeScdnCcQpsInfoResponseBody setTotals(DescribeScdnCcQpsInfoResponseBodyTotals totals) {
        this.totals = totals;
        return this;
    }
    public DescribeScdnCcQpsInfoResponseBodyTotals getTotals() {
        return this.totals;
    }

    public static class DescribeScdnCcQpsInfoResponseBodyAttacks extends TeaModel {
        @NameInMap("Attack")
        public java.util.List<String> attack;

        public static DescribeScdnCcQpsInfoResponseBodyAttacks build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnCcQpsInfoResponseBodyAttacks self = new DescribeScdnCcQpsInfoResponseBodyAttacks();
            return TeaModel.build(map, self);
        }

        public DescribeScdnCcQpsInfoResponseBodyAttacks setAttack(java.util.List<String> attack) {
            this.attack = attack;
            return this;
        }
        public java.util.List<String> getAttack() {
            return this.attack;
        }

    }

    public static class DescribeScdnCcQpsInfoResponseBodyTimeScopesTimeScope extends TeaModel {
        @NameInMap("Interval")
        public String interval;

        @NameInMap("Start")
        public String start;

        public static DescribeScdnCcQpsInfoResponseBodyTimeScopesTimeScope build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnCcQpsInfoResponseBodyTimeScopesTimeScope self = new DescribeScdnCcQpsInfoResponseBodyTimeScopesTimeScope();
            return TeaModel.build(map, self);
        }

        public DescribeScdnCcQpsInfoResponseBodyTimeScopesTimeScope setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public DescribeScdnCcQpsInfoResponseBodyTimeScopesTimeScope setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class DescribeScdnCcQpsInfoResponseBodyTimeScopes extends TeaModel {
        @NameInMap("TimeScope")
        public java.util.List<DescribeScdnCcQpsInfoResponseBodyTimeScopesTimeScope> timeScope;

        public static DescribeScdnCcQpsInfoResponseBodyTimeScopes build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnCcQpsInfoResponseBodyTimeScopes self = new DescribeScdnCcQpsInfoResponseBodyTimeScopes();
            return TeaModel.build(map, self);
        }

        public DescribeScdnCcQpsInfoResponseBodyTimeScopes setTimeScope(java.util.List<DescribeScdnCcQpsInfoResponseBodyTimeScopesTimeScope> timeScope) {
            this.timeScope = timeScope;
            return this;
        }
        public java.util.List<DescribeScdnCcQpsInfoResponseBodyTimeScopesTimeScope> getTimeScope() {
            return this.timeScope;
        }

    }

    public static class DescribeScdnCcQpsInfoResponseBodyTotals extends TeaModel {
        @NameInMap("Total")
        public java.util.List<String> total;

        public static DescribeScdnCcQpsInfoResponseBodyTotals build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnCcQpsInfoResponseBodyTotals self = new DescribeScdnCcQpsInfoResponseBodyTotals();
            return TeaModel.build(map, self);
        }

        public DescribeScdnCcQpsInfoResponseBodyTotals setTotal(java.util.List<String> total) {
            this.total = total;
            return this;
        }
        public java.util.List<String> getTotal() {
            return this.total;
        }

    }

}
