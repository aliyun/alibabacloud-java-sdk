// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectWhiteBaseImageAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/objectdet/DetectWhiteBaseImage/DetectWhiteBaseImage1.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/objectdet/DetectWhiteBaseImage/DetectWhiteBaseImage1.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    public static DetectWhiteBaseImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectWhiteBaseImageAdvanceRequest self = new DetectWhiteBaseImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectWhiteBaseImageAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
