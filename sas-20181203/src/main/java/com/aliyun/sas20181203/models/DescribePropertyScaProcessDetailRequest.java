// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribePropertyScaProcessDetailRequest extends TeaModel {
    /**
     * <p>The type of the application process. Default value: <strong>java</strong>. Valid values:</p>
     * <ul>
     * <li><strong>java</strong>: Java process</li>
     * <li><strong>php</strong>: PHP process</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>java</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>The startup parameter.</p>
     * <blockquote>
     * <p>Only prefix match is supported. Fuzzy match is not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>java -jar</p>
     */
    @NameInMap("Cmdline")
    public String cmdline;

    /**
     * <p>The page number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The maximum number of entries to return on each page in a paged query. The default number of entries per page for paging is 10. If this parameter is left empty, 10 entries are returned by default.</p>
     * <blockquote>
     * <p>Specify a value for this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The process ID.</p>
     * <blockquote>
     * <p>Only exact match is supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>756</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The asset information to query. You can set this parameter to the asset name, public IP address, or private IP address. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>10.167.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The UUID of the server.</p>
     * <blockquote>
     * <ul>
     * <li>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain this parameter.</li>
     * <li>Only exact match is supported.</li>
     * </ul>
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

    public DescribePropertyScaProcessDetailRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribePropertyScaProcessDetailRequest setCmdline(String cmdline) {
        this.cmdline = cmdline;
        return this;
    }
    public String getCmdline() {
        return this.cmdline;
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
