// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class PreviewStackResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the stack that is previewed.</p>
     */
    @NameInMap("Stack")
    public PreviewStackResponseBodyStack stack;

    public static PreviewStackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreviewStackResponseBody self = new PreviewStackResponseBody();
        return TeaModel.build(map, self);
    }

    public PreviewStackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PreviewStackResponseBody setStack(PreviewStackResponseBodyStack stack) {
        this.stack = stack;
        return this;
    }
    public PreviewStackResponseBodyStack getStack() {
        return this.stack;
    }

    public static class PreviewStackResponseBodyStackLogTerraformLogs extends TeaModel {
        /**
         * <p>The name of the Terraform command that is run. Valid values:</p>
         * <ul>
         * <li>apply</li>
         * <li>plan</li>
         * <li>destroy</li>
         * <li>version</li>
         * </ul>
         * <p>For more information about Terraform commands, see <a href="https://www.terraform.io/cli/commands">Basic CLI Features</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>apply</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The content of the output stream that is returned after the command is run.</p>
         * 
         * <strong>example:</strong>
         * <p>Apply complete! Resources: 42 added, 0 changed, 0 destroyed.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The output stream. Valid values:</p>
         * <ul>
         * <li>stdout: standard output stream</li>
         * <li>stderr: standard error stream</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>stdout</p>
         */
        @NameInMap("Stream")
        public String stream;

        public static PreviewStackResponseBodyStackLogTerraformLogs build(java.util.Map<String, ?> map) throws Exception {
            PreviewStackResponseBodyStackLogTerraformLogs self = new PreviewStackResponseBodyStackLogTerraformLogs();
            return TeaModel.build(map, self);
        }

        public PreviewStackResponseBodyStackLogTerraformLogs setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public PreviewStackResponseBodyStackLogTerraformLogs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public PreviewStackResponseBodyStackLogTerraformLogs setStream(String stream) {
            this.stream = stream;
            return this;
        }
        public String getStream() {
            return this.stream;
        }

    }

    public static class PreviewStackResponseBodyStackLog extends TeaModel {
        /**
         * <p>The Terraform logs. This parameter is returned only if the stack is a Terraform stack.</p>
         * <blockquote>
         * <p>This parameter contains the logs of previewing the stack.</p>
         * </blockquote>
         */
        @NameInMap("TerraformLogs")
        public java.util.List<PreviewStackResponseBodyStackLogTerraformLogs> terraformLogs;

        public static PreviewStackResponseBodyStackLog build(java.util.Map<String, ?> map) throws Exception {
            PreviewStackResponseBodyStackLog self = new PreviewStackResponseBodyStackLog();
            return TeaModel.build(map, self);
        }

        public PreviewStackResponseBodyStackLog setTerraformLogs(java.util.List<PreviewStackResponseBodyStackLogTerraformLogs> terraformLogs) {
            this.terraformLogs = terraformLogs;
            return this;
        }
        public java.util.List<PreviewStackResponseBodyStackLogTerraformLogs> getTerraformLogs() {
            return this.terraformLogs;
        }

    }

    public static class PreviewStackResponseBodyStackParameters extends TeaModel {
        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::AccountId</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>151266687691****</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static PreviewStackResponseBodyStackParameters build(java.util.Map<String, ?> map) throws Exception {
            PreviewStackResponseBodyStackParameters self = new PreviewStackResponseBodyStackParameters();
            return TeaModel.build(map, self);
        }

        public PreviewStackResponseBodyStackParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public PreviewStackResponseBodyStackParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class PreviewStackResponseBodyStackResources extends TeaModel {
        /**
         * <p>The resource type of an Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        @NameInMap("AcsResourceType")
        public String acsResourceType;

        /**
         * <p>The action that is performed on the resource. Valid values:</p>
         * <ul>
         * <li>Add</li>
         * <li>Modify</li>
         * <li>Remove</li>
         * <li>None</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Add</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The description of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS instance.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The logical ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>WebServer</p>
         */
        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        /**
         * <p>The physical ID of the resource.</p>
         * <p>This parameter is returned only if Action is set to Modify or Remove.</p>
         * 
         * <strong>example:</strong>
         * <p>i-a1b2c3***</p>
         */
        @NameInMap("PhysicalResourceId")
        public String physicalResourceId;

        /**
         * <p>The resource properties.</p>
         * 
         * <strong>example:</strong>
         * <p>{   &quot;DiskMappings&quot;: [     {       &quot;Category&quot;: &quot;cloud_ssd&quot;,       &quot;Size&quot;: &quot;20&quot;     }   ],   &quot;SystemDisk_Category&quot;: &quot;cloud_ssd&quot;,   &quot;InstanceChargeType&quot;: &quot;PostPaid&quot;,   &quot;AutoRenew&quot;: &quot;False&quot;,   &quot;WillReplace&quot;: true,   &quot;ImageId&quot;: &quot;centos_7&quot;,   &quot;InstanceType&quot;: &quot;ecs.g6.large&quot;,   &quot;AllocatePublicIP&quot;: true,   &quot;AutoRenewPeriod&quot;: 1,   &quot;IoOptimized&quot;: &quot;optimized&quot;,   &quot;ZoneId&quot;: &quot;cn-beijing-g&quot;,   &quot;VSwitchId&quot;: &quot;&quot;,   &quot;SecurityGroupId&quot;: &quot;&quot;,   &quot;Period&quot;: 1,   &quot;InternetChargeType&quot;: &quot;PayByTraffic&quot;,   &quot;SystemDiskCategory&quot;: &quot;cloud_efficiency&quot;,   &quot;InternetMaxBandwidthOut&quot;: 1,   &quot;VpcId&quot;: &quot;&quot;,   &quot;InternetMaxBandwidthIn&quot;: 200,   &quot;PeriodUnit&quot;: &quot;Month&quot; }</p>
         */
        @NameInMap("Properties")
        public java.util.Map<String, ?> properties;

        /**
         * <p>Indicates whether a replacement update is performed on the template. Valid values:</p>
         * <ul>
         * <li>True: A replacement update is performed on the template.</li>
         * <li>False: A change is made on the template.</li>
         * <li>Conditional: A replacement update may be performed on the template. You can check whether a replacement update is performed when the template is in use.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only if Action is set to Modify.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("Replacement")
        public String replacement;

        /**
         * <p>The resources on which the stack depends.</p>
         */
        @NameInMap("RequiredBy")
        public java.util.List<String> requiredBy;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::ECS::Instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The information about the nested stack. The data structure of the value is the same as the data structure of the entire response.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Stack")
        public java.util.Map<String, ?> stack;

        public static PreviewStackResponseBodyStackResources build(java.util.Map<String, ?> map) throws Exception {
            PreviewStackResponseBodyStackResources self = new PreviewStackResponseBodyStackResources();
            return TeaModel.build(map, self);
        }

        public PreviewStackResponseBodyStackResources setAcsResourceType(String acsResourceType) {
            this.acsResourceType = acsResourceType;
            return this;
        }
        public String getAcsResourceType() {
            return this.acsResourceType;
        }

        public PreviewStackResponseBodyStackResources setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public PreviewStackResponseBodyStackResources setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public PreviewStackResponseBodyStackResources setLogicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        public PreviewStackResponseBodyStackResources setPhysicalResourceId(String physicalResourceId) {
            this.physicalResourceId = physicalResourceId;
            return this;
        }
        public String getPhysicalResourceId() {
            return this.physicalResourceId;
        }

        public PreviewStackResponseBodyStackResources setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public PreviewStackResponseBodyStackResources setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }
        public String getReplacement() {
            return this.replacement;
        }

        public PreviewStackResponseBodyStackResources setRequiredBy(java.util.List<String> requiredBy) {
            this.requiredBy = requiredBy;
            return this;
        }
        public java.util.List<String> getRequiredBy() {
            return this.requiredBy;
        }

        public PreviewStackResponseBodyStackResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public PreviewStackResponseBodyStackResources setStack(java.util.Map<String, ?> stack) {
            this.stack = stack;
            return this;
        }
        public java.util.Map<String, ?> getStack() {
            return this.stack;
        }

    }

    public static class PreviewStackResponseBodyStack extends TeaModel {
        /**
         * <p>The description of the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>One ECS instance.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether rollback is disabled for the resources when the stack fails to be created.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DisableRollback")
        public Boolean disableRollback;

        /**
         * <p>The log that is generated when the stack is run.</p>
         */
        @NameInMap("Log")
        public PreviewStackResponseBodyStackLog log;

        /**
         * <p>The parameters of the stack.</p>
         */
        @NameInMap("Parameters")
        public java.util.List<PreviewStackResponseBodyStackParameters> parameters;

        /**
         * <p>The region where the stack resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resources in the stack.</p>
         */
        @NameInMap("Resources")
        public java.util.List<PreviewStackResponseBodyStackResources> resources;

        /**
         * <p>The stack name.</p>
         * 
         * <strong>example:</strong>
         * <p>MyStack</p>
         */
        @NameInMap("StackName")
        public String stackName;

        /**
         * <p>The structure that contains the stack policy body.</p>
         * 
         * <strong>example:</strong>
         * <p>{   &quot;Statement&quot;: [     {       &quot;Action&quot;: &quot;Update:<em>&quot;,       &quot;Resource&quot;: &quot;</em>&quot;,       &quot;Effect&quot;: &quot;Allow&quot;,       &quot;Principal&quot;: &quot;<em>&quot;     },     {       &quot;Action&quot;: &quot;Update:</em>&quot;,       &quot;Resource&quot;: &quot;LogicalResourceId/apple1&quot;,       &quot;Effect&quot;: &quot;Deny&quot;,       &quot;Principal&quot;: &quot;*&quot;     }   ] }</p>
         */
        @NameInMap("StackPolicyBody")
        public java.util.Map<String, ?> stackPolicyBody;

        /**
         * <p>The description of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>One ECS instance.</p>
         */
        @NameInMap("TemplateDescription")
        public String templateDescription;

        /**
         * <p>The timeout period for creating the stack.</p>
         * <p>Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("TimeoutInMinutes")
        public Integer timeoutInMinutes;

        public static PreviewStackResponseBodyStack build(java.util.Map<String, ?> map) throws Exception {
            PreviewStackResponseBodyStack self = new PreviewStackResponseBodyStack();
            return TeaModel.build(map, self);
        }

        public PreviewStackResponseBodyStack setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public PreviewStackResponseBodyStack setDisableRollback(Boolean disableRollback) {
            this.disableRollback = disableRollback;
            return this;
        }
        public Boolean getDisableRollback() {
            return this.disableRollback;
        }

        public PreviewStackResponseBodyStack setLog(PreviewStackResponseBodyStackLog log) {
            this.log = log;
            return this;
        }
        public PreviewStackResponseBodyStackLog getLog() {
            return this.log;
        }

        public PreviewStackResponseBodyStack setParameters(java.util.List<PreviewStackResponseBodyStackParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<PreviewStackResponseBodyStackParameters> getParameters() {
            return this.parameters;
        }

        public PreviewStackResponseBodyStack setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public PreviewStackResponseBodyStack setResources(java.util.List<PreviewStackResponseBodyStackResources> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.List<PreviewStackResponseBodyStackResources> getResources() {
            return this.resources;
        }

        public PreviewStackResponseBodyStack setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public PreviewStackResponseBodyStack setStackPolicyBody(java.util.Map<String, ?> stackPolicyBody) {
            this.stackPolicyBody = stackPolicyBody;
            return this;
        }
        public java.util.Map<String, ?> getStackPolicyBody() {
            return this.stackPolicyBody;
        }

        public PreviewStackResponseBodyStack setTemplateDescription(String templateDescription) {
            this.templateDescription = templateDescription;
            return this;
        }
        public String getTemplateDescription() {
            return this.templateDescription;
        }

        public PreviewStackResponseBodyStack setTimeoutInMinutes(Integer timeoutInMinutes) {
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }
        public Integer getTimeoutInMinutes() {
            return this.timeoutInMinutes;
        }

    }

}
