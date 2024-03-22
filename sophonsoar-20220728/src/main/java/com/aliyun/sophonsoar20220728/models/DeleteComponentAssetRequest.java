// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DeleteComponentAssetRequest extends TeaModel {
    /**
     * <p>The ID of the asset.</p>
     * <br>
     * <p>>  You can call the [DescribeComponentAssets](~~DescribeComponentAssets~~) operation to query the ID.</p>
     */
    @NameInMap("AssetId")
    public Long assetId;

    /**
     * <p>The language of the content within the request and the response. Valid values:</p>
     * <br>
     * <p>*   **zh** (default): Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DeleteComponentAssetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteComponentAssetRequest self = new DeleteComponentAssetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteComponentAssetRequest setAssetId(Long assetId) {
        this.assetId = assetId;
        return this;
    }
    public Long getAssetId() {
        return this.assetId;
    }

    public DeleteComponentAssetRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
