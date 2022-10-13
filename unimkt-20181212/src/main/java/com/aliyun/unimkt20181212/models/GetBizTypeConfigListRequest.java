// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class GetBizTypeConfigListRequest extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    public static GetBizTypeConfigListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBizTypeConfigListRequest self = new GetBizTypeConfigListRequest();
        return TeaModel.build(map, self);
    }

    public GetBizTypeConfigListRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

}
