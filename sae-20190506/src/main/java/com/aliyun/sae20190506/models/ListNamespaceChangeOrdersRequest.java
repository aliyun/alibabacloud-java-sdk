// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListNamespaceChangeOrdersRequest extends TeaModel {
    /**
     * <p>The status of the change order. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: preparing</li>
     * <li><strong>1</strong>: executing</li>
     * <li><strong>2</strong>: succeeded</li>
     * <li><strong>3</strong>: failed</li>
     * <li><strong>6</strong>: terminated</li>
     * <li><strong>10</strong>: failed due to a system exception</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CoStatus")
    public String coStatus;

    /**
     * <p>The type of the change order. Valid values:</p>
     * <ul>
     * <li><strong>CoBatchStartApplication</strong>: Starts applications in batches.</li>
     * <li><strong>CoBatchStopApplication</strong>: Stops applications in batches.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CoBatchStartApplication</p>
     */
    @NameInMap("CoType")
    public String coType;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The keyword used for fuzzy matching of the change order description. All change orders whose descriptions contain this <strong>key</strong> are returned.</p>
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
     * <p>The number of entries per page.</p>
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
