// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeletionProtectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeletionProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletionProtectionResponse self = new DeletionProtectionResponse();
        return TeaModel.build(map, self);
    }

}
