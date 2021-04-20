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

        @NameInMap("Name")
        public String name;

        @NameInMap("IPAddr")
        public String IPAddr;

        @NameInMap("Port")
        public Long port;

        @NameInMap("Longitude")
        public Float longitude;

        @NameInMap("Latitude")
        public Float latitude;

        @NameInMap("Place")
        public String place;

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

        public AddAiotDevicesRequestAiotDeviceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddAiotDevicesRequestAiotDeviceList setIPAddr(String IPAddr) {
            this.IPAddr = IPAddr;
            return this;
        }
        public String getIPAddr() {
            return this.IPAddr;
        }

        public AddAiotDevicesRequestAiotDeviceList setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public AddAiotDevicesRequestAiotDeviceList setLongitude(Float longitude) {
            this.longitude = longitude;
            return this;
        }
        public Float getLongitude() {
            return this.longitude;
        }

        public AddAiotDevicesRequestAiotDeviceList setLatitude(Float latitude) {
            this.latitude = latitude;
            return this;
        }
        public Float getLatitude() {
            return this.latitude;
        }

        public AddAiotDevicesRequestAiotDeviceList setPlace(String place) {
            this.place = place;
            return this;
        }
        public String getPlace() {
            return this.place;
        }

    }

}
