// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UpdateAccessKeyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateAccessKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccessKeyResponse self = new UpdateAccessKeyResponse();
        return TeaModel.build(map, self);
    }

}
