// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DeleteComponentAssetRequest extends TeaModel {
    /**
     * <p>The asset ID of the component.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeComponentAssets~~">DescribeComponentAssets</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12x</p>
     */
    @NameInMap("AssetId")
    public Long assetId;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
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
