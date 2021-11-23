// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAutoLiveStreamRuleRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeAutoLiveStreamRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoLiveStreamRuleRequest self = new DescribeAutoLiveStreamRuleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAutoLiveStreamRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeAutoLiveStreamRuleRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
