// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotNodeRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the management node.</p>
     * 
     * <strong>example:</strong>
     * <p>7d110ca6-05ee-4149-8042-13ad1a41fd****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The name of the management node.</p>
     * 
     * <strong>example:</strong>
     * <p>cyct_cnymu</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
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
