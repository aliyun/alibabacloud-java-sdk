// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class GrantAccountPrivilegeRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

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
