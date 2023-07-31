// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateChangeSetRequest extends TeaModel {
    /**
     * <p>The name of the change set.\</p>
     * <p>The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (\_). The name must start with a digit or a letter.</p>
     * <br>
     * <p>> Make sure that the name is unique among all names of change sets that are associated with the specified stack.</p>
     */
    @NameInMap("ChangeSetName")
    public String changeSetName;

    /**
     * <p>The type of the change set. Valid values:</p>
     * <br>
     * <p>*   CREATE: creates a change set for a new stack.</p>
     * <p>*   UPDATE (default): creates a change set for an existing stack.</p>
     * <p>*   IMPORT: creates a change set for a new stack or an existing stack to import resources that are not managed by ROS.</p>
     * <br>
     * <p>If you create a change set for a new stack, ROS generates a unique stack ID for the stack. The stack remains in the REVIEW_IN_PROGRESS state until you execute the change set.\</p>
     * <p>If you want to create a change set for a new stack, do not set ChangeSetType to UPDATE. If you want to create a change set for an existing stack, do not set ChangeSetType to CREATE.</p>
     */
    @NameInMap("ChangeSetType")
    public String changeSetType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests.\</p>
     * <p>The token can contain letters, digits, hyphens (-), and underscores (\_) and cannot exceed 64 characters in length.\</p>
     * <p>For more information, see [How to ensure idempotence](~~134212~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the change set. The description can be up to 1,024 bytes in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to disable rollback when the stack fails to be created.\</p>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true: disables rollback for the stack when the stack fails to be created.</p>
     * <p>*   false (default): enables rollback for the stack when the stack fails to be created.</p>
     * <br>
     * <p>> This parameter takes effect only if you set ChangeSetType to CREATE or IMPORT.</p>
     */
    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    /**
     * <p>The callback URLs that are used to receive stack events.</p>
     */
    @NameInMap("NotificationURLs")
    public java.util.List<String> notificationURLs;

    /**
     * <p>The maximum number of concurrent operations that can be performed on resources. By default, this parameter is empty. You can set this parameter to an integer that is greater than or equal to 0. If you set this parameter to a specific value, ROS associates the value with the stack. The value can affect subsequent operations on the stack.</p>
     * <br>
     * <p>This parameter takes effect only if you set ChangeSetType to CREATE or UPDATE.</p>
     * <br>
     * <p>*   Valid values for change sets of the CREATE type:</p>
     * <br>
     * <p>    *   If you set this parameter to an integer that is greater than 0, the integer is used.</p>
     * <p>    *   If you set this parameter to 0 or leave this parameter empty, no limit is imposed on ROS stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.</p>
     * <br>
     * <p>*   Valid values for change sets of the UPDATE type:</p>
     * <br>
     * <p>    *   If you set this parameter to an integer that is greater than 0, the integer is used.</p>
     * <p>    *   If you set this parameter to 0, no limit is imposed on ROS stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.</p>
     * <p>    *   If you leave this parameter empty, the value that you specified for this parameter in the previous request is used. If you left this parameter empty in the previous request, no limit is imposed on ROS stacks. However, the default value in Terraform is used for Terraform stacks. In most cases, the default value in Terraform is 10.</p>
     */
    @NameInMap("Parallelism")
    public Long parallelism;

    /**
     * <p>The parameters that are defined in the template.</p>
     */
    @NameInMap("Parameters")
    public java.util.List<CreateChangeSetRequestParameters> parameters;

    /**
     * <p>The name of the Resource Access Management (RAM) role. Resource Orchestration Service (ROS) assumes the RAM role to create the stack and uses the credentials of the role to call the APIs of Alibaba Cloud services.\</p>
     * <p>ROS assumes the role to perform operations on the stack. If you have permissions to perform operations on the stack but do not have permissions to use the RAM role, ROS still assumes the RAM role. You must make sure that the least privileges are granted to the RAM role.\</p>
     * <p>If you do not specify this parameter, ROS uses the existing role that is associated with the stack. If no roles are available for ROS to assume, ROS uses a temporary credential that is generated from the credentials of your Alibaba Cloud account.\</p>
     * <p>The name of the RAM role can be up to 64 bytes in length.</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The region ID of the change set. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to enable replacement update if a resource property is changed and you cannot modify the new resource property. For a change, the physical ID of the resource remains unchanged. For a replacement update, the existing resource is deleted, a new resource is created, and the physical ID of the resource is changed. Valid values:</p>
     * <br>
     * <p>*   Enabled</p>
     * <p>*   Disabled (default)</p>
     * <br>
     * <p>> Operations that you perform to modify the resource properties for an update take precedence over operations you perform to replace the resource properties for an update. This parameter takes effect only if you set ChangeSetType to UPDATE.</p>
     */
    @NameInMap("ReplacementOption")
    public String replacementOption;

    /**
     * <p>The resources that you want to import into the stack.</p>
     */
    @NameInMap("ResourcesToImport")
    public java.util.List<CreateChangeSetRequestResourcesToImport> resourcesToImport;

    /**
     * <p>The ID of the stack for which you want to create a change set. ROS compares the stack information with the information that you submit, such as a modified template or a changed parameter value, to generate the change set.</p>
     * <br>
     * <p>> This parameter takes effect only for change sets of the UPDATE or IMPORT.</p>
     */
    @NameInMap("StackId")
    public String stackId;

    /**
     * <p>The name of the stack for which you want to create the change set.\</p>
     * <p>The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (\_). The name must start with a digit or a letter.</p>
     * <br>
     * <p>> This parameter takes effect only if you set ChangeSetType to CREATE or IMPORT.</p>
     */
    @NameInMap("StackName")
    public String stackName;

    /**
     * <p>The structure of the stack policy body. The policy body must be 1 to 16,384 bytes in length. If you set ChangeSetType to CREATE, you can specify StackPolicyBody or StackPolicyURL. If you set ChangeSetType to UPDATE, you can specify only one of the following parameters:</p>
     * <br>
     * <p>*   StackPolicyBody</p>
     * <p>*   StackPolicyURL</p>
     * <p>*   StackPolicyDuringUpdateBody</p>
     * <p>*   StackPolicyDuringUpdateURL</p>
     */
    @NameInMap("StackPolicyBody")
    public String stackPolicyBody;

    /**
     * <p>The structure of the temporary overriding stack policy. The policy body must be 1 to 16,384 bytes in length.\</p>
     * <p>If you need to update protected resources, specify a temporary overriding stack policy for the resources during the update. If you do not specify a temporary overriding stack policy, the existing stack policy that is associated with the stack is used.\</p>
     * <p>This parameter takes effect only if you set ChangeSetType to UPDATE. You can specify only one of the following parameters:</p>
     * <br>
     * <p>*   StackPolicyBody</p>
     * <p>*   StackPolicyURL</p>
     * <p>*   StackPolicyDuringUpdateBody</p>
     * <p>*   StackPolicyDuringUpdateURL</p>
     */
    @NameInMap("StackPolicyDuringUpdateBody")
    public String stackPolicyDuringUpdateBody;

    /**
     * <p>The URL of the stack policy based on which the stack is updated. The URL must point to a policy that is located on an HTTP or HTTPS web server or in an OSS bucket, such as oss://ros/stack-policy/demo and oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy file can be up to 16,384 bytes in length.</p>
     * <br>
     * <p>> If you do not specify the region of the OSS bucket, the value of RegionId is used.</p>
     * <br>
     * <p>The URL can be up to 1,350 bytes in length.\</p>
     * <p>If you need to update protected resources, specify a temporary overriding stack policy for the resources during the update. If you do not specify a stack policy, the existing policy that is associated with the stack is used. This parameter takes effect only if you set ChangeSetType to UPDATE. You can specify only one of the following parameters:</p>
     * <br>
     * <p>*   StackPolicyBody</p>
     * <p>*   StackPolicyURL</p>
     * <p>*   StackPolicyDuringUpdateBody</p>
     * <p>*   StackPolicyDuringUpdateURL</p>
     */
    @NameInMap("StackPolicyDuringUpdateURL")
    public String stackPolicyDuringUpdateURL;

    /**
     * <p>The URL of the file that contains the stack policy. The URL must point to a policy that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/stack-policy/demo and oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy file can be up to 16,384 bytes in length.</p>
     * <br>
     * <p>> If you do not specify the region of the OSS bucket, the value of RegionId is used.</p>
     * <br>
     * <p>You can specify only one of the following parameters: StackPolicyBody and StackPolicyURL.\</p>
     * <p>The URL can be up to 1,350 bytes in length.</p>
     * <br>
     * <p>If you set ChangeSetType to CREATE, you can specify StackPolicyBody or StackPolicyURL. If you set ChangeSetType to UPDATE, you can specify only one of the following parameters:</p>
     * <br>
     * <p>*   StackPolicyBody</p>
     * <p>*   StackPolicyURL</p>
     * <p>*   StackPolicyDuringUpdateBody</p>
     * <p>*   StackPolicyDuringUpdateURL</p>
     */
    @NameInMap("StackPolicyURL")
    public String stackPolicyURL;

    /**
     * <p>The structure of the template body. The template body must be 1 to 524,288 bytes in length.\</p>
     * <p>If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessive length of URLs.</p>
     * <br>
     * <p>You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
     */
    @NameInMap("TemplateBody")
    public String templateBody;

    /**
     * <p>The ID of the template. This parameter applies to shared and private templates.</p>
     * <br>
     * <p>You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The ID of the scenario template.</p>
     */
    @NameInMap("TemplateScratchId")
    public String templateScratchId;

    /**
     * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an OSS bucket, such as oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template body can be up to 524,288 bytes in length.</p>
     * <br>
     * <p>> If you do not specify the region of the OSS bucket, the value of RegionId is used.</p>
     * <br>
     * <p>You can specify only one of the following parameters: TemplateBody, TemplateURL, and TemplateId.</p>
     * <br>
     * <p>The URL can be up to 1,024 bytes in length.</p>
     */
    @NameInMap("TemplateURL")
    public String templateURL;

    /**
     * <p>The version of the template.</p>
     * <br>
     * <p>> This parameter takes effect only if you specify TemplateId.</p>
     */
    @NameInMap("TemplateVersion")
    public String templateVersion;

    /**
     * <p>The amount of time that can elapse before the stack enters the CREATE_FAILED or UPDATE_FAILED state.\</p>
     * <p>If you set ChangeSetType to CREATE, this parameter is required. If you set ChangeSetType to UPDATE, this parameter is optional.</p>
     * <br>
     * <p>*   Unit: minutes.</p>
     * <p>*   Valid values: 10 to 1440.</p>
     * <p>*   Default value: 60.</p>
     */
    @NameInMap("TimeoutInMinutes")
    public Long timeoutInMinutes;

    /**
     * <p>Specifies whether to use the values that were passed last time for the parameters that you do not specify in the current request. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false (default)</p>
     * <br>
     * <p>> This parameter takes effect only if you set ChangeSetType to UPDATE or IMPORT.</p>
     */
    @NameInMap("UsePreviousParameters")
    public Boolean usePreviousParameters;

    public static CreateChangeSetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChangeSetRequest self = new CreateChangeSetRequest();
        return TeaModel.build(map, self);
    }

    public CreateChangeSetRequest setChangeSetName(String changeSetName) {
        this.changeSetName = changeSetName;
        return this;
    }
    public String getChangeSetName() {
        return this.changeSetName;
    }

    public CreateChangeSetRequest setChangeSetType(String changeSetType) {
        this.changeSetType = changeSetType;
        return this;
    }
    public String getChangeSetType() {
        return this.changeSetType;
    }

    public CreateChangeSetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateChangeSetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateChangeSetRequest setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
        return this;
    }
    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    public CreateChangeSetRequest setNotificationURLs(java.util.List<String> notificationURLs) {
        this.notificationURLs = notificationURLs;
        return this;
    }
    public java.util.List<String> getNotificationURLs() {
        return this.notificationURLs;
    }

    public CreateChangeSetRequest setParallelism(Long parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    public Long getParallelism() {
        return this.parallelism;
    }

    public CreateChangeSetRequest setParameters(java.util.List<CreateChangeSetRequestParameters> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.List<CreateChangeSetRequestParameters> getParameters() {
        return this.parameters;
    }

    public CreateChangeSetRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public CreateChangeSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateChangeSetRequest setReplacementOption(String replacementOption) {
        this.replacementOption = replacementOption;
        return this;
    }
    public String getReplacementOption() {
        return this.replacementOption;
    }

    public CreateChangeSetRequest setResourcesToImport(java.util.List<CreateChangeSetRequestResourcesToImport> resourcesToImport) {
        this.resourcesToImport = resourcesToImport;
        return this;
    }
    public java.util.List<CreateChangeSetRequestResourcesToImport> getResourcesToImport() {
        return this.resourcesToImport;
    }

    public CreateChangeSetRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public CreateChangeSetRequest setStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    public String getStackName() {
        return this.stackName;
    }

    public CreateChangeSetRequest setStackPolicyBody(String stackPolicyBody) {
        this.stackPolicyBody = stackPolicyBody;
        return this;
    }
    public String getStackPolicyBody() {
        return this.stackPolicyBody;
    }

    public CreateChangeSetRequest setStackPolicyDuringUpdateBody(String stackPolicyDuringUpdateBody) {
        this.stackPolicyDuringUpdateBody = stackPolicyDuringUpdateBody;
        return this;
    }
    public String getStackPolicyDuringUpdateBody() {
        return this.stackPolicyDuringUpdateBody;
    }

    public CreateChangeSetRequest setStackPolicyDuringUpdateURL(String stackPolicyDuringUpdateURL) {
        this.stackPolicyDuringUpdateURL = stackPolicyDuringUpdateURL;
        return this;
    }
    public String getStackPolicyDuringUpdateURL() {
        return this.stackPolicyDuringUpdateURL;
    }

    public CreateChangeSetRequest setStackPolicyURL(String stackPolicyURL) {
        this.stackPolicyURL = stackPolicyURL;
        return this;
    }
    public String getStackPolicyURL() {
        return this.stackPolicyURL;
    }

    public CreateChangeSetRequest setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }
    public String getTemplateBody() {
        return this.templateBody;
    }

    public CreateChangeSetRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateChangeSetRequest setTemplateScratchId(String templateScratchId) {
        this.templateScratchId = templateScratchId;
        return this;
    }
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    public CreateChangeSetRequest setTemplateURL(String templateURL) {
        this.templateURL = templateURL;
        return this;
    }
    public String getTemplateURL() {
        return this.templateURL;
    }

    public CreateChangeSetRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public CreateChangeSetRequest setTimeoutInMinutes(Long timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
        return this;
    }
    public Long getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    public CreateChangeSetRequest setUsePreviousParameters(Boolean usePreviousParameters) {
        this.usePreviousParameters = usePreviousParameters;
        return this;
    }
    public Boolean getUsePreviousParameters() {
        return this.usePreviousParameters;
    }

    public static class CreateChangeSetRequestParameters extends TeaModel {
        /**
         * <p>The key of parameter N that is defined in the template. If you do not specify the key and value of a parameter, ROS uses the default name and value that are defined in the template. Maximum value of N: 200.</p>
         * <br>
         * <p>>  Parameters is optional. If you specify Parameters, you must also specify Parameters.N.ParameterKey.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of parameter N that is defined in the template. Maximum value of N: 200.</p>
         * <br>
         * <p>>  Parameters is optional. If you specify Parameters, you must also specify Parameters.N.ParameterValue.</p>
         */
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
        /**
         * <p>The logical ID of resource N that you want to import. The logical ID specifies the name of resource N that is defined in the template.</p>
         * <br>
         * <p>> This parameter takes effect only if you set ChangeSetType to IMPORT. ResourcesToImport is optional. If you specify ResourcesToImport, you must also specify ResourcesToImport.N.LogicalResourceId.</p>
         */
        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        /**
         * <p>The key-value mapping between strings. The value is a JSON string that identifies resource N that you want to import.\</p>
         * <p>A key is an identifier for a resource and a value is an assignment of data to the key. For example, VpcId is a key that indicates the ID of a virtual private cloud (VPC), and `vpc-2zevx9ios****` is a value that is assigned to VpcId. You can call the [GetTemplateSummary](~~172485~~) operation to obtain the key of a resource.</p>
         * <br>
         * <p>> This parameter takes effect only if you set ChangeSetType to IMPORT. ResourcesToImport is optional. If you specify ResourcesToImport, you must also specify ResourcesToImport.N.ResourceIdentifier.</p>
         */
        @NameInMap("ResourceIdentifier")
        public String resourceIdentifier;

        /**
         * <p>The type of resource N that you want to import. The resource type must be the same as the resource type that is defined in the template.</p>
         * <br>
         * <p>> This parameter takes effect only if you set ChangeSetType to IMPORT. ResourcesToImport is optional. If you specify ResourcesToImport, you must also specify ResourcesToImport.N.ResourceType.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static CreateChangeSetRequestResourcesToImport build(java.util.Map<String, ?> map) throws Exception {
            CreateChangeSetRequestResourcesToImport self = new CreateChangeSetRequestResourcesToImport();
            return TeaModel.build(map, self);
        }

        public CreateChangeSetRequestResourcesToImport setLogicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        public CreateChangeSetRequestResourcesToImport setResourceIdentifier(String resourceIdentifier) {
            this.resourceIdentifier = resourceIdentifier;
            return this;
        }
        public String getResourceIdentifier() {
            return this.resourceIdentifier;
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
