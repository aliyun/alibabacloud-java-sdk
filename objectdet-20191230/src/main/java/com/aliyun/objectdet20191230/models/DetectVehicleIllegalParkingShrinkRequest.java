// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVehicleIllegalParkingShrinkRequest extends TeaModel {
    // A short description of struct
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("OriginRequestId")
    public String originRequestId;

    @NameInMap("RoadRegions")
    public String roadRegionsShrink;

    @NameInMap("StreamArn")
    public String streamArn;

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

    public DetectVehicleIllegalParkingShrinkRequest setOriginRequestId(String originRequestId) {
        this.originRequestId = originRequestId;
        return this;
    }
    public String getOriginRequestId() {
        return this.originRequestId;
    }

    public DetectVehicleIllegalParkingShrinkRequest setRoadRegionsShrink(String roadRegionsShrink) {
        this.roadRegionsShrink = roadRegionsShrink;
        return this;
    }
    public String getRoadRegionsShrink() {
        return this.roadRegionsShrink;
    }

    public DetectVehicleIllegalParkingShrinkRequest setStreamArn(String streamArn) {
        this.streamArn = streamArn;
        return this;
    }
    public String getStreamArn() {
        return this.streamArn;
    }

}
