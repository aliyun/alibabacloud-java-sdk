// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DeleteRoleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoleResponse self = new DeleteRoleResponse();
        return TeaModel.build(map, self);
    }

}
