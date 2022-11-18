// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteServiceAddressRequest extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("AddressType")
    public String addressType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SagId")
    public String sagId;

    @NameInMap("Sn")
    public String sn;

    public static DeleteServiceAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceAddressRequest self = new DeleteServiceAddressRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceAddressRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public DeleteServiceAddressRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public DeleteServiceAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteServiceAddressRequest setSagId(String sagId) {
        this.sagId = sagId;
        return this;
    }
    public String getSagId() {
        return this.sagId;
    }

    public DeleteServiceAddressRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

}
