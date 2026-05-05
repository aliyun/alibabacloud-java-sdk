// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeCreditUsageInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>68BD3312-53D8-123E-BB32-1A9F25E07A03</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UsageInfoList")
    public java.util.List<DescribeCreditUsageInfoResponseBodyUsageInfoList> usageInfoList;

    public static DescribeCreditUsageInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreditUsageInfoResponseBody self = new DescribeCreditUsageInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCreditUsageInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCreditUsageInfoResponseBody setUsageInfoList(java.util.List<DescribeCreditUsageInfoResponseBodyUsageInfoList> usageInfoList) {
        this.usageInfoList = usageInfoList;
        return this;
    }
    public java.util.List<DescribeCreditUsageInfoResponseBodyUsageInfoList> getUsageInfoList() {
        return this.usageInfoList;
    }

    public static class DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfoCreditTrendList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-05-02 10</p>
         */
        @NameInMap("TimePoint")
        public String timePoint;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("UsedCredit")
        public Long usedCredit;

        public static DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfoCreditTrendList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfoCreditTrendList self = new DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfoCreditTrendList();
            return TeaModel.build(map, self);
        }

        public DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfoCreditTrendList setTimePoint(String timePoint) {
            this.timePoint = timePoint;
            return this;
        }
        public String getTimePoint() {
            return this.timePoint;
        }

        public DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfoCreditTrendList setUsedCredit(Long usedCredit) {
            this.usedCredit = usedCredit;
            return this;
        }
        public Long getUsedCredit() {
            return this.usedCredit;
        }

    }

    public static class DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfo extends TeaModel {
        @NameInMap("CreditTrendList")
        public java.util.List<DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfoCreditTrendList> creditTrendList;

        /**
         * <strong>example:</strong>
         * <p>cp-inst-001</p>
         */
        @NameInMap("CurrentInstanceId")
        public String currentInstanceId;

        @NameInMap("CurrentRemainCredit")
        public Long currentRemainCredit;

        @NameInMap("CurrentTotalCredit")
        public Long currentTotalCredit;

        @NameInMap("CurrentUsedCredit")
        public Long currentUsedCredit;

        @NameInMap("DayUsedCredit")
        public Long dayUsedCredit;

        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("PeriodTotalCredit")
        public Long periodTotalCredit;

        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("PeriodUsedCredit")
        public Long periodUsedCredit;

        @NameInMap("RemainCredit")
        public Long remainCredit;

        @NameInMap("TotalCredit")
        public Long totalCredit;

        @NameInMap("TotalUsedCredit")
        public Long totalUsedCredit;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("WarnPercent")
        public Integer warnPercent;

        @NameInMap("WeekUsedCredit")
        public Long weekUsedCredit;

        public static DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfo self = new DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfo setCreditTrendList(java.util.List<DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfoCreditTrendList> creditTrendList) {
            this.creditTrendList = creditTrendList;
            return this;
        }
        public java.util.List<DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfoCreditTrendList> getCreditTrendList() {
            return this.creditTrendList;
        }

        public DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfo setCurrentInstanceId(String currentInstanceId) {
            this.currentInstanceId = currentInstanceId;
            return this;
        }
        public String getCurrentInstanceId() {
            return this.currentInstanceId;
        }

        public DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfo setCurrentRemainCredit(Long currentRemainCredit) {
            this.currentRemainCredit = currentRemainCredit;
            return this;
        }
        public Long getCurrentRemainCredit() {
            return this.currentRemainCredit;
        }

        public DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfo setCurrentTotalCredit(Long currentTotalCredit) {
            this.currentTotalCredit = currentTotalCredit;
            return this;
        }
        public Long getCurrentTotalCredit() {
            return this.currentTotalCredit;
        }

        public DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfo setCurrentUsedCredit(Long currentUsedCredit) {
            this.currentUsedCredit = currentUsedCredit;
            return this;
        }
        public Long getCurrentUsedCredit() {
            return this.currentUsedCredit;
        }

        public DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfo setDayUsedCredit(Long dayUsedCredit) {
            this.dayUsedCredit = dayUsedCredit;
            return this;
        }
        public Long getDayUsedCredit() {
            return this.dayUsedCredit;
        }

        public DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfo setPeriodTotalCredit(Long periodTotalCredit) {
            this.periodTotalCredit = periodTotalCredit;
            return this;
        }
        public Long getPeriodTotalCredit() {
            return this.periodTotalCredit;
        }

        public DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfo setPeriodUsedCredit(Long periodUsedCredit) {
            this.periodUsedCredit = periodUsedCredit;
            return this;
        }
        public Long getPeriodUsedCredit() {
            return this.periodUsedCredit;
        }

        public DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfo setRemainCredit(Long remainCredit) {
            this.remainCredit = remainCredit;
            return this;
        }
        public Long getRemainCredit() {
            return this.remainCredit;
        }

        public DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfo setTotalCredit(Long totalCredit) {
            this.totalCredit = totalCredit;
            return this;
        }
        public Long getTotalCredit() {
            return this.totalCredit;
        }

        public DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfo setTotalUsedCredit(Long totalUsedCredit) {
            this.totalUsedCredit = totalUsedCredit;
            return this;
        }
        public Long getTotalUsedCredit() {
            return this.totalUsedCredit;
        }

        public DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfo setWarnPercent(Integer warnPercent) {
            this.warnPercent = warnPercent;
            return this;
        }
        public Integer getWarnPercent() {
            return this.warnPercent;
        }

        public DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfo setWeekUsedCredit(Long weekUsedCredit) {
            this.weekUsedCredit = weekUsedCredit;
            return this;
        }
        public Long getWeekUsedCredit() {
            return this.weekUsedCredit;
        }

    }

    public static class DescribeCreditUsageInfoResponseBodyUsageInfoList extends TeaModel {
        @NameInMap("UsageInfo")
        public DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfo usageInfo;

        /**
         * <strong>example:</strong>
         * <p>agent-abc</p>
         */
        @NameInMap("UsageInfoKey")
        public String usageInfoKey;

        public static DescribeCreditUsageInfoResponseBodyUsageInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCreditUsageInfoResponseBodyUsageInfoList self = new DescribeCreditUsageInfoResponseBodyUsageInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeCreditUsageInfoResponseBodyUsageInfoList setUsageInfo(DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfo usageInfo) {
            this.usageInfo = usageInfo;
            return this;
        }
        public DescribeCreditUsageInfoResponseBodyUsageInfoListUsageInfo getUsageInfo() {
            return this.usageInfo;
        }

        public DescribeCreditUsageInfoResponseBodyUsageInfoList setUsageInfoKey(String usageInfoKey) {
            this.usageInfoKey = usageInfoKey;
            return this;
        }
        public String getUsageInfoKey() {
            return this.usageInfoKey;
        }

    }

}
