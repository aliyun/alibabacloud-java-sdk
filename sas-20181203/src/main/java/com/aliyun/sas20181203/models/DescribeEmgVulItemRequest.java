// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeEmgVulItemRequest extends TeaModel {
    /**
     * <p>The check method. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: proof of concept (POC) verification</li>
     * <li><strong>1</strong>: version comparison</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CheckType")
    public Integer checkType;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

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
     * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>Specifies whether the vulnerability poses risks.\
     * If you do not specify this parameter, all vulnerabilities are queried regardless of whether the vulnerabilities pose risks. Valid values:</p>
     * <ul>
     * <li><strong>y</strong>: yes</li>
     * <li><strong>n</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>y</p>
     */
    @NameInMap("RiskStatus")
    public String riskStatus;

    /**
     * <p>The method that is used to detect the vulnerability.\
     * If you do not specify this parameter, all vulnerabilities are queried regardless of which method is used. Valid values:</p>
     * <ul>
     * <li><strong>python</strong>: The Version method is used. Security Center checks the software versions of your server to check whether disclosed vulnerabilities exist on your server.</li>
     * <li><strong>scan</strong>: The Network Scan method is used. Security Center analyzes the access traffic to your server over the Internet to check whether vulnerabilities exist on your server.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>python</p>
     */
    @NameInMap("ScanType")
    public String scanType;

    /**
     * <p>The name of the urgent vulnerability.</p>
     * 
     * <strong>example:</strong>
     * <p>Changjietong T + SetupAccount/Upload.aspx file Upload vulnerability (CNVD-2022-60632)</p>
     */
    @NameInMap("VulName")
    public String vulName;

    public static DescribeEmgVulItemRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEmgVulItemRequest self = new DescribeEmgVulItemRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEmgVulItemRequest setCheckType(Integer checkType) {
        this.checkType = checkType;
        return this;
    }
    public Integer getCheckType() {
        return this.checkType;
    }

    public DescribeEmgVulItemRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeEmgVulItemRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeEmgVulItemRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEmgVulItemRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeEmgVulItemRequest setRiskStatus(String riskStatus) {
        this.riskStatus = riskStatus;
        return this;
    }
    public String getRiskStatus() {
        return this.riskStatus;
    }

    public DescribeEmgVulItemRequest setScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }
    public String getScanType() {
        return this.scanType;
    }

    public DescribeEmgVulItemRequest setVulName(String vulName) {
        this.vulName = vulName;
        return this;
    }
    public String getVulName() {
        return this.vulName;
    }

}
