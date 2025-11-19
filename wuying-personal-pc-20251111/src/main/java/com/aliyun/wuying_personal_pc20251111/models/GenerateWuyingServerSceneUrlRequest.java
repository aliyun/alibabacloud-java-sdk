// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class GenerateWuyingServerSceneUrlRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ClientIp")
    public String clientIp;

    @NameInMap("ClientOS")
    public String clientOS;

    @NameInMap("ClientType")
    public String clientType;

    @NameInMap("ClientVersion")
    public String clientVersion;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("LoginRegionId")
    public String loginRegionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("Uuid")
    public String uuid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WuyingServerId")
    public String wuyingServerId;

    public static GenerateWuyingServerSceneUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateWuyingServerSceneUrlRequest self = new GenerateWuyingServerSceneUrlRequest();
        return TeaModel.build(map, self);
    }

    public GenerateWuyingServerSceneUrlRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public GenerateWuyingServerSceneUrlRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public GenerateWuyingServerSceneUrlRequest setClientOS(String clientOS) {
        this.clientOS = clientOS;
        return this;
    }
    public String getClientOS() {
        return this.clientOS;
    }

    public GenerateWuyingServerSceneUrlRequest setClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }
    public String getClientType() {
        return this.clientType;
    }

    public GenerateWuyingServerSceneUrlRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public GenerateWuyingServerSceneUrlRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public GenerateWuyingServerSceneUrlRequest setLoginRegionId(String loginRegionId) {
        this.loginRegionId = loginRegionId;
        return this;
    }
    public String getLoginRegionId() {
        return this.loginRegionId;
    }

    public GenerateWuyingServerSceneUrlRequest setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public GenerateWuyingServerSceneUrlRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public GenerateWuyingServerSceneUrlRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public GenerateWuyingServerSceneUrlRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GenerateWuyingServerSceneUrlRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public GenerateWuyingServerSceneUrlRequest setWuyingServerId(String wuyingServerId) {
        this.wuyingServerId = wuyingServerId;
        return this;
    }
    public String getWuyingServerId() {
        return this.wuyingServerId;
    }

}
