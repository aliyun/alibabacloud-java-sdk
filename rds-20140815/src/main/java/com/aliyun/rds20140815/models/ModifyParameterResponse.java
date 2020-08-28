// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyParameterResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyParameterResponse self = new ModifyParameterResponse();
        return TeaModel.build(map, self);
    }

}
