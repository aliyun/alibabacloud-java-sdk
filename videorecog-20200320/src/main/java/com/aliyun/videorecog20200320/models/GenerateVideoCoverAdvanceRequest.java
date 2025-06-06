// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class GenerateVideoCoverAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsGif")
    public Boolean isGif;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/videorecog/videorecog/videorecog1.mp4">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/videorecog/videorecog/videorecog1.mp4</a></p>
     */
    @NameInMap("VideoUrl")
    public java.io.InputStream videoUrlObject;

    public static GenerateVideoCoverAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateVideoCoverAdvanceRequest self = new GenerateVideoCoverAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public GenerateVideoCoverAdvanceRequest setIsGif(Boolean isGif) {
        this.isGif = isGif;
        return this;
    }
    public Boolean getIsGif() {
        return this.isGif;
    }

    public GenerateVideoCoverAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

}
