// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class OpenXtraceServiceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static OpenXtraceServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenXtraceServiceRequest self = new OpenXtraceServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenXtraceServiceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
