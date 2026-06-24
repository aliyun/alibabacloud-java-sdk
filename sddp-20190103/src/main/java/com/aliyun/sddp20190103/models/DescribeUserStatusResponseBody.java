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
     * <p>The details of the current account.</p>
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
         * <p>The authorized AccessKey ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>yourAccessKeyID</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>Indicates whether the currently logged-in account has been granted the service role permissions for DSC asset synchronization. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: authorized.</p>
         * </li>
         * <li><p><strong>false</strong>: unauthorized.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AssetRoleAuthed")
        public Boolean assetRoleAuthed;

        /**
         * <p>Indicates whether SQL Insights can be disabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: yes.</p>
         * </li>
         * <li><p><strong>false</strong>: no.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AuditClosable")
        public Boolean auditClosable;

        /**
         * <p>Indicates whether SQL Insights can be released.</p>
         * <ul>
         * <li><p><strong>true</strong>: yes.</p>
         * </li>
         * <li><p><strong>false</strong>: no.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AuditReleasable")
        public Boolean auditReleasable;

        /**
         * <p>Indicates whether the current account is granted Resource Access Management (RAM) permissions on DSC. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The account is granted the permissions.</p>
         * </li>
         * <li><p><strong>false</strong>: The account is not granted the permissions.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Authed")
        public Boolean authed;

        /**
         * <p>The billing method of the DSC service for the current account. Valid values:</p>
         * <ul>
         * <li><p><strong>PREPAY</strong>: subscription.</p>
         * </li>
         * <li><p><strong>POSTPAY</strong>: pay-as-you-go.</p>
         * </li>
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
         * <li><p><strong>0</strong>: The account has the management or read-only permissions on Data Security Center.</p>
         * </li>
         * <li><p><strong>1</strong>: The account has the management permissions on data domains.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DataManagerRole")
        public Integer dataManagerRole;

        /**
         * <p>The ID of the Data Security Center instance purchased by the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>sddp-cn-****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The number of instances in the current account.</p>
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
         * <p>Indicates whether the Asset Lab feature is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: enabled.</p>
         * </li>
         * <li><p><strong>0</strong>: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LabStatus")
        public Integer labStatus;

        /**
         * <p>The total OSS storage. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("OssTotalSize")
        public Long ossTotalSize;

        /**
         * <p>The total number of days that assets have been protected.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("ProtectionDays")
        public Integer protectionDays;

        /**
         * <p>Indicates whether the DSC service is purchased. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: yes.</p>
         * </li>
         * <li><p><strong>false</strong>: no.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Purchased")
        public Boolean purchased;

        /**
         * <p>The number of days from service expiration to service release. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("ReleaseDays")
        public Integer releaseDays;

        /**
         * <p>The release time. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>15000</p>
         */
        @NameInMap("ReleaseTime")
        public Long releaseTime;

        /**
         * <p>The number of remaining days in the protection period for the assets of the current account.</p>
         * 
         * <strong>example:</strong>
         * <p>131</p>
         */
        @NameInMap("RemainDays")
        public Integer remainDays;

        /**
         * <p>Indicates whether the current account uses the trial version of the DSC service. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: yes.</p>
         * </li>
         * <li><p><strong>false</strong>: no.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Trail")
        public Boolean trail;

        /**
         * <p>Indicates whether the agent-based audit feature has been used. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: yes.</p>
         * </li>
         * <li><p><strong>0</strong>: no.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UseAgentAudit")
        public Boolean useAgentAudit;

        /**
         * <p>The number of used instances.</p>
         * 
         * <strong>example:</strong>
         * <p>125</p>
         */
        @NameInMap("UseInstanceNum")
        public Integer useInstanceNum;

        /**
         * <p>The used Object Storage Service (OSS) storage. Unit: bytes.</p>
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

        public DescribeUserStatusResponseBodyUserStatus setAssetRoleAuthed(Boolean assetRoleAuthed) {
            this.assetRoleAuthed = assetRoleAuthed;
            return this;
        }
        public Boolean getAssetRoleAuthed() {
            return this.assetRoleAuthed;
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
