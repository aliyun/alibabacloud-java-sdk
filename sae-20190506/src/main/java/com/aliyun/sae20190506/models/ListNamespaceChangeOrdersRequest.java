// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListNamespaceChangeOrdersRequest extends TeaModel {
    /**
     * <p>The change order status. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Preparing.</p>
     * </li>
     * <li><p><strong>1</strong>: Executing.</p>
     * </li>
     * <li><p><strong>2</strong>: Succeeded.</p>
     * </li>
     * <li><p><strong>3</strong>: Failed.</p>
     * </li>
     * <li><p><strong>6</strong>: Terminated.</p>
     * </li>
     * <li><p><strong>10</strong>: System Error.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CoStatus")
    public String coStatus;

    /**
     * <p>The change order type. Valid values:</p>
     * <ul>
     * <li><p><strong>CoBatchStartApplication</strong>: Batch Start Application.</p>
     * </li>
     * <li><p><strong>CoBatchStopApplication</strong>: Batch Stop Application.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CoBatchStartApplication</p>
     */
    @NameInMap("CoType")
    public String coType;

    /**
     * <p>The current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>A keyword for a fuzzy search of change order descriptions. Change orders whose descriptions contain this <strong>key</strong> are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The namespace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListNamespaceChangeOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNamespaceChangeOrdersRequest self = new ListNamespaceChangeOrdersRequest();
        return TeaModel.build(map, self);
    }

    public ListNamespaceChangeOrdersRequest setCoStatus(String coStatus) {
        this.coStatus = coStatus;
        return this;
    }
    public String getCoStatus() {
        return this.coStatus;
    }

    public ListNamespaceChangeOrdersRequest setCoType(String coType) {
        this.coType = coType;
        return this;
    }
    public String getCoType() {
        return this.coType;
    }

    public ListNamespaceChangeOrdersRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListNamespaceChangeOrdersRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ListNamespaceChangeOrdersRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public ListNamespaceChangeOrdersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
