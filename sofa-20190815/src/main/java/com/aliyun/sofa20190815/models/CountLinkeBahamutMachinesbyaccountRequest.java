// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CountLinkeBahamutMachinesbyaccountRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    public static CountLinkeBahamutMachinesbyaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CountLinkeBahamutMachinesbyaccountRequest self = new CountLinkeBahamutMachinesbyaccountRequest();
        return TeaModel.build(map, self);
    }

    public CountLinkeBahamutMachinesbyaccountRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

}
