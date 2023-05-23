// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateCampaignRequest extends TeaModel {
    /**
     * <p>运营活动名称。</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>备注。</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static CreateCampaignRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCampaignRequest self = new CreateCampaignRequest();
        return TeaModel.build(map, self);
    }

    public CreateCampaignRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCampaignRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
