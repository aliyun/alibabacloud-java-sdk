// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class ListRecentExperimentsRequest extends TeaModel {
    @NameInMap("Order")
    public String order;

    @NameInMap("Source")
    public String source;

    @NameInMap("Type")
    public String type;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    public static ListRecentExperimentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRecentExperimentsRequest self = new ListRecentExperimentsRequest();
        return TeaModel.build(map, self);
    }

    public ListRecentExperimentsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListRecentExperimentsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListRecentExperimentsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListRecentExperimentsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ListRecentExperimentsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListRecentExperimentsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
