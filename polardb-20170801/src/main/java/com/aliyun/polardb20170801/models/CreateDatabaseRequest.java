// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDatabaseRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("DBName")
    @Validation(required = true)
    public String DBName;

    @NameInMap("CharacterSetName")
    @Validation(required = true)
    public String characterSetName;

    @NameInMap("DBDescription")
    public String DBDescription;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("AccountPrivilege")
    public String accountPrivilege;

    @NameInMap("Collate")
    public String collate;

    @NameInMap("Ctype")
    public String ctype;

    public static CreateDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseRequest self = new CreateDatabaseRequest();
        return TeaModel.build(map, self);
    }

}
