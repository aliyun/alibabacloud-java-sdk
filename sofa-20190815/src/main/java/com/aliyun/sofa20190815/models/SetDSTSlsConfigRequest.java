// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetDSTSlsConfigRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ServiceAccountAccessKey")
    public String serviceAccountAccessKey;

    @NameInMap("ServiceAccountAccessKeyId")
    public String serviceAccountAccessKeyId;

    public static SetDSTSlsConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDSTSlsConfigRequest self = new SetDSTSlsConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetDSTSlsConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetDSTSlsConfigRequest setServiceAccountAccessKey(String serviceAccountAccessKey) {
        this.serviceAccountAccessKey = serviceAccountAccessKey;
        return this;
    }
    public String getServiceAccountAccessKey() {
        return this.serviceAccountAccessKey;
    }

    public SetDSTSlsConfigRequest setServiceAccountAccessKeyId(String serviceAccountAccessKeyId) {
        this.serviceAccountAccessKeyId = serviceAccountAccessKeyId;
        return this;
    }
    public String getServiceAccountAccessKeyId() {
        return this.serviceAccountAccessKeyId;
    }

}
