// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ResetSystemRequest extends TeaModel {
    /**
     * <p>The client token that you want to use to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>token</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">Ensure idempotence</a></p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the destination image. If you do not specify this parameter, the current image is reset.</p>
     * 
     * <strong>example:</strong>
     * <p>794c230fd3e64ea19f83f4d7a0ad****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The ID of the simple application server.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ace0706b2ac4454d984295a94213****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LoginCredentials")
    public ResetSystemRequestLoginCredentials loginCredentials;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ResetSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetSystemRequest self = new ResetSystemRequest();
        return TeaModel.build(map, self);
    }

    public ResetSystemRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ResetSystemRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ResetSystemRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ResetSystemRequest setLoginCredentials(ResetSystemRequestLoginCredentials loginCredentials) {
        this.loginCredentials = loginCredentials;
        return this;
    }
    public ResetSystemRequestLoginCredentials getLoginCredentials() {
        return this.loginCredentials;
    }

    public ResetSystemRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ResetSystemRequestLoginCredentials extends TeaModel {
        @NameInMap("KeyPairName")
        public String keyPairName;

        @NameInMap("Password")
        public String password;

        public static ResetSystemRequestLoginCredentials build(java.util.Map<String, ?> map) throws Exception {
            ResetSystemRequestLoginCredentials self = new ResetSystemRequestLoginCredentials();
            return TeaModel.build(map, self);
        }

        public ResetSystemRequestLoginCredentials setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public ResetSystemRequestLoginCredentials setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

    }

}
