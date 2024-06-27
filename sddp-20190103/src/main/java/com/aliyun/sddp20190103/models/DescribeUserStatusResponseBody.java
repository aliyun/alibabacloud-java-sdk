// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeUserStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>769FB3C1-F4C9-42DF-9B72-7077A8989C13</p>
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
         * 
         * <strong>example:</strong>
         * <p>LTAI4G67HRBzNRmMhfyv****</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>Indicates whether the SQL Explorer feature can be disabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AuditClosable")
        public Boolean auditClosable;

        /**
         * <p>Indicates whether the audit resources can be released.</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AuditReleasable")
        public Boolean auditReleasable;

        /**
         * <p>Indicates whether DSC has permission to access user resources within the current account. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Authed")
        public Boolean authed;

        /**
         * <p>The billing method of DCS that is purchased by using the current account. Valid values:</p>
         * <ul>
         * <li><strong>PREPAY</strong>: subscription</li>
         * <li><strong>POSTPAY</strong>: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The permissions that the current account has. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The current account has the administrative permissions or read-only permissions on Data Security Center.</li>
         * <li><strong>1</strong>: The current account has the permissions to manage data domains.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DataManagerRole")
        public Integer dataManagerRole;

        /**
         * <p>The ID of the data security center instance purchased by the main account.</p>
         * 
         * <strong>example:</strong>
         * <p>sddp-cn-****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The number of instances within the current account.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("InstanceNum")
        public Integer instanceNum;

        /**
         * <p>The total number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InstanceTotalCount")
        public Long instanceTotalCount;

        /**
         * <p>Indicates whether the data security lab feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LabStatus")
        public Integer labStatus;

        /**
         * <p>OSS total storage capacity. Unit: Bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("OssTotalSize")
        public Long ossTotalSize;

        /**
         * <p>Accumulate the number of days to protect user assets.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ProtectionDays")
        public Integer protectionDays;

        /**
         * <p>Indicates whether DSC is purchased. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Purchased")
        public Boolean purchased;

        /**
         * <p>The grace period between when DSC is expired and when DSC is released. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("ReleaseDays")
        public Integer releaseDays;

        /**
         * <p>The time when the audit resources are released. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>15000</p>
         */
        @NameInMap("ReleaseTime")
        public Long releaseTime;

        /**
         * <p>The remaining period for which the data assets within the current account can be protected by DSC.</p>
         * 
         * <strong>example:</strong>
         * <p>131</p>
         */
        @NameInMap("RemainDays")
        public Integer remainDays;

        /**
         * <p>Indicates whether the current account uses a free trial of DSC. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Trail")
        public Boolean trail;

        /**
         * <p>Indicates whether the agent audit feature is used. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UseAgentAudit")
        public Boolean useAgentAudit;

        /**
         * <p>The number of instances that are used.</p>
         * 
         * <strong>example:</strong>
         * <p>125</p>
         */
        @NameInMap("UseInstanceNum")
        public Integer useInstanceNum;

        /**
         * <p>The occupied space of the Object Storage Service (OSS) bucket. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>234</p>
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
