// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ReleaseEipSegmentAddressRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("SegmentInstanceId")
    @Validation(required = true)
    public String segmentInstanceId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static ReleaseEipSegmentAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseEipSegmentAddressRequest self = new ReleaseEipSegmentAddressRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseEipSegmentAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReleaseEipSegmentAddressRequest setSegmentInstanceId(String segmentInstanceId) {
        this.segmentInstanceId = segmentInstanceId;
        return this;
    }
    public String getSegmentInstanceId() {
        return this.segmentInstanceId;
    }

    public ReleaseEipSegmentAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
