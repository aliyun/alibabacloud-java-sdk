// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelUserMetricsRequest extends TeaModel {
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1614936817</p>
     */
    @NameInMap("CreatedTs")
    public Long createdTs;

    /**
     * <strong>example:</strong>
     * <p>1614936817</p>
     */
    @NameInMap("DestroyedTs")
    public Long destroyedTs;

    public static DescribeChannelUserMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelUserMetricsRequest self = new DescribeChannelUserMetricsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeChannelUserMetricsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeChannelUserMetricsRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeChannelUserMetricsRequest setCreatedTs(Long createdTs) {
        this.createdTs = createdTs;
        return this;
    }
    public Long getCreatedTs() {
        return this.createdTs;
    }

    public DescribeChannelUserMetricsRequest setDestroyedTs(Long destroyedTs) {
        this.destroyedTs = destroyedTs;
        return this;
    }
    public Long getDestroyedTs() {
        return this.destroyedTs;
    }

}
