// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqTraceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("QueryItem")
    public String queryItem;

    public static ListMqSofamqTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqTraceRequest self = new ListMqSofamqTraceRequest();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqTraceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListMqSofamqTraceRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListMqSofamqTraceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListMqSofamqTraceRequest setQueryItem(String queryItem) {
        this.queryItem = queryItem;
        return this;
    }
    public String getQueryItem() {
        return this.queryItem;
    }

}
