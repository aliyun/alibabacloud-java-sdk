// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackRequest extends TeaModel {
    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("StackPolicyDuringUpdateBody")
    public String stackPolicyDuringUpdateBody;

    @NameInMap("TimeoutInMinutes")
    public Long timeoutInMinutes;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("Parameters")
    public java.util.List<UpdateStackRequestParameters> parameters;

    @NameInMap("StackPolicyURL")
    public String stackPolicyURL;

    @NameInMap("StackPolicyDuringUpdateURL")
    public String stackPolicyDuringUpdateURL;

    @NameInMap("StackPolicyBody")
    public String stackPolicyBody;

    @NameInMap("UsePreviousParameters")
    public Boolean usePreviousParameters;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("ReplacementOption")
    public String replacementOption;

    public static UpdateStackRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackRequest self = new UpdateStackRequest();
        return TeaModel.build(map, self);
    }

    public static class UpdateStackRequestParameters extends TeaModel {
        @NameInMap("ParameterValue")
        @Validation(required = true)
        public String parameterValue;

        @NameInMap("ParameterKey")
        @Validation(required = true)
        public String parameterKey;

        public static UpdateStackRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateStackRequestParameters self = new UpdateStackRequestParameters();
            return TeaModel.build(map, self);
        }

    }

}
