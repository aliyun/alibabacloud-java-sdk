// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeEndPointEventListRequest extends TeaModel {
    /**
     * <p>APP ID。</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("CreatedTs")
    public Long createdTs;

    @NameInMap("DestroyedTs")
    public Long destroyedTs;

    @NameInMap("UserIdList")
    public String userIdList;

    public static DescribeEndPointEventListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndPointEventListRequest self = new DescribeEndPointEventListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEndPointEventListRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeEndPointEventListRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeEndPointEventListRequest setCreatedTs(Long createdTs) {
        this.createdTs = createdTs;
        return this;
    }
    public Long getCreatedTs() {
        return this.createdTs;
    }

    public DescribeEndPointEventListRequest setDestroyedTs(Long destroyedTs) {
        this.destroyedTs = destroyedTs;
        return this;
    }
    public Long getDestroyedTs() {
        return this.destroyedTs;
    }

    public DescribeEndPointEventListRequest setUserIdList(String userIdList) {
        this.userIdList = userIdList;
        return this;
    }
    public String getUserIdList() {
        return this.userIdList;
    }

}
