// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedStatisticsDetailRequest extends TeaModel {
    /**
     * <p>The query condition.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
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
     * <p>The public IP address that is exposed on the Internet for the asset to query.</p>
     * 
     * <strong>example:</strong>
     * <p>116.12.XX.XX</p>
     */
    @NameInMap("ExposureIp")
    public String exposureIp;

    /**
     * <p>The instance ID of the asset to query.</p>
     * 
     * <strong>example:</strong>
     * <p>s-bp1g6wxdwps7s9dz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of entries per page in a paged query. Default value: 20. If you leave this parameter empty, 20 entries are returned per page.</p>
     * <blockquote>
     * <p>Set PageSize to a non-empty value.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The Alibaba Cloud account ID of the member accounts in the resource folder.</p>
     * <blockquote>
     * <p>Invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1232428423234****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The type of statistics to query. Valid values:</p>
     * <ul>
     * <li><strong>exposureType</strong>: gateway assets exposed on the Internet.</li>
     * <li><strong>exposurePort</strong>: ports exposed on the Internet.</li>
     * <li><strong>exposureComponent</strong>: system components exposed on the Internet.</li>
     * <li><strong>exposureIp</strong>: IP addresses exposed on the Internet.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exposureType</p>
     */
    @NameInMap("StatisticsType")
    public String statisticsType;

    /**
     * <p>The Asset Type of the gateway to query. This parameter takes effect only when <strong>StatisticsType</strong> is set to <strong>exposureType</strong>. Valid values:</p>
     * <ul>
     * <li><strong>SLB</strong>: public IP address of a load balancing SLB instance.</li>
     * <li><strong>DNAT</strong>: NAT gateway that uses the DNAT feature to connect to the Internet.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SLB</p>
     */
    @NameInMap("StatisticsTypeGatewayType")
    public String statisticsTypeGatewayType;

    /**
     * <p>The instance ID of the gateway to query. This parameter takes effect only when <strong>StatisticsType</strong> is set to <strong>exposureType</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-2ze4rso39h4nczcqs****</p>
     */
    @NameInMap("StatisticsTypeInstanceValue")
    public String statisticsTypeInstanceValue;

    /**
     * <p>The UUID of the server to query.</p>
     * 
     * <strong>example:</strong>
     * <p>c9107c04-942f-40c1-981a-f1c1***</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribeExposedStatisticsDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedStatisticsDetailRequest self = new DescribeExposedStatisticsDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExposedStatisticsDetailRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public DescribeExposedStatisticsDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeExposedStatisticsDetailRequest setExposureIp(String exposureIp) {
        this.exposureIp = exposureIp;
        return this;
    }
    public String getExposureIp() {
        return this.exposureIp;
    }

    public DescribeExposedStatisticsDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeExposedStatisticsDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeExposedStatisticsDetailRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeExposedStatisticsDetailRequest setStatisticsType(String statisticsType) {
        this.statisticsType = statisticsType;
        return this;
    }
    public String getStatisticsType() {
        return this.statisticsType;
    }

    public DescribeExposedStatisticsDetailRequest setStatisticsTypeGatewayType(String statisticsTypeGatewayType) {
        this.statisticsTypeGatewayType = statisticsTypeGatewayType;
        return this;
    }
    public String getStatisticsTypeGatewayType() {
        return this.statisticsTypeGatewayType;
    }

    public DescribeExposedStatisticsDetailRequest setStatisticsTypeInstanceValue(String statisticsTypeInstanceValue) {
        this.statisticsTypeInstanceValue = statisticsTypeInstanceValue;
        return this;
    }
    public String getStatisticsTypeInstanceValue() {
        return this.statisticsTypeInstanceValue;
    }

    public DescribeExposedStatisticsDetailRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
