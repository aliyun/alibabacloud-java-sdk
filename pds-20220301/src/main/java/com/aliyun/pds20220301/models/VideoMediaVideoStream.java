// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class VideoMediaVideoStream extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>108420</p>
     */
    @NameInMap("bitrate")
    public String bitrate;

    /**
     * <strong>example:</strong>
     * <p>h264</p>
     */
    @NameInMap("code_name")
    public String codeName;

    /**
     * <strong>example:</strong>
     * <p>22.88</p>
     */
    @NameInMap("duration")
    public String duration;

    /**
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("frame_count")
    public String frameCount;

    public static VideoMediaVideoStream build(java.util.Map<String, ?> map) throws Exception {
        VideoMediaVideoStream self = new VideoMediaVideoStream();
        return TeaModel.build(map, self);
    }

    public VideoMediaVideoStream setBitrate(String bitrate) {
        this.bitrate = bitrate;
        return this;
    }
    public String getBitrate() {
        return this.bitrate;
    }

    public VideoMediaVideoStream setCodeName(String codeName) {
        this.codeName = codeName;
        return this;
    }
    public String getCodeName() {
        return this.codeName;
    }

    public VideoMediaVideoStream setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public VideoMediaVideoStream setFrameCount(String frameCount) {
        this.frameCount = frameCount;
        return this;
    }
    public String getFrameCount() {
        return this.frameCount;
    }

}
