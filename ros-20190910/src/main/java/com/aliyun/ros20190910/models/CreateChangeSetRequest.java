// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateChangeSetRequest extends TeaModel {
    @NameInMap("StackId")
    public String stackId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("StackPolicyURL")
    public String stackPolicyURL;

    @NameInMap("StackPolicyBody")
    public String stackPolicyBody;

    @NameInMap("StackName")
    public String stackName;

    @NameInMap("UsePreviousParameters")
    public Boolean usePreviousParameters;

    @NameInMap("ChangeSetType")
    public String changeSetType;

    @NameInMap("Description")
    public String description;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("StackPolicyDuringUpdateURL")
    public String stackPolicyDuringUpdateURL;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("UpdateAllowPolicy")
    public String updateAllowPolicy;

    @NameInMap("TimeoutInMinutes")
    public Long timeoutInMinutes;

    @NameInMap("ActivityId")
    public String activityId;

    @NameInMap("OrderSource")
    public String orderSource;

    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    @NameInMap("ChangeSetName")
    public String changeSetName;

    @NameInMap("StackPolicyDuringUpdateBody")
    public String stackPolicyDuringUpdateBody;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("ReplacementOption")
    public String replacementOption;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    @NameInMap("Parameters")
    public java.util.List<CreateChangeSetRequestParameters> parameters;

    @NameInMap("NotificationURLs")
    public java.util.List<String> notificationURLs;

    @NameInMap("ResourcesToImport")
    public java.util.List<CreateChangeSetRequestResourcesToImport> resourcesToImport;

    public static CreateChangeSetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChangeSetRequest self = new CreateChangeSetRequest();
        return TeaModel.build(map, self);
    }

    public CreateChangeSetRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public CreateChangeSetRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public CreateChangeSetRequest setStackPolicyURL(String stackPolicyURL) {
        this.stackPolicyURL = stackPolicyURL;
        return this;
    }
    public String getStackPolicyURL() {
        return this.stackPolicyURL;
    }

    public CreateChangeSetRequest setStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
        return this;
    }
    public String getStackPolicyBody() {
        return this.stackPolicyBody;
    }

    public CreateChangeSetRequest setStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    public String getStackName() {
        return this.stackName;
    }

    public CreateChangeSetRequest setUsePreviousParameters(Boolean usePreviousParameters) {
        this.usePreviousParameters = usePreviousParameters;
        return this;
    }
    public Boolean getUsePreviousParameters() {
        return this.usePreviousParameters;
    }

    public CreateChangeSetRequest setChangeSetType(String changeSetType) {
        this.changeSetType = changeSetType;
        return this;
    }
    public String getChangeSetType() {
        return this.changeSetType;
    }

    public CreateChangeSetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateChangeSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateChangeSetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateChangeSetRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public CreateChangeSetRequest setStackPolicyDuringUpdateURL(String stackPolicyDuringUpdateURL) {
        this.stackPolicyDuringUpdateURL = stackPolicyDuringUpdateURL;
        return this;
    }
    public String getStackPolicyDuringUpdateURL() {
        return this.stackPolicyDuringUpdateURL;
    }

    public CreateChangeSetRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public CreateChangeSetRequest setUpdateAllowPolicy(String updateAllowPolicy) {
        this.updateAllowPolicy = updateAllowPolicy;
        return this;
    }
    public String getUpdateAllowPolicy() {
        return this.updateAllowPolicy;
    }

    public CreateChangeSetRequest setTimeoutInMinutes(Long timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Long getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public CreateChangeSetRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public CreateChangeSetRequest setOrderSource(String orderSource) {
        this.orderSource = orderSource;
        return this;
    }
    public String getOrderSource() {
        return this.orderSource;
    }

    public CreateChangeSetRequest setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public CreateChangeSetRequest setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
        return this;
    }
    public String getChangeSetName() {
        return this.changeSetName;
    }

    public CreateChangeSetRequest setStackPolicyDuringUpdateBody(String stackPolicyDuringUpdateBody) {
        this.stackPolicyDuringUpdateBody = stackPolicyDuringUpdateBody;
        return this;
    }
    public String getStackPolicyDuringUpdateBody() {
        return this.stackPolicyDuringUpdateBody;
    }

    public CreateChangeSetRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public CreateChangeSetRequest setReplacementOption(String replacementOption) {
        this.replacementOption = replacementOption;
        return this;
    }
    public String getReplacementOption() {
        return this.replacementOption;
    }

    public CreateChangeSetRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateChangeSetRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public CreateChangeSetRequest setParameters(java.util.List<CreateChangeSetRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<CreateChangeSetRequestParameters> getParameters() {
        return this.parameters;
    }

    public CreateChangeSetRequest setNotificationURLs(java.util.List<String> notificationURLs) {
        this.notificationURLs = notificationURLs;
        return this;
    }
    public java.util.List<String> getNotificationURLs() {
        return this.notificationURLs;
    }

    public CreateChangeSetRequest setResourcesToImport(java.util.List<CreateChangeSetRequestResourcesToImport> resourcesToImport) {
        this.resourcesToImport = resourcesToImport;
        return this;
    }
    public java.util.List<CreateChangeSetRequestResourcesToImport> getResourcesToImport() {
        return this.resourcesToImport;
    }

    public static class CreateChangeSetRequestParameters extends TeaModel {
        @NameInMap("ParameterKey")
        public String parameterKey;

        @NameInMap("ParameterValue")
        public String parameterValue;

        public static CreateChangeSetRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateChangeSetRequestParameters self = new CreateChangeSetRequestParameters();
            return TeaModel.build(map, self);
        }

        public CreateChangeSetRequestParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public CreateChangeSetRequestParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class CreateChangeSetRequestResourcesToImport extends TeaModel {
        @NameInMap("ResourceIdentifier")
        public String resourceIdentifier;

        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        public static CreateChangeSetRequestResourcesToImport build(java.util.Map<String, ?> map) throws Exception {
            CreateChangeSetRequestResourcesToImport self = new CreateChangeSetRequestResourcesToImport();
            return TeaModel.build(map, self);
        }

        public CreateChangeSetRequestResourcesToImport setResourceIdentifier(String resourceIdentifier) {
            this.resourceIdentifier = resourceIdentifier;
            return this;
        }
        public String getResourceIdentifier() {
            return this.resourceIdentifier;
        }

        public CreateChangeSetRequestResourcesToImport setLogicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        public CreateChangeSetRequestResourcesToImport setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
