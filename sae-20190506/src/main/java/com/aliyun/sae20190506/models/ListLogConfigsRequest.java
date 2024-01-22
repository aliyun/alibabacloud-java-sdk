// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListLogConfigsRequest extends TeaModel {
    /**
     * <p>10</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListLogConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLogConfigsRequest self = new ListLogConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListLogConfigsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListLogConfigsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListLogConfigsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
