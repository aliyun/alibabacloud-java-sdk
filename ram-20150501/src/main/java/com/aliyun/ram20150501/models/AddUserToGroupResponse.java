// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class AddUserToGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddUserToGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserToGroupResponse self = new AddUserToGroupResponse();
        return TeaModel.build(map, self);
    }

}
