// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSTopologiesRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ZoneMode")
    public String zoneMode;

    public static QueryTSTopologiesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTSTopologiesRequest self = new QueryTSTopologiesRequest();
        return TeaModel.build(map, self);
    }

    public QueryTSTopologiesRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryTSTopologiesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTSTopologiesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryTSTopologiesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTSTopologiesRequest setZoneMode(String zoneMode) {
        this.zoneMode = zoneMode;
        return this;
    }
    public String getZoneMode() {
        return this.zoneMode;
    }

}
