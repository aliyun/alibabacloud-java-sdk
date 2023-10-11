// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class CreateDigitalHumanProjectRequest extends TeaModel {
    @NameInMap("AudioId")
    public String audioId;

    @NameInMap("AudioUrl")
    public String audioUrl;

    @NameInMap("BackgroundId")
    public String backgroundId;

    @NameInMap("BackgroundUrl")
    public String backgroundUrl;

    @NameInMap("Content")
    public String content;

    @NameInMap("ForegroundId")
    public String foregroundId;

    @NameInMap("ForegroundUrl")
    public String foregroundUrl;

    @NameInMap("HumanLayerStyle")
    public String humanLayerStyle;

    @NameInMap("Intro")
    public String intro;

    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("ModelId")
    public String modelId;

    @NameInMap("Title")
    public String title;

    @NameInMap("TtsVoiceId")
    public String ttsVoiceId;

    @NameInMap("WatermarkImageUrl")
    public String watermarkImageUrl;

    @NameInMap("WatermarkStyle")
    public String watermarkStyle;

    public static CreateDigitalHumanProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalHumanProjectRequest self = new CreateDigitalHumanProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateDigitalHumanProjectRequest setAudioId(String audioId) {
        this.audioId = audioId;
        return this;
    }
    public String getAudioId() {
        return this.audioId;
    }

    public CreateDigitalHumanProjectRequest setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
        return this;
    }
    public String getAudioUrl() {
        return this.audioUrl;
    }

    public CreateDigitalHumanProjectRequest setBackgroundId(String backgroundId) {
        this.backgroundId = backgroundId;
        return this;
    }
    public String getBackgroundId() {
        return this.backgroundId;
    }

    public CreateDigitalHumanProjectRequest setBackgroundUrl(String backgroundUrl) {
        this.backgroundUrl = backgroundUrl;
        return this;
    }
    public String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    public CreateDigitalHumanProjectRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateDigitalHumanProjectRequest setForegroundId(String foregroundId) {
        this.foregroundId = foregroundId;
        return this;
    }
    public String getForegroundId() {
        return this.foregroundId;
    }

    public CreateDigitalHumanProjectRequest setForegroundUrl(String foregroundUrl) {
        this.foregroundUrl = foregroundUrl;
        return this;
    }
    public String getForegroundUrl() {
        return this.foregroundUrl;
    }

    public CreateDigitalHumanProjectRequest setHumanLayerStyle(String humanLayerStyle) {
        this.humanLayerStyle = humanLayerStyle;
        return this;
    }
    public String getHumanLayerStyle() {
        return this.humanLayerStyle;
    }

    public CreateDigitalHumanProjectRequest setIntro(String intro) {
        this.intro = intro;
        return this;
    }
    public String getIntro() {
        return this.intro;
    }

    public CreateDigitalHumanProjectRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public CreateDigitalHumanProjectRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateDigitalHumanProjectRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public CreateDigitalHumanProjectRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateDigitalHumanProjectRequest setTtsVoiceId(String ttsVoiceId) {
        this.ttsVoiceId = ttsVoiceId;
        return this;
    }
    public String getTtsVoiceId() {
        return this.ttsVoiceId;
    }

    public CreateDigitalHumanProjectRequest setWatermarkImageUrl(String watermarkImageUrl) {
        this.watermarkImageUrl = watermarkImageUrl;
        return this;
    }
    public String getWatermarkImageUrl() {
        return this.watermarkImageUrl;
    }

    public CreateDigitalHumanProjectRequest setWatermarkStyle(String watermarkStyle) {
        this.watermarkStyle = watermarkStyle;
        return this;
    }
    public String getWatermarkStyle() {
        return this.watermarkStyle;
    }

}
