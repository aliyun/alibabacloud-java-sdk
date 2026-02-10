// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertySoftwareDetailRequest extends TeaModel {
    /**
     * <p>Set which page of the returned results to start displaying the query results. The default value is <strong>1</strong>, indicating that the display starts from the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Whether the software name supports fuzzy search. To enable fuzzy search, set the value of this parameter to 1; other values or an empty value indicate that fuzzy search is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>The timestamp when the software update ended. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1650012695000</p>
     */
    @NameInMap("InstallTimeEnd")
    public Long installTimeEnd;

    /**
     * <p>The timestamp when the software update started. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1649321495000</p>
     */
    @NameInMap("InstallTimeStart")
    public Long installTimeStart;

    /**
     * <p>The name of the software to be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>kernel</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Used to mark the starting position for reading. Leave it blank to start from the beginning.</p>
     * <blockquote>
     * <p>For the first call, you do not need to fill this in; the response will include the NextToken for the second call, and each subsequent call\&quot;s response will contain the NextToken for the next call.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>E17B501887A2D3AA5E8360A6EFA3B***</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Set the number of software asset fingerprint information items displayed per page during pagination. The default value is <strong>10</strong>, indicating that 10 items of software asset fingerprint information are displayed per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The installation path of the software.</p>
     * 
     * <strong>example:</strong>
     * <p>/etc/test</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The name or IP address of the server to be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The version information of the software.</p>
     * 
     * <strong>example:</strong>
     * <p>3.10.0</p>
     */
    @NameInMap("SoftwareVersion")
    public String softwareVersion;

    /**
     * <p>Whether to use the NextToken method to pull asset list data. If this parameter is used, TotalCount will no longer be returned. Values:</p>
     * <ul>
     * <li><strong>true</strong>: Use the NextToken method.</li>
     * <li><strong>false</strong>: Do not use the NextToken method.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseNextToken")
    public Boolean useNextToken;

    /**
     * <p>The UUID of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>50d213b4-3a35-427a-b8a5-****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribePropertySoftwareDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertySoftwareDetailRequest self = new DescribePropertySoftwareDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribePropertySoftwareDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePropertySoftwareDetailRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public DescribePropertySoftwareDetailRequest setInstallTimeEnd(Long installTimeEnd) {
        this.installTimeEnd = installTimeEnd;
        return this;
    }
    public Long getInstallTimeEnd() {
        return this.installTimeEnd;
    }

    public DescribePropertySoftwareDetailRequest setInstallTimeStart(Long installTimeStart) {
        this.installTimeStart = installTimeStart;
        return this;
    }
    public Long getInstallTimeStart() {
        return this.installTimeStart;
    }

    public DescribePropertySoftwareDetailRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribePropertySoftwareDetailRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribePropertySoftwareDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePropertySoftwareDetailRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public DescribePropertySoftwareDetailRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribePropertySoftwareDetailRequest setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
        return this;
    }
    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    public DescribePropertySoftwareDetailRequest setUseNextToken(Boolean useNextToken) {
        this.useNextToken = useNextToken;
        return this;
    }
    public Boolean getUseNextToken() {
        return this.useNextToken;
    }

    public DescribePropertySoftwareDetailRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
