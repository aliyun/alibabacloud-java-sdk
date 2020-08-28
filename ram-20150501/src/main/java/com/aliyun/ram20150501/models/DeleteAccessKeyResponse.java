// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DeleteAccessKeyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteAccessKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessKeyResponse self = new DeleteAccessKeyResponse();
        return TeaModel.build(map, self);
    }

}
