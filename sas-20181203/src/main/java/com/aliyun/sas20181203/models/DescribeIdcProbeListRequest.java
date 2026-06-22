// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeIdcProbeListRequest extends TeaModel {
    /**
     * <p>The page number of the page to return. Default value: 1, which indicates that the first page is returned.</p>
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
     * <p>The maximum number of entries per page when paging. Default value: 20. If you leave this parameter empty, 20 entries are returned per page.</p>
     * <blockquote>
     * <p>Do not leave PageSize empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The usage status of the probe. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: enabled</li>
     * <li><strong>1</strong>: disabled.</li>
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
