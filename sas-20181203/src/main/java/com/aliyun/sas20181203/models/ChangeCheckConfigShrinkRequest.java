// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeCheckConfigShrinkRequest extends TeaModel {
    /**
     * <p>The list of check items to add to the policy.
     * <notice> If ConfigStandardIds or ConfigRequirementIds is specified, this parameter does not take effect.</p>
     */
    @NameInMap("AddedCheck")
    public java.util.List<ChangeCheckConfigShrinkRequestAddedCheck> addedCheck;

    /**
     * <p>The client token used to ensure request idempotency. Use a different token for each request. Only ASCII characters are supported. The token can be up to 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Configures the check policy by specifying requirement IDs.</p>
     * <blockquote>
     * <p>Call <a href="~~ListCheckResult~~">ListCheckResult</a> to obtain requirement IDs. If ConfigStandardIds is specified, this parameter does not take effect.</p>
     * </blockquote>
     */
    @NameInMap("ConfigRequirementIds")
    public String configRequirementIdsShrink;

    /**
     * <p>Configures the check policy by specifying standard IDs.</p>
     * <blockquote>
     * <p>Call <a href="~~ListCheckResult~~">ListCheckResult</a> to obtain standard IDs.</p>
     * </blockquote>
     */
    @NameInMap("ConfigStandardIds")
    public String configStandardIdsShrink;

    /**
     * <p>The field configuration. Valid values:</p>
     * <ul>
     * <li><strong>all:</strong> Adds all check items.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("Configure")
    public String configure;

    /**
     * <p>The scheduled check days.</p>
     */
    @NameInMap("CycleDays")
    public java.util.List<Integer> cycleDays;

    /**
     * <p>Specifies whether to automatically include newly added check items from the selected requirements. Valid values:</p>
     * <ul>
     * <li><strong>true:</strong> Enabled.</li>
     * <li><strong>false:</strong> Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableAddCheck")
    public Boolean enableAddCheck;

    /**
     * <p>Specifies whether to enable automatic scheduled checks. Valid values:</p>
     * <ul>
     * <li><strong>true:</strong> Enabled.</li>
     * <li><strong>false:</strong> Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAutoCheck")
    public Boolean enableAutoCheck;

    /**
     * <p>The end hour of the check time window, expressed as an hour of the day. The start and end times must fall within one of the following time ranges. Valid values: 6, 12, 18, 24.</p>
     * <ul>
     * <li><strong>0~6:</strong> If the start time is 0, set the end time to 6.</li>
     * <li><strong>6~12:</strong> If the start time is 6, set the end time to 12.</li>
     * <li><strong>12~18:</strong> If the start time is 12, set the end time to 18.</li>
     * <li><strong>18~24:</strong> If the start time is 18, set the end time to 24.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <p>The region of the Security Center instance. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou:</strong> China (Hangzhou)</li>
     * <li><strong>ap-southeast-1:</strong> Singapore</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of check items to remove from the policy.
     * <notice> If ConfigStandardIds or ConfigRequirementIds is specified, this parameter does not take effect.</p>
     */
    @NameInMap("RemovedCheck")
    public java.util.List<ChangeCheckConfigShrinkRequestRemovedCheck> removedCheck;

    /**
     * <p>The ID of the resource directory member accounts (Alibaba Cloud account).</p>
     * <blockquote>
     * <p>Call <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1232428423234****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>This parameter is deprecated. You do not need to configure it.</p>
     */
    @NameInMap("StandardIds")
    public java.util.List<Long> standardIds;

    /**
     * <p>The start hour of the check time window, expressed as an hour of the day. The start and end times must fall within one of the following time ranges. Valid values: 0, 6, 12, 18.</p>
     * <ul>
     * <li><strong>0~6:</strong> If the start time is 0, set the end time to 6.</li>
     * <li><strong>6~12:</strong> If the start time is 6, set the end time to 12.</li>
     * <li><strong>12~18:</strong> If the start time is 12, set the end time to 18.</li>
     * <li><strong>18~24:</strong> If the start time is 18, set the end time to 24.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartTime")
    public Integer startTime;

    /**
     * <p>Specifies whether to use the system-generated configuration. Valid values:</p>
     * <ul>
     * <li><strong>true:</strong> Yes.</li>
     * <li><strong>false:</strong> No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SystemConfig")
    public Boolean systemConfig;

    /**
     * <p>The list of cloud vendors.</p>
     */
    @NameInMap("Vendors")
    public java.util.List<String> vendors;

    public static ChangeCheckConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeCheckConfigShrinkRequest self = new ChangeCheckConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ChangeCheckConfigShrinkRequest setAddedCheck(java.util.List<ChangeCheckConfigShrinkRequestAddedCheck> addedCheck) {
        this.addedCheck = addedCheck;
        return this;
    }
    public java.util.List<ChangeCheckConfigShrinkRequestAddedCheck> getAddedCheck() {
        return this.addedCheck;
    }

    public ChangeCheckConfigShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ChangeCheckConfigShrinkRequest setConfigRequirementIdsShrink(String configRequirementIdsShrink) {
        this.configRequirementIdsShrink = configRequirementIdsShrink;
        return this;
    }
    public String getConfigRequirementIdsShrink() {
        return this.configRequirementIdsShrink;
    }

    public ChangeCheckConfigShrinkRequest setConfigStandardIdsShrink(String configStandardIdsShrink) {
        this.configStandardIdsShrink = configStandardIdsShrink;
        return this;
    }
    public String getConfigStandardIdsShrink() {
        return this.configStandardIdsShrink;
    }

    public ChangeCheckConfigShrinkRequest setConfigure(String configure) {
        this.configure = configure;
        return this;
    }
    public String getConfigure() {
        return this.configure;
    }

    public ChangeCheckConfigShrinkRequest setCycleDays(java.util.List<Integer> cycleDays) {
        this.cycleDays = cycleDays;
        return this;
    }
    public java.util.List<Integer> getCycleDays() {
        return this.cycleDays;
    }

    public ChangeCheckConfigShrinkRequest setEnableAddCheck(Boolean enableAddCheck) {
        this.enableAddCheck = enableAddCheck;
        return this;
    }
    public Boolean getEnableAddCheck() {
        return this.enableAddCheck;
    }

    public ChangeCheckConfigShrinkRequest setEnableAutoCheck(Boolean enableAutoCheck) {
        this.enableAutoCheck = enableAutoCheck;
        return this;
    }
    public Boolean getEnableAutoCheck() {
        return this.enableAutoCheck;
    }

    public ChangeCheckConfigShrinkRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public ChangeCheckConfigShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ChangeCheckConfigShrinkRequest setRemovedCheck(java.util.List<ChangeCheckConfigShrinkRequestRemovedCheck> removedCheck) {
        this.removedCheck = removedCheck;
        return this;
    }
    public java.util.List<ChangeCheckConfigShrinkRequestRemovedCheck> getRemovedCheck() {
        return this.removedCheck;
    }

    public ChangeCheckConfigShrinkRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public ChangeCheckConfigShrinkRequest setStandardIds(java.util.List<Long> standardIds) {
        this.standardIds = standardIds;
        return this;
    }
    public java.util.List<Long> getStandardIds() {
        return this.standardIds;
    }

    public ChangeCheckConfigShrinkRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public ChangeCheckConfigShrinkRequest setSystemConfig(Boolean systemConfig) {
        this.systemConfig = systemConfig;
        return this;
    }
    public Boolean getSystemConfig() {
        return this.systemConfig;
    }

    public ChangeCheckConfigShrinkRequest setVendors(java.util.List<String> vendors) {
        this.vendors = vendors;
        return this;
    }
    public java.util.List<String> getVendors() {
        return this.vendors;
    }

    public static class ChangeCheckConfigShrinkRequestAddedCheck extends TeaModel {
        /**
         * <p>The ID of the check item.</p>
         * <blockquote>
         * <p>Call <a href="~~ListCheckResult~~">ListCheckResult</a> to obtain check item IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <p>The section ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>69</p>
         */
        @NameInMap("SectionId")
        public Long sectionId;

        public static ChangeCheckConfigShrinkRequestAddedCheck build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckConfigShrinkRequestAddedCheck self = new ChangeCheckConfigShrinkRequestAddedCheck();
            return TeaModel.build(map, self);
        }

        public ChangeCheckConfigShrinkRequestAddedCheck setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public ChangeCheckConfigShrinkRequestAddedCheck setSectionId(Long sectionId) {
            this.sectionId = sectionId;
            return this;
        }
        public Long getSectionId() {
            return this.sectionId;
        }

    }

    public static class ChangeCheckConfigShrinkRequestRemovedCheck extends TeaModel {
        /**
         * <p>The ID of the check item.</p>
         * <blockquote>
         * <p>Call <a href="~~ListCheckResult~~">ListCheckResult</a> to obtain check item IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <p>The section ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>69</p>
         */
        @NameInMap("SectionId")
        public Long sectionId;

        public static ChangeCheckConfigShrinkRequestRemovedCheck build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckConfigShrinkRequestRemovedCheck self = new ChangeCheckConfigShrinkRequestRemovedCheck();
            return TeaModel.build(map, self);
        }

        public ChangeCheckConfigShrinkRequestRemovedCheck setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public ChangeCheckConfigShrinkRequestRemovedCheck setSectionId(Long sectionId) {
            this.sectionId = sectionId;
            return this;
        }
        public Long getSectionId() {
            return this.sectionId;
        }

    }

}
