// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteStackInstancesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("StackGroupName")
    @Validation(required = true)
    public String stackGroupName;

    @NameInMap("AccountIds")
    @Validation(required = true)
    public java.util.Map<String, ?> accountIds;

    @NameInMap("RegionIds")
    @Validation(required = true)
    public java.util.Map<String, ?> regionIds;

    @NameInMap("RetainStacks")
    @Validation(required = true)
    public Boolean retainStacks;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OperationDescription")
    public String operationDescription;

    @NameInMap("OperationPreferences")
    public java.util.Map<String, ?> operationPreferences;

    public static DeleteStackInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackInstancesRequest self = new DeleteStackInstancesRequest();
        return TeaModel.build(map, self);
    }

}
