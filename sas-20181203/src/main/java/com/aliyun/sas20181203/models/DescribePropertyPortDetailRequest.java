// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyPortDetailRequest extends TeaModel {
    @NameInMap("Remark")
    public String remark;

    @NameInMap("Port")
    public String port;

    @NameInMap("ProcName")
    public String procName;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribePropertyPortDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyPortDetailRequest self = new DescribePropertyPortDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribePropertyPortDetailRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
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

    public DescribePropertyPortDetailRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public DescribePropertyPortDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePropertyPortDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
