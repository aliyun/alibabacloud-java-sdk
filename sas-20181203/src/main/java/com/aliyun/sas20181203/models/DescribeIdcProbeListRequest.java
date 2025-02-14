// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeIdcProbeListRequest extends TeaModel {
    /**
     * <p>Sets the page number from which to start displaying the query results. The default value is 1, indicating that the display starts from the first page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the IDC.</p>
     * 
     * <strong>example:</strong>
     * <p>3K IDC</p>
     */
    @NameInMap("IdcName")
    public String idcName;

    /**
     * <p>Specifies the maximum number of data entries to display per page in a paginated query. The default number of data entries per page is 20, and if the PageSize parameter is empty, it will default to returning 20 data entries.</p>
     * <blockquote>
     * <p>It is recommended that the PageSize value is not empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Probe status. Values:</p>
     * <ul>
     * <li><strong>0</strong>: Enabled</li>
     * <li><strong>1</strong>: Disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static DescribeIdcProbeListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIdcProbeListRequest self = new DescribeIdcProbeListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIdcProbeListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeIdcProbeListRequest setIdcName(String idcName) {
        this.idcName = idcName;
        return this;
    }
    public String getIdcName() {
        return this.idcName;
    }

    public DescribeIdcProbeListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIdcProbeListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
