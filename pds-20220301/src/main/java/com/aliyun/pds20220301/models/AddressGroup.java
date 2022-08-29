// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AddressGroup extends TeaModel {
    @NameInMap("address_detail")
    public Address addressDetail;

    @NameInMap("count")
    public Long count;

    @NameInMap("cover_file_id")
    public String coverFileId;

    @NameInMap("cover_url")
    public String coverUrl;

    @NameInMap("location")
    public String location;

    @NameInMap("name")
    public String name;

    public static AddressGroup build(java.util.Map<String, ?> map) throws Exception {
        AddressGroup self = new AddressGroup();
        return TeaModel.build(map, self);
    }

    public AddressGroup setAddressDetail(Address addressDetail) {
        this.addressDetail = addressDetail;
        return this;
    }
    public Address getAddressDetail() {
        return this.addressDetail;
    }

    public AddressGroup setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public AddressGroup setCoverFileId(String coverFileId) {
        this.coverFileId = coverFileId;
        return this;
    }
    public String getCoverFileId() {
        return this.coverFileId;
    }

    public AddressGroup setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public AddressGroup setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public AddressGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
