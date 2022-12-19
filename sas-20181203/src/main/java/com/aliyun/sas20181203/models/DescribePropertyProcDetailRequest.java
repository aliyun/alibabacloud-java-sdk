// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyProcDetailRequest extends TeaModel {
    // The startup parameter of the process.
    @NameInMap("Cmdline")
    public String cmdline;

    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // Specifies whether fuzzy search by process name is supported. If you want to use fuzzy search, set the parameter to 1. If you set the parameter to a different value or leave the parameter empty, fuzzy search is not supported.
    @NameInMap("Extend")
    public String extend;

    // The name of the process.
    @NameInMap("Name")
    public String name;

    // The number of entries to return on each page. Default value: **10**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The timestamp when the process ends. Unit: milliseconds.
    @NameInMap("ProcTimeEnd")
    public Long procTimeEnd;

    // The timestamp when the process starts. Unit: milliseconds.
    @NameInMap("ProcTimeStart")
    public Long procTimeStart;

    // The name or IP address of the server.
    @NameInMap("Remark")
    public String remark;

    // The user who runs the process.
    @NameInMap("User")
    public String user;

    // The UUID of the server.
    @NameInMap("Uuid")
    public String uuid;

    public static DescribePropertyProcDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyProcDetailRequest self = new DescribePropertyProcDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribePropertyProcDetailRequest setCmdline(String cmdline) {
        this.cmdline = cmdline;
        return this;
    }
    public String getCmdline() {
        return this.cmdline;
    }

    public DescribePropertyProcDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePropertyProcDetailRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public DescribePropertyProcDetailRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribePropertyProcDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePropertyProcDetailRequest setProcTimeEnd(Long procTimeEnd) {
        this.procTimeEnd = procTimeEnd;
        return this;
    }
    public Long getProcTimeEnd() {
        return this.procTimeEnd;
    }

    public DescribePropertyProcDetailRequest setProcTimeStart(Long procTimeStart) {
        this.procTimeStart = procTimeStart;
        return this;
    }
    public Long getProcTimeStart() {
        return this.procTimeStart;
    }

    public DescribePropertyProcDetailRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribePropertyProcDetailRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

    public DescribePropertyProcDetailRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
