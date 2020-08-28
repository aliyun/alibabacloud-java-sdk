// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteStackGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteStackGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackGroupResponse self = new DeleteStackGroupResponse();
        return TeaModel.build(map, self);
    }

}
