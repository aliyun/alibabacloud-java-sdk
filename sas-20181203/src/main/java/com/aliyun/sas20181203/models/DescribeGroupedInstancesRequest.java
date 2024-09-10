// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedInstancesRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the group to which the assets belong. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test-01</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>The filter condition that you want to use to query the assets. Valid values:</p>
     * <ul>
     * <li><strong>groupId</strong>: the group to which the assets belong</li>
     * <li><strong>regionId</strong>: the region in which the assets reside</li>
     * <li><strong>vpcInstanceId</strong>: the virtual private cloud (VPC) in which the assets reside</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>groupId</p>
     */
    @NameInMap("GroupField")
    public String groupField;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The type of the assets that you want to query. Set the value to <strong>ecs</strong>, which indicates Elastic Compute Service (ECS) instances.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("MachineTypes")
    public String machineTypes;

    /**
     * <p>Specifies whether to enable paged query. Default value: <strong>true</strong>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NoPage")
    public Boolean noPage;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The edition of Security Center that protects the asset. Valid values:</p>
     * <ul>
     * <li><strong>sas_gte_advanced</strong>: the Advanced edition or higher</li>
     * <li><strong>sas_gte_enterprise</strong>: the Enterprise edition or higher</li>
     * <li><strong>sas_gt_basic:</strong> a paid edition</li>
     * <li><strong>sas_eq_advanced:</strong> the Advanced edition</li>
     * <li><strong>sas_gt_anti_virus:</strong> an edition higher than the Anti-virus edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sas_gt_basic</p>
     */
    @NameInMap("SaleVersionCheckCode")
    public String saleVersionCheckCode;

    /**
     * <p>The source of the server. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: an asset provided by Alibaba Cloud.</li>
     * <li><strong>1</strong>: a third-party cloud server</li>
     * <li><strong>2</strong>: a server in a data center</li>
     * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: other cloud asset</li>
     * <li><strong>8</strong>: a lightweight asset</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Vendor")
    public Integer vendor;

    /**
     * <p>The source of the server. Separate multiple sources with commas (,).Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: an asset provided by Alibaba Cloud.</li>
     * <li><strong>1</strong>: a third-party cloud server</li>
     * <li><strong>2</strong>: a server in a data center</li>
     * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: other cloud asset</li>
     * <li><strong>8</strong>: a lightweight asset</li>
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
