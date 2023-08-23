// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedInstancesRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the group to which the assets belong. Fuzzy search is supported.</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>The filter condition that you want to use to query the assets. Valid values:</p>
     * <br>
     * <p>*   **groupId**: the group to which the assets belong</p>
     * <p>*   **regionId**: the region in which the assets reside</p>
     * <p>*   **vpcInstanceId**: the virtual private cloud (VPC) in which the assets reside</p>
     */
    @NameInMap("GroupField")
    public String groupField;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The type of the assets that you want to query. Set the value to **ecs**, which indicates Elastic Compute Service (ECS) instances.</p>
     */
    @NameInMap("MachineTypes")
    public String machineTypes;

    /**
     * <p>Specifies whether to enable paged query. Default value: **true**. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("NoPage")
    public Boolean noPage;

    /**
     * <p>The number of entries to return on each page. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The edition of Security Center that protects the asset. Valid values:</p>
     * <br>
     * <p>* **sas_gte_advanced**: the Advanced edition or higher</p>
     * <p>* **sas_gte_enterprise**: the Enterprise edition or higher</p>
     * <p>* **sas_gt_basic:** a paid edition</p>
     * <p>* **sas_eq_advanced:** the Advanced edition</p>
     * <p>* **sas_gt_anti_virus:** an edition higher than the Anti-virus edition</p>
     */
    @NameInMap("SaleVersionCheckCode")
    public String saleVersionCheckCode;

    /**
     * <p>The source of the server. Valid values:</p>
     * <br>
     * <p>*   **0**: an asset provided by Alibaba Cloud.</p>
     * <p>*   **1**: a third-party cloud server</p>
     * <p>*   **2**: a server in a data center</p>
     * <p>*   **3**, **4**, **5**, and **7**: other cloud asset</p>
     * <p>*   **8**: a lightweight asset</p>
     */
    @NameInMap("Vendor")
    public Integer vendor;

    /**
     * <p>The source of the server. Separate multiple sources with commas (,).Valid values:</p>
     * <br>
     * <p>*   **0**: an asset provided by Alibaba Cloud.</p>
     * <p>*   **1**: a third-party cloud server</p>
     * <p>*   **2**: a server in a data center</p>
     * <p>*   **3**, **4**, **5**, and **7**: other cloud asset</p>
     * <p>*   **8**: a lightweight asset</p>
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
