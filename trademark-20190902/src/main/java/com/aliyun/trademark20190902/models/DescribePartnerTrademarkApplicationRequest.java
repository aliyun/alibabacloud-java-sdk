// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class DescribePartnerTrademarkApplicationRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    public static DescribePartnerTrademarkApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePartnerTrademarkApplicationRequest self = new DescribePartnerTrademarkApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DescribePartnerTrademarkApplicationRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
