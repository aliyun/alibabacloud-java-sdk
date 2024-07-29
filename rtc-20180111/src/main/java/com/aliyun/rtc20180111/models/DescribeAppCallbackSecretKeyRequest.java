// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppCallbackSecretKeyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9qb1****</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static DescribeAppCallbackSecretKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppCallbackSecretKeyRequest self = new DescribeAppCallbackSecretKeyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppCallbackSecretKeyRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
