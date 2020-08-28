// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteStackGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("StackGroupName")
    @Validation(required = true)
    public String stackGroupName;

    public static DeleteStackGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackGroupRequest self = new DeleteStackGroupRequest();
        return TeaModel.build(map, self);
    }

}
