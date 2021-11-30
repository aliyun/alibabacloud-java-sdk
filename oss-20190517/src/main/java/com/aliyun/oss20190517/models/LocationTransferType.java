// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class LocationTransferType extends TeaModel {
    // The region in which the destination bucket can be located
    @NameInMap("Location")
    public String location;

    // The container that stores the transmission type
    @NameInMap("TransferTypes")
    public LocationTransferTypeTransferTypes transferTypes;

    public static LocationTransferType build(java.util.Map<String, ?> map) throws Exception {
        LocationTransferType self = new LocationTransferType();
        return TeaModel.build(map, self);
    }

    public LocationTransferType setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public LocationTransferType setTransferTypes(LocationTransferTypeTransferTypes transferTypes) {
        this.transferTypes = transferTypes;
        return this;
    }
    public LocationTransferTypeTransferTypes getTransferTypes() {
        return this.transferTypes;
    }

    public static class LocationTransferTypeTransferTypes extends TeaModel {
        // The link used to transfer data in Cross-region replication
        @NameInMap("Type")
        public String type;

        public static LocationTransferTypeTransferTypes build(java.util.Map<String, ?> map) throws Exception {
            LocationTransferTypeTransferTypes self = new LocationTransferTypeTransferTypes();
            return TeaModel.build(map, self);
        }

        public LocationTransferTypeTransferTypes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
