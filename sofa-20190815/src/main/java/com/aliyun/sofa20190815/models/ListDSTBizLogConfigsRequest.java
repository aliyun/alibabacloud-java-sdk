// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDSTBizLogConfigsRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("QueryString")
    public String queryString;

    public static ListDSTBizLogConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDSTBizLogConfigsRequest self = new ListDSTBizLogConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListDSTBizLogConfigsRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public ListDSTBizLogConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDSTBizLogConfigsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDSTBizLogConfigsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDSTBizLogConfigsRequest setQueryString(String queryString) {
        this.queryString = queryString;
        return this;
    }
    public String getQueryString() {
        return this.queryString;
    }

}
