// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ContinueCreateStackRequest extends TeaModel {
    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    @NameInMap("RecreatingResources")
    public java.util.List<String> recreatingResources;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("Parameters")
    public java.util.List<ContinueCreateStackRequestParameters> parameters;

    @NameInMap("DryRun")
    public Boolean dryRun;

    public static ContinueCreateStackRequest build(java.util.Map<String, ?> map) throws Exception {
        ContinueCreateStackRequest self = new ContinueCreateStackRequest();
        return TeaModel.build(map, self);
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
