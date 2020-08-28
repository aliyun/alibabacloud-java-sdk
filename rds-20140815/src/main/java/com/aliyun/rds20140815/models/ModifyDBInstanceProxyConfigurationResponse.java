// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceProxyConfigurationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBInstanceProxyConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceProxyConfigurationResponse self = new ModifyDBInstanceProxyConfigurationResponse();
        return TeaModel.build(map, self);
    }

}
