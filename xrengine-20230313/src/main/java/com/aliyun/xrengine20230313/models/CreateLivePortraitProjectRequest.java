// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class CreateLivePortraitProjectRequest extends TeaModel {
    @NameInMap("AudioId")
    public String audioId;

    @NameInMap("AudioUrl")
    public String audioUrl;

    @NameInMap("Content")
    public String content;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("Intro")
    public String intro;

    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("LightModel")
    public Boolean lightModel;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("OutputConfig")
    public String outputConfig;

    @NameInMap("Title")
    public String title;

    @NameInMap("TtsVoiceId")
    public String ttsVoiceId;

    @NameInMap("WatermarkImageUrl")
    public String watermarkImageUrl;

    @NameInMap("WatermarkStyle")
    public String watermarkStyle;

    public static CreateLivePortraitProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLivePortraitProjectRequest self = new CreateLivePortraitProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateLivePortraitProjectRequest setAudioId(String audioId) {
        this.audioId = audioId;
        return this;
    }
    public String getAudioId() {
        return this.audioId;
    }

    public CreateLivePortraitProjectRequest setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
        return this;
    }
    public String getAudioUrl() {
        return this.audioUrl;
    }

    public CreateLivePortraitProjectRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateLivePortraitProjectRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateLivePortraitProjectRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CreateLivePortraitProjectRequest setIntro(String intro) {
        this.intro = intro;
        return this;
    }
    public String getIntro() {
        return this.intro;
    }

    public CreateLivePortraitProjectRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public CreateLivePortraitProjectRequest setLightModel(Boolean lightModel) {
        this.lightModel = lightModel;
        return this;
    }
    public Boolean getLightModel() {
        return this.lightModel;
    }

    public CreateLivePortraitProjectRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateLivePortraitProjectRequest setOutputConfig(String outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public String getOutputConfig() {
        return this.outputConfig;
    }

    public CreateLivePortraitProjectRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateLivePortraitProjectRequest setTtsVoiceId(String ttsVoiceId) {
        this.ttsVoiceId = ttsVoiceId;
        return this;
    }
    public String getTtsVoiceId() {
        return this.ttsVoiceId;
    }

    public CreateLivePortraitProjectRequest setWatermarkImageUrl(String watermarkImageUrl) {
        this.watermarkImageUrl = watermarkImageUrl;
        return this;
    }
    public String getWatermarkImageUrl() {
        return this.watermarkImageUrl;
    }

    public CreateLivePortraitProjectRequest setWatermarkStyle(String watermarkStyle) {
        this.watermarkStyle = watermarkStyle;
        return this;
    }
    public String getWatermarkStyle() {
        return this.watermarkStyle;
    }

}
