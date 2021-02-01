// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.threedvision20210131.models;

import com.aliyun.tea.*;

public class EstimateStereoImageDepthRequest extends TeaModel {
    // A short description of struct
    @NameInMap("LeftImageURL")
    public String leftImageURL;

    @NameInMap("RightImageURL")
    public String rightImageURL;

    public static EstimateStereoImageDepthRequest build(java.util.Map<String, ?> map) throws Exception {
        EstimateStereoImageDepthRequest self = new EstimateStereoImageDepthRequest();
        return TeaModel.build(map, self);
    }

    public EstimateStereoImageDepthRequest setLeftImageURL(String leftImageURL) {
        this.leftImageURL = leftImageURL;
        return this;
    }
    public String getLeftImageURL() {
        return this.leftImageURL;
    }

    public EstimateStereoImageDepthRequest setRightImageURL(String rightImageURL) {
        this.rightImageURL = rightImageURL;
        return this;
    }
    public String getRightImageURL() {
        return this.rightImageURL;
    }

}
