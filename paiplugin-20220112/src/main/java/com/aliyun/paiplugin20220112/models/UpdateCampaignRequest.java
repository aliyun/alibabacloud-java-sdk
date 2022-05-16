// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class UpdateCampaignRequest extends TeaModel {
    // 运营活动名称。
    @NameInMap("Name")
    public String name;

    // 备注。
    @NameInMap("Remark")
    public String remark;

    public static UpdateCampaignRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCampaignRequest self = new UpdateCampaignRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCampaignRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCampaignRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
