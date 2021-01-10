// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsDrmDrmResourceTplRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("Start")
    public Long start;

    public static QueryMsDrmDrmResourceTplRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMsDrmDrmResourceTplRequest self = new QueryMsDrmDrmResourceTplRequest();
        return TeaModel.build(map, self);
    }

    public QueryMsDrmDrmResourceTplRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMsDrmDrmResourceTplRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMsDrmDrmResourceTplRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public QueryMsDrmDrmResourceTplRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
