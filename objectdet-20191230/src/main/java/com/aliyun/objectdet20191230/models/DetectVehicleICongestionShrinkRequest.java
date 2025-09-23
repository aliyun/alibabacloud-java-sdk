// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVehicleICongestionShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/objectdet/DetectVehicleICongestion/DetectVehicleICongestion1.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/objectdet/DetectVehicleICongestion/DetectVehicleICongestion1.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("PreRegionIntersectFeatures")
    public String preRegionIntersectFeaturesShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RoadRegions")
    public String roadRegionsShrink;

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

    public DetectVehicleICongestionShrinkRequest setPreRegionIntersectFeaturesShrink(String preRegionIntersectFeaturesShrink) {
        this.preRegionIntersectFeaturesShrink = preRegionIntersectFeaturesShrink;
        return this;
    }
    public String getPreRegionIntersectFeaturesShrink() {
        return this.preRegionIntersectFeaturesShrink;
    }

    public DetectVehicleICongestionShrinkRequest setRoadRegionsShrink(String roadRegionsShrink) {
        this.roadRegionsShrink = roadRegionsShrink;
        return this;
    }
    public String getRoadRegionsShrink() {
        return this.roadRegionsShrink;
    }

}
