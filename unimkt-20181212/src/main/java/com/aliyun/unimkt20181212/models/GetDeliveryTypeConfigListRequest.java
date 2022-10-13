// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class GetDeliveryTypeConfigListRequest extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    public static GetDeliveryTypeConfigListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeliveryTypeConfigListRequest self = new GetDeliveryTypeConfigListRequest();
        return TeaModel.build(map, self);
    }

    public GetDeliveryTypeConfigListRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

}
