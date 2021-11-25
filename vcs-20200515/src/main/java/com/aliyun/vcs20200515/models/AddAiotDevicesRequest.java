// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddAiotDevicesRequest extends TeaModel {
    @NameInMap("AiotDeviceList")
    public java.util.List<AddAiotDevicesRequestAiotDeviceList> aiotDeviceList;

    public static AddAiotDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAiotDevicesRequest self = new AddAiotDevicesRequest();
        return TeaModel.build(map, self);
    }

    public AddAiotDevicesRequest setAiotDeviceList(java.util.List<AddAiotDevicesRequestAiotDeviceList> aiotDeviceList) {
        this.aiotDeviceList = aiotDeviceList;
        return this;
    }
    public java.util.List<AddAiotDevicesRequestAiotDeviceList> getAiotDeviceList() {
        return this.aiotDeviceList;
    }

    public static class AddAiotDevicesRequestAiotDeviceList extends TeaModel {
        @NameInMap("CorpId")
        public String corpId;

        @NameInMap("DeviceId")
        public String deviceId;

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

        public static AddAiotDevicesRequestAiotDeviceList build(java.util.Map<String, ?> map) throws Exception {
            AddAiotDevicesRequestAiotDeviceList self = new AddAiotDevicesRequestAiotDeviceList();
            return TeaModel.build(map, self);
        }

        public AddAiotDevicesRequestAiotDeviceList setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public AddAiotDevicesRequestAiotDeviceList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public AddAiotDevicesRequestAiotDeviceList setIPAddr(String IPAddr) {
            this.IPAddr = IPAddr;
            return this;
        }
        public String getIPAddr() {
            return this.IPAddr;
        }

        public AddAiotDevicesRequestAiotDeviceList setLatitude(Float latitude) {
            this.latitude = latitude;
            return this;
        }
        public Float getLatitude() {
            return this.latitude;
        }

        public AddAiotDevicesRequestAiotDeviceList setLongitude(Float longitude) {
            this.longitude = longitude;
            return this;
        }
        public Float getLongitude() {
            return this.longitude;
        }

        public AddAiotDevicesRequestAiotDeviceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddAiotDevicesRequestAiotDeviceList setPlace(String place) {
            this.place = place;
            return this;
        }
        public String getPlace() {
            return this.place;
        }

        public AddAiotDevicesRequestAiotDeviceList setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

    }

}
