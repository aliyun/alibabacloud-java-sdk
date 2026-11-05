// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeCheckConfigRequest extends TeaModel {
    /**
     * <p>The list of check items to be added to the policy.
     * <notice> If the ConfigStandardIds or ConfigRequirementIds parameter is configured, this parameter does not take effect. </notice></p>
     */
    @NameInMap("AddedCheck")
    public java.util.List<ChangeCheckConfigRequestAddedCheck> addedCheck;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. Different requests must use different tokens. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22222f91-57af-4907-87f1-f9046da*****</p>
     */
    @NameInMap("ConfigId")
    public String configId;

    /**
     * <p>Configures the check policy by using the IDs of the specified regulations.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain the regulation IDs. If the ConfigStandardIds parameter is configured, this parameter does not take effect.</p>
     * </blockquote>
     */
    @NameInMap("ConfigRequirementIds")
    public ChangeCheckConfigRequestConfigRequirementIds configRequirementIds;

    /**
     * <p>Configures the check policy by using the IDs of the specified standards.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain the standard IDs.</p>
     * </blockquote>
     */
    @NameInMap("ConfigStandardIds")
    public ChangeCheckConfigRequestConfigStandardIds configStandardIds;

    /**
     * <p>The field configuration. Valid values:</p>
     * <ul>
     * <li><strong>all</strong>: Adds all check items.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("Configure")
    public String configure;

    /**
     * <p>The periodic check time.</p>
     */
    @NameInMap("CycleDays")
    public java.util.List<Integer> cycleDays;

    /**
     * <p>The list of days of the month when the policy cycle is monthly.</p>
     */
    @NameInMap("DaysOfMonth")
    public java.util.List<Integer> daysOfMonth;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li>true: Only checks the request without performing the actual operation.</li>
     * <li>false: Executes the request normally.</li>
     * </ul>
     * <p>Default value: false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to check new check items by default when new check items are added to the selected regulations. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableAddCheck")
    public Boolean enableAddCheck;

    /**
     * <p>Specifies whether to enable automatic periodic checks. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAutoCheck")
    public Boolean enableAutoCheck;

    /**
     * <p>The end time of the check time period, which indicates the hour of the day. The start time and end time must be selected from the following time intervals. Valid values: 6, 12, 18, and 24.</p>
     * <ul>
     * <li><strong>0~6</strong>: If the start time is 0, the end time must be set to 6 on the same day.</li>
     * <li><strong>6~12</strong>: If the start time is 6, the end time must be set to 12 on the same day.</li>
     * <li><strong>12~18</strong>: If the start time is 12, the end time must be set to 18 on the same day.</li>
     * <li><strong>18~24</strong>: If the start time is 18, the end time must be set to 24 on the same day.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <p>The end time of the check, in seconds from 00:00:00 of the current day. Valid values: 1 to 86400, where 86400 indicates 00:00:00 of the next day. This parameter is optional. If this parameter is not provided, the current value of the policy is retained. This parameter must be paired with StartTimeSeconds. If only one of them is provided, the system returns IllegalParam (paramName=scheduleTime). If both this parameter and StartTime/EndTime are provided, the second-level parameters take precedence, and the hour-level parameters are ignored. The time window span must not be less than 60 seconds. This parameter is not accepted for the system default policy (ConfigId=default) and will be rejected if provided.</p>
     * 
     * <strong>example:</strong>
     * <p>32399</p>
     */
    @NameInMap("EndTimeSeconds")
    public Integer endTimeSeconds;

    /**
     * <p>The frequency type. Valid values:</p>
     * <ul>
     * <li>DAILY: Daily.</li>
     * <li>WEEKLY: Weekly.</li>
     * <li>MONTHLY: Monthly.</li>
     * <li>6HOURLY: Every 6 hours.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DAILY</p>
     */
    @NameInMap("Frequency")
    public String frequency;

    /**
     * <p>The region of the Security Center instance. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: Center</li>
     * <li><strong>ap-southeast-1</strong>: Singapore</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of check items to be removed from the policy.
     * <notice> If the ConfigStandardIds or ConfigRequirementIds parameter is configured, this parameter does not take effect. </notice></p>
     */
    @NameInMap("RemovedCheck")
    public java.util.List<ChangeCheckConfigRequestRemovedCheck> removedCheck;

    /**
     * <p>The ID of the member accounts in the resource folder, which is an Alibaba Cloud account ID.</p>
     * <blockquote>
     * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1232428423234****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>This parameter is deprecated and can be ignored.</p>
     */
    @NameInMap("StandardIds")
    public java.util.List<Long> standardIds;

    /**
     * <p>The start time of the check time period, which indicates the hour of the day. The start time and end time must be selected from the following time intervals. Valid values: 0, 6, 12, and 18.</p>
     * <ul>
     * <li><strong>0~6</strong>: If the start time is 0, the end time must be set to 6 on the same day.</li>
     * <li><strong>6~12</strong>: If the start time is 6, the end time must be set to 12 on the same day.</li>
     * <li><strong>12~18</strong>: If the start time is 12, the end time must be set to 18 on the same day.</li>
     * <li><strong>18~24</strong>: If the start time is 18, the end time must be set to 24 on the same day.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartTime")
    public Integer startTime;

    /**
     * <p>The start time of the check, in seconds from 00:00:00 of the current day. Valid values: 0 to 86399, which correspond to 00:00:00 to 23:59:59. This parameter is optional. If this parameter is not provided, the current value of the policy is retained. This parameter must be paired with EndTimeSeconds. If only one of them is provided, the system returns IllegalParam (paramName=scheduleTime). If both this parameter and StartTime/EndTime are provided, the second-level parameters take precedence, and the hour-level parameters are ignored. If the two sets of parameters are inconsistent, the server records a WARN log. The time window span must not be less than 60 seconds. The frequency of the system default policy (ConfigId=default) is always 6HOURLY. This parameter is not accepted for the default policy and will be rejected if provided. Under a multi-policy frequency, the actual scan execution time is exactly the second specified by this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>25200</p>
     */
    @NameInMap("StartTimeSeconds")
    public Integer startTimeSeconds;

    /**
     * <p>The policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("StrategyName")
    public String strategyName;

    /**
     * <p>Specifies whether to use the automatically generated system configuration. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SystemConfig")
    public Boolean systemConfig;

    /**
     * <p>The list of cloud providers.</p>
     */
    @NameInMap("Vendors")
    public java.util.List<String> vendors;

    public static ChangeCheckConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeCheckConfigRequest self = new ChangeCheckConfigRequest();
        return TeaModel.build(map, self);
    }

    public ChangeCheckConfigRequest setAddedCheck(java.util.List<ChangeCheckConfigRequestAddedCheck> addedCheck) {
        this.addedCheck = addedCheck;
        return this;
    }
    public java.util.List<ChangeCheckConfigRequestAddedCheck> getAddedCheck() {
        return this.addedCheck;
    }

    public ChangeCheckConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ChangeCheckConfigRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public ChangeCheckConfigRequest setConfigRequirementIds(ChangeCheckConfigRequestConfigRequirementIds configRequirementIds) {
        this.configRequirementIds = configRequirementIds;
        return this;
    }
    public ChangeCheckConfigRequestConfigRequirementIds getConfigRequirementIds() {
        return this.configRequirementIds;
    }

    public ChangeCheckConfigRequest setConfigStandardIds(ChangeCheckConfigRequestConfigStandardIds configStandardIds) {
        this.configStandardIds = configStandardIds;
        return this;
    }
    public ChangeCheckConfigRequestConfigStandardIds getConfigStandardIds() {
        return this.configStandardIds;
    }

    public ChangeCheckConfigRequest setConfigure(String configure) {
        this.configure = configure;
        return this;
    }
    public String getConfigure() {
        return this.configure;
    }

    public ChangeCheckConfigRequest setCycleDays(java.util.List<Integer> cycleDays) {
        this.cycleDays = cycleDays;
        return this;
    }
    public java.util.List<Integer> getCycleDays() {
        return this.cycleDays;
    }

    public ChangeCheckConfigRequest setDaysOfMonth(java.util.List<Integer> daysOfMonth) {
        this.daysOfMonth = daysOfMonth;
        return this;
    }
    public java.util.List<Integer> getDaysOfMonth() {
        return this.daysOfMonth;
    }

    public ChangeCheckConfigRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ChangeCheckConfigRequest setEnableAddCheck(Boolean enableAddCheck) {
        this.enableAddCheck = enableAddCheck;
        return this;
    }
    public Boolean getEnableAddCheck() {
        return this.enableAddCheck;
    }

    public ChangeCheckConfigRequest setEnableAutoCheck(Boolean enableAutoCheck) {
        this.enableAutoCheck = enableAutoCheck;
        return this;
    }
    public Boolean getEnableAutoCheck() {
        return this.enableAutoCheck;
    }

    public ChangeCheckConfigRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public ChangeCheckConfigRequest setEndTimeSeconds(Integer endTimeSeconds) {
        this.endTimeSeconds = endTimeSeconds;
        return this;
    }
    public Integer getEndTimeSeconds() {
        return this.endTimeSeconds;
    }

    public ChangeCheckConfigRequest setFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }
    public String getFrequency() {
        return this.frequency;
    }

    public ChangeCheckConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ChangeCheckConfigRequest setRemovedCheck(java.util.List<ChangeCheckConfigRequestRemovedCheck> removedCheck) {
        this.removedCheck = removedCheck;
        return this;
    }
    public java.util.List<ChangeCheckConfigRequestRemovedCheck> getRemovedCheck() {
        return this.removedCheck;
    }

    public ChangeCheckConfigRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public ChangeCheckConfigRequest setStandardIds(java.util.List<Long> standardIds) {
        this.standardIds = standardIds;
        return this;
    }
    public java.util.List<Long> getStandardIds() {
        return this.standardIds;
    }

    public ChangeCheckConfigRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public ChangeCheckConfigRequest setStartTimeSeconds(Integer startTimeSeconds) {
        this.startTimeSeconds = startTimeSeconds;
        return this;
    }
    public Integer getStartTimeSeconds() {
        return this.startTimeSeconds;
    }

    public ChangeCheckConfigRequest setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public ChangeCheckConfigRequest setSystemConfig(Boolean systemConfig) {
        this.systemConfig = systemConfig;
        return this;
    }
    public Boolean getSystemConfig() {
        return this.systemConfig;
    }

    public ChangeCheckConfigRequest setVendors(java.util.List<String> vendors) {
        this.vendors = vendors;
        return this;
    }
    public java.util.List<String> getVendors() {
        return this.vendors;
    }

    public static class ChangeCheckConfigRequestAddedCheck extends TeaModel {
        /**
         * <p>The ID of the check item.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain the check item ID.</p>
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

        public static ChangeCheckConfigRequestAddedCheck build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckConfigRequestAddedCheck self = new ChangeCheckConfigRequestAddedCheck();
            return TeaModel.build(map, self);
        }

        public ChangeCheckConfigRequestAddedCheck setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public ChangeCheckConfigRequestAddedCheck setSectionId(Long sectionId) {
            this.sectionId = sectionId;
            return this;
        }
        public Long getSectionId() {
            return this.sectionId;
        }

    }

    public static class ChangeCheckConfigRequestConfigRequirementIds extends TeaModel {
        /**
         * <p>The list of regulation IDs to be added to the policy.</p>
         */
        @NameInMap("AddIds")
        public java.util.List<Long> addIds;

        /**
         * <p>The list of regulation IDs to be removed from the policy.</p>
         */
        @NameInMap("RemoveIds")
        public java.util.List<Long> removeIds;

        public static ChangeCheckConfigRequestConfigRequirementIds build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckConfigRequestConfigRequirementIds self = new ChangeCheckConfigRequestConfigRequirementIds();
            return TeaModel.build(map, self);
        }

        public ChangeCheckConfigRequestConfigRequirementIds setAddIds(java.util.List<Long> addIds) {
            this.addIds = addIds;
            return this;
        }
        public java.util.List<Long> getAddIds() {
            return this.addIds;
        }

        public ChangeCheckConfigRequestConfigRequirementIds setRemoveIds(java.util.List<Long> removeIds) {
            this.removeIds = removeIds;
            return this;
        }
        public java.util.List<Long> getRemoveIds() {
            return this.removeIds;
        }

    }

    public static class ChangeCheckConfigRequestConfigStandardIds extends TeaModel {
        /**
         * <p>The list of standard IDs to be added to the policy.</p>
         */
        @NameInMap("AddIds")
        public java.util.List<Long> addIds;

        /**
         * <p>The list of standard IDs to be removed from the policy.</p>
         */
        @NameInMap("RemoveIds")
        public java.util.List<Long> removeIds;

        public static ChangeCheckConfigRequestConfigStandardIds build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckConfigRequestConfigStandardIds self = new ChangeCheckConfigRequestConfigStandardIds();
            return TeaModel.build(map, self);
        }

        public ChangeCheckConfigRequestConfigStandardIds setAddIds(java.util.List<Long> addIds) {
            this.addIds = addIds;
            return this;
        }
        public java.util.List<Long> getAddIds() {
            return this.addIds;
        }

        public ChangeCheckConfigRequestConfigStandardIds setRemoveIds(java.util.List<Long> removeIds) {
            this.removeIds = removeIds;
            return this;
        }
        public java.util.List<Long> getRemoveIds() {
            return this.removeIds;
        }

    }

    public static class ChangeCheckConfigRequestRemovedCheck extends TeaModel {
        /**
         * <p>The ID of the check item.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to obtain the check item ID.</p>
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

        public static ChangeCheckConfigRequestRemovedCheck build(java.util.Map<String, ?> map) throws Exception {
            ChangeCheckConfigRequestRemovedCheck self = new ChangeCheckConfigRequestRemovedCheck();
            return TeaModel.build(map, self);
        }

        public ChangeCheckConfigRequestRemovedCheck setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public ChangeCheckConfigRequestRemovedCheck setSectionId(Long sectionId) {
            this.sectionId = sectionId;
            return this;
        }
        public Long getSectionId() {
            return this.sectionId;
        }

    }

}
