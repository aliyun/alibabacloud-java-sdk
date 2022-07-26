// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetUatSpecCtDataRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("DsMonth")
    public Long dsMonth;

    @NameInMap("ItemId")
    public String itemId;

    public static GetUatSpecCtDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUatSpecCtDataRequest self = new GetUatSpecCtDataRequest();
        return TeaModel.build(map, self);
    }

    public GetUatSpecCtDataRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public GetUatSpecCtDataRequest setDsMonth(Long dsMonth) {
        this.dsMonth = dsMonth;
        return this;
    }
    public Long getDsMonth() {
        return this.dsMonth;
    }

    public GetUatSpecCtDataRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

}
