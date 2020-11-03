// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetDatabaseObjectsByFilterRequest extends TeaModel {
    // 数据库类型列表
    @NameInMap("CatalogTypes")
    public java.util.List<String> catalogTypes;

    // 数据库位置列表
    @NameInMap("LikeLocations")
    public java.util.List<String> likeLocations;

    // 数据库类型列表
    @NameInMap("Locations")
    public java.util.List<String> locations;

    public static GetDatabaseObjectsByFilterRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseObjectsByFilterRequest self = new GetDatabaseObjectsByFilterRequest();
        return TeaModel.build(map, self);
    }

    public GetDatabaseObjectsByFilterRequest setCatalogTypes(java.util.List<String> catalogTypes) {
        this.catalogTypes = catalogTypes;
        return this;
    }
    public java.util.List<String> getCatalogTypes() {
        return this.catalogTypes;
    }

    public GetDatabaseObjectsByFilterRequest setLikeLocations(java.util.List<String> likeLocations) {
        this.likeLocations = likeLocations;
        return this;
    }
    public java.util.List<String> getLikeLocations() {
        return this.likeLocations;
    }

    public GetDatabaseObjectsByFilterRequest setLocations(java.util.List<String> locations) {
        this.locations = locations;
        return this;
    }
    public java.util.List<String> getLocations() {
        return this.locations;
    }

}
