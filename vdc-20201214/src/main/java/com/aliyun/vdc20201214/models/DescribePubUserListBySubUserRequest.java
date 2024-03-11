// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribePubUserListBySubUserRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("CreatedTs")
    public Long createdTs;

    @NameInMap("DestroyedTs")
    public Long destroyedTs;

    @NameInMap("SubUserId")
    public String subUserId;

    public static DescribePubUserListBySubUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePubUserListBySubUserRequest self = new DescribePubUserListBySubUserRequest();
        return TeaModel.build(map, self);
    }

    public DescribePubUserListBySubUserRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribePubUserListBySubUserRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribePubUserListBySubUserRequest setCreatedTs(Long createdTs) {
        this.createdTs = createdTs;
        return this;
    }
    public Long getCreatedTs() {
        return this.createdTs;
    }

    public DescribePubUserListBySubUserRequest setDestroyedTs(Long destroyedTs) {
        this.destroyedTs = destroyedTs;
        return this;
    }
    public Long getDestroyedTs() {
        return this.destroyedTs;
    }

    public DescribePubUserListBySubUserRequest setSubUserId(String subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public String getSubUserId() {
        return this.subUserId;
    }

}
