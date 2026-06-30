// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class BusinessCategoryBasicInfo extends TeaModel {
    /**
     * <p>Business ID</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Bid")
    public Integer bid;

    /**
     * <p>Business name</p>
     * 
     * <strong>example:</strong>
     * <p>全部</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>originalId</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OriginalId")
    public Long originalId;

    /**
     * <p>Service Type (ServiceCategory).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
