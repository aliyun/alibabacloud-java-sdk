// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnTopDomainsByFlowRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Product")
    public String product;

    @NameInMap("Limit")
    public Long limit;

    public static DescribeScdnTopDomainsByFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnTopDomainsByFlowRequest self = new DescribeScdnTopDomainsByFlowRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScdnTopDomainsByFlowRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeScdnTopDomainsByFlowRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeScdnTopDomainsByFlowRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeScdnTopDomainsByFlowRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DescribeScdnTopDomainsByFlowRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

}
