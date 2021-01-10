// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMSDdcsClientsRequest extends TeaModel {
    @NameInMap("AttributeId")
    public Long attributeId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public String pageSize;

    public static QueryMSDdcsClientsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMSDdcsClientsRequest self = new QueryMSDdcsClientsRequest();
        return TeaModel.build(map, self);
    }

    public QueryMSDdcsClientsRequest setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
        return this;
    }
    public Long getAttributeId() {
        return this.attributeId;
    }

    public QueryMSDdcsClientsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMSDdcsClientsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryMSDdcsClientsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
