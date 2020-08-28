// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackInstanceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("StackGroupName")
    @Validation(required = true)
    public String stackGroupName;

    @NameInMap("StackInstanceAccountId")
    @Validation(required = true)
    public String stackInstanceAccountId;

    @NameInMap("StackInstanceRegionId")
    @Validation(required = true)
    public String stackInstanceRegionId;

    public static GetStackInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStackInstanceRequest self = new GetStackInstanceRequest();
        return TeaModel.build(map, self);
    }

}
