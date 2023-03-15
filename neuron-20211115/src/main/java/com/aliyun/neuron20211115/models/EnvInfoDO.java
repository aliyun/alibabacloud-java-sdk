// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class EnvInfoDO extends TeaModel {
    @NameInMap("env")
    public String env;

    @NameInMap("envType")
    public String envType;

    @NameInMap("orgType")
    public String orgType;

    @NameInMap("productId")
    public Long productId;

    @NameInMap("productName")
    public String productName;

    @NameInMap("region")
    public String region;

    public static EnvInfoDO build(java.util.Map<String, ?> map) throws Exception {
        EnvInfoDO self = new EnvInfoDO();
        return TeaModel.build(map, self);
    }

    public EnvInfoDO setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public EnvInfoDO setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public EnvInfoDO setOrgType(String orgType) {
        this.orgType = orgType;
        return this;
    }
    public String getOrgType() {
        return this.orgType;
    }

    public EnvInfoDO setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public EnvInfoDO setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public EnvInfoDO setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
