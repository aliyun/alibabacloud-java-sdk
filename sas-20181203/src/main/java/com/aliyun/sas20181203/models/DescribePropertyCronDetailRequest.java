// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyCronDetailRequest extends TeaModel {
    /**
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The details of the scheduled tasks.</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The public IP address of the server.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>Specifies whether fuzzy search by path to the scheduled task is supported. If you want to use fuzzy search, set the parameter to **1**. If you set the parameter to a different value or leave the parameter empty, fuzzy search is not supported.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The path to the scheduled task.</p>
     */
    @NameInMap("User")
    public String user;

    /**
     * <p>50d213b4-3a35-427a-b8a5-04b0c7e1****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribePropertyCronDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyCronDetailRequest self = new DescribePropertyCronDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribePropertyCronDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePropertyCronDetailRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public DescribePropertyCronDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePropertyCronDetailRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribePropertyCronDetailRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribePropertyCronDetailRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

    public DescribePropertyCronDetailRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
