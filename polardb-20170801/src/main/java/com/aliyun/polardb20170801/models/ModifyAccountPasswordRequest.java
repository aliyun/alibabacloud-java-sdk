// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyAccountPasswordRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("AccountName")
    @Validation(required = true)
    public String accountName;

    @NameInMap("NewAccountPassword")
    @Validation(required = true)
    public String newAccountPassword;

    public static ModifyAccountPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountPasswordRequest self = new ModifyAccountPasswordRequest();
        return TeaModel.build(map, self);
    }

}
