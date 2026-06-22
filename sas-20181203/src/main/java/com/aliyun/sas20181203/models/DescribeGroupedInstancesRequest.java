// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedInstancesRequest extends TeaModel {
    /**
     * <p>The page number from which query results start to be displayed. Default value: <strong>1</strong>, indicating that query results are displayed starting from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the asset group to query. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test-01</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>The filter condition for querying assets. Valid values:</p>
     * <ul>
     * <li><strong>groupId</strong>: queries assets by group.</li>
     * <li><strong>regionId</strong>: queries assets by region.</li>
     * <li><strong>vpcInstanceId</strong>: queries assets by Virtual Private Cloud (VPC).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>groupId</p>
     */
    @NameInMap("GroupField")
    public String groupField;

    /**
     * <p>The language type for requests and responses. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The type of assets to query. Fixed value: <strong>ecs</strong>, indicating Elastic Compute Service (ECS) instances.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("MachineTypes")
    public String machineTypes;

    /**
     * <p>Specifies whether to enable paginated queries. Default value: <strong>true</strong>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables paginated queries.</li>
     * <li><strong>false</strong>: disables paginated queries.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NoPage")
    public Boolean noPage;

    /**
     * <p>The number of entries per page in a paginated query. Default value: <strong>20</strong>, indicating that 20 entries of asset information are displayed per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The edition filter for querying assets. Valid values:</p>
     * <ul>
     * <li><strong>sas_gte_advanced</strong>: Advanced edition or higher</li>
     * <li><strong>sas_gte_enterprise</strong>: Enterprise edition or higher</li>
     * <li><strong>sas_gt_basic</strong>: paid editions</li>
     * <li><strong>sas_eq_advanced</strong>: Advanced edition only</li>
     * <li><strong>sas_gt_anti_virus</strong>: editions higher than Anti-virus edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sas_gt_basic</p>
     */
    @NameInMap("SaleVersionCheckCode")
    public String saleVersionCheckCode;

    /**
     * <p>The server vendor. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Alibaba Cloud assets</li>
     * <li><strong>1</strong>: non-cloud assets</li>
     * <li><strong>2</strong>: IDC assets</li>
     * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, <strong>7</strong>: assets from other cloud providers</li>
     * <li><strong>8</strong>: lightweight assets</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Vendor")
    public Integer vendor;

    /**
     * <p>The server vendors. Separate multiple vendors with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Alibaba Cloud assets</li>
     * <li><strong>1</strong>: non-cloud assets</li>
     * <li><strong>2</strong>: IDC assets</li>
     * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, <strong>7</strong>: assets from other cloud providers</li>
     * <li><strong>8</strong>: lightweight assets</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0,8</p>
     */
    @NameInMap("Vendors")
    public String vendors;

    public static DescribeGroupedInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedInstancesRequest self = new DescribeGroupedInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedInstancesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeGroupedInstancesRequest setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }
    public String getFieldValue() {
        return this.fieldValue;
    }

    public DescribeGroupedInstancesRequest setGroupField(String groupField) {
        this.groupField = groupField;
        return this;
    }
    public String getGroupField() {
        return this.groupField;
    }

    public DescribeGroupedInstancesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGroupedInstancesRequest setMachineTypes(String machineTypes) {
        this.machineTypes = machineTypes;
        return this;
    }
    public String getMachineTypes() {
        return this.machineTypes;
    }

    public DescribeGroupedInstancesRequest setNoPage(Boolean noPage) {
        this.noPage = noPage;
        return this;
    }
    public Boolean getNoPage() {
        return this.noPage;
    }

    public DescribeGroupedInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGroupedInstancesRequest setSaleVersionCheckCode(String saleVersionCheckCode) {
        this.saleVersionCheckCode = saleVersionCheckCode;
        return this;
    }
    public String getSaleVersionCheckCode() {
        return this.saleVersionCheckCode;
    }

    public DescribeGroupedInstancesRequest setVendor(Integer vendor) {
        this.vendor = vendor;
        return this;
    }
    public Integer getVendor() {
        return this.vendor;
    }

    public DescribeGroupedInstancesRequest setVendors(String vendors) {
        this.vendors = vendors;
        return this;
    }
    public String getVendors() {
        return this.vendors;
    }

}
