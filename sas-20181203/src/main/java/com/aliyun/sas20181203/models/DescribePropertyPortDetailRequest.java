// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyPortDetailRequest extends TeaModel {
    /**
     * <p>The network protocol that is used by the listening port.</p>
     */
    @NameInMap("BindIp")
    public String bindIp;

    /**
     * <p>The name of the server process.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The listening port.</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>50d213b4-3a35-427a-b8a5-04b0c7e1****</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The public IP address of the server.</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The IP address that is bound to the listening port.</p>
     */
    @NameInMap("ProcName")
    public String procName;

    /**
     * <p>The number of entries to return on each page. Default value: **10**.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The listening port of the server.</p>
     */
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
