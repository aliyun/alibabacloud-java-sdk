// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class LocationTransferType extends TeaModel {
    @NameInMap("Location")
    public String location;

    @NameInMap("TransferTypes")
    public TransferTypes transferTypes;

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

    public LocationTransferType setTransferTypes(TransferTypes transferTypes) {
        this.transferTypes = transferTypes;
        return this;
    }
    public TransferTypes getTransferTypes() {
        return this.transferTypes;
    }

    public static class TransferTypes extends TeaModel {
        @NameInMap("Type")
        public String type;

        public static TransferTypes build(java.util.Map<String, ?> map) throws Exception {
            TransferTypes self = new TransferTypes();
            return TeaModel.build(map, self);
        }

        public TransferTypes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
