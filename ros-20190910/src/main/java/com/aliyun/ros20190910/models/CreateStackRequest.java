// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateStackRequest extends TeaModel {
    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("Parameters")
    public java.util.List<CreateStackRequestParameters> parameters;

    @NameInMap("StackPolicyURL")
    public String stackPolicyURL;

    @NameInMap("TimeoutInMinutes")
    public Long timeoutInMinutes;

    @NameInMap("StackPolicyBody")
    public String stackPolicyBody;

    @NameInMap("StackName")
    @Validation(required = true)
    public String stackName;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("NotificationURLs")
    public java.util.List<String> notificationURLs;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("DeletionProtection")
    public String deletionProtection;

    public static CreateStackRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStackRequest self = new CreateStackRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateStackRequestParameters extends TeaModel {
        @NameInMap("ParameterValue")
        @Validation(required = true)
        public String parameterValue;

        @NameInMap("ParameterKey")
        @Validation(required = true)
        public String parameterKey;

        public static CreateStackRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateStackRequestParameters self = new CreateStackRequestParameters();
            return TeaModel.build(map, self);
        }

    }

    public static class ContinueCreateStackRequestParameters extends TeaModel {
        @NameInMap("ParameterKey")
        @Validation(required = true)
        public String parameterKey;

        @NameInMap("ParameterValue")
        @Validation(required = true)
        public String parameterValue;

        public static ContinueCreateStackRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            ContinueCreateStackRequestParameters self = new ContinueCreateStackRequestParameters();
            return TeaModel.build(map, self);
        }

    }

}
