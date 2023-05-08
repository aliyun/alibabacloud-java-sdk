// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class QueryBarrelImageListRequest extends TeaModel {
    /**
     * <p>Barrel</p>
     */
    @NameInMap("Barrel")
    public String barrel;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartId")
    public Long startId;

    public static QueryBarrelImageListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBarrelImageListRequest self = new QueryBarrelImageListRequest();
        return TeaModel.build(map, self);
    }

    public QueryBarrelImageListRequest setBarrel(String barrel) {
        this.barrel = barrel;
        return this;
    }
    public String getBarrel() {
        return this.barrel;
    }

    public QueryBarrelImageListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryBarrelImageListRequest setStartId(Long startId) {
        this.startId = startId;
        return this;
    }
    public Long getStartId() {
        return this.startId;
    }

}
