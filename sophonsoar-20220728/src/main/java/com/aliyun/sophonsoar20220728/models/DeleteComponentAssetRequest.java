// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DeleteComponentAssetRequest extends TeaModel {
    /**
     * <p>The ID of the asset.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeComponentAssets~~">DescribeComponentAssets</a> operation to query the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12x</p>
     */
    @NameInMap("AssetId")
    public Long assetId;

    /**
     * <p>The language of the content within the request and the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
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
