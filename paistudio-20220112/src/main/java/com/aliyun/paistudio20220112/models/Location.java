// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class Location extends TeaModel {
    @NameInMap("LocationType")
    public String locationType;

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
