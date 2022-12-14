// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.threedvision20210131.models;

import com.aliyun.tea.*;

public class EstimateStereoImageDepthAdvanceRequest extends TeaModel {
    @NameInMap("LeftImageURL")
    public java.io.InputStream leftImageURLObject;

    @NameInMap("RightImageURL")
    public java.io.InputStream rightImageURLObject;

    public static EstimateStereoImageDepthAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        EstimateStereoImageDepthAdvanceRequest self = new EstimateStereoImageDepthAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public EstimateStereoImageDepthAdvanceRequest setLeftImageURLObject(java.io.InputStream leftImageURLObject) {
        this.leftImageURLObject = leftImageURLObject;
        return this;
    }
    public java.io.InputStream getLeftImageURLObject() {
        return this.leftImageURLObject;
    }

    public EstimateStereoImageDepthAdvanceRequest setRightImageURLObject(java.io.InputStream rightImageURLObject) {
        this.rightImageURLObject = rightImageURLObject;
        return this;
    }
    public java.io.InputStream getRightImageURLObject() {
        return this.rightImageURLObject;
    }

}
