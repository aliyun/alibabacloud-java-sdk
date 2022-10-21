// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class BusinessCategoryBasicInfo extends TeaModel {
    @NameInMap("Bid")
    public Integer bid;

    @NameInMap("Name")
    public String name;

    @NameInMap("OriginalId")
    public Long originalId;

    @NameInMap("ServiceType")
    public Integer serviceType;

    public static BusinessCategoryBasicInfo build(java.util.Map<String, ?> map) throws Exception {
        BusinessCategoryBasicInfo self = new BusinessCategoryBasicInfo();
        return TeaModel.build(map, self);
    }

    public BusinessCategoryBasicInfo setBid(Integer bid) {
        this.bid = bid;
        return this;
    }
    public Integer getBid() {
        return this.bid;
    }

    public BusinessCategoryBasicInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BusinessCategoryBasicInfo setOriginalId(Long originalId) {
        this.originalId = originalId;
        return this;
    }
    public Long getOriginalId() {
        return this.originalId;
    }

    public BusinessCategoryBasicInfo setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public Integer getServiceType() {
        return this.serviceType;
    }

}
