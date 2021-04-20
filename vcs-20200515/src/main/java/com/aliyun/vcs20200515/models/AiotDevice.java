// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AiotDevice extends TeaModel {
    // 名称
    @NameInMap("Name")
    public String name;

    // ip地址
    @NameInMap("IPAddr")
    public String IPAddr;

    // 端口
    @NameInMap("Port")
    public Long port;

    // 经度
    @NameInMap("Longitude")
    public Float longitude;

    // 纬度
    @NameInMap("Latitude")
    public Float latitude;

    // 安装位置
    @NameInMap("Place")
    public String place;

    public static AiotDevice build(java.util.Map<String, ?> map) throws Exception {
        AiotDevice self = new AiotDevice();
        return TeaModel.build(map, self);
    }

    public AiotDevice setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AiotDevice setIPAddr(String IPAddr) {
        this.IPAddr = IPAddr;
        return this;
    }
    public String getIPAddr() {
        return this.IPAddr;
    }

    public AiotDevice setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public AiotDevice setLongitude(Float longitude) {
        this.longitude = longitude;
        return this;
    }
    public Float getLongitude() {
        return this.longitude;
    }

    public AiotDevice setLatitude(Float latitude) {
        this.latitude = latitude;
        return this;
    }
    public Float getLatitude() {
        return this.latitude;
    }

    public AiotDevice setPlace(String place) {
        this.place = place;
        return this;
    }
    public String getPlace() {
        return this.place;
    }

}
