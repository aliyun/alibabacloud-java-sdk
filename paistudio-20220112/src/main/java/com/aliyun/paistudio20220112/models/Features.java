// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class Features extends TeaModel {
    /**
     * <p>The Quota feature.</p>
     */
    @NameInMap("Quota")
    public FeaturesQuota quota;

    public static Features build(java.util.Map<String, ?> map) throws Exception {
        Features self = new Features();
        return TeaModel.build(map, self);
    }

    public Features setQuota(FeaturesQuota quota) {
        this.quota = quota;
        return this;
    }
    public FeaturesQuota getQuota() {
        return this.quota;
    }

    public static class FeaturesQuota extends TeaModel {
        /**
         * <p>Indicates whether the feature is started.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsEnabled")
        public Boolean isEnabled;

        public static FeaturesQuota build(java.util.Map<String, ?> map) throws Exception {
            FeaturesQuota self = new FeaturesQuota();
            return TeaModel.build(map, self);
        }

        public FeaturesQuota setIsEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Boolean getIsEnabled() {
            return this.isEnabled;
        }

    }

}
