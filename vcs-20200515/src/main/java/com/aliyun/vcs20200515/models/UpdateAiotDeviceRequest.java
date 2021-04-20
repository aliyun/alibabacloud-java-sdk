// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateAiotDeviceRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("AiotDevice")
    public UpdateAiotDeviceRequestAiotDevice aiotDevice;

    public static UpdateAiotDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiotDeviceRequest self = new UpdateAiotDeviceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAiotDeviceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateAiotDeviceRequest setAiotDevice(UpdateAiotDeviceRequestAiotDevice aiotDevice) {
        this.aiotDevice = aiotDevice;
        return this;
    }
    public UpdateAiotDeviceRequestAiotDevice getAiotDevice() {
        return this.aiotDevice;
    }

    public static class UpdateAiotDeviceRequestAiotDevice extends TeaModel {
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

        public static UpdateAiotDeviceRequestAiotDevice build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiotDeviceRequestAiotDevice self = new UpdateAiotDeviceRequestAiotDevice();
            return TeaModel.build(map, self);
        }

        public UpdateAiotDeviceRequestAiotDevice setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateAiotDeviceRequestAiotDevice setIPAddr(String IPAddr) {
            this.IPAddr = IPAddr;
            return this;
        }
        public String getIPAddr() {
            return this.IPAddr;
        }

        public UpdateAiotDeviceRequestAiotDevice setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public UpdateAiotDeviceRequestAiotDevice setLongitude(Float longitude) {
            this.longitude = longitude;
            return this;
        }
        public Float getLongitude() {
            return this.longitude;
        }

        public UpdateAiotDeviceRequestAiotDevice setLatitude(Float latitude) {
            this.latitude = latitude;
            return this;
        }
        public Float getLatitude() {
            return this.latitude;
        }

        public UpdateAiotDeviceRequestAiotDevice setPlace(String place) {
            this.place = place;
            return this;
        }
        public String getPlace() {
            return this.place;
        }

    }

}
