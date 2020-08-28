// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetChangeSetResponse extends TeaModel {
    @NameInMap("ChangeSetId")
    @Validation(required = true)
    public String changeSetId;

    @NameInMap("ChangeSetName")
    @Validation(required = true)
    public String changeSetName;

    @NameInMap("ChangeSetType")
    @Validation(required = true)
    public String changeSetType;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public String createTime;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("DisableRollback")
    @Validation(required = true)
    public Boolean disableRollback;

    @NameInMap("ExecutionStatus")
    @Validation(required = true)
    public String executionStatus;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    @NameInMap("StackName")
    @Validation(required = true)
    public String stackName;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("TemplateBody")
    @Validation(required = true)
    public String templateBody;

    @NameInMap("TimeoutInMinutes")
    @Validation(required = true)
    public Integer timeoutInMinutes;

    @NameInMap("StatusReason")
    @Validation(required = true)
    public String statusReason;

    @NameInMap("Parameters")
    @Validation(required = true)
    public java.util.List<GetChangeSetResponseParameters> parameters;

    @NameInMap("Changes")
    @Validation(required = true)
    public java.util.List<java.util.Map<String, ?>> changes;

    public static GetChangeSetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChangeSetResponse self = new GetChangeSetResponse();
        return TeaModel.build(map, self);
    }

    public static class GetChangeSetResponseParameters extends TeaModel {
        @NameInMap("ParameterKey")
        @Validation(required = true)
        public String parameterKey;

        @NameInMap("ParameterValue")
        @Validation(required = true)
        public String parameterValue;

        public static GetChangeSetResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            GetChangeSetResponseParameters self = new GetChangeSetResponseParameters();
            return TeaModel.build(map, self);
        }

    }

}
