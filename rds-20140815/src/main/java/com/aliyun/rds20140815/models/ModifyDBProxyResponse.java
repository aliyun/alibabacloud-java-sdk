// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyResponse self = new ModifyDBProxyResponse();
        return TeaModel.build(map, self);
    }

}
