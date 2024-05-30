// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ToneSdrVideoRequest extends TeaModel {
    @NameInMap("Bitrate")
    public Integer bitrate;

    @NameInMap("RecolorModel")
    public String recolorModel;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VideoURL")
    public String videoURL;

    public static ToneSdrVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        ToneSdrVideoRequest self = new ToneSdrVideoRequest();
        return TeaModel.build(map, self);
    }

    public ToneSdrVideoRequest setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }
    public Integer getBitrate() {
        return this.bitrate;
    }

    public ToneSdrVideoRequest setRecolorModel(String recolorModel) {
        this.recolorModel = recolorModel;
        return this;
    }
    public String getRecolorModel() {
        return this.recolorModel;
    }

    public ToneSdrVideoRequest setVideoURL(String videoURL) {
        this.videoURL = videoURL;
        return this;
    }
    public String getVideoURL() {
        return this.videoURL;
    }

}
