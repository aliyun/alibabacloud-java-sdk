// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ChangePasswordResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ChangePasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangePasswordResponse self = new ChangePasswordResponse();
        return TeaModel.build(map, self);
    }

}
