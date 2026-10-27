// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCloudVendorAccountAKListRequest extends TeaModel {
    /**
     * <p>The unique ID of the AK.</p>
     * 
     * <strong>example:</strong>
     * <p>2624</p>
     */
    @NameInMap("AuthIds")
    public String authIds;

    /**
     * <p>The page number of the current page during paging. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries to return on each page during paging. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of the AK. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Enabled.</li>
     * <li><strong>1</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The username of the sub-account of the cloud service provider to which the AK belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>AlibabaCloud_***</p>
     */
    @NameInMap("SubAccountName")
    public String subAccountName;

    /**
     * <p>The cloud service provider. Valid values:</p>
     * <ul>
     * <li><strong>Tencent</strong>: Tencent Cloud.</li>
     * <li><strong>HUAWEICLOUD</strong>: Huawei Cloud.</li>
     * <li><strong>Azure</strong>: Azure.</li>
     * <li><strong>AWS</strong>: AWS.</li>
     * <li><strong>VOLCENGINE</strong>: Volcengine.</li>
     * <li><strong>google</strong>: Google Cloud.</li>
     * <li><strong>CHAITIN</strong>: Chaitin Tech.</li>
     * <li><strong>FORTINET</strong>: Fortinet.</li>
     * <li><strong>THREATBOOK</strong>: ThreatBook.</li>
     * <li><strong>KingsoftCloud</strong>: Kingsoft Cloud.</li>
     * <li><strong>UCloud</strong>: UCloud.</li>
     * <li><strong>BaiduCloud</strong>: Baidu AI Cloud.</li>
     * <li><strong>WIZ</strong>: Wiz.</li>
     * <li><strong>OracleCloud</strong>: Oracle Cloud.</li>
     * <li><strong>StateCloud</strong>: CTYun.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VOLCENGINE</p>
     */
    @NameInMap("Vendor")
    public String vendor;

    /**
     * <p>The name of the AK account.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("VendorAuthAlias")
    public String vendorAuthAlias;

    public static DescribeCloudVendorAccountAKListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudVendorAccountAKListRequest self = new DescribeCloudVendorAccountAKListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudVendorAccountAKListRequest setAuthIds(String authIds) {
        this.authIds = authIds;
        return this;
    }
    public String getAuthIds() {
        return this.authIds;
    }

    public DescribeCloudVendorAccountAKListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCloudVendorAccountAKListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCloudVendorAccountAKListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCloudVendorAccountAKListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeCloudVendorAccountAKListRequest setSubAccountName(String subAccountName) {
        this.subAccountName = subAccountName;
        return this;
    }
    public String getSubAccountName() {
        return this.subAccountName;
    }

    public DescribeCloudVendorAccountAKListRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

    public DescribeCloudVendorAccountAKListRequest setVendorAuthAlias(String vendorAuthAlias) {
        this.vendorAuthAlias = vendorAuthAlias;
        return this;
    }
    public String getVendorAuthAlias() {
        return this.vendorAuthAlias;
    }

}
