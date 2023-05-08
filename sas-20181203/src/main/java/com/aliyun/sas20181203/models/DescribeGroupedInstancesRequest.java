// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedInstancesRequest extends TeaModel {
    /**
     * <p>The number of entries to return on each page. Default value: **20**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>An array that consists of the information about the assets.</p>
     */
    @NameInMap("GroupField")
    public String groupField;

    /**
     * <p>The number of entries returned on the current page.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies whether to enable paged query. Default value: **true**. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("MachineTypes")
    public String machineTypes;

    /**
     * <p>The number of assets on which high-risk vulnerabilities are detected.</p>
     */
    @NameInMap("NoPage")
    public Boolean noPage;

    /**
     * <p>The type of the server group. Valid values:</p>
     * <br>
     * <p>*   **0**: the default group</p>
     * <p>*   **1**: other group</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SaleVersionCheckCode")
    public String saleVersionCheckCode;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Vendor")
    public Integer vendor;

    /**
     * <p>The name of the group to which the assets belong. Fuzzy search is supported.</p>
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
