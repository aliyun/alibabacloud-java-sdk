// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelAreaDistributionStatDataRequest extends TeaModel {
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
