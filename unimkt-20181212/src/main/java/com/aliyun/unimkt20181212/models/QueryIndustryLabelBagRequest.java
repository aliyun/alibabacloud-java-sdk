// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryIndustryLabelBagRequest extends TeaModel {
    @NameInMap("ChannelId")
    public String channelId;

    public static QueryIndustryLabelBagRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIndustryLabelBagRequest self = new QueryIndustryLabelBagRequest();
        return TeaModel.build(map, self);
    }

    public QueryIndustryLabelBagRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

}
