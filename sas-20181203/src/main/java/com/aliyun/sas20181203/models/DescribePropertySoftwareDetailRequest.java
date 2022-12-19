// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertySoftwareDetailRequest extends TeaModel {
    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // Specifies whether fuzzy search by software name is supported. If you want to use fuzzy search, set the parameter to 1. If you set the parameter to a different value or leave the parameter empty, fuzzy search is not supported.
    @NameInMap("Extend")
    public String extend;

    // The timestamp at which the software update ends. Unit: milliseconds.
    @NameInMap("InstallTimeEnd")
    public Long installTimeEnd;

    // The timestamp at which the software update starts. Unit: milliseconds.
    @NameInMap("InstallTimeStart")
    public Long installTimeStart;

    // The name of the software.
    @NameInMap("Name")
    public String name;

    // The number of entries to return on each page. Default value: **10**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The installation path of the software.
    @NameInMap("Path")
    public String path;

    // The name or IP address of the server.
    @NameInMap("Remark")
    public String remark;

    // The version of the software.
    @NameInMap("SoftwareVersion")
    public String softwareVersion;

    // The UUID of the server.
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
