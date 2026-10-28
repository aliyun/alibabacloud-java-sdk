// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetTokenRequest extends TeaModel {
    /**
     * <p>The expiration time of the sharing link. Default value: 604800 seconds. Minimum value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <p>The ID of the job to be shared.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc*******</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>The type of the shared job. Valid values: job and tensorboard.</p>
     * 
     * <strong>example:</strong>
     * <p>job</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The permission settings of the sharing token, which controls log download and cross-account access.</p>
     */
    @NameInMap("TokenSettings")
    public TokenSettings tokenSettings;

    public static GetTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTokenRequest self = new GetTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetTokenRequest setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public GetTokenRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public GetTokenRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public GetTokenRequest setTokenSettings(TokenSettings tokenSettings) {
        this.tokenSettings = tokenSettings;
        return this;
    }
    public TokenSettings getTokenSettings() {
        return this.tokenSettings;
    }

}
