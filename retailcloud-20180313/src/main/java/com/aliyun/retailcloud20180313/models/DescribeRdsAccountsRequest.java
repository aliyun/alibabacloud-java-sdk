// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeRdsAccountsRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    public static DescribeRdsAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsAccountsRequest self = new DescribeRdsAccountsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRdsAccountsRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public DescribeRdsAccountsRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

}
