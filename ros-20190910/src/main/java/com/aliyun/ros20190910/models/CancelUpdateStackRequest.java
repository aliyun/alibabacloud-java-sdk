// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CancelUpdateStackRequest extends TeaModel {
    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("CancelType")
    public String cancelType;

    public static CancelUpdateStackRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelUpdateStackRequest self = new CancelUpdateStackRequest();
        return TeaModel.build(map, self);
    }

}
