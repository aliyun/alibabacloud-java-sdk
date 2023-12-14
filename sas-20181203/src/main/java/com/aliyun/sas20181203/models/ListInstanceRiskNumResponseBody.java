// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInstanceRiskNumResponseBody extends TeaModel {
    /**
     * <p>The information about the risks in the instance.</p>
     */
    @NameInMap("InstanceRiskNum")
    public java.util.List<ListInstanceRiskNumResponseBodyInstanceRiskNum> instanceRiskNum;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListInstanceRiskNumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceRiskNumResponseBody self = new ListInstanceRiskNumResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceRiskNumResponseBody setInstanceRiskNum(java.util.List<ListInstanceRiskNumResponseBodyInstanceRiskNum> instanceRiskNum) {
        this.instanceRiskNum = instanceRiskNum;
        return this;
    }
    public java.util.List<ListInstanceRiskNumResponseBodyInstanceRiskNum> getInstanceRiskNum() {
        return this.instanceRiskNum;
    }

    public ListInstanceRiskNumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInstanceRiskNumResponseBodyInstanceRiskNumInstanceItem extends TeaModel {
        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The UUID of the instance.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static ListInstanceRiskNumResponseBodyInstanceRiskNumInstanceItem build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceRiskNumResponseBodyInstanceRiskNumInstanceItem self = new ListInstanceRiskNumResponseBodyInstanceRiskNumInstanceItem();
            return TeaModel.build(map, self);
        }

        public ListInstanceRiskNumResponseBodyInstanceRiskNumInstanceItem setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceRiskNumResponseBodyInstanceRiskNumInstanceItem setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class ListInstanceRiskNumResponseBodyInstanceRiskNumRiskNumEntity extends TeaModel {
        /**
         * <p>The number of high-risk alerts.</p>
         */
        @NameInMap("SuspiciousHighCount")
        public Integer suspiciousHighCount;

        /**
         * <p>The number of low-risk alerts.</p>
         */
        @NameInMap("SuspiciousLowCount")
        public Integer suspiciousLowCount;

        /**
         * <p>The number of medium-risk alerts.</p>
         */
        @NameInMap("SuspiciousMediumCount")
        public Integer suspiciousMediumCount;

        /**
         * <p>The number of high-risk vulnerabilities.</p>
         */
        @NameInMap("VulHighCount")
        public Integer vulHighCount;

        /**
         * <p>The number of low-risk vulnerabilities.</p>
         */
        @NameInMap("VulLowCount")
        public Integer vulLowCount;

        /**
         * <p>The number of medium-risk vulnerabilities.</p>
         */
        @NameInMap("VulMediumCount")
        public Integer vulMediumCount;

        /**
         * <p>The number of weak passwords exposed on the Internet.</p>
         */
        @NameInMap("WeakPassWordCount")
        public Integer weakPassWordCount;

        public static ListInstanceRiskNumResponseBodyInstanceRiskNumRiskNumEntity build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceRiskNumResponseBodyInstanceRiskNumRiskNumEntity self = new ListInstanceRiskNumResponseBodyInstanceRiskNumRiskNumEntity();
            return TeaModel.build(map, self);
        }

        public ListInstanceRiskNumResponseBodyInstanceRiskNumRiskNumEntity setSuspiciousHighCount(Integer suspiciousHighCount) {
            this.suspiciousHighCount = suspiciousHighCount;
            return this;
        }
        public Integer getSuspiciousHighCount() {
            return this.suspiciousHighCount;
        }

        public ListInstanceRiskNumResponseBodyInstanceRiskNumRiskNumEntity setSuspiciousLowCount(Integer suspiciousLowCount) {
            this.suspiciousLowCount = suspiciousLowCount;
            return this;
        }
        public Integer getSuspiciousLowCount() {
            return this.suspiciousLowCount;
        }

        public ListInstanceRiskNumResponseBodyInstanceRiskNumRiskNumEntity setSuspiciousMediumCount(Integer suspiciousMediumCount) {
            this.suspiciousMediumCount = suspiciousMediumCount;
            return this;
        }
        public Integer getSuspiciousMediumCount() {
            return this.suspiciousMediumCount;
        }

        public ListInstanceRiskNumResponseBodyInstanceRiskNumRiskNumEntity setVulHighCount(Integer vulHighCount) {
            this.vulHighCount = vulHighCount;
            return this;
        }
        public Integer getVulHighCount() {
            return this.vulHighCount;
        }

        public ListInstanceRiskNumResponseBodyInstanceRiskNumRiskNumEntity setVulLowCount(Integer vulLowCount) {
            this.vulLowCount = vulLowCount;
            return this;
        }
        public Integer getVulLowCount() {
            return this.vulLowCount;
        }

        public ListInstanceRiskNumResponseBodyInstanceRiskNumRiskNumEntity setVulMediumCount(Integer vulMediumCount) {
            this.vulMediumCount = vulMediumCount;
            return this;
        }
        public Integer getVulMediumCount() {
            return this.vulMediumCount;
        }

        public ListInstanceRiskNumResponseBodyInstanceRiskNumRiskNumEntity setWeakPassWordCount(Integer weakPassWordCount) {
            this.weakPassWordCount = weakPassWordCount;
            return this;
        }
        public Integer getWeakPassWordCount() {
            return this.weakPassWordCount;
        }

    }

    public static class ListInstanceRiskNumResponseBodyInstanceRiskNum extends TeaModel {
        /**
         * <p>The information about the instance.</p>
         */
        @NameInMap("InstanceItem")
        public ListInstanceRiskNumResponseBodyInstanceRiskNumInstanceItem instanceItem;

        /**
         * <p>The statistics about the risks.</p>
         */
        @NameInMap("RiskNumEntity")
        public ListInstanceRiskNumResponseBodyInstanceRiskNumRiskNumEntity riskNumEntity;

        public static ListInstanceRiskNumResponseBodyInstanceRiskNum build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceRiskNumResponseBodyInstanceRiskNum self = new ListInstanceRiskNumResponseBodyInstanceRiskNum();
            return TeaModel.build(map, self);
        }

        public ListInstanceRiskNumResponseBodyInstanceRiskNum setInstanceItem(ListInstanceRiskNumResponseBodyInstanceRiskNumInstanceItem instanceItem) {
            this.instanceItem = instanceItem;
            return this;
        }
        public ListInstanceRiskNumResponseBodyInstanceRiskNumInstanceItem getInstanceItem() {
            return this.instanceItem;
        }

        public ListInstanceRiskNumResponseBodyInstanceRiskNum setRiskNumEntity(ListInstanceRiskNumResponseBodyInstanceRiskNumRiskNumEntity riskNumEntity) {
            this.riskNumEntity = riskNumEntity;
            return this;
        }
        public ListInstanceRiskNumResponseBodyInstanceRiskNumRiskNumEntity getRiskNumEntity() {
            return this.riskNumEntity;
        }

    }

}
