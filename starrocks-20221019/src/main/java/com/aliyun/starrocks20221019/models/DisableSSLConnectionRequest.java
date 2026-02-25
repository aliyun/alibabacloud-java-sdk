// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DisableSSLConnectionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DisableSSLConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableSSLConnectionRequest self = new DisableSSLConnectionRequest();
        return TeaModel.build(map, self);
    }

    public DisableSSLConnectionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
