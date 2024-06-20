// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelDistributionStatDataRequest extends TeaModel {
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

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OS</p>
     */
    @NameInMap("StatDim")
    public String statDim;

    public static DescribeChannelDistributionStatDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelDistributionStatDataRequest self = new DescribeChannelDistributionStatDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeChannelDistributionStatDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeChannelDistributionStatDataRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeChannelDistributionStatDataRequest setCreatedTs(Long createdTs) {
        this.createdTs = createdTs;
        return this;
    }
    public Long getCreatedTs() {
        return this.createdTs;
    }

    public DescribeChannelDistributionStatDataRequest setDestroyedTs(Long destroyedTs) {
        this.destroyedTs = destroyedTs;
        return this;
    }
    public Long getDestroyedTs() {
        return this.destroyedTs;
    }

    public DescribeChannelDistributionStatDataRequest setStatDim(String statDim) {
        this.statDim = statDim;
        return this;
    }
    public String getStatDim() {
        return this.statDim;
    }

}
