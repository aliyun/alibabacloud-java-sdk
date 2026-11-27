// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelTopPubUserListRequest extends TeaModel {
    /**
     * <p>The app ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testappid</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The channel ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The timestamp when the channel was created. Data from the last 30 days can be queried. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1615893133</p>
     */
    @NameInMap("CreatedTs")
    public Long createdTs;

    /**
     * <p>The timestamp when the channel was released. The value is a UNIX timestamp in seconds. If this parameter is left empty, the current time is used.</p>
     * <blockquote>
     * <p>If the specified channel release time is later than the actual release time, the data from the creation time to the actual release time is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1615893757</p>
     */
    @NameInMap("DestroyedTs")
    public Long destroyedTs;

    public static DescribeChannelTopPubUserListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelTopPubUserListRequest self = new DescribeChannelTopPubUserListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeChannelTopPubUserListRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeChannelTopPubUserListRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeChannelTopPubUserListRequest setCreatedTs(Long createdTs) {
        this.createdTs = createdTs;
        return this;
    }
    public Long getCreatedTs() {
        return this.createdTs;
    }

    public DescribeChannelTopPubUserListRequest setDestroyedTs(Long destroyedTs) {
        this.destroyedTs = destroyedTs;
        return this;
    }
    public Long getDestroyedTs() {
        return this.destroyedTs;
    }

}
