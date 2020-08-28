// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class PreviewStackResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Stack")
    @Validation(required = true)
    public PreviewStackResponseStack stack;

    public static PreviewStackResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewStackResponse self = new PreviewStackResponse();
        return TeaModel.build(map, self);
    }

    public static class PreviewStackResponseStackParameters extends TeaModel {
        @NameInMap("ParameterKey")
        @Validation(required = true)
        public String parameterKey;

        @NameInMap("ParameterValue")
        @Validation(required = true)
        public String parameterValue;

        public static PreviewStackResponseStackParameters build(java.util.Map<String, ?> map) throws Exception {
            PreviewStackResponseStackParameters self = new PreviewStackResponseStackParameters();
            return TeaModel.build(map, self);
        }

    }

    public static class PreviewStackResponseStackResources extends TeaModel {
        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("LogicalResourceId")
        @Validation(required = true)
        public String logicalResourceId;

        @NameInMap("Properties")
        @Validation(required = true)
        public java.util.Map<String, ?> properties;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("Stack")
        @Validation(required = true)
        public java.util.Map<String, ?> stack;

        @NameInMap("RequiredBy")
        @Validation(required = true)
        public java.util.List<String> requiredBy;

        public static PreviewStackResponseStackResources build(java.util.Map<String, ?> map) throws Exception {
            PreviewStackResponseStackResources self = new PreviewStackResponseStackResources();
            return TeaModel.build(map, self);
        }

    }

    public static class PreviewStackResponseStack extends TeaModel {
        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("DisableRollback")
        @Validation(required = true)
        public Boolean disableRollback;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("StackName")
        @Validation(required = true)
        public String stackName;

        @NameInMap("StackPolicyBody")
        @Validation(required = true)
        public java.util.Map<String, ?> stackPolicyBody;

        @NameInMap("TemplateDescription")
        @Validation(required = true)
        public String templateDescription;

        @NameInMap("TimeoutInMinutes")
        @Validation(required = true)
        public Integer timeoutInMinutes;

        @NameInMap("Parameters")
        @Validation(required = true)
        public java.util.List<PreviewStackResponseStackParameters> parameters;

        @NameInMap("Resources")
        @Validation(required = true)
        public java.util.List<PreviewStackResponseStackResources> resources;

        public static PreviewStackResponseStack build(java.util.Map<String, ?> map) throws Exception {
            PreviewStackResponseStack self = new PreviewStackResponseStack();
            return TeaModel.build(map, self);
        }

    }

}
