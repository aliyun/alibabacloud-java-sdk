// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVehicleIllegalParkingShrinkRequest extends TeaModel {
    // A short description of struct
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("RoadRegions")
    public String roadRegionsShrink;

    public static DetectVehicleIllegalParkingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectVehicleIllegalParkingShrinkRequest self = new DetectVehicleIllegalParkingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DetectVehicleIllegalParkingShrinkRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public DetectVehicleIllegalParkingShrinkRequest setRoadRegionsShrink(String roadRegionsShrink) {
        this.roadRegionsShrink = roadRegionsShrink;
        return this;
    }
    public String getRoadRegionsShrink() {
        return this.roadRegionsShrink;
    }

}
