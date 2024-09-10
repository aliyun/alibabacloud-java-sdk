// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeIdcProbeScanResultListRequest extends TeaModel {
    /**
     * <p>The search conditions for assets. This parameter is in the JSON format. The value is case-sensitive.</p>
     * <blockquote>
     * <p> A search condition can be the instance ID, instance name, VPC ID, region, or public IP address. You can call the <a href="https://help.aliyun.com/document_detail/2842671.html">DescribeIdcAssetCriteria</a> operation to query supported search conditions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;name\&quot;:\&quot;scannedIp\&quot;,\&quot;value\&quot;:\&quot;192.168.2.11\&quot;}]</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end time of the scan.</p>
     * 
     * <strong>example:</strong>
     * <p>1720006819000</p>
     */
    @NameInMap("FoundEndTime")
    public Long foundEndTime;

    /**
     * <p>The start time of the scan.</p>
     * 
     * <strong>example:</strong>
     * <p>1720006818000</p>
     */
    @NameInMap("FoundStartTime")
    public Long foundStartTime;

    /**
     * <p>The logical operator that combines multiple search conditions. Valid values:</p>
     * <ul>
     * <li><strong>OR</strong>****</li>
     * <li><strong>AND</strong>****</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OR</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <blockquote>
     * <p> We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The statuses of the corresponding probes. Separate multiple values with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The probe is valid.</li>
     * <li><strong>1</strong>: The probe is ignored.</li>
     * <li><strong>2</strong>: The probe is invalid.</li>
     * <li><strong>3</strong>: The probe expired.</li>
     * <li><strong>4</strong>: The probe does not exist.</li>
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
