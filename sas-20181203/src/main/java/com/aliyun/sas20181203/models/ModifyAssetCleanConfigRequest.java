// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAssetCleanConfigRequest extends TeaModel {
    @NameInMap("AssetCleanConfigs")
    public java.util.List<ModifyAssetCleanConfigRequestAssetCleanConfigs> assetCleanConfigs;

    public static ModifyAssetCleanConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAssetCleanConfigRequest self = new ModifyAssetCleanConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAssetCleanConfigRequest setAssetCleanConfigs(java.util.List<ModifyAssetCleanConfigRequestAssetCleanConfigs> assetCleanConfigs) {
        this.assetCleanConfigs = assetCleanConfigs;
        return this;
    }
    public java.util.List<ModifyAssetCleanConfigRequestAssetCleanConfigs> getAssetCleanConfigs() {
        return this.assetCleanConfigs;
    }

    public static class ModifyAssetCleanConfigRequestAssetCleanConfigs extends TeaModel {
        @NameInMap("CleanDays")
        public Integer cleanDays;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Type")
        public Integer type;

        public static ModifyAssetCleanConfigRequestAssetCleanConfigs build(java.util.Map<String, ?> map) throws Exception {
            ModifyAssetCleanConfigRequestAssetCleanConfigs self = new ModifyAssetCleanConfigRequestAssetCleanConfigs();
            return TeaModel.build(map, self);
        }

        public ModifyAssetCleanConfigRequestAssetCleanConfigs setCleanDays(Integer cleanDays) {
            this.cleanDays = cleanDays;
            return this;
        }
        public Integer getCleanDays() {
            return this.cleanDays;
        }

        public ModifyAssetCleanConfigRequestAssetCleanConfigs setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ModifyAssetCleanConfigRequestAssetCleanConfigs setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
