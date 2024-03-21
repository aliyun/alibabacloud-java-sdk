// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class DescribeTrademarkApplicationRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    public static DescribeTrademarkApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrademarkApplicationRequest self = new DescribeTrademarkApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTrademarkApplicationRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
