// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackOperationRisksRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("RetainAllResources")
    public Boolean retainAllResources;

    @NameInMap("RetainResources")
    public java.util.List<String> retainResources;

    public static ListStackOperationRisksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStackOperationRisksRequest self = new ListStackOperationRisksRequest();
        return TeaModel.build(map, self);
    }

}
