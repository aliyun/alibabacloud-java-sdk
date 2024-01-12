// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class CreateAvatarTalkProjectRequest extends TeaModel {
    @NameInMap("AvatarProjectId")
    public String avatarProjectId;

    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("Title")
    public String title;

    @NameInMap("TtsVoice")
    public String ttsVoice;

    @NameInMap("TxtContent")
    public String txtContent;

    public static CreateAvatarTalkProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAvatarTalkProjectRequest self = new CreateAvatarTalkProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateAvatarTalkProjectRequest setAvatarProjectId(String avatarProjectId) {
        this.avatarProjectId = avatarProjectId;
        return this;
    }
    public String getAvatarProjectId() {
        return this.avatarProjectId;
    }

    public CreateAvatarTalkProjectRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public CreateAvatarTalkProjectRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateAvatarTalkProjectRequest setTtsVoice(String ttsVoice) {
        this.ttsVoice = ttsVoice;
        return this;
    }
    public String getTtsVoice() {
        return this.ttsVoice;
    }

    public CreateAvatarTalkProjectRequest setTxtContent(String txtContent) {
        this.txtContent = txtContent;
        return this;
    }
    public String getTxtContent() {
        return this.txtContent;
    }

}
