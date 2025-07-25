// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListIngressesRequest extends TeaModel {
    /**
     * <p>The ID of an application.</p>
     * 
     * <strong>example:</strong>
     * <p>bbf3a590-6d13-46fe-8ca9-c947a20b****</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of a namespace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListIngressesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIngressesRequest self = new ListIngressesRequest();
        return TeaModel.build(map, self);
    }

    public ListIngressesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListIngressesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListIngressesRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ListIngressesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
