// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class PreviewStackRequest extends TeaModel {
    @NameInMap("DisableRollback")
    public Boolean disableRollback;

    @NameInMap("TimeoutInMinutes")
    public Long timeoutInMinutes;

    @NameInMap("Parameters")
    public java.util.List<PreviewStackRequestParameters> parameters;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("StackPolicyURL")
    public String stackPolicyURL;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("StackPolicyBody")
    public String stackPolicyBody;

    @NameInMap("StackName")
    @Validation(required = true)
    public String stackName;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("TemplateURL")
    public String templateURL;

    public static PreviewStackRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewStackRequest self = new PreviewStackRequest();
        return TeaModel.build(map, self);
    }

    public static class PreviewStackRequestParameters extends TeaModel {
        @NameInMap("ParameterValue")
        @Validation(required = true)
        public String parameterValue;

        @NameInMap("ParameterKey")
        @Validation(required = true)
        public String parameterKey;

        public static PreviewStackRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            PreviewStackRequestParameters self = new PreviewStackRequestParameters();
            return TeaModel.build(map, self);
        }

    }

}
