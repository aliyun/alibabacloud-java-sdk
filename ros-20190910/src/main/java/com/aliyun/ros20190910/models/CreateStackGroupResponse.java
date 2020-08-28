// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateStackGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StackGroupId")
    @Validation(required = true)
    public String stackGroupId;

    public static CreateStackGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStackGroupResponse self = new CreateStackGroupResponse();
        return TeaModel.build(map, self);
    }

}
