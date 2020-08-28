// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateStackInstancesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("StackGroupName")
    @Validation(required = true)
    public String stackGroupName;

    @NameInMap("ParameterOverrides")
    public java.util.List<CreateStackInstancesRequestParameterOverrides> parameterOverrides;

    @NameInMap("AccountIds")
    @Validation(required = true)
    public java.util.Map<String, ?> accountIds;

    @NameInMap("RegionIds")
    @Validation(required = true)
    public java.util.Map<String, ?> regionIds;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OperationDescription")
    public String operationDescription;

    @NameInMap("OperationPreferences")
    public java.util.Map<String, ?> operationPreferences;

    public static CreateStackInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStackInstancesRequest self = new CreateStackInstancesRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateStackInstancesRequestParameterOverrides extends TeaModel {
        @NameInMap("ParameterValue")
        @Validation(required = true)
        public String parameterValue;

        @NameInMap("ParameterKey")
        @Validation(required = true)
        public String parameterKey;

        public static CreateStackInstancesRequestParameterOverrides build(java.util.Map<String, ?> map) throws Exception {
            CreateStackInstancesRequestParameterOverrides self = new CreateStackInstancesRequestParameterOverrides();
            return TeaModel.build(map, self);
        }

    }

}
