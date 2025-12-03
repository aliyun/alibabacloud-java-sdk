// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenSecurityStatInfoResponseBody extends TeaModel {
    @NameInMap("AttackEvent")
    public DescribeScreenSecurityStatInfoResponseBodyAttackEvent attackEvent;

    @NameInMap("HealthCheck")
    public DescribeScreenSecurityStatInfoResponseBodyHealthCheck healthCheck;

    /**
     * <strong>example:</strong>
     * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityEvent")
    public DescribeScreenSecurityStatInfoResponseBodySecurityEvent securityEvent;

    @NameInMap("Vulnerability")
    public DescribeScreenSecurityStatInfoResponseBodyVulnerability vulnerability;

    public static DescribeScreenSecurityStatInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenSecurityStatInfoResponseBody self = new DescribeScreenSecurityStatInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScreenSecurityStatInfoResponseBody setAttackEvent(DescribeScreenSecurityStatInfoResponseBodyAttackEvent attackEvent) {
        this.attackEvent = attackEvent;
        return this;
    }
    public DescribeScreenSecurityStatInfoResponseBodyAttackEvent getAttackEvent() {
        return this.attackEvent;
    }

    public DescribeScreenSecurityStatInfoResponseBody setHealthCheck(DescribeScreenSecurityStatInfoResponseBodyHealthCheck healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public DescribeScreenSecurityStatInfoResponseBodyHealthCheck getHealthCheck() {
        return this.healthCheck;
    }

    public DescribeScreenSecurityStatInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScreenSecurityStatInfoResponseBody setSecurityEvent(DescribeScreenSecurityStatInfoResponseBodySecurityEvent securityEvent) {
        this.securityEvent = securityEvent;
        return this;
    }
    public DescribeScreenSecurityStatInfoResponseBodySecurityEvent getSecurityEvent() {
        return this.securityEvent;
    }

    public DescribeScreenSecurityStatInfoResponseBody setVulnerability(DescribeScreenSecurityStatInfoResponseBodyVulnerability vulnerability) {
        this.vulnerability = vulnerability;
        return this;
    }
    public DescribeScreenSecurityStatInfoResponseBodyVulnerability getVulnerability() {
        return this.vulnerability;
    }

    public static class DescribeScreenSecurityStatInfoResponseBodyAttackEvent extends TeaModel {
        @NameInMap("DateArray")
        public java.util.List<String> dateArray;

        /**
         * <strong>example:</strong>
         * <p>1096</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("ValueArray")
        public java.util.List<String> valueArray;

        public static DescribeScreenSecurityStatInfoResponseBodyAttackEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeScreenSecurityStatInfoResponseBodyAttackEvent self = new DescribeScreenSecurityStatInfoResponseBodyAttackEvent();
            return TeaModel.build(map, self);
        }

        public DescribeScreenSecurityStatInfoResponseBodyAttackEvent setDateArray(java.util.List<String> dateArray) {
            this.dateArray = dateArray;
            return this;
        }
        public java.util.List<String> getDateArray() {
            return this.dateArray;
        }

        public DescribeScreenSecurityStatInfoResponseBodyAttackEvent setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeScreenSecurityStatInfoResponseBodyAttackEvent setValueArray(java.util.List<String> valueArray) {
            this.valueArray = valueArray;
            return this;
        }
        public java.util.List<String> getValueArray() {
            return this.valueArray;
        }

    }

    public static class DescribeScreenSecurityStatInfoResponseBodyHealthCheck extends TeaModel {
        @NameInMap("DateArray")
        public java.util.List<String> dateArray;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("HighCount")
        public Integer highCount;

        @NameInMap("HighList")
        public java.util.List<String> highList;

        @NameInMap("LevelsOn")
        public java.util.List<String> levelsOn;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LowCount")
        public Integer lowCount;

        @NameInMap("LowList")
        public java.util.List<String> lowList;

        /**
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("MediumCount")
        public Integer mediumCount;

        @NameInMap("MediumList")
        public java.util.List<String> mediumList;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("ValueArray")
        public java.util.List<String> valueArray;

        public static DescribeScreenSecurityStatInfoResponseBodyHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            DescribeScreenSecurityStatInfoResponseBodyHealthCheck self = new DescribeScreenSecurityStatInfoResponseBodyHealthCheck();
            return TeaModel.build(map, self);
        }

        public DescribeScreenSecurityStatInfoResponseBodyHealthCheck setDateArray(java.util.List<String> dateArray) {
            this.dateArray = dateArray;
            return this;
        }
        public java.util.List<String> getDateArray() {
            return this.dateArray;
        }

        public DescribeScreenSecurityStatInfoResponseBodyHealthCheck setHighCount(Integer highCount) {
            this.highCount = highCount;
            return this;
        }
        public Integer getHighCount() {
            return this.highCount;
        }

        public DescribeScreenSecurityStatInfoResponseBodyHealthCheck setHighList(java.util.List<String> highList) {
            this.highList = highList;
            return this;
        }
        public java.util.List<String> getHighList() {
            return this.highList;
        }

        public DescribeScreenSecurityStatInfoResponseBodyHealthCheck setLevelsOn(java.util.List<String> levelsOn) {
            this.levelsOn = levelsOn;
            return this;
        }
        public java.util.List<String> getLevelsOn() {
            return this.levelsOn;
        }

        public DescribeScreenSecurityStatInfoResponseBodyHealthCheck setLowCount(Integer lowCount) {
            this.lowCount = lowCount;
            return this;
        }
        public Integer getLowCount() {
            return this.lowCount;
        }

        public DescribeScreenSecurityStatInfoResponseBodyHealthCheck setLowList(java.util.List<String> lowList) {
            this.lowList = lowList;
            return this;
        }
        public java.util.List<String> getLowList() {
            return this.lowList;
        }

        public DescribeScreenSecurityStatInfoResponseBodyHealthCheck setMediumCount(Integer mediumCount) {
            this.mediumCount = mediumCount;
            return this;
        }
        public Integer getMediumCount() {
            return this.mediumCount;
        }

        public DescribeScreenSecurityStatInfoResponseBodyHealthCheck setMediumList(java.util.List<String> mediumList) {
            this.mediumList = mediumList;
            return this;
        }
        public java.util.List<String> getMediumList() {
            return this.mediumList;
        }

        public DescribeScreenSecurityStatInfoResponseBodyHealthCheck setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeScreenSecurityStatInfoResponseBodyHealthCheck setValueArray(java.util.List<String> valueArray) {
            this.valueArray = valueArray;
            return this;
        }
        public java.util.List<String> getValueArray() {
            return this.valueArray;
        }

    }

    public static class DescribeScreenSecurityStatInfoResponseBodySecurityEvent extends TeaModel {
        @NameInMap("DateArray")
        public java.util.List<String> dateArray;

        @NameInMap("LevelsOn")
        public java.util.List<String> levelsOn;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemindCount")
        public Integer remindCount;

        @NameInMap("RemindList")
        public java.util.List<String> remindList;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SeriousCount")
        public Integer seriousCount;

        @NameInMap("SeriousList")
        public java.util.List<String> seriousList;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SuspiciousCount")
        public Integer suspiciousCount;

        @NameInMap("SuspiciousList")
        public java.util.List<String> suspiciousList;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("ValueArray")
        public java.util.List<String> valueArray;

        public static DescribeScreenSecurityStatInfoResponseBodySecurityEvent build(java.util.Map<String, ?> map) throws Exception {
            DescribeScreenSecurityStatInfoResponseBodySecurityEvent self = new DescribeScreenSecurityStatInfoResponseBodySecurityEvent();
            return TeaModel.build(map, self);
        }

        public DescribeScreenSecurityStatInfoResponseBodySecurityEvent setDateArray(java.util.List<String> dateArray) {
            this.dateArray = dateArray;
            return this;
        }
        public java.util.List<String> getDateArray() {
            return this.dateArray;
        }

        public DescribeScreenSecurityStatInfoResponseBodySecurityEvent setLevelsOn(java.util.List<String> levelsOn) {
            this.levelsOn = levelsOn;
            return this;
        }
        public java.util.List<String> getLevelsOn() {
            return this.levelsOn;
        }

        public DescribeScreenSecurityStatInfoResponseBodySecurityEvent setRemindCount(Integer remindCount) {
            this.remindCount = remindCount;
            return this;
        }
        public Integer getRemindCount() {
            return this.remindCount;
        }

        public DescribeScreenSecurityStatInfoResponseBodySecurityEvent setRemindList(java.util.List<String> remindList) {
            this.remindList = remindList;
            return this;
        }
        public java.util.List<String> getRemindList() {
            return this.remindList;
        }

        public DescribeScreenSecurityStatInfoResponseBodySecurityEvent setSeriousCount(Integer seriousCount) {
            this.seriousCount = seriousCount;
            return this;
        }
        public Integer getSeriousCount() {
            return this.seriousCount;
        }

        public DescribeScreenSecurityStatInfoResponseBodySecurityEvent setSeriousList(java.util.List<String> seriousList) {
            this.seriousList = seriousList;
            return this;
        }
        public java.util.List<String> getSeriousList() {
            return this.seriousList;
        }

        public DescribeScreenSecurityStatInfoResponseBodySecurityEvent setSuspiciousCount(Integer suspiciousCount) {
            this.suspiciousCount = suspiciousCount;
            return this;
        }
        public Integer getSuspiciousCount() {
            return this.suspiciousCount;
        }

        public DescribeScreenSecurityStatInfoResponseBodySecurityEvent setSuspiciousList(java.util.List<String> suspiciousList) {
            this.suspiciousList = suspiciousList;
            return this;
        }
        public java.util.List<String> getSuspiciousList() {
            return this.suspiciousList;
        }

        public DescribeScreenSecurityStatInfoResponseBodySecurityEvent setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeScreenSecurityStatInfoResponseBodySecurityEvent setValueArray(java.util.List<String> valueArray) {
            this.valueArray = valueArray;
            return this;
        }
        public java.util.List<String> getValueArray() {
            return this.valueArray;
        }

    }

    public static class DescribeScreenSecurityStatInfoResponseBodyVulnerability extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>109</p>
         */
        @NameInMap("AsapCount")
        public Integer asapCount;

        @NameInMap("AsapList")
        public java.util.List<String> asapList;

        @NameInMap("DateArray")
        public java.util.List<String> dateArray;

        /**
         * <strong>example:</strong>
         * <p>275</p>
         */
        @NameInMap("LaterCount")
        public Integer laterCount;

        @NameInMap("LaterList")
        public java.util.List<String> laterList;

        @NameInMap("LevelsOn")
        public java.util.List<String> levelsOn;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NntfCount")
        public Integer nntfCount;

        @NameInMap("NntfList")
        public java.util.List<String> nntfList;

        /**
         * <strong>example:</strong>
         * <p>384</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("ValueArray")
        public java.util.List<String> valueArray;

        public static DescribeScreenSecurityStatInfoResponseBodyVulnerability build(java.util.Map<String, ?> map) throws Exception {
            DescribeScreenSecurityStatInfoResponseBodyVulnerability self = new DescribeScreenSecurityStatInfoResponseBodyVulnerability();
            return TeaModel.build(map, self);
        }

        public DescribeScreenSecurityStatInfoResponseBodyVulnerability setAsapCount(Integer asapCount) {
            this.asapCount = asapCount;
            return this;
        }
        public Integer getAsapCount() {
            return this.asapCount;
        }

        public DescribeScreenSecurityStatInfoResponseBodyVulnerability setAsapList(java.util.List<String> asapList) {
            this.asapList = asapList;
            return this;
        }
        public java.util.List<String> getAsapList() {
            return this.asapList;
        }

        public DescribeScreenSecurityStatInfoResponseBodyVulnerability setDateArray(java.util.List<String> dateArray) {
            this.dateArray = dateArray;
            return this;
        }
        public java.util.List<String> getDateArray() {
            return this.dateArray;
        }

        public DescribeScreenSecurityStatInfoResponseBodyVulnerability setLaterCount(Integer laterCount) {
            this.laterCount = laterCount;
            return this;
        }
        public Integer getLaterCount() {
            return this.laterCount;
        }

        public DescribeScreenSecurityStatInfoResponseBodyVulnerability setLaterList(java.util.List<String> laterList) {
            this.laterList = laterList;
            return this;
        }
        public java.util.List<String> getLaterList() {
            return this.laterList;
        }

        public DescribeScreenSecurityStatInfoResponseBodyVulnerability setLevelsOn(java.util.List<String> levelsOn) {
            this.levelsOn = levelsOn;
            return this;
        }
        public java.util.List<String> getLevelsOn() {
            return this.levelsOn;
        }

        public DescribeScreenSecurityStatInfoResponseBodyVulnerability setNntfCount(Integer nntfCount) {
            this.nntfCount = nntfCount;
            return this;
        }
        public Integer getNntfCount() {
            return this.nntfCount;
        }

        public DescribeScreenSecurityStatInfoResponseBodyVulnerability setNntfList(java.util.List<String> nntfList) {
            this.nntfList = nntfList;
            return this;
        }
        public java.util.List<String> getNntfList() {
            return this.nntfList;
        }

        public DescribeScreenSecurityStatInfoResponseBodyVulnerability setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeScreenSecurityStatInfoResponseBodyVulnerability setValueArray(java.util.List<String> valueArray) {
            this.valueArray = valueArray;
            return this;
        }
        public java.util.List<String> getValueArray() {
            return this.valueArray;
        }

    }

}
