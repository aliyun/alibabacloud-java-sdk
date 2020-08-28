// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateStackGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("StackGroupName")
    @Validation(required = true)
    public String stackGroupName;

    @NameInMap("Description")
    public String description;

    @NameInMap("Parameters")
    public java.util.List<CreateStackGroupRequestParameters> parameters;

    @NameInMap("TemplateBody")
    public String templateBody;

    @NameInMap("TemplateURL")
    public String templateURL;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("AdministrationRoleName")
    public String administrationRoleName;

    @NameInMap("ExecutionRoleName")
    public String executionRoleName;

    public static CreateStackGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStackGroupRequest self = new CreateStackGroupRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateStackGroupRequestParameters extends TeaModel {
        @NameInMap("ParameterValue")
        @Validation(required = true)
        public String parameterValue;

        @NameInMap("ParameterKey")
        @Validation(required = true)
        public String parameterKey;

        public static CreateStackGroupRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateStackGroupRequestParameters self = new CreateStackGroupRequestParameters();
            return TeaModel.build(map, self);
        }

    }

}
