// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeEmgVulItemRequest extends TeaModel {
    /**
     * <p>The check type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: POC verification</li>
     * <li><strong>1</strong>: version comparison.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CheckType")
    public Integer checkType;

    /**
     * <p>The page number of the first page to return. Default value: <strong>1</strong>, which indicates that query results are displayed starting from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page in a paged query. Default value: <strong>10</strong>, which indicates that 10 emergency vulnerability entries are displayed per page. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the member accounts in the resource directory (Alibaba Cloud account).</p>
     * <blockquote>
     * <p>Invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127608589417****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The risk status of the vulnerabilities to query. If this parameter is not specified, vulnerabilities of all risk statuses are returned, including those with risks and those without risks. Valid values:</p>
     * <ul>
     * <li><strong>y</strong>: at risk</li>
     * <li><strong>n</strong>: not at risk.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>y</p>
     */
    @NameInMap("RiskStatus")
    public String riskStatus;

    /**
     * <p>The detection method of the vulnerabilities to query. If this parameter is not specified, vulnerabilities detected by all methods are returned by default, including version detection and network scanning. Valid values:</p>
     * <ul>
     * <li><strong>python</strong>: version detection (server software version detection). Detects whether your server has disclosed software vulnerabilities.</li>
     * <li><strong>scan</strong>: network scanning (network traffic detection). Detects whether your public assets (Internet-accessible servers) have vulnerabilities.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>python</p>
     */
    @NameInMap("ScanType")
    public String scanType;

    /**
     * <p>The name of the emergency vulnerability to query.</p>
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
