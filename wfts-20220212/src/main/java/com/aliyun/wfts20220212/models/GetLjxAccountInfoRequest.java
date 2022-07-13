// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wfts20220212.models;

import com.aliyun.tea.*;

public class GetLjxAccountInfoRequest extends TeaModel {
    // 实例 ID。
    @NameInMap("LjxAccountInfoId")
    public String ljxAccountInfoId;

    public static GetLjxAccountInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLjxAccountInfoRequest self = new GetLjxAccountInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetLjxAccountInfoRequest setLjxAccountInfoId(String ljxAccountInfoId) {
        this.ljxAccountInfoId = ljxAccountInfoId;
        return this;
    }
    public String getLjxAccountInfoId() {
        return this.ljxAccountInfoId;
    }

}
