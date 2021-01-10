// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgServiceSubKeysRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Start")
    public Long start;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryMsSgServiceSubKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgServiceSubKeysRequest self = new QueryMsSgServiceSubKeysRequest();
        return TeaModel.build(map, self);
    }

    public QueryMsSgServiceSubKeysRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMsSgServiceSubKeysRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public QueryMsSgServiceSubKeysRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryMsSgServiceSubKeysRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public QueryMsSgServiceSubKeysRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
