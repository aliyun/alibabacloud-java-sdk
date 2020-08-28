// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RevokeAccountPrivilegeRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("AccountName")
    @Validation(required = true)
    public String accountName;

    @NameInMap("DBName")
    @Validation(required = true)
    public String DBName;

    public static RevokeAccountPrivilegeRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeAccountPrivilegeRequest self = new RevokeAccountPrivilegeRequest();
        return TeaModel.build(map, self);
    }

}
