// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DeleteComponentAssetRequest extends TeaModel {
    @NameInMap("AssetId")
    public Long assetId;

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
