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
     * <p>1615893133</p>
     */
    @NameInMap("CreatedTs")
    public Long createdTs;

    /**
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
