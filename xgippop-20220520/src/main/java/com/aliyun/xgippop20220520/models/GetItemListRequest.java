// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetItemListRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("BizCode")
    public String bizCode;

    public static GetItemListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetItemListRequest self = new GetItemListRequest();
        return TeaModel.build(map, self);
    }

    public GetItemListRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public GetItemListRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

}
