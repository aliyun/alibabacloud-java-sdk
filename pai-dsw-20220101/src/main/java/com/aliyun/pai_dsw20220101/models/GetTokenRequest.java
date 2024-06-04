// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetTokenRequest extends TeaModel {
    @NameInMap("ExpireTime")
    public Integer expireTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTokenRequest self = new GetTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetTokenRequest setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Integer getExpireTime() {
        return this.expireTime;
    }

    public GetTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
