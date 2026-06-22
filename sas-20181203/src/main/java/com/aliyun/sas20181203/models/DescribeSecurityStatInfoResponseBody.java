// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecurityStatInfoResponseBody extends TeaModel {
    /**
     * <p>The statistics of attack events.</p>
     */
    @NameInMap("AttackEvent")
    public DescribeSecurityStatInfoResponseBodyAttackEvent attackEvent;

    /**
     * <p>The statistics of baseline issues.</p>
     */
    @NameInMap("HealthCheck")
    public DescribeSecurityStatInfoResponseBodyHealthCheck healthCheck;

    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>A3E61730-85E2-4789-8017-B9B1B70F0568</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The statistics of pending security alerts.</p>
     */
    @NameInMap("SecurityEvent")
    public DescribeSecurityStatInfoResponseBodySecurityEvent securityEvent;

    /**
     * <p>Indicates whether the query is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Successful.</li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The statistics information of unfixed vulnerabilities.</p>
     */
    @NameInMap("Vulnerability")
    public DescribeSecurityStatInfoResponseBodyVulnerability vulnerability;

    public static DescribeSecurityStatInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityStatInfoResponseBody self = new DescribeSecurityStatInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityStatInfoResponseBody setAttackEvent(DescribeSecurityStatInfoResponseBodyAttackEvent attackEvent) {
        this.attackEvent = attackEvent;
        return this;
    }
    public DescribeSecurityStatInfoResponseBodyAttackEvent getAttackEvent() {
        return this.attackEvent;
    }

    public DescribeSecurityStatInfoResponseBody setHealthCheck(DescribeSecurityStatInfoResponseBodyHealthCheck healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public DescribeSecurityStatInfoResponseBodyHealthCheck getHealthCheck() {
        return this.healthCheck;
    }

    public DescribeSecurityStatInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecurityStatInfoResponseBody setSecurityEvent(DescribeSecurityStatInfoResponseBodySecurityEvent securityEvent) {
        this.securityEvent = securityEvent;
        return this;
    }
    public DescribeSecurityStatInfoResponseBodySecurityEvent getSecurityEvent() {
        return this.securityEvent;
    }

    public DescribeSecurityStatInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeSecurityStatInfoResponseBody setVulnerability(DescribeSecurityStatInfoResponseBodyVulnerability vulnerability) {
        this.vulnerability = vulnerability;
        return this;
    }
    public DescribeSecurityStatInfoResponseBodyVulnerability getVulnerability() {
        return this.vulnerability;
    }

    public static class DescribeSecurityStatInfoResponseBodyAttackEvent extends TeaModel {
        /**
         * <p>The collection of statistical time points in the attack count trend chart.</p>
         */
        @NameInMap("DateArray")
        public java.util.List<String> dateArray;

        /**
         * <p>The number of attacks on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>1096</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The collection of attack counts at each statistical time point.</p>
         */
        @NameInMap("ValueArray")
        public java.util.List<String> valueArray;

        public static DescribeSecurityStatInfoResponseBodyAttackEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityStatInfoResponseBodyAttackEvent self = new DescribeSecurityStatInfoResponseBodyAttackEvent();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityStatInfoResponseBodyAttackEvent setDateArray(java.util.List<String> dateArray) {
            this.dateArray = dateArray;
            return this;
        }
        public java.util.List<String> getDateArray() {
            return this.dateArray;
        }

        public DescribeSecurityStatInfoResponseBodyAttackEvent setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeSecurityStatInfoResponseBodyAttackEvent setValueArray(java.util.List<String> valueArray) {
            this.valueArray = valueArray;
            return this;
        }
        public java.util.List<String> getValueArray() {
            return this.valueArray;
        }

    }

    public static class DescribeSecurityStatInfoResponseBodyHealthCheck extends TeaModel {
        /**
         * <p>The collection of statistical time points in the baseline issue trend chart.</p>
         */
        @NameInMap("DateArray")
        public java.util.List<String> dateArray;

        /**
         * <p>The number of high-risk baseline issues on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("HighCount")
        public Integer highCount;

        /**
         * <p>The collection of high-risk baseline counts at each statistical time point.</p>
         */
        @NameInMap("HighList")
        public java.util.List<String> highList;

        /**
         * <p>The collection of baseline risk levels included in the statistics.</p>
         */
        @NameInMap("LevelsOn")
        public java.util.List<String> levelsOn;

        /**
         * <p>The number of low-risk baseline issues on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LowCount")
        public Integer lowCount;

        /**
         * <p>The collection of low-risk baseline issue counts at each statistical time point.</p>
         */
        @NameInMap("LowList")
        public java.util.List<String> lowList;

        /**
         * <p>The number of medium-risk baseline issues on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("MediumCount")
        public Integer mediumCount;

        /**
         * <p>The collection of medium-risk baseline issue counts at each statistical time point.</p>
         */
        @NameInMap("MediumList")
        public java.util.List<String> mediumList;

        /**
         * <p>The collection of statistical time periods for baselines.</p>
         */
        @NameInMap("TimeArray")
        public java.util.List<String> timeArray;

        /**
         * <p>The total number of baseline issues on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The collection of total baseline counts at each statistical time point.</p>
         */
        @NameInMap("ValueArray")
        public java.util.List<String> valueArray;

        public static DescribeSecurityStatInfoResponseBodyHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityStatInfoResponseBodyHealthCheck self = new DescribeSecurityStatInfoResponseBodyHealthCheck();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityStatInfoResponseBodyHealthCheck setDateArray(java.util.List<String> dateArray) {
            this.dateArray = dateArray;
            return this;
        }
        public java.util.List<String> getDateArray() {
            return this.dateArray;
        }

        public DescribeSecurityStatInfoResponseBodyHealthCheck setHighCount(Integer highCount) {
            this.highCount = highCount;
            return this;
        }
        public Integer getHighCount() {
            return this.highCount;
        }

        public DescribeSecurityStatInfoResponseBodyHealthCheck setHighList(java.util.List<String> highList) {
            this.highList = highList;
            return this;
        }
        public java.util.List<String> getHighList() {
            return this.highList;
        }

        public DescribeSecurityStatInfoResponseBodyHealthCheck setLevelsOn(java.util.List<String> levelsOn) {
            this.levelsOn = levelsOn;
            return this;
        }
        public java.util.List<String> getLevelsOn() {
            return this.levelsOn;
        }

        public DescribeSecurityStatInfoResponseBodyHealthCheck setLowCount(Integer lowCount) {
            this.lowCount = lowCount;
            return this;
        }
        public Integer getLowCount() {
            return this.lowCount;
        }

        public DescribeSecurityStatInfoResponseBodyHealthCheck setLowList(java.util.List<String> lowList) {
            this.lowList = lowList;
            return this;
        }
        public java.util.List<String> getLowList() {
            return this.lowList;
        }

        public DescribeSecurityStatInfoResponseBodyHealthCheck setMediumCount(Integer mediumCount) {
            this.mediumCount = mediumCount;
            return this;
        }
        public Integer getMediumCount() {
            return this.mediumCount;
        }

        public DescribeSecurityStatInfoResponseBodyHealthCheck setMediumList(java.util.List<String> mediumList) {
            this.mediumList = mediumList;
            return this;
        }
        public java.util.List<String> getMediumList() {
            return this.mediumList;
        }

        public DescribeSecurityStatInfoResponseBodyHealthCheck setTimeArray(java.util.List<String> timeArray) {
            this.timeArray = timeArray;
            return this;
        }
        public java.util.List<String> getTimeArray() {
            return this.timeArray;
        }

        public DescribeSecurityStatInfoResponseBodyHealthCheck setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeSecurityStatInfoResponseBodyHealthCheck setValueArray(java.util.List<String> valueArray) {
            this.valueArray = valueArray;
            return this;
        }
        public java.util.List<String> getValueArray() {
            return this.valueArray;
        }

    }

    public static class DescribeSecurityStatInfoResponseBodySecurityEvent extends TeaModel {
        /**
         * <p>The collection of statistical time points in the pending alert trend chart.</p>
         */
        @NameInMap("DateArray")
        public java.util.List<String> dateArray;

        /**
         * <p>The collection of alert severity levels included in the statistics for pending alerts.</p>
         */
        @NameInMap("LevelsOn")
        public java.util.List<String> levelsOn;

        /**
         * <p>The number of alerts with the <strong>Reminder</strong> severity level detected on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemindCount")
        public Integer remindCount;

        /**
         * <p>The collection of Reminder-level alert counts at each statistical time point.</p>
         */
        @NameInMap("RemindList")
        public java.util.List<String> remindList;

        /**
         * <p>The number of alerts with the <strong>Urgent</strong> severity level on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>404</p>
         */
        @NameInMap("SeriousCount")
        public Integer seriousCount;

        /**
         * <p>The collection of Urgent-level alert counts at each statistical time point.</p>
         */
        @NameInMap("SeriousList")
        public java.util.List<String> seriousList;

        /**
         * <p>The number of alerts with the <strong>Suspicious</strong> severity level on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>148</p>
         */
        @NameInMap("SuspiciousCount")
        public Integer suspiciousCount;

        /**
         * <p>The collection of Suspicious-level alert counts at each statistical time point.</p>
         */
        @NameInMap("SuspiciousList")
        public java.util.List<String> suspiciousList;

        /**
         * <p>The collection of statistical time periods for alerts.</p>
         */
        @NameInMap("TimeArray")
        public java.util.List<String> timeArray;

        /**
         * <p>The total number of pending alerts on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>552</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The collection of pending alert counts at each statistical time point.</p>
         */
        @NameInMap("ValueArray")
        public java.util.List<String> valueArray;

        public static DescribeSecurityStatInfoResponseBodySecurityEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityStatInfoResponseBodySecurityEvent self = new DescribeSecurityStatInfoResponseBodySecurityEvent();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityStatInfoResponseBodySecurityEvent setDateArray(java.util.List<String> dateArray) {
            this.dateArray = dateArray;
            return this;
        }
        public java.util.List<String> getDateArray() {
            return this.dateArray;
        }

        public DescribeSecurityStatInfoResponseBodySecurityEvent setLevelsOn(java.util.List<String> levelsOn) {
            this.levelsOn = levelsOn;
            return this;
        }
        public java.util.List<String> getLevelsOn() {
            return this.levelsOn;
        }

        public DescribeSecurityStatInfoResponseBodySecurityEvent setRemindCount(Integer remindCount) {
            this.remindCount = remindCount;
            return this;
        }
        public Integer getRemindCount() {
            return this.remindCount;
        }

        public DescribeSecurityStatInfoResponseBodySecurityEvent setRemindList(java.util.List<String> remindList) {
            this.remindList = remindList;
            return this;
        }
        public java.util.List<String> getRemindList() {
            return this.remindList;
        }

        public DescribeSecurityStatInfoResponseBodySecurityEvent setSeriousCount(Integer seriousCount) {
            this.seriousCount = seriousCount;
            return this;
        }
        public Integer getSeriousCount() {
            return this.seriousCount;
        }

        public DescribeSecurityStatInfoResponseBodySecurityEvent setSeriousList(java.util.List<String> seriousList) {
            this.seriousList = seriousList;
            return this;
        }
        public java.util.List<String> getSeriousList() {
            return this.seriousList;
        }

        public DescribeSecurityStatInfoResponseBodySecurityEvent setSuspiciousCount(Integer suspiciousCount) {
            this.suspiciousCount = suspiciousCount;
            return this;
        }
        public Integer getSuspiciousCount() {
            return this.suspiciousCount;
        }

        public DescribeSecurityStatInfoResponseBodySecurityEvent setSuspiciousList(java.util.List<String> suspiciousList) {
            this.suspiciousList = suspiciousList;
            return this;
        }
        public java.util.List<String> getSuspiciousList() {
            return this.suspiciousList;
        }

        public DescribeSecurityStatInfoResponseBodySecurityEvent setTimeArray(java.util.List<String> timeArray) {
            this.timeArray = timeArray;
            return this;
        }
        public java.util.List<String> getTimeArray() {
            return this.timeArray;
        }

        public DescribeSecurityStatInfoResponseBodySecurityEvent setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeSecurityStatInfoResponseBodySecurityEvent setValueArray(java.util.List<String> valueArray) {
            this.valueArray = valueArray;
            return this;
        }
        public java.util.List<String> getValueArray() {
            return this.valueArray;
        }

    }

    public static class DescribeSecurityStatInfoResponseBodyVulnerability extends TeaModel {
        /**
         * <p>The number of unfixed vulnerabilities with <strong>high</strong> priority on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>109</p>
         */
        @NameInMap("AsapCount")
        public Integer asapCount;

        /**
         * <p>The collection of high-priority unfixed vulnerability counts at each statistical time point.</p>
         */
        @NameInMap("AsapList")
        public java.util.List<String> asapList;

        /**
         * <p>The collection of statistical time points in the unfixed vulnerability trend chart.</p>
         */
        @NameInMap("DateArray")
        public java.util.List<String> dateArray;

        /**
         * <p>The number of unfixed vulnerabilities with <strong>medium</strong> priority on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>275</p>
         */
        @NameInMap("LaterCount")
        public Integer laterCount;

        /**
         * <p>The collection of medium-priority unfixed vulnerability counts at each statistical time point.</p>
         */
        @NameInMap("LaterList")
        public java.util.List<String> laterList;

        /**
         * <p>The collection of vulnerability priority levels included in the statistics for unfixed vulnerabilities.</p>
         */
        @NameInMap("LevelsOn")
        public java.util.List<String> levelsOn;

        /**
         * <p>The number of unfixed vulnerabilities with <strong>low</strong> priority on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NntfCount")
        public Integer nntfCount;

        /**
         * <p>The collection of low-priority unfixed vulnerability counts at each statistical time point.</p>
         */
        @NameInMap("NntfList")
        public java.util.List<String> nntfList;

        /**
         * <p>The collection of statistical time periods for unfixed vulnerabilities.</p>
         */
        @NameInMap("TimeArray")
        public java.util.List<String> timeArray;

        /**
         * <p>The number of unfixed vulnerabilities on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>384</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The collection of unfixed vulnerability counts at each statistical time point.</p>
         */
        @NameInMap("ValueArray")
        public java.util.List<String> valueArray;

        public static DescribeSecurityStatInfoResponseBodyVulnerability build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityStatInfoResponseBodyVulnerability self = new DescribeSecurityStatInfoResponseBodyVulnerability();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityStatInfoResponseBodyVulnerability setAsapCount(Integer asapCount) {
            this.asapCount = asapCount;
            return this;
        }
        public Integer getAsapCount() {
            return this.asapCount;
        }

        public DescribeSecurityStatInfoResponseBodyVulnerability setAsapList(java.util.List<String> asapList) {
            this.asapList = asapList;
            return this;
        }
        public java.util.List<String> getAsapList() {
            return this.asapList;
        }

        public DescribeSecurityStatInfoResponseBodyVulnerability setDateArray(java.util.List<String> dateArray) {
            this.dateArray = dateArray;
            return this;
        }
        public java.util.List<String> getDateArray() {
            return this.dateArray;
        }

        public DescribeSecurityStatInfoResponseBodyVulnerability setLaterCount(Integer laterCount) {
            this.laterCount = laterCount;
            return this;
        }
        public Integer getLaterCount() {
            return this.laterCount;
        }

        public DescribeSecurityStatInfoResponseBodyVulnerability setLaterList(java.util.List<String> laterList) {
            this.laterList = laterList;
            return this;
        }
        public java.util.List<String> getLaterList() {
            return this.laterList;
        }

        public DescribeSecurityStatInfoResponseBodyVulnerability setLevelsOn(java.util.List<String> levelsOn) {
            this.levelsOn = levelsOn;
            return this;
        }
        public java.util.List<String> getLevelsOn() {
            return this.levelsOn;
        }

        public DescribeSecurityStatInfoResponseBodyVulnerability setNntfCount(Integer nntfCount) {
            this.nntfCount = nntfCount;
            return this;
        }
        public Integer getNntfCount() {
            return this.nntfCount;
        }

        public DescribeSecurityStatInfoResponseBodyVulnerability setNntfList(java.util.List<String> nntfList) {
            this.nntfList = nntfList;
            return this;
        }
        public java.util.List<String> getNntfList() {
            return this.nntfList;
        }

        public DescribeSecurityStatInfoResponseBodyVulnerability setTimeArray(java.util.List<String> timeArray) {
            this.timeArray = timeArray;
            return this;
        }
        public java.util.List<String> getTimeArray() {
            return this.timeArray;
        }

        public DescribeSecurityStatInfoResponseBodyVulnerability setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeSecurityStatInfoResponseBodyVulnerability setValueArray(java.util.List<String> valueArray) {
            this.valueArray = valueArray;
            return this;
        }
        public java.util.List<String> getValueArray() {
            return this.valueArray;
        }

    }

}
