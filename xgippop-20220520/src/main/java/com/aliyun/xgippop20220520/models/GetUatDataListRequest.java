// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class GetUatDataListRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("DsMonth")
    public Long dsMonth;

    @NameInMap("ItemId")
    public String itemId;

    public static GetUatDataListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUatDataListRequest self = new GetUatDataListRequest();
        return TeaModel.build(map, self);
    }

    public GetUatDataListRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public GetUatDataListRequest setDsMonth(Long dsMonth) {
        this.dsMonth = dsMonth;
        return this;
    }
    public Long getDsMonth() {
        return this.dsMonth;
    }

    public GetUatDataListRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

}
