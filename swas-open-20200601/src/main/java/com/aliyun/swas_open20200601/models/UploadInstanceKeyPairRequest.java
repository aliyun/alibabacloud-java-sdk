// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class UploadInstanceKeyPairRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("PublicKey")
    public String publicKey;

    @NameInMap("RegionId")
    public String regionId;

    public static UploadInstanceKeyPairRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadInstanceKeyPairRequest self = new UploadInstanceKeyPairRequest();
        return TeaModel.build(map, self);
    }

    public UploadInstanceKeyPairRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UploadInstanceKeyPairRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UploadInstanceKeyPairRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public UploadInstanceKeyPairRequest setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public UploadInstanceKeyPairRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
