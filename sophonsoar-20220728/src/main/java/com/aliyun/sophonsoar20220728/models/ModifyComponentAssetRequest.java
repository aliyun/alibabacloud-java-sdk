// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ModifyComponentAssetRequest extends TeaModel {
    @NameInMap("AssetConfig")
    public String assetConfig;

    @NameInMap("Lang")
    public String lang;

    public static ModifyComponentAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyComponentAssetRequest self = new ModifyComponentAssetRequest();
        return TeaModel.build(map, self);
    }

    public ModifyComponentAssetRequest setAssetConfig(String assetConfig) {
        this.assetConfig = assetConfig;
        return this;
    }
    public String getAssetConfig() {
        return this.assetConfig;
    }

    public ModifyComponentAssetRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
