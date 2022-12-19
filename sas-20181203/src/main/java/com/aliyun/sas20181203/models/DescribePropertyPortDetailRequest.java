// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyPortDetailRequest extends TeaModel {
    // The IP address that is bound to the listening port.
    @NameInMap("BindIp")
    public String bindIp;

    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // Specifies whether fuzzy search by port number is supported. If you want to use fuzzy search, set the parameter to **1**. If you set the parameter to a different value or leave the parameter empty, fuzzy search is not supported.
    @NameInMap("Extend")
    public String extend;

    // The number of entries to return on each page. Default value: **10**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The listening port of the server.
    @NameInMap("Port")
    public String port;

    // The name of the server process.
    @NameInMap("ProcName")
    public String procName;

    // The name or IP address of the server.
    @NameInMap("Remark")
    public String remark;

    // The UUID of the server.
    @NameInMap("Uuid")
    public String uuid;

    public static DescribePropertyPortDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyPortDetailRequest self = new DescribePropertyPortDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribePropertyPortDetailRequest setBindIp(String bindIp) {
        this.bindIp = bindIp;
        return this;
    }
    public String getBindIp() {
        return this.bindIp;
    }

    public DescribePropertyPortDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePropertyPortDetailRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public DescribePropertyPortDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePropertyPortDetailRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public DescribePropertyPortDetailRequest setProcName(String procName) {
        this.procName = procName;
        return this;
    }
    public String getProcName() {
        return this.procName;
    }

    public DescribePropertyPortDetailRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribePropertyPortDetailRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
