// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ToneSdrVideoAdvanceRequest extends TeaModel {
    @NameInMap("Bitrate")
    public Integer bitrate;

    @NameInMap("RecolorModel")
    public String recolorModel;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VideoURL")
    public java.io.InputStream videoURLObject;

    public static ToneSdrVideoAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ToneSdrVideoAdvanceRequest self = new ToneSdrVideoAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ToneSdrVideoAdvanceRequest setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }
    public Integer getBitrate() {
        return this.bitrate;
    }

    public ToneSdrVideoAdvanceRequest setRecolorModel(String recolorModel) {
        this.recolorModel = recolorModel;
        return this;
    }
    public String getRecolorModel() {
        return this.recolorModel;
    }

    public ToneSdrVideoAdvanceRequest setVideoURLObject(java.io.InputStream videoURLObject) {
        this.videoURLObject = videoURLObject;
        return this;
    }
    public java.io.InputStream getVideoURLObject() {
        return this.videoURLObject;
    }

}
