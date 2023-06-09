// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateUserAnalyzerRequest extends TeaModel {
    /**
     * <p>基础分词器</p>
     */
    @NameInMap("business")
    public String business;

    @NameInMap("businessAppGroupId")
    public String businessAppGroupId;

    /**
     * <p>基础分词器类型 (AUTO, MODEL, SYSTEM, USER)</p>
     */
    @NameInMap("businessType")
    public String businessType;

    /**
     * <p>名称</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>引擎类型 (HA3, ES)</p>
     */
    @NameInMap("type")
    public String type;

    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateUserAnalyzerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserAnalyzerRequest self = new CreateUserAnalyzerRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserAnalyzerRequest setBusiness(String business) {
        this.business = business;
        return this;
    }
    public String getBusiness() {
        return this.business;
    }

    public CreateUserAnalyzerRequest setBusinessAppGroupId(String businessAppGroupId) {
        this.businessAppGroupId = businessAppGroupId;
        return this;
    }
    public String getBusinessAppGroupId() {
        return this.businessAppGroupId;
    }

    public CreateUserAnalyzerRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public CreateUserAnalyzerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateUserAnalyzerRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateUserAnalyzerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
