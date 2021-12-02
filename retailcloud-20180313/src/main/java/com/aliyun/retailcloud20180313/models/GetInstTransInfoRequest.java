// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class GetInstTransInfoRequest extends TeaModel {
    @NameInMap("aliyunCommodityCode")
    public String aliyunCommodityCode;

    @NameInMap("aliyunEquipId")
    public String aliyunEquipId;

    @NameInMap("aliyunUid")
    public String aliyunUid;

    public static GetInstTransInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstTransInfoRequest self = new GetInstTransInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetInstTransInfoRequest setAliyunCommodityCode(String aliyunCommodityCode) {
        this.aliyunCommodityCode = aliyunCommodityCode;
        return this;
    }
    public String getAliyunCommodityCode() {
        return this.aliyunCommodityCode;
    }

    public GetInstTransInfoRequest setAliyunEquipId(String aliyunEquipId) {
        this.aliyunEquipId = aliyunEquipId;
        return this;
    }
    public String getAliyunEquipId() {
        return this.aliyunEquipId;
    }

    public GetInstTransInfoRequest setAliyunUid(String aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public String getAliyunUid() {
        return this.aliyunUid;
    }

}
