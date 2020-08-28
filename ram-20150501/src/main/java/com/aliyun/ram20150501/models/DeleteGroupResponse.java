// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DeleteGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupResponse self = new DeleteGroupResponse();
        return TeaModel.build(map, self);
    }

}
