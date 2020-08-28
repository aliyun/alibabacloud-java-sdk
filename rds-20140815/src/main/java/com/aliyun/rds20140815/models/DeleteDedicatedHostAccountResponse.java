// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDedicatedHostAccountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteDedicatedHostAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDedicatedHostAccountResponse self = new DeleteDedicatedHostAccountResponse();
        return TeaModel.build(map, self);
    }

}
