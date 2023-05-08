// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotNodeRequest extends TeaModel {
    /**
     * <p>The allowed CIDR block.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The name of the management node.</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The time when the management node was created.</p>
     */
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
