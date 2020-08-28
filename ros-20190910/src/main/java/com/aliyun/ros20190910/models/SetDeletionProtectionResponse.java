// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class SetDeletionProtectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetDeletionProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDeletionProtectionResponse self = new SetDeletionProtectionResponse();
        return TeaModel.build(map, self);
    }

}
