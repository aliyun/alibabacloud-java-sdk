// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpLaneInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>灰度</p>
     */
    @NameInMap("alias")
    public String alias;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("companyId")
    public Long companyId;

    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("creatorName")
    public String creatorName;

    /**
     * <strong>example:</strong>
     * <p>252333049301505383</p>
     */
    @NameInMap("creatorUid")
    public String creatorUid;

    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>TEST</p>
     */
    @NameInMap("env")
    public String env;

    /**
     * <strong>example:</strong>
     * <p>2023-07-04T00:00:00.000Z</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("initGroupFlag")
    public Boolean initGroupFlag;

    /**
     * <strong>example:</strong>
     * <p>1，2</p>
     */
    @NameInMap("inletServices")
    public String inletServices;

    /**
     * <strong>example:</strong>
     * <p>gray</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("productId")
    public Long productId;

    /**
     * <strong>example:</strong>
     * <p>linkedmall</p>
     */
    @NameInMap("productName")
    public String productName;

    /**
     * <strong>example:</strong>
     * <p>1，2</p>
     */
    @NameInMap("serviceGroupIds")
    public String serviceGroupIds;

    /**
     * <strong>example:</strong>
     * <p>SYSTEM</p>
     */
    @NameInMap("type")
    public String type;

    public static PdpLaneInfo build(java.util.Map<String, ?> map) throws Exception {
        PdpLaneInfo self = new PdpLaneInfo();
        return TeaModel.build(map, self);
    }

    public PdpLaneInfo setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public PdpLaneInfo setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public PdpLaneInfo setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public PdpLaneInfo setCreatorUid(String creatorUid) {
        this.creatorUid = creatorUid;
        return this;
    }
    public String getCreatorUid() {
        return this.creatorUid;
    }

    public PdpLaneInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PdpLaneInfo setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public PdpLaneInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public PdpLaneInfo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PdpLaneInfo setInitGroupFlag(Boolean initGroupFlag) {
        this.initGroupFlag = initGroupFlag;
        return this;
    }
    public Boolean getInitGroupFlag() {
        return this.initGroupFlag;
    }

    public PdpLaneInfo setInletServices(String inletServices) {
        this.inletServices = inletServices;
        return this;
    }
    public String getInletServices() {
        return this.inletServices;
    }

    public PdpLaneInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PdpLaneInfo setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public PdpLaneInfo setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public PdpLaneInfo setServiceGroupIds(String serviceGroupIds) {
        this.serviceGroupIds = serviceGroupIds;
        return this;
    }
    public String getServiceGroupIds() {
        return this.serviceGroupIds;
    }

    public PdpLaneInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
