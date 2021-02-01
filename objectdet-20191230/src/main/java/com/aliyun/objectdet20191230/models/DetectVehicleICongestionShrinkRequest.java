// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVehicleICongestionShrinkRequest extends TeaModel {
    // A short description of struct
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("RoadRegions")
    public String roadRegionsShrink;

    @NameInMap("PreRegionIntersectFeatures")
    public String preRegionIntersectFeaturesShrink;

    public static DetectVehicleICongestionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectVehicleICongestionShrinkRequest self = new DetectVehicleICongestionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DetectVehicleICongestionShrinkRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public DetectVehicleICongestionShrinkRequest setRoadRegionsShrink(String roadRegionsShrink) {
        this.roadRegionsShrink = roadRegionsShrink;
        return this;
    }
    public String getRoadRegionsShrink() {
        return this.roadRegionsShrink;
    }

    public DetectVehicleICongestionShrinkRequest setPreRegionIntersectFeaturesShrink(String preRegionIntersectFeaturesShrink) {
        this.preRegionIntersectFeaturesShrink = preRegionIntersectFeaturesShrink;
        return this;
    }
    public String getPreRegionIntersectFeaturesShrink() {
        return this.preRegionIntersectFeaturesShrink;
    }

}
