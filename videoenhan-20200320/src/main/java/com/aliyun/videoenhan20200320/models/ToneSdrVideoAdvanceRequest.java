// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ToneSdrVideoAdvanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Bitrate")
    public Integer bitrate;

    /**
     * <strong>example:</strong>
     * <p>auto_l2</p>
     */
    @NameInMap("RecolorModel")
    public String recolorModel;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://invi-label.oss-cn-shanghai.aliyuncs.com/label/temp/faceswap/test_for_api/xxxx.mp4">https://invi-label.oss-cn-shanghai.aliyuncs.com/label/temp/faceswap/test_for_api/xxxx.mp4</a></p>
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
