// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ImageConfig extends TeaModel {
    @NameInMap("accelerationType")
    public String accelerationType;

    @NameInMap("image")
    public String image;

    @NameInMap("instanceID")
    public String instanceID;

    public static ImageConfig build(java.util.Map<String, ?> map) throws Exception {
        ImageConfig self = new ImageConfig();
        return TeaModel.build(map, self);
    }

    public ImageConfig setAccelerationType(String accelerationType) {
        this.accelerationType = accelerationType;
        return this;
    }
    public String getAccelerationType() {
        return this.accelerationType;
    }

    public ImageConfig setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public ImageConfig setInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }
    public String getInstanceID() {
        return this.instanceID;
    }

}
