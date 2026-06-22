// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeIdcProbeScanResultListRequest extends TeaModel {
    /**
     * <p>The search conditions for assets. This parameter is in JSON format. Parameter names are case-sensitive.</p>
     * <blockquote>
     * <p>You can search for assets by instance ID, instance name, VPC ID, region, or public IP address.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;name\&quot;:\&quot;scannedIp\&quot;,\&quot;value\&quot;:\&quot;192.168.2.11\&quot;}]</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The page number of the current page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end time of the scan discovery period.</p>
     * 
     * <strong>example:</strong>
     * <p>1720006819000</p>
     */
    @NameInMap("FoundEndTime")
    public Long foundEndTime;

    /**
     * <p>The start time of the scan discovery period.</p>
     * 
     * <strong>example:</strong>
     * <p>1720006818000</p>
     */
    @NameInMap("FoundStartTime")
    public Long foundStartTime;

    /**
     * <p>The logical relationship between multiple search conditions. Valid values:</p>
     * <ul>
     * <li><strong>OR</strong>: The search conditions are in a logical <strong>OR</strong> relationship.</li>
     * <li><strong>AND</strong>: The search conditions are in a logical <strong>AND</strong> relationship.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OR</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>The maximum number of entries per page in a paged query. Default value: 20. If you leave this parameter empty, 20 entries are returned per page.</p>
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
     * <p>The status list of the corresponding probes. Separate multiple values with commas. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: active</li>
     * <li><strong>1</strong>: ignored</li>
     * <li><strong>2</strong>: invalid</li>
     * <li><strong>3</strong>: expired</li>
     * <li><strong>4</strong>: probe does not exist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0,1</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeIdcProbeScanResultListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIdcProbeScanResultListRequest self = new DescribeIdcProbeScanResultListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIdcProbeScanResultListRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public DescribeIdcProbeScanResultListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeIdcProbeScanResultListRequest setFoundEndTime(Long foundEndTime) {
        this.foundEndTime = foundEndTime;
        return this;
    }
    public Long getFoundEndTime() {
        return this.foundEndTime;
    }

    public DescribeIdcProbeScanResultListRequest setFoundStartTime(Long foundStartTime) {
        this.foundStartTime = foundStartTime;
        return this;
    }
    public Long getFoundStartTime() {
        return this.foundStartTime;
    }

    public DescribeIdcProbeScanResultListRequest setLogicalExp(String logicalExp) {
        this.logicalExp = logicalExp;
        return this;
    }
    public String getLogicalExp() {
        return this.logicalExp;
    }

    public DescribeIdcProbeScanResultListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIdcProbeScanResultListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
