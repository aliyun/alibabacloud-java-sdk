// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class SubmitMotionShopTaskRequest extends TeaModel {
    @NameInMap("AvatarId")
    public String avatarId;

    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("Title")
    public String title;

    @NameInMap("VideoId")
    public String videoId;

    public static SubmitMotionShopTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitMotionShopTaskRequest self = new SubmitMotionShopTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitMotionShopTaskRequest setAvatarId(String avatarId) {
        this.avatarId = avatarId;
        return this;
    }
    public String getAvatarId() {
        return this.avatarId;
    }

    public SubmitMotionShopTaskRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public SubmitMotionShopTaskRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitMotionShopTaskRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
