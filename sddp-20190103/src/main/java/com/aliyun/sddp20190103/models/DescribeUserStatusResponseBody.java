// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeUserStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>769FB3C1-F4C9-42DF-9B72-7077A8989C13</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the current logon account.</p>
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
         * <p>The AccessKey ID authorized by the user.</p>
         * 
         * <strong>example:</strong>
         * <p>yourAccessKeyID</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <p>Indicates whether the current logon account has authorized the service-linked role for DSC asset synchronization. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: authorized.</li>
         * <li><strong>false</strong>: not authorized.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AssetRoleAuthed")
        public Boolean assetRoleAuthed;

        /**
         * <p>Indicates whether SQL Explorer can be disabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: can be disabled.</li>
         * <li><strong>false</strong>: cannot be disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AuditClosable")
        public Boolean auditClosable;

        /**
         * <p>Indicates whether SQL Explorer can be released. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: can be released.</li>
         * <li><strong>false</strong>: cannot be released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AuditReleasable")
        public Boolean auditReleasable;

        /**
         * <p>Indicates whether the current logon account has authorized DSC to access RAM. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: authorized.</li>
         * <li><strong>false</strong>: not authorized.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Authed")
        public Boolean authed;

        /**
         * <p>The billing method of the DSC service purchased by the current logon account. Valid values:</p>
         * <ul>
         * <li><strong>PREPAY</strong>: subscription.</li>
         * <li><strong>POSTPAY</strong>: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The permissions of the current account. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: has management or read-only permissions for Data Security Center.</li>
         * <li><strong>1</strong>: has data domain management permissions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DataManagerRole")
        public Integer dataManagerRole;

        /**
         * <p>The instance ID of the Data Security Center product purchased by the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>sddp-cn-****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The number of instances in the current logon account.</p>
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
         * <p>Indicates whether the asset lab feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enabled.</li>
         * <li><strong>0</strong>: not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LabStatus")
        public Integer labStatus;

        /**
         * <p>The total OSS storage capacity. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("OssTotalSize")
        public Long ossTotalSize;

        /**
         * <p>The total number of days that user assets have been protected.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("ProtectionDays")
        public Integer protectionDays;

        /**
         * <p>Indicates whether the DSC service is purchased. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: purchased.</li>
         * <li><strong>false</strong>: not purchased.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Purchased")
        public Boolean purchased;

        /**
         * <p>The number of days from expiration to release. Unit: days.</p>
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
         * <p>The remaining days of the protection period for assets in the current logon account.</p>
         * 
         * <strong>example:</strong>
         * <p>131</p>
         */
        @NameInMap("RemainDays")
        public Integer remainDays;

        /**
         * <p>Indicates whether the current logon account is using a trial version of DSC. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: trial.</li>
         * <li><strong>false</strong>: non-trial.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Trail")
        public Boolean trail;

        /**
         * <p>Indicates whether the Agent audit feature has been used. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: has been used.</li>
         * <li><strong>0</strong>: has not been used.</li>
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
         * <p>The used OSS storage capacity. Unit: bytes.</p>
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
