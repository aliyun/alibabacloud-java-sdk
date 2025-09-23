// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVehicleIllegalParkingShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/objectdet/DetectVehicleIllegalParking/DetectVehicleIllegalParking2.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/objectdet/DetectVehicleIllegalParking/DetectVehicleIllegalParking2.jpg</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    /**
     * <p>This parameter is required.</p>
     */
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
