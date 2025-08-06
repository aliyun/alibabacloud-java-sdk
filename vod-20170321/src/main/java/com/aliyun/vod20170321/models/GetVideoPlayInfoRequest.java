// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoPlayInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Channel")
    public String channel;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClientTS")
    public Long clientTS;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClientVersion")
    public String clientVersion;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PlaySign")
    public String playSign;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SignVersion")
    public String signVersion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    public static GetVideoPlayInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoPlayInfoRequest self = new GetVideoPlayInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoPlayInfoRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public GetVideoPlayInfoRequest setClientTS(Long clientTS) {
        this.clientTS = clientTS;
        return this;
    }
    public Long getClientTS() {
        return this.clientTS;
    }

    public GetVideoPlayInfoRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public GetVideoPlayInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetVideoPlayInfoRequest setPlaySign(String playSign) {
        this.playSign = playSign;
        return this;
    }
    public String getPlaySign() {
        return this.playSign;
    }

    public GetVideoPlayInfoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetVideoPlayInfoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetVideoPlayInfoRequest setSignVersion(String signVersion) {
        this.signVersion = signVersion;
        return this;
    }
    public String getSignVersion() {
        return this.signVersion;
    }

    public GetVideoPlayInfoRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
