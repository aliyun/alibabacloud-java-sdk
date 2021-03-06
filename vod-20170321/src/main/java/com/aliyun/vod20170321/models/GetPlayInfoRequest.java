// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetPlayInfoRequest extends TeaModel {
    @NameInMap("VideoId")
    public String videoId;

    @NameInMap("Formats")
    public String formats;

    @NameInMap("AuthTimeout")
    public Long authTimeout;

    @NameInMap("Rand")
    public String rand;

    @NameInMap("AuthInfo")
    public String authInfo;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("PlayerVersion")
    public String playerVersion;

    @NameInMap("OutputType")
    public String outputType;

    @NameInMap("StreamType")
    public String streamType;

    @NameInMap("ReAuthInfo")
    public String reAuthInfo;

    @NameInMap("Definition")
    public String definition;

    @NameInMap("ResultType")
    public String resultType;

    @NameInMap("PlayConfig")
    public String playConfig;

    public static GetPlayInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPlayInfoRequest self = new GetPlayInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetPlayInfoRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

    public GetPlayInfoRequest setFormats(String formats) {
        this.formats = formats;
        return this;
    }
    public String getFormats() {
        return this.formats;
    }

    public GetPlayInfoRequest setAuthTimeout(Long authTimeout) {
        this.authTimeout = authTimeout;
        return this;
    }
    public Long getAuthTimeout() {
        return this.authTimeout;
    }

    public GetPlayInfoRequest setRand(String rand) {
        this.rand = rand;
        return this;
    }
    public String getRand() {
        return this.rand;
    }

    public GetPlayInfoRequest setAuthInfo(String authInfo) {
        this.authInfo = authInfo;
        return this;
    }
    public String getAuthInfo() {
        return this.authInfo;
    }

    public GetPlayInfoRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public GetPlayInfoRequest setPlayerVersion(String playerVersion) {
        this.playerVersion = playerVersion;
        return this;
    }
    public String getPlayerVersion() {
        return this.playerVersion;
    }

    public GetPlayInfoRequest setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

    public GetPlayInfoRequest setStreamType(String streamType) {
        this.streamType = streamType;
        return this;
    }
    public String getStreamType() {
        return this.streamType;
    }

    public GetPlayInfoRequest setReAuthInfo(String reAuthInfo) {
        this.reAuthInfo = reAuthInfo;
        return this;
    }
    public String getReAuthInfo() {
        return this.reAuthInfo;
    }

    public GetPlayInfoRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public GetPlayInfoRequest setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public GetPlayInfoRequest setPlayConfig(String playConfig) {
        this.playConfig = playConfig;
        return this;
    }
    public String getPlayConfig() {
        return this.playConfig;
    }

}
