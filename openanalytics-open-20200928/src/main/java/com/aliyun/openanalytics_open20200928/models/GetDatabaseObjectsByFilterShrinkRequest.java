// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetDatabaseObjectsByFilterShrinkRequest extends TeaModel {
    // 数据库类型列表
    @NameInMap("CatalogTypes")
    public String catalogTypesShrink;

    // 数据库位置列表
    @NameInMap("LikeLocations")
    public String likeLocationsShrink;

    // 数据库类型列表
    @NameInMap("Locations")
    public String locationsShrink;

    public static GetDatabaseObjectsByFilterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseObjectsByFilterShrinkRequest self = new GetDatabaseObjectsByFilterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetDatabaseObjectsByFilterShrinkRequest setCatalogTypesShrink(String catalogTypesShrink) {
        this.catalogTypesShrink = catalogTypesShrink;
        return this;
    }
    public String getCatalogTypesShrink() {
        return this.catalogTypesShrink;
    }

    public GetDatabaseObjectsByFilterShrinkRequest setLikeLocationsShrink(String likeLocationsShrink) {
        this.likeLocationsShrink = likeLocationsShrink;
        return this;
    }
    public String getLikeLocationsShrink() {
        return this.likeLocationsShrink;
    }

    public GetDatabaseObjectsByFilterShrinkRequest setLocationsShrink(String locationsShrink) {
        this.locationsShrink = locationsShrink;
        return this;
    }
    public String getLocationsShrink() {
        return this.locationsShrink;
    }

}
