// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListAppResourceAllocsRequest extends TeaModel {
    @NameInMap("AppEnvId")
    public Long appEnvId;

    @NameInMap("AppId")
    public Long appId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListAppResourceAllocsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppResourceAllocsRequest self = new ListAppResourceAllocsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppResourceAllocsRequest setAppEnvId(Long appEnvId) {
        this.appEnvId = appEnvId;
        return this;
    }
    public Long getAppEnvId() {
        return this.appEnvId;
    }

    public ListAppResourceAllocsRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public ListAppResourceAllocsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListAppResourceAllocsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppResourceAllocsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
