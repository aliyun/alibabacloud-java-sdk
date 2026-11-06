// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawChannelsShrinkRequest extends TeaModel {
    /**
     * <p>The PolarClaw application ID. First call DescribeApplications to filter applications where ApplicationType is polardb_polarclaw and Status is Activated, and then use the returned ApplicationId to query channels.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The list of channel IDs to query. If this parameter is left empty, all channels are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>feishu,telegram</p>
     */
    @NameInMap("ChannelList")
    public String channelListShrink;

    public static DescribePolarClawChannelsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawChannelsShrinkRequest self = new DescribePolarClawChannelsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawChannelsShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribePolarClawChannelsShrinkRequest setChannelListShrink(String channelListShrink) {
        this.channelListShrink = channelListShrink;
        return this;
    }
    public String getChannelListShrink() {
        return this.channelListShrink;
    }

}
