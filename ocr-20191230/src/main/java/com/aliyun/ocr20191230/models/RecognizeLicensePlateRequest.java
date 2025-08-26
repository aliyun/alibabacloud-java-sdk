// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeLicensePlateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/ocr/RecognizeLicensePlate/cpsb1.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/ocr/RecognizeLicensePlate/cpsb1.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    public static RecognizeLicensePlateRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeLicensePlateRequest self = new RecognizeLicensePlateRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeLicensePlateRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
