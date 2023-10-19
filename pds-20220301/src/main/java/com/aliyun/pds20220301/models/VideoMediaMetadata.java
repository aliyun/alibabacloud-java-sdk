// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class VideoMediaMetadata extends TeaModel {
    @NameInMap("height")
    public Long height;

    @NameInMap("video_media_audio_stream")
    public java.util.List<VideoMediaAudioStream> videoMediaAudioStream;

    @NameInMap("video_media_video_stream")
    public java.util.List<VideoMediaVideoStream> videoMediaVideoStream;

    @NameInMap("width")
    public Long width;

    public static VideoMediaMetadata build(java.util.Map<String, ?> map) throws Exception {
        VideoMediaMetadata self = new VideoMediaMetadata();
        return TeaModel.build(map, self);
    }

    public VideoMediaMetadata setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public VideoMediaMetadata setVideoMediaAudioStream(java.util.List<VideoMediaAudioStream> videoMediaAudioStream) {
        this.videoMediaAudioStream = videoMediaAudioStream;
        return this;
    }
    public java.util.List<VideoMediaAudioStream> getVideoMediaAudioStream() {
        return this.videoMediaAudioStream;
    }

    public VideoMediaMetadata setVideoMediaVideoStream(java.util.List<VideoMediaVideoStream> videoMediaVideoStream) {
        this.videoMediaVideoStream = videoMediaVideoStream;
        return this;
    }
    public java.util.List<VideoMediaVideoStream> getVideoMediaVideoStream() {
        return this.videoMediaVideoStream;
    }

    public VideoMediaMetadata setWidth(Long width) {
        this.width = width;
        return this;
    }
    public Long getWidth() {
        return this.width;
    }

}
