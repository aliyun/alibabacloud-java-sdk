// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ModifyComponentAssetRequest extends TeaModel {
    /**
     * <p>The configuration of the asset. The value is a JSON object.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;name&quot;: &quot;test asset&quot;,
     *     &quot;componentName&quot;: &quot;SLS&quot;,
     *     &quot;params&quot;: [
     *         {
     *             &quot;name&quot;: &quot;end_point&quot;,
     *             &quot;value&quot;: &quot;xxx&quot;
     *         },
     *         {
     *             &quot;name&quot;: &quot;sub_id&quot;,
     *             &quot;value&quot;: &quot;xxxx&quot;
     *         },
     *         {
     *             &quot;name&quot;: &quot;access_key&quot;,
     *             &quot;value&quot;: &quot;xxxx&quot;
     *         }
     *     ]
     * }</p>
     */
    @NameInMap("AssetConfig")
    public String assetConfig;

    /**
     * <p>The language of the content within the request and response.</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese (default)</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
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
