// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecurityStatInfoResponseBody extends TeaModel {
    // The detailed statistics of attacks.
    @NameInMap("AttackEvent")
    public DescribeSecurityStatInfoResponseBodyAttackEvent attackEvent;

    // The detailed statistics of baseline risk items.
    @NameInMap("HealthCheck")
    public DescribeSecurityStatInfoResponseBodyHealthCheck healthCheck;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The detailed statistics of unhandled alerts.
    @NameInMap("SecurityEvent")
    public DescribeSecurityStatInfoResponseBodySecurityEvent securityEvent;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   **true**: The request was successful.
    // *   **false**: The request failed.
    @NameInMap("Success")
    public Boolean success;

    // The detailed statistics of unfixed vulnerabilities.
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
        // The points in time when the number of attacks is collected in the trend chart.
        @NameInMap("DateArray")
        public java.util.List<String> dateArray;

        // The total number of attacks on the current day.
        @NameInMap("TotalCount")
        public Integer totalCount;

        // The numbers of attacks at all points in time.
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
        // The points in time when data of baseline risk items is collected in the trend chart.
        @NameInMap("DateArray")
        public java.util.List<String> dateArray;

        // The number of baseline risk items that have the high-risk level on the current day.
        @NameInMap("HighCount")
        public Integer highCount;

        // The numbers of baseline risk items that have the high-risk level at all points in time.
        @NameInMap("HighList")
        public java.util.List<String> highList;

        // The risk levels of baseline risk items.
        @NameInMap("LevelsOn")
        public java.util.List<String> levelsOn;

        // The number of baseline risk items that have the low-risk level on the current day.
        @NameInMap("LowCount")
        public Integer lowCount;

        // The numbers of baseline risk items that have the low-risk level at all points in time.
        @NameInMap("LowList")
        public java.util.List<String> lowList;

        // The number of baseline risk items that have the medium-risk level on the current day.
        @NameInMap("MediumCount")
        public Integer mediumCount;

        // The numbers of baseline risk items that have the medium-risk level at all points in time.
        @NameInMap("MediumList")
        public java.util.List<String> mediumList;

        // The time periods during which data of baseline risk items is collected.
        @NameInMap("TimeArray")
        public java.util.List<String> timeArray;

        // The total number of baseline risk items on the current day.
        @NameInMap("TotalCount")
        public Integer totalCount;

        // The total number of baseline risk items at all points in time.
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
        // The points in time when data of unhandled alerts is collected in the trend chart.
        @NameInMap("DateArray")
        public java.util.List<String> dateArray;

        // The risk levels of unhandled alerts.
        @NameInMap("LevelsOn")
        public java.util.List<String> levelsOn;

        // The number of **remind** alerts on the current day.
        @NameInMap("RemindCount")
        public Integer remindCount;

        // The numbers of remind alerts at all points in time.
        @NameInMap("RemindList")
        public java.util.List<String> remindList;

        // The number of **serious** alerts on the current day.
        @NameInMap("SeriousCount")
        public Integer seriousCount;

        // The numbers of serious alerts at all points in time.
        @NameInMap("SeriousList")
        public java.util.List<String> seriousList;

        // The number of **suspicious** alerts on the current day.
        @NameInMap("SuspiciousCount")
        public Integer suspiciousCount;

        // The numbers of suspicious alerts at all points in time.
        @NameInMap("SuspiciousList")
        public java.util.List<String> suspiciousList;

        // The time periods during which data of the same alert is collected.
        @NameInMap("TimeArray")
        public java.util.List<String> timeArray;

        // The total number of unhandled alerts on the current day.
        @NameInMap("TotalCount")
        public Integer totalCount;

        // The numbers of unhandled alerts at all points in time.
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
        // The number of **high-risk** unfixed vulnerabilities on the current day.
        @NameInMap("AsapCount")
        public Integer asapCount;

        // The numbers of high-risk unfixed vulnerabilities at all points in time.
        @NameInMap("AsapList")
        public java.util.List<String> asapList;

        // The points in time when data of unfixed vulnerabilities is collected in the trend chart.
        @NameInMap("DateArray")
        public java.util.List<String> dateArray;

        // The number of **medium-risk** unfixed vulnerabilities on the current day.
        @NameInMap("LaterCount")
        public Integer laterCount;

        // The numbers of medium-risk unfixed vulnerabilities at all points in time.
        @NameInMap("LaterList")
        public java.util.List<String> laterList;

        // The risk levels of unfixed vulnerabilities.
        @NameInMap("LevelsOn")
        public java.util.List<String> levelsOn;

        // The number of **low-risk** unfixed vulnerabilities on the current day.
        @NameInMap("NntfCount")
        public Integer nntfCount;

        // The numbers of low-risk unfixed vulnerabilities at all points in time.
        @NameInMap("NntfList")
        public java.util.List<String> nntfList;

        // The time periods during which data of unfixed vulnerabilities is collected.
        @NameInMap("TimeArray")
        public java.util.List<String> timeArray;

        // The total number of unfixed vulnerabilities on the current day.
        @NameInMap("TotalCount")
        public Integer totalCount;

        // The numbers of unfixed vulnerabilities at all points in time.
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
