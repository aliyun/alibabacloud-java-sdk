// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppKeyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0cho****</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeAppKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppKeyRequest self = new DescribeAppKeyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppKeyRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeAppKeyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
