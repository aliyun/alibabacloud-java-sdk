// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class BenefitMeta extends TeaModel {
    @NameInMap("config")
    public String config;

    @NameInMap("enabled")
    public Boolean enabled;

    @NameInMap("quota")
    public Long quota;

    public static BenefitMeta build(java.util.Map<String, ?> map) throws Exception {
        BenefitMeta self = new BenefitMeta();
        return TeaModel.build(map, self);
    }

    public BenefitMeta setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public BenefitMeta setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public BenefitMeta setQuota(Long quota) {
        this.quota = quota;
        return this;
    }
    public Long getQuota() {
        return this.quota;
    }

}
