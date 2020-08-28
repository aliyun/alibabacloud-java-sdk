// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ContinueCreateStackResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    public static ContinueCreateStackResponse build(java.util.Map<String, ?> map) throws Exception {
        ContinueCreateStackResponse self = new ContinueCreateStackResponse();
        return TeaModel.build(map, self);
    }

}
