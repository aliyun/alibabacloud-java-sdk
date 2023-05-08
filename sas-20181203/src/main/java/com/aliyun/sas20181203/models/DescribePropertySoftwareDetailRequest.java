// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertySoftwareDetailRequest extends TeaModel {
    /**
     * <p>The name of the software.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>10</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>3.10.0</p>
     */
    @NameInMap("InstallTimeEnd")
    public Long installTimeEnd;

    /**
     * <p>The name of the software.</p>
     */
    @NameInMap("InstallTimeStart")
    public Long installTimeStart;

    /**
     * <p>The details of the software asset.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries to return on each page. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name or IP address of the server.</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The private IP address of the server.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("SoftwareVersion")
    public String softwareVersion;

    /**
     * <p>The public IP address of the server.</p>
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

    public DescribePropertySoftwareDetailRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
