// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListEditableNamespaceRequest extends TeaModel {
    @NameInMap("namespace")
    public String namespace;

    @NameInMap("pageIndex")
    public String pageIndex;

    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("regionId")
    public String regionId;

    @NameInMap("workspaceId")
    public String workspaceId;

    public static ListEditableNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEditableNamespaceRequest self = new ListEditableNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public ListEditableNamespaceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListEditableNamespaceRequest setPageIndex(String pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public String getPageIndex() {
        return this.pageIndex;
    }

    public ListEditableNamespaceRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListEditableNamespaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListEditableNamespaceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
