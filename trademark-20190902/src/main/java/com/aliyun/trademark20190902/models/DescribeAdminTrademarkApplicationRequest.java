// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class DescribeAdminTrademarkApplicationRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    public static DescribeAdminTrademarkApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdminTrademarkApplicationRequest self = new DescribeAdminTrademarkApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAdminTrademarkApplicationRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
