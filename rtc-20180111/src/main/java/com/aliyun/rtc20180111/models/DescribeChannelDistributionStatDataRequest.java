// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelDistributionStatDataRequest extends TeaModel {
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
     * <p>The timestamp when the channel was created. You can query data from the last 30 days. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1614936817</p>
     */
    @NameInMap("CreatedTs")
    public Long createdTs;

    /**
     * <p>The timestamp when the channel was released. The value is a UNIX timestamp in seconds. If this parameter is empty, the current time is used.</p>
     * <blockquote>
     * <p>If the specified channel release time is later than the actual release time, the data from the creation time to the actual release time is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1614936817</p>
     */
    @NameInMap("DestroyedTs")
    public Long destroyedTs;

    /**
     * <p>The statistical dimension. Valid values:</p>
     * <ul>
     * <li><strong>OS</strong>: Statistics by operating system.</li>
     * <li><strong>SDK_VERSION</strong>: Statistics by SDK version.</li>
     * </ul>
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
