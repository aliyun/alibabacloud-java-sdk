// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DeleteRdsAccountRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    public static DeleteRdsAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRdsAccountRequest self = new DeleteRdsAccountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRdsAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public DeleteRdsAccountRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

}
