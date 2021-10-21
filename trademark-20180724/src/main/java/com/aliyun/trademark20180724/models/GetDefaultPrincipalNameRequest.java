// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class GetDefaultPrincipalNameRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    public static GetDefaultPrincipalNameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultPrincipalNameRequest self = new GetDefaultPrincipalNameRequest();
        return TeaModel.build(map, self);
    }

    public GetDefaultPrincipalNameRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

}
