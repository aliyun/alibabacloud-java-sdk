// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class GrantAccountPrivilegeRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("AccountName")
    @Validation(required = true)
    public String accountName;

    @NameInMap("DBName")
    @Validation(required = true)
    public String DBName;

    @NameInMap("AccountPrivilege")
    @Validation(required = true)
    public String accountPrivilege;

    public static GrantAccountPrivilegeRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantAccountPrivilegeRequest self = new GrantAccountPrivilegeRequest();
        return TeaModel.build(map, self);
    }

}
