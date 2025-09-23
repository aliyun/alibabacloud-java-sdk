// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectMainBodyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/objectdet/DetectMainBody/DetectMainBody1.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/objectdet/DetectMainBody/DetectMainBody1.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    public static DetectMainBodyRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectMainBodyRequest self = new DetectMainBodyRequest();
        return TeaModel.build(map, self);
    }

    public DetectMainBodyRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
