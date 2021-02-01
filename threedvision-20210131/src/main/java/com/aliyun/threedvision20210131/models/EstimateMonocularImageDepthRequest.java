// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.threedvision20210131.models;

import com.aliyun.tea.*;

public class EstimateMonocularImageDepthRequest extends TeaModel {
    // A short description of struct
    @NameInMap("ImageURL")
    public String imageURL;

    public static EstimateMonocularImageDepthRequest build(java.util.Map<String, ?> map) throws Exception {
        EstimateMonocularImageDepthRequest self = new EstimateMonocularImageDepthRequest();
        return TeaModel.build(map, self);
    }

    public EstimateMonocularImageDepthRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
