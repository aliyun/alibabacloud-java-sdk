// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class GetOssTokenRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("UserId")
    public String userId;

    public static GetOssTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssTokenRequest self = new GetOssTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetOssTokenRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public GetOssTokenRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
