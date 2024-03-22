// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ModifyComponentAssetRequest extends TeaModel {
    /**
     * <p>The configuration of the asset. The value is a JSON object.</p>
     */
    @NameInMap("AssetConfig")
    public String assetConfig;

    /**
     * <p>The language of the content within the request and response.</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
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
