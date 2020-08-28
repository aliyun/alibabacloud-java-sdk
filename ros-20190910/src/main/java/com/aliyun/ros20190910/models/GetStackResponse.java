// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackResponse extends TeaModel {
    @NameInMap("CreateTime")
    @Validation(required = true)
    public String createTime;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("DisableRollback")
    @Validation(required = true)
    public Boolean disableRollback;

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

    @NameInMap("StatusReason")
    @Validation(required = true)
    public String statusReason;

    @NameInMap("TemplateDescription")
    @Validation(required = true)
    public String templateDescription;

    @NameInMap("TimeoutInMinutes")
    @Validation(required = true)
    public Integer timeoutInMinutes;

    @NameInMap("UpdateTime")
    @Validation(required = true)
    public String updateTime;

    @NameInMap("ParentStackId")
    @Validation(required = true)
    public String parentStackId;

    @NameInMap("StackDriftStatus")
    @Validation(required = true)
    public String stackDriftStatus;

    @NameInMap("DriftDetectionTime")
    @Validation(required = true)
    public String driftDetectionTime;

    @NameInMap("RamRoleName")
    @Validation(required = true)
    public String ramRoleName;

    @NameInMap("DeletionProtection")
    @Validation(required = true)
    public String deletionProtection;

    @NameInMap("RootStackId")
    @Validation(required = true)
    public String rootStackId;

    @NameInMap("StackType")
    @Validation(required = true)
    public String stackType;

    @NameInMap("Parameters")
    @Validation(required = true)
    public java.util.List<GetStackResponseParameters> parameters;

    @NameInMap("Outputs")
    @Validation(required = true)
    public java.util.List<java.util.Map<String, ?>> outputs;

    @NameInMap("NotificationURLs")
    @Validation(required = true)
    public java.util.List<String> notificationURLs;

    public static GetStackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStackResponse self = new GetStackResponse();
        return TeaModel.build(map, self);
    }

    public static class GetStackResponseParameters extends TeaModel {
        @NameInMap("ParameterKey")
        @Validation(required = true)
        public String parameterKey;

        @NameInMap("ParameterValue")
        @Validation(required = true)
        public String parameterValue;

        public static GetStackResponseParameters build(java.util.Map<String, ?> map) throws Exception {
            GetStackResponseParameters self = new GetStackResponseParameters();
            return TeaModel.build(map, self);
        }

    }

}
