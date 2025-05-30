// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class CreateDemandPlanV2Request extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("productType")
    public String productType;

    @NameInMap("targetCid")
    public Long targetCid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("userId")
    public String userId;

    public static CreateDemandPlanV2Request build(java.util.Map<String, ?> map) throws Exception {
        CreateDemandPlanV2Request self = new CreateDemandPlanV2Request();
        return TeaModel.build(map, self);
    }

    public CreateDemandPlanV2Request setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CreateDemandPlanV2Request setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDemandPlanV2Request setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDemandPlanV2Request setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public CreateDemandPlanV2Request setTargetCid(Long targetCid) {
        this.targetCid = targetCid;
        return this;
    }
    public Long getTargetCid() {
        return this.targetCid;
    }

    public CreateDemandPlanV2Request setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateDemandPlanV2Request setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
