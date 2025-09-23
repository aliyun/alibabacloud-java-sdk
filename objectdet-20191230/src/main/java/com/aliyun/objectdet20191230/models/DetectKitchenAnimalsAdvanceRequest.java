// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectKitchenAnimalsAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/objectdet/DetectKitchenAnimals/DetectKitchenAnimals-left1.png">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/objectdet/DetectKitchenAnimals/DetectKitchenAnimals-left1.png</a></p>
     */
    @NameInMap("ImageURLA")
    public java.io.InputStream imageURLAObject;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/objectdet/DetectKitchenAnimals/DetectKitchenAnimals-right1.png">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/objectdet/DetectKitchenAnimals/DetectKitchenAnimals-right1.png</a></p>
     */
    @NameInMap("ImageURLB")
    public java.io.InputStream imageURLBObject;

    public static DetectKitchenAnimalsAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectKitchenAnimalsAdvanceRequest self = new DetectKitchenAnimalsAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectKitchenAnimalsAdvanceRequest setImageURLAObject(java.io.InputStream imageURLAObject) {
        this.imageURLAObject = imageURLAObject;
        return this;
    }
    public java.io.InputStream getImageURLAObject() {
        return this.imageURLAObject;
    }

    public DetectKitchenAnimalsAdvanceRequest setImageURLBObject(java.io.InputStream imageURLBObject) {
        this.imageURLBObject = imageURLBObject;
        return this;
    }
    public java.io.InputStream getImageURLBObject() {
        return this.imageURLBObject;
    }

}
