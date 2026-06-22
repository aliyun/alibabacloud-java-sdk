// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCustomBlockRecordsRequest extends TeaModel {
    /**
     * <p>The IP address to be blocked for brute-force attacks prevention.</p>
     * 
     * <strong>example:</strong>
     * <p>117.66.XX.XX</p>
     */
    @NameInMap("BlockIp")
    public String blockIp;

    /**
     * <p>The page number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Settings for paged query. The number of records to return on each page during paging. Default value: <strong>20</strong>, which indicates that 20 records are displayed per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The status of the brute-force attacks defense rule. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Invalid.</li>
     * <li><strong>1</strong>: Enabled.</li>
     * <li><strong>2</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static DescribeCustomBlockRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomBlockRecordsRequest self = new DescribeCustomBlockRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomBlockRecordsRequest setBlockIp(String blockIp) {
        this.blockIp = blockIp;
        return this;
    }
    public String getBlockIp() {
        return this.blockIp;
    }

    public DescribeCustomBlockRecordsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCustomBlockRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCustomBlockRecordsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeCustomBlockRecordsRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
