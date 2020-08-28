// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateStackResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    public static CreateStackResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStackResponse self = new CreateStackResponse();
        return TeaModel.build(map, self);
    }

}
