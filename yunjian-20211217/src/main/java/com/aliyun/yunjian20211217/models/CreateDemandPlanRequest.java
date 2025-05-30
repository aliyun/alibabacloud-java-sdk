// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class CreateDemandPlanRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1065737167271819</p>
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

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FY2022</p>
     */
    @NameInMap("period")
    public String period;

    @NameInMap("source")
    public String source;

    @NameInMap("targetCid")
    public Long targetCid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>URGENT</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>262940</p>
     */
    @NameInMap("userId")
    public String userId;

    public static CreateDemandPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDemandPlanRequest self = new CreateDemandPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateDemandPlanRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CreateDemandPlanRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDemandPlanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDemandPlanRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateDemandPlanRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateDemandPlanRequest setTargetCid(Long targetCid) {
        this.targetCid = targetCid;
        return this;
    }
    public Long getTargetCid() {
        return this.targetCid;
    }

    public CreateDemandPlanRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateDemandPlanRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
