// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class SubmitLongTtsTaskRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("TtsVoiceId")
    public String ttsVoiceId;

    public static SubmitLongTtsTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitLongTtsTaskRequest self = new SubmitLongTtsTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitLongTtsTaskRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SubmitLongTtsTaskRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public SubmitLongTtsTaskRequest setTtsVoiceId(String ttsVoiceId) {
        this.ttsVoiceId = ttsVoiceId;
        return this;
    }
    public String getTtsVoiceId() {
        return this.ttsVoiceId;
    }

}
