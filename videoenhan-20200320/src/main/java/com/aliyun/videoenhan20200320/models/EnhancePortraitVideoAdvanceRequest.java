// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EnhancePortraitVideoAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://viapi-test.oss-cn-shanghai.aliyuncs.com/test-team/xxx/shang/video/SD%289516100%29.mp4">https://viapi-test.oss-cn-shanghai.aliyuncs.com/test-team/xxx/shang/video/SD%289516100%29.mp4</a></p>
     */
    @NameInMap("VideoUrl")
    public java.io.InputStream videoUrlObject;

    public static EnhancePortraitVideoAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        EnhancePortraitVideoAdvanceRequest self = new EnhancePortraitVideoAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public EnhancePortraitVideoAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

}
