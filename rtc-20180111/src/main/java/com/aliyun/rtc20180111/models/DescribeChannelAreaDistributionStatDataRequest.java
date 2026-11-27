// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelAreaDistributionStatDataRequest extends TeaModel {
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
     * <p>The timestamp when the channel was created. You can query data of the last 30 days. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1614936817</p>
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
     * <p>1614936817</p>
     */
    @NameInMap("DestroyedTs")
    public Long destroyedTs;

    /**
     * <p>The name of the parent region. For example, the parent region of Shenzhen is Guangdong Province. If this parameter is left empty, global statistics at the country level are returned, such as China and the United Kingdom.</p>
     * 
     * <strong>example:</strong>
     * <p>China_Zhejiang Province</p>
     */
    @NameInMap("ParentArea")
    public String parentArea;

    public static DescribeChannelAreaDistributionStatDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelAreaDistributionStatDataRequest self = new DescribeChannelAreaDistributionStatDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeChannelAreaDistributionStatDataRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeChannelAreaDistributionStatDataRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeChannelAreaDistributionStatDataRequest setCreatedTs(Long createdTs) {
        this.createdTs = createdTs;
        return this;
    }
    public Long getCreatedTs() {
        return this.createdTs;
    }

    public DescribeChannelAreaDistributionStatDataRequest setDestroyedTs(Long destroyedTs) {
        this.destroyedTs = destroyedTs;
        return this;
    }
    public Long getDestroyedTs() {
        return this.destroyedTs;
    }

    public DescribeChannelAreaDistributionStatDataRequest setParentArea(String parentArea) {
        this.parentArea = parentArea;
        return this;
    }
    public String getParentArea() {
        return this.parentArea;
    }

}
