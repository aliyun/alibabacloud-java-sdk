// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryAliasesRequest extends TeaModel {
    /**
     * <p>The AppKey value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23267207</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>The unique identifier for the device in Mobile Push. It is 32 characters long and contains only digits and lowercase letters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e2ba19de97604f55b165576****</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    public static QueryAliasesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAliasesRequest self = new QueryAliasesRequest();
        return TeaModel.build(map, self);
    }

    public QueryAliasesRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public QueryAliasesRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
