// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetInternetTupleShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of member accounts.</p>
     */
    @NameInMap("AccountIds")
    public java.util.List<Long> accountIds;

    /**
     * <p>The beginning of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1684373600099</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The local IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>112.74.XX.XX</p>
     */
    @NameInMap("CloudIp")
    public String cloudIp;

    /**
     * <p>The local IP addresses for filtering.</p>
     */
    @NameInMap("CloudIpList")
    public String cloudIpListShrink;

    /**
     * <p>The local Internet service provider (ISP).</p>
     * <blockquote>
     * <p> In most cases, the value is Alibaba or Alibaba Cloud.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Alibaba</p>
     */
    @NameInMap("CloudIsp")
    public String cloudIsp;

    /**
     * <p>The local port.</p>
     * <blockquote>
     * <p> This parameter is required only if you set GroupBy to CloudPort.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>443</p>
     */
    @NameInMap("CloudPort")
    public String cloudPort;

    /**
     * <p>The direction of the Internet traffic that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>in</strong>: inbound</li>
     * <li><strong>out</strong>: outbound</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The end of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1684373700099</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the Alibaba Cloud instance.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-sample*</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance IDs for filtering.</p>
     */
    @NameInMap("InstanceList")
    public String instanceListShrink;

    /**
     * <p>The metric for data ranking. Default value: <strong>ByteCount</strong>. This value indicates that Internet traffic data is ranked by traffic volume.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Rtt</li>
     * <li>ByteCount</li>
     * <li>PacketCount</li>
     * <li>RetransmitRate</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ByteCount</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The remote city.</p>
     * <blockquote>
     * <p> This parameter is required only if you set <strong>TupleType</strong> to <strong>2</strong> or <strong>5</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Hangzhou</p>
     */
    @NameInMap("OtherCity")
    public String otherCity;

    /**
     * <p>The remote country.</p>
     * <blockquote>
     * <p> This parameter is required only if you set <strong>TupleType</strong> to <strong>2</strong> or <strong>5</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>China</p>
     */
    @NameInMap("OtherCountry")
    public String otherCountry;

    /**
     * <p>The remote IP address.</p>
     * <blockquote>
     * <p>This parameter is required only when you set <strong>TupleType</strong> to <strong>2</strong> or <strong>5</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>122.112.XX.XX</p>
     */
    @NameInMap("OtherIp")
    public String otherIp;

    /**
     * <p>The remote ISP.</p>
     * <blockquote>
     * <p>This parameter is required if you want to view the information about the remote ISP.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>China Mobile</p>
     */
    @NameInMap("OtherIsp")
    public String otherIsp;

    /**
     * <p>The remote port.</p>
     * <blockquote>
     * <p>This parameter is required only when you set <strong>TupleType</strong> to <strong>5</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>40002</p>
     */
    @NameInMap("OtherPort")
    public String otherPort;

    /**
     * <p>The protocol number.</p>
     * <blockquote>
     * <p>All protocols are supported. This parameter is required only when you set <strong>TupleType</strong> to <strong>5</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The ID of the region for which you want to query the Internet traffic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The order in which instances are ranked by Internet traffic. Valid values:</p>
     * <ul>
     * <li><strong>desc</strong>: the descending order</li>
     * <li><strong>asc</strong>: the ascending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>Specifies top-N traffic data to display. Default value: <strong>10</strong>. This value specifies to display top-10 traffic data by default. Max value: <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopN")
    public Integer topN;

    /**
     * <p>The type of the tuple. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: 1-tuple</li>
     * <li><strong>2</strong>: 2-tuple</li>
     * <li><strong>5</strong>: 5-tuple</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TupleType")
    public Integer tupleType;

    /**
     * <p>Specifies whether to enable the multi-account management feature. Default value: <strong>false</strong>. This value specifies that the multi-account management feature is disabled.</p>
     * <blockquote>
     * <p> By default, the multi-account management feature is not available. If you want to use this feature, contact your account manager to apply for permissions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseMultiAccount")
    public Boolean useMultiAccount;

    public static GetInternetTupleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInternetTupleShrinkRequest self = new GetInternetTupleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetInternetTupleShrinkRequest setAccountIds(java.util.List<Long> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<Long> getAccountIds() {
        return this.accountIds;
    }

    public GetInternetTupleShrinkRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetInternetTupleShrinkRequest setCloudIp(String cloudIp) {
        this.cloudIp = cloudIp;
        return this;
    }
    public String getCloudIp() {
        return this.cloudIp;
    }

    public GetInternetTupleShrinkRequest setCloudIpListShrink(String cloudIpListShrink) {
        this.cloudIpListShrink = cloudIpListShrink;
        return this;
    }
    public String getCloudIpListShrink() {
        return this.cloudIpListShrink;
    }

    public GetInternetTupleShrinkRequest setCloudIsp(String cloudIsp) {
        this.cloudIsp = cloudIsp;
        return this;
    }
    public String getCloudIsp() {
        return this.cloudIsp;
    }

    public GetInternetTupleShrinkRequest setCloudPort(String cloudPort) {
        this.cloudPort = cloudPort;
        return this;
    }
    public String getCloudPort() {
        return this.cloudPort;
    }

    public GetInternetTupleShrinkRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public GetInternetTupleShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetInternetTupleShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInternetTupleShrinkRequest setInstanceListShrink(String instanceListShrink) {
        this.instanceListShrink = instanceListShrink;
        return this;
    }
    public String getInstanceListShrink() {
        return this.instanceListShrink;
    }

    public GetInternetTupleShrinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetInternetTupleShrinkRequest setOtherCity(String otherCity) {
        this.otherCity = otherCity;
        return this;
    }
    public String getOtherCity() {
        return this.otherCity;
    }

    public GetInternetTupleShrinkRequest setOtherCountry(String otherCountry) {
        this.otherCountry = otherCountry;
        return this;
    }
    public String getOtherCountry() {
        return this.otherCountry;
    }

    public GetInternetTupleShrinkRequest setOtherIp(String otherIp) {
        this.otherIp = otherIp;
        return this;
    }
    public String getOtherIp() {
        return this.otherIp;
    }

    public GetInternetTupleShrinkRequest setOtherIsp(String otherIsp) {
        this.otherIsp = otherIsp;
        return this;
    }
    public String getOtherIsp() {
        return this.otherIsp;
    }

    public GetInternetTupleShrinkRequest setOtherPort(String otherPort) {
        this.otherPort = otherPort;
        return this;
    }
    public String getOtherPort() {
        return this.otherPort;
    }

    public GetInternetTupleShrinkRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public GetInternetTupleShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetInternetTupleShrinkRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public GetInternetTupleShrinkRequest setTopN(Integer topN) {
        this.topN = topN;
        return this;
    }
    public Integer getTopN() {
        return this.topN;
    }

    public GetInternetTupleShrinkRequest setTupleType(Integer tupleType) {
        this.tupleType = tupleType;
        return this;
    }
    public Integer getTupleType() {
        return this.tupleType;
    }

    public GetInternetTupleShrinkRequest setUseMultiAccount(Boolean useMultiAccount) {
        this.useMultiAccount = useMultiAccount;
        return this;
    }
    public Boolean getUseMultiAccount() {
        return this.useMultiAccount;
    }

}
