// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateAiotDeviceRequest extends TeaModel {
    @NameInMap("AiotDevice")
    public UpdateAiotDeviceRequestAiotDevice aiotDevice;

    @NameInMap("Id")
    public String id;

    public static UpdateAiotDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiotDeviceRequest self = new UpdateAiotDeviceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAiotDeviceRequest setAiotDevice(UpdateAiotDeviceRequestAiotDevice aiotDevice) {
        this.aiotDevice = aiotDevice;
        return this;
    }
    public UpdateAiotDeviceRequestAiotDevice getAiotDevice() {
        return this.aiotDevice;
    }

    public UpdateAiotDeviceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public static class UpdateAiotDeviceRequestAiotDevice extends TeaModel {
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

        public static UpdateAiotDeviceRequestAiotDevice build(java.util.Map<String, ?> map) throws Exception {
            UpdateAiotDeviceRequestAiotDevice self = new UpdateAiotDeviceRequestAiotDevice();
            return TeaModel.build(map, self);
        }

        public UpdateAiotDeviceRequestAiotDevice setIPAddr(String IPAddr) {
            this.IPAddr = IPAddr;
            return this;
        }
        public String getIPAddr() {
            return this.IPAddr;
        }

        public UpdateAiotDeviceRequestAiotDevice setLatitude(Float latitude) {
            this.latitude = latitude;
            return this;
        }
        public Float getLatitude() {
            return this.latitude;
        }

        public UpdateAiotDeviceRequestAiotDevice setLongitude(Float longitude) {
            this.longitude = longitude;
            return this;
        }
        public Float getLongitude() {
            return this.longitude;
        }

        public UpdateAiotDeviceRequestAiotDevice setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateAiotDeviceRequestAiotDevice setPlace(String place) {
            this.place = place;
            return this;
        }
        public String getPlace() {
            return this.place;
        }

        public UpdateAiotDeviceRequestAiotDevice setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

    }

}
