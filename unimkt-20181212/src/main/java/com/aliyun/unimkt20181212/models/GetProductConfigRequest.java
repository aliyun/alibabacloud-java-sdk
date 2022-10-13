// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class GetProductConfigRequest extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    public static GetProductConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductConfigRequest self = new GetProductConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetProductConfigRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

}
