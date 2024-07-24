// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class VideoMediaAudioStream extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>129280</p>
     */
    @NameInMap("bit_rate")
    public String bitRate;

    /**
     * <strong>example:</strong>
     * <p>aac</p>
     */
    @NameInMap("code_name")
    public String codeName;

    /**
     * <strong>example:</strong>
     * <p>7704.573000</p>
     */
    @NameInMap("duration")
    public String duration;

    public static VideoMediaAudioStream build(java.util.Map<String, ?> map) throws Exception {
        VideoMediaAudioStream self = new VideoMediaAudioStream();
        return TeaModel.build(map, self);
    }

    public VideoMediaAudioStream setBitRate(String bitRate) {
        this.bitRate = bitRate;
        return this;
    }
    public String getBitRate() {
        return this.bitRate;
    }

    public VideoMediaAudioStream setCodeName(String codeName) {
        this.codeName = codeName;
        return this;
    }
    public String getCodeName() {
        return this.codeName;
    }

    public VideoMediaAudioStream setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

}
