// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class QuotaConfig extends TeaModel {
    @NameInMap("AllowedMaxPriority")
    public Integer allowedMaxPriority;

    @NameInMap("EnableDLC")
    public Boolean enableDLC;

    @NameInMap("EnableDSW")
    public Boolean enableDSW;

    @NameInMap("EnableTideResource")
    public Boolean enableTideResource;

    @NameInMap("ResourceLevel")
    public String resourceLevel;

    public static QuotaConfig build(java.util.Map<String, ?> map) throws Exception {
        QuotaConfig self = new QuotaConfig();
        return TeaModel.build(map, self);
    }

    public QuotaConfig setAllowedMaxPriority(Integer allowedMaxPriority) {
        this.allowedMaxPriority = allowedMaxPriority;
        return this;
    }
    public Integer getAllowedMaxPriority() {
        return this.allowedMaxPriority;
    }

    public QuotaConfig setEnableDLC(Boolean enableDLC) {
        this.enableDLC = enableDLC;
        return this;
    }
    public Boolean getEnableDLC() {
        return this.enableDLC;
    }

    public QuotaConfig setEnableDSW(Boolean enableDSW) {
        this.enableDSW = enableDSW;
        return this;
    }
    public Boolean getEnableDSW() {
        return this.enableDSW;
    }

    public QuotaConfig setEnableTideResource(Boolean enableTideResource) {
        this.enableTideResource = enableTideResource;
        return this;
    }
    public Boolean getEnableTideResource() {
        return this.enableTideResource;
    }

    public QuotaConfig setResourceLevel(String resourceLevel) {
        this.resourceLevel = resourceLevel;
        return this;
    }
    public String getResourceLevel() {
        return this.resourceLevel;
    }

}
