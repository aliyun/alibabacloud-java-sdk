// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawChannelsRequest extends TeaModel {
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
    public java.util.List<String> channelList;

    public static DescribePolarClawChannelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawChannelsRequest self = new DescribePolarClawChannelsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawChannelsRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribePolarClawChannelsRequest setChannelList(java.util.List<String> channelList) {
        this.channelList = channelList;
        return this;
    }
    public java.util.List<String> getChannelList() {
        return this.channelList;
    }

}
