// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeUserStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the current account.</p>
     */
    @NameInMap("UserStatus")
    public DescribeUserStatusResponseBodyUserStatus userStatus;

    public static DescribeUserStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserStatusResponseBody self = new DescribeUserStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserStatusResponseBody setUserStatus(DescribeUserStatusResponseBodyUserStatus userStatus) {
        this.userStatus = userStatus;
        return this;
    }
    public DescribeUserStatusResponseBodyUserStatus getUserStatus() {
        return this.userStatus;
    }

    public static class DescribeUserStatusResponseBodyUserStatus extends TeaModel {
        /**
         * <p>The AccessKey ID of the current account.</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>Indicates whether the SQL Explorer feature can be disabled. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("AuditClosable")
        public Boolean auditClosable;

        /**
         * <p>Indicates whether the audit resources can be released.</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("AuditReleasable")
        public Boolean auditReleasable;

        /**
         * <p>Indicates whether DSC has permission to access user resources within the current account. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("Authed")
        public Boolean authed;

        /**
         * <p>The billing method of DCS that is purchased by using the current account. Valid values:</p>
         * <br>
         * <p>*   **PREPAY**: subscription</p>
         * <p>*   **POSTPAY**: pay-as-you-go</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The permissions that the current account has. Valid values:</p>
         * <br>
         * <p>*   **0**: The current account has the administrative permissions or read-only permissions on Data Security Center.</p>
         * <p>*   **1**: The current account has the permissions to manage data domains.</p>
         */
        @NameInMap("DataManagerRole")
        public Integer dataManagerRole;

        /**
         * <p>The ID of the instance within the current account.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The number of instances within the current account.</p>
         */
        @NameInMap("InstanceNum")
        public Integer instanceNum;

        @NameInMap("InstanceTotalCount")
        public Long instanceTotalCount;

        /**
         * <p>Indicates whether the data security lab feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **1**: yes</p>
         * <p>*   **0**: no</p>
         */
        @NameInMap("LabStatus")
        public Integer labStatus;

        @NameInMap("OssTotalSize")
        public Long ossTotalSize;

        @NameInMap("ProtectionDays")
        public Integer protectionDays;

        /**
         * <p>Indicates whether DSC is purchased. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("Purchased")
        public Boolean purchased;

        /**
         * <p>The grace period between when DSC is expired and when DSC is released. Unit: days.</p>
         */
        @NameInMap("ReleaseDays")
        public Integer releaseDays;

        /**
         * <p>The time when the audit resources are released. Unit: milliseconds.</p>
         */
        @NameInMap("ReleaseTime")
        public Long releaseTime;

        /**
         * <p>The remaining period for which the data assets within the current account can be protected by DSC.</p>
         */
        @NameInMap("RemainDays")
        public Integer remainDays;

        /**
         * <p>Indicates whether the current account uses a free trial of DSC. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("Trail")
        public Boolean trail;

        @NameInMap("UseAgentAudit")
        public Boolean useAgentAudit;

        /**
         * <p>The number of instances that are used.</p>
         */
        @NameInMap("UseInstanceNum")
        public Integer useInstanceNum;

        /**
         * <p>The occupied space of the Object Storage Service (OSS) bucket. Unit: bytes.</p>
         */
        @NameInMap("UseOssSize")
        public Long useOssSize;

        public static DescribeUserStatusResponseBodyUserStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserStatusResponseBodyUserStatus self = new DescribeUserStatusResponseBodyUserStatus();
            return TeaModel.build(map, self);
        }

        public DescribeUserStatusResponseBodyUserStatus setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public DescribeUserStatusResponseBodyUserStatus setAuditClosable(Boolean auditClosable) {
            this.auditClosable = auditClosable;
            return this;
        }
        public Boolean getAuditClosable() {
            return this.auditClosable;
        }

        public DescribeUserStatusResponseBodyUserStatus setAuditReleasable(Boolean auditReleasable) {
            this.auditReleasable = auditReleasable;
            return this;
        }
        public Boolean getAuditReleasable() {
            return this.auditReleasable;
        }

        public DescribeUserStatusResponseBodyUserStatus setAuthed(Boolean authed) {
            this.authed = authed;
            return this;
        }
        public Boolean getAuthed() {
            return this.authed;
        }

        public DescribeUserStatusResponseBodyUserStatus setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeUserStatusResponseBodyUserStatus setDataManagerRole(Integer dataManagerRole) {
            this.dataManagerRole = dataManagerRole;
            return this;
        }
        public Integer getDataManagerRole() {
            return this.dataManagerRole;
        }

        public DescribeUserStatusResponseBodyUserStatus setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeUserStatusResponseBodyUserStatus setInstanceNum(Integer instanceNum) {
            this.instanceNum = instanceNum;
            return this;
        }
        public Integer getInstanceNum() {
            return this.instanceNum;
        }

        public DescribeUserStatusResponseBodyUserStatus setInstanceTotalCount(Long instanceTotalCount) {
            this.instanceTotalCount = instanceTotalCount;
            return this;
        }
        public Long getInstanceTotalCount() {
            return this.instanceTotalCount;
        }

        public DescribeUserStatusResponseBodyUserStatus setLabStatus(Integer labStatus) {
            this.labStatus = labStatus;
            return this;
        }
        public Integer getLabStatus() {
            return this.labStatus;
        }

        public DescribeUserStatusResponseBodyUserStatus setOssTotalSize(Long ossTotalSize) {
            this.ossTotalSize = ossTotalSize;
            return this;
        }
        public Long getOssTotalSize() {
            return this.ossTotalSize;
        }

        public DescribeUserStatusResponseBodyUserStatus setProtectionDays(Integer protectionDays) {
            this.protectionDays = protectionDays;
            return this;
        }
        public Integer getProtectionDays() {
            return this.protectionDays;
        }

        public DescribeUserStatusResponseBodyUserStatus setPurchased(Boolean purchased) {
            this.purchased = purchased;
            return this;
        }
        public Boolean getPurchased() {
            return this.purchased;
        }

        public DescribeUserStatusResponseBodyUserStatus setReleaseDays(Integer releaseDays) {
            this.releaseDays = releaseDays;
            return this;
        }
        public Integer getReleaseDays() {
            return this.releaseDays;
        }

        public DescribeUserStatusResponseBodyUserStatus setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public DescribeUserStatusResponseBodyUserStatus setRemainDays(Integer remainDays) {
            this.remainDays = remainDays;
            return this;
        }
        public Integer getRemainDays() {
            return this.remainDays;
        }

        public DescribeUserStatusResponseBodyUserStatus setTrail(Boolean trail) {
            this.trail = trail;
            return this;
        }
        public Boolean getTrail() {
            return this.trail;
        }

        public DescribeUserStatusResponseBodyUserStatus setUseAgentAudit(Boolean useAgentAudit) {
            this.useAgentAudit = useAgentAudit;
            return this;
        }
        public Boolean getUseAgentAudit() {
            return this.useAgentAudit;
        }

        public DescribeUserStatusResponseBodyUserStatus setUseInstanceNum(Integer useInstanceNum) {
            this.useInstanceNum = useInstanceNum;
            return this;
        }
        public Integer getUseInstanceNum() {
            return this.useInstanceNum;
        }

        public DescribeUserStatusResponseBodyUserStatus setUseOssSize(Long useOssSize) {
            this.useOssSize = useOssSize;
            return this;
        }
        public Long getUseOssSize() {
            return this.useOssSize;
        }

    }

}
