// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedStatisticsDetailRequest extends TeaModel {
    /**
     * <p>The search condition for components.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("ExposureIp")
    public String exposureIp;

    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
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
     * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127608589417****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The type of the exposed asset. Valid values:</p>
     * <ul>
     * <li><strong>exposureType</strong>: gateway assets</li>
     * <li><strong>exposurePort</strong>: ports</li>
     * <li><strong>exposureComponent</strong>: system components</li>
     * <li><strong>exposureIp</strong>: IP addresses</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exposureType</p>
     */
    @NameInMap("StatisticsType")
    public String statisticsType;

    /**
     * <p>The type of the gateway asset. This parameter is required when the <strong>StatisticsType</strong> parameter is set to <strong>exposureType</strong>. Valid values:</p>
     * <ul>
     * <li><strong>SLB</strong>: the public IP address of a Server Load Balancer (SLB) instance</li>
     * <li><strong>DNAT</strong>: the NAT gateway that connects to the Internet by using the DNAT feature</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SLB</p>
     */
    @NameInMap("StatisticsTypeGatewayType")
    public String statisticsTypeGatewayType;

    /**
     * <p>The ID of the gateway asset. This parameter is required when the <strong>StatisticsType</strong> parameter is set to <strong>exposureType</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-2ze4rso39h4nczcqs****</p>
     */
    @NameInMap("StatisticsTypeInstanceValue")
    public String statisticsTypeInstanceValue;

    /**
     * <p>The UUID of the server.</p>
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
