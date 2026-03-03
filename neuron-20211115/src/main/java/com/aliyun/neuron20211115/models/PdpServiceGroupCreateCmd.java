// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpServiceGroupCreateCmd extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>121321412341</p>
     */
    @NameInMap("accountId")
    public String accountId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>管理</p>
     */
    @NameInMap("alias")
    public String alias;

    /**
     * <strong>example:</strong>
     * <p>管理</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TEST</p>
     */
    @NameInMap("env")
    public String env;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CUSTOM</p>
     */
    @NameInMap("groupType")
    public String groupType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>employee</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("serviceId")
    public Long serviceId;

    public static PdpServiceGroupCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        PdpServiceGroupCreateCmd self = new PdpServiceGroupCreateCmd();
        return TeaModel.build(map, self);
    }

    public PdpServiceGroupCreateCmd setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public PdpServiceGroupCreateCmd setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public PdpServiceGroupCreateCmd setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PdpServiceGroupCreateCmd setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public PdpServiceGroupCreateCmd setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public PdpServiceGroupCreateCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PdpServiceGroupCreateCmd setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

}
