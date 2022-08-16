// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotNodeRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("NodeName")
    public String nodeName;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListHoneypotNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotNodeRequest self = new ListHoneypotNodeRequest();
        return TeaModel.build(map, self);
    }

    public ListHoneypotNodeRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListHoneypotNodeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ListHoneypotNodeRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public ListHoneypotNodeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
