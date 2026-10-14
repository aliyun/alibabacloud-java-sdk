// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ListOrdersRequest extends TeaModel {
    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/183258.html">product edition</a>. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: Cluster Edition.</li>
     * <li><strong>Basic</strong>: Single Node Edition.</li>
     * <li><strong>Archive</strong>: X-Engine (Warm Data).</li>
     * <li><strong>NormalMultimaster</strong>: Multi-master Cluster Edition.</li>
     * <li><strong>SENormal</strong>: Standard Edition.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>PolarDB for PostgreSQL 11 does not support Single Node Edition.</li>
     * <li>PolarDB for MySQL 8.0, PolarDB for MySQL 5.7, and PolarDB for PostgreSQL 14 support Standard Edition.</li>
     * <li>PolarDB for MySQL 8.0 supports X-Engine (Warm Data) and Multi-master Cluster Edition.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2zed3m89cw***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of entries to return. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used to retrieve more results. If a single request does not return all results, this parameter is returned. You can pass the returned token in a subsequent request to continue retrieving results.</p>
     * 
     * <strong>example:</strong>
     * <p>212db86sca4384811e0b5e8707e******</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The order status. Valid values:</p>
     * <ul>
     * <li><p><strong>pending</strong>: The task is waiting to start.</p>
     * </li>
     * <li><p><strong>create</strong>: The order has been placed and entered the production process.</p>
     * </li>
     * <li><p><strong>fail</strong>: Production failed.</p>
     * </li>
     * <li><p><strong>cancel</strong>: The order is canceled.</p>
     * </li>
     * <li><p><strong>success</strong>: Production succeeded.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("OrderStatus")
    public String orderStatus;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>30</strong></li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * <p>Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product code.</p>
     * 
     * <strong>example:</strong>
     * <p>polardb</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query region information.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-************</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ListOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOrdersRequest self = new ListOrdersRequest();
        return TeaModel.build(map, self);
    }

    public ListOrdersRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListOrdersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListOrdersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListOrdersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOrdersRequest setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public ListOrdersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOrdersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOrdersRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ListOrdersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListOrdersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
