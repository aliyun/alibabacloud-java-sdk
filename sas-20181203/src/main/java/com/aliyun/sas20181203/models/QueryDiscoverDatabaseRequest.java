// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryDiscoverDatabaseRequest extends TeaModel {
    @NameInMap("CreateMark")
    public String createMark;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static QueryDiscoverDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDiscoverDatabaseRequest self = new QueryDiscoverDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public QueryDiscoverDatabaseRequest setCreateMark(String createMark) {
        this.createMark = createMark;
        return this;
    }
    public String getCreateMark() {
        return this.createMark;
    }

    public QueryDiscoverDatabaseRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryDiscoverDatabaseRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
