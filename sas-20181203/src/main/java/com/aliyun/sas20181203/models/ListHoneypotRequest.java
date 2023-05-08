// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The IDs of the honeypots.</p>
     */
    @NameInMap("HoneypotIds")
    public java.util.List<String> honeypotIds;

    /**
     * <p>The name of the honeypot.</p>
     */
    @NameInMap("HoneypotName")
    public String honeypotName;

    /**
     * <p>The ID of the management node.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The name of the management node.</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListHoneypotRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotRequest self = new ListHoneypotRequest();
        return TeaModel.build(map, self);
    }

    public ListHoneypotRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListHoneypotRequest setHoneypotIds(java.util.List<String> honeypotIds) {
        this.honeypotIds = honeypotIds;
        return this;
    }
    public java.util.List<String> getHoneypotIds() {
        return this.honeypotIds;
    }

    public ListHoneypotRequest setHoneypotName(String honeypotName) {
        this.honeypotName = honeypotName;
        return this;
    }
    public String getHoneypotName() {
        return this.honeypotName;
    }

    public ListHoneypotRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ListHoneypotRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public ListHoneypotRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
