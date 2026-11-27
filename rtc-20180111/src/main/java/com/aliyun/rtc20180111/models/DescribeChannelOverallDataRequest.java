// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelOverallDataRequest extends TeaModel {
    /**
     * <p>APP ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testappid</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Channel ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>UNIX timestamp indicating the channel creation time. Supports querying data from the last 30 days. Expressed as a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1615893133</p>
     */
    @NameInMap("CreatedTs")
    public Long createdTs;

    /**
     * <p>Channel release time, represented as a UNIX timestamp in seconds. If this parameter is empty, the current time is used.</p>
     * <blockquote>
     * <p>If the provided channel release time exceeds the actual release time, data from the Creation Time to the actual release time is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1615893757</p>
     */
    @NameInMap("DestroyedTs")
    public Long destroyedTs;

    public static DescribeChannelOverallDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelOverallDataRequest self = new DescribeChannelOverallDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeChannelOverallDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeChannelOverallDataRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeChannelOverallDataRequest setCreatedTs(Long createdTs) {
        this.createdTs = createdTs;
        return this;
    }
    public Long getCreatedTs() {
        return this.createdTs;
    }

    public DescribeChannelOverallDataRequest setDestroyedTs(Long destroyedTs) {
        this.destroyedTs = destroyedTs;
        return this;
    }
    public Long getDestroyedTs() {
        return this.destroyedTs;
    }

}
