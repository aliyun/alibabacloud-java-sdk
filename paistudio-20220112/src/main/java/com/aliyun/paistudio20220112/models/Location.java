// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class Location extends TeaModel {
    /**
     * <p>The code location type. Valid values: OSS and NAS.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("LocationType")
    public String locationType;

    /**
     * <p>The code path.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://${bucket_name}.oss-${region}.aliyuncs.com/oss/location/path/</p>
     */
    @NameInMap("LocationValue")
    public java.util.Map<String, ?> locationValue;

    public static Location build(java.util.Map<String, ?> map) throws Exception {
        Location self = new Location();
        return TeaModel.build(map, self);
    }

    public Location setLocationType(String locationType) {
        this.locationType = locationType;
        return this;
    }
    public String getLocationType() {
        return this.locationType;
    }

    public Location setLocationValue(java.util.Map<String, ?> locationValue) {
        this.locationValue = locationValue;
        return this;
    }
    public java.util.Map<String, ?> getLocationValue() {
        return this.locationValue;
    }

}
