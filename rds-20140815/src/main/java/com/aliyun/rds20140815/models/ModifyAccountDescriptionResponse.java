// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyAccountDescriptionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyAccountDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountDescriptionResponse self = new ModifyAccountDescriptionResponse();
        return TeaModel.build(map, self);
    }

}
