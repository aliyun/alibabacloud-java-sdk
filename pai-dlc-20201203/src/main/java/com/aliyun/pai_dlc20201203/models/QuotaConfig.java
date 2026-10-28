// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class QuotaConfig extends TeaModel {
    /**
     * <p>The maximum allowed priority.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("AllowedMaxPriority")
    public Integer allowedMaxPriority;

    /**
     * <p>Specifies whether DLC is enabled.</p>
     */
    @NameInMap("EnableDLC")
    public Boolean enableDLC;

    /**
     * <p>Specifies whether DSW is enabled.</p>
     */
    @NameInMap("EnableDSW")
    public Boolean enableDSW;

    /**
     * <p>Specifies whether to use tide resources.</p>
     */
    @NameInMap("EnableTideResource")
    public Boolean enableTideResource;

    /**
     * <p>The resource level (L0, L1).</p>
     * 
     * <strong>example:</strong>
     * <p>L0</p>
     */
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
