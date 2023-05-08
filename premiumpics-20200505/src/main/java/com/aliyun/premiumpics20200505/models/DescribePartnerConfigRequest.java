// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class DescribePartnerConfigRequest extends TeaModel {
    /**
     * <p>BizType</p>
     */
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("PartnerCode")
    public String partnerCode;

    public static DescribePartnerConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePartnerConfigRequest self = new DescribePartnerConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribePartnerConfigRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribePartnerConfigRequest setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }
    public String getPartnerCode() {
        return this.partnerCode;
    }

}
