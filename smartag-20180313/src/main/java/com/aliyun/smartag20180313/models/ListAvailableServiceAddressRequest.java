// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListAvailableServiceAddressRequest extends TeaModel {
    @NameInMap("AddressType")
    public String addressType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SagId")
    public String sagId;

    @NameInMap("Sn")
    public String sn;

    public static ListAvailableServiceAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableServiceAddressRequest self = new ListAvailableServiceAddressRequest();
        return TeaModel.build(map, self);
    }

    public ListAvailableServiceAddressRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public ListAvailableServiceAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAvailableServiceAddressRequest setSagId(String sagId) {
        this.sagId = sagId;
        return this;
    }
    public String getSagId() {
        return this.sagId;
    }

    public ListAvailableServiceAddressRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

}
