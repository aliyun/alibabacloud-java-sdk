// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningsRequest extends TeaModel {
    /**
     * <p>The ID of the check item.</p>
     * 
     * <strong>example:</strong>
     * <p>2546</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The type of the check item. Valid values:</p>
     * <ul>
     * <li><strong>hc.check.type.identity_auth</strong>: identity authentication</li>
     * <li><strong>hc.check.type.access_control</strong>: access control</li>
     * <li><strong>hc.check.type.network_service</strong>: network and service</li>
     * <li><strong>hc.check.type.service_conf</strong>: service configuration</li>
     * <li><strong>hc.check.type.file_rights</strong>: file permission</li>
     * <li><strong>hc.check.type.security_audit</strong>: security audit</li>
     * <li><strong>hc.check.type.attack_defense</strong>: intrusion prevention</li>
     * <li><strong>hc.check.type.others</strong>: others</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hc.check.type.attack_defense</p>
     */
    @NameInMap("CheckType")
    public String checkType;

    /**
     * <p>The name of the container.</p>
     * 
     * <strong>example:</strong>
     * <p>/redis</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

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
     * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
     * <blockquote>
     * <p> To obtain the Alibaba Cloud account ID, call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127608589417****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The ID of the risk item. This parameter is required.</p>
     * <blockquote>
     * <p> To query the information about the risk items and check items of a server, you must specify the IDs of the risk items. You can call the <a href="~~DescribeCheckWarningSummary~~">DescribeCheckWarningSummary</a> operation to query the IDs of risk items.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10354</p>
     */
    @NameInMap("RiskId")
    public Long riskId;

    /**
     * <p>The status of the check item. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: failed</li>
     * <li><strong>2</strong>: verifying</li>
     * <li><strong>3</strong>: passed</li>
     * <li><strong>5</strong>: expired</li>
     * <li><strong>6</strong>: ignored</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskStatus")
    public Integer riskStatus;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The UUID of the server on which the baseline check is performed.</p>
     * <blockquote>
     * <p>To query specified risk items and the check items of a specified server, you must provide the ID of the server on which the baseline check is performed. You can call the <a href="~~DescribeWarningMachines~~">DescribeWarningMachines</a> operation to query the IDs of servers.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d42f938c-d962-48a0-90f9-05****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribeCheckWarningsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckWarningsRequest self = new DescribeCheckWarningsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCheckWarningsRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public DescribeCheckWarningsRequest setCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }
    public String getCheckType() {
        return this.checkType;
    }

    public DescribeCheckWarningsRequest setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public DescribeCheckWarningsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCheckWarningsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCheckWarningsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCheckWarningsRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeCheckWarningsRequest setRiskId(Long riskId) {
        this.riskId = riskId;
        return this;
    }
    public Long getRiskId() {
        return this.riskId;
    }

    public DescribeCheckWarningsRequest setRiskStatus(Integer riskStatus) {
        this.riskStatus = riskStatus;
        return this;
    }
    public Integer getRiskStatus() {
        return this.riskStatus;
    }

    public DescribeCheckWarningsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeCheckWarningsRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
