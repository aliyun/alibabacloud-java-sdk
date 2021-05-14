// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertySoftwareDetailRequest extends TeaModel {
    @NameInMap("Remark")
    public String remark;

    @NameInMap("Name")
    public String name;

    @NameInMap("Path")
    public String path;

    @NameInMap("SoftwareVersion")
    public String softwareVersion;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribePropertySoftwareDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertySoftwareDetailRequest self = new DescribePropertySoftwareDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribePropertySoftwareDetailRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribePropertySoftwareDetailRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribePropertySoftwareDetailRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
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

    public DescribePropertySoftwareDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePropertySoftwareDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
