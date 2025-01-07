// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScaProcessDetailRequest extends TeaModel {
    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries per page. Default value: 10. If you leave this parameter empty, 10 entries are returned on each page.</p>
     * <blockquote>
     * <p> We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the process.</p>
     * 
     * <strong>example:</strong>
     * <p>756</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The information about the server that you want to query. The value can be the public IP address, private IP address, or name of the server. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>10.167.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The UUID of the server.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>D0D6E6E4-CB8C-4897-B852-46AEFDA0****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribePropertyScaProcessDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePropertyScaProcessDetailRequest self = new DescribePropertyScaProcessDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribePropertyScaProcessDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribePropertyScaProcessDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePropertyScaProcessDetailRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public DescribePropertyScaProcessDetailRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribePropertyScaProcessDetailRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
