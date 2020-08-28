// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateChangeSetRequest extends TeaModel {
    @NameInMap("StackId")
    public String stackId;

    @NameInMap("Parameters")
    public java.util.List<CreateChangeSetRequestParameters> parameters;

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
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("StackPolicyDuringUpdateURL")
    public String stackPolicyDuringUpdateURL;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("TimeoutInMinutes")
    public Long timeoutInMinutes;

    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    @NameInMap("ChangeSetName")
    @Validation(required = true)
    public String changeSetName;

    @NameInMap("StackPolicyDuringUpdateBody")
    public String stackPolicyDuringUpdateBody;

    @NameInMap("NotificationURLs")
    public java.util.List<String> notificationURLs;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("ReplacementOption")
    public String replacementOption;

    @NameInMap("ResourcesToImport")
    public java.util.List<CreateChangeSetRequestResourcesToImport> resourcesToImport;

    public static CreateChangeSetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChangeSetRequest self = new CreateChangeSetRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateChangeSetRequestParameters extends TeaModel {
        @NameInMap("ParameterValue")
        @Validation(required = true)
        public String parameterValue;

        @NameInMap("ParameterKey")
        @Validation(required = true)
        public String parameterKey;

        public static CreateChangeSetRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateChangeSetRequestParameters self = new CreateChangeSetRequestParameters();
            return TeaModel.build(map, self);
        }

    }

    public static class CreateChangeSetRequestResourcesToImport extends TeaModel {
        @NameInMap("LogicalResourceId")
        @Validation(required = true)
        public String logicalResourceId;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("ResourceIdentifier")
        @Validation(required = true)
        public String resourceIdentifier;

        public static CreateChangeSetRequestResourcesToImport build(java.util.Map<String, ?> map) throws Exception {
            CreateChangeSetRequestResourcesToImport self = new CreateChangeSetRequestResourcesToImport();
            return TeaModel.build(map, self);
        }

    }

}
