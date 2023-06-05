// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AiotDevice extends TeaModel {
    @NameInMap("IPAddr")
    public String IPAddr;

    @NameInMap("Latitude")
    public Float latitude;

    @NameInMap("Longitude")
    public Float longitude;

    @NameInMap("Name")
    public String name;

    @NameInMap("Place")
    public String place;

    @NameInMap("Port")
    public Long port;

    public static AiotDevice build(java.util.Map<String, ?> map) throws Exception {
        AiotDevice self = new AiotDevice();
        return TeaModel.build(map, self);
    }

    public AiotDevice setIPAddr(String IPAddr) {
        this.IPAddr = IPAddr;
        return this;
    }
    public String getIPAddr() {
        return this.IPAddr;
    }

    public AiotDevice setLatitude(Float latitude) {
        this.latitude = latitude;
        return this;
    }
    public Float getLatitude() {
        return this.latitude;
    }

    public AiotDevice setLongitude(Float longitude) {
        this.longitude = longitude;
        return this;
    }
    public Float getLongitude() {
        return this.longitude;
    }

    public AiotDevice setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AiotDevice setPlace(String place) {
        this.place = place;
        return this;
    }
    public String getPlace() {
        return this.place;
    }

    public AiotDevice setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

}
