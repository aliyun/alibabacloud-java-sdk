// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetInternetTupleRequest extends TeaModel {
    /**
     * <p>The IDs of member accounts.</p>
     */
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    /**
     * <p>The beginning of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The local IP address.</p>
     */
    @NameInMap("CloudIp")
    public String cloudIp;

    /**
     * <p>The local Internet service provider (ISP).</p>
     * <br>
     * <p>> In most cases, the value is Alibaba or Alibaba Cloud.</p>
     */
    @NameInMap("CloudIsp")
    public String cloudIsp;

    /**
     * <p>The local port.</p>
     * <br>
     * <p>> This parameter is required only when you set **TupleType** to **5**.</p>
     */
    @NameInMap("CloudPort")
    public String cloudPort;

    /**
     * <p>The direction of the Internet traffic that you want to query. Valid values:</p>
     * <br>
     * <p>- **in**: inbound</p>
     * <p>- **out**: outbound</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The end of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the Alibaba Cloud instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance IDs for filtering.</p>
     */
    @NameInMap("InstanceList")
    public java.util.List<String> instanceList;

    /**
     * <p>The metric for instance ranking. Default value: **ByteCount**. This value specifies that instances are ranked by traffic volume.</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The remote city.</p>
     * <br>
     * <p>> This parameter is required only if you set **TupleType** to **5**.</p>
     */
    @NameInMap("OtherCity")
    public String otherCity;

    /**
     * <p>The remote country.</p>
     * <br>
     * <p>> This parameter is required only if you set **TupleType** to **5**.</p>
     */
    @NameInMap("OtherCountry")
    public String otherCountry;

    /**
     * <p>The remote IP address.</p>
     * <br>
     * <p>> This parameter is required only when you set **TupleType** to **2** or **5**.</p>
     */
    @NameInMap("OtherIp")
    public String otherIp;

    /**
     * <p>The remote ISP.</p>
     * <br>
     * <p>> This parameter is required if you want to view the information about the remote ISP.</p>
     */
    @NameInMap("OtherIsp")
    public String otherIsp;

    /**
     * <p>The remote port.</p>
     * <br>
     * <p>> This parameter is required only when you set **TupleType** to **5**.</p>
     */
    @NameInMap("OtherPort")
    public String otherPort;

    /**
     * <p>The protocol number.</p>
     * <br>
     * <p>> All protocols are supported. This parameter is required only when you set **TupleType** to **5**.</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The ID of the region for which you want to query the Internet traffic.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The order in which instances are ranked by Internet traffic. Valid values:</p>
     * <br>
     * <p>- **desc**: the descending order</p>
     * <p>- **asc**: the ascending order</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>Specifies top-N traffic data to display. Default value: **10**. This value specifies to display top-10 traffic data by default.</p>
     */
    @NameInMap("TopN")
    public Integer topN;

    /**
     * <p>The type of the tuple. Valid values:</p>
     * <br>
     * <p>- **1**: 1-tuple</p>
     * <p>- **2**: 2-tuples</p>
     * <p>- **5**: 5-tuples</p>
     */
    @NameInMap("TupleType")
    public Integer tupleType;

    /**
     * <p>Specifies whether to enable the multi-account management feature. Default value: **false**. This value specifies that the multi-account management feature is disabled.</p>
     * <br>
     * <p>> By default, the multi-account management feature is disabled. If you want to enable this feature, contact your customer business manager.</p>
     */
    @NameInMap("UseMultiAccount")
    public Boolean useMultiAccount;

    public static GetInternetTupleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInternetTupleRequest self = new GetInternetTupleRequest();
        return TeaModel.build(map, self);
    }

    public GetInternetTupleRequest setAccountIds(java.util.List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    public GetInternetTupleRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetInternetTupleRequest setCloudIp(String cloudIp) {
        this.cloudIp = cloudIp;
        return this;
    }
    public String getCloudIp() {
        return this.cloudIp;
    }

    public GetInternetTupleRequest setCloudIsp(String cloudIsp) {
        this.cloudIsp = cloudIsp;
        return this;
    }
    public String getCloudIsp() {
        return this.cloudIsp;
    }

    public GetInternetTupleRequest setCloudPort(String cloudPort) {
        this.cloudPort = cloudPort;
        return this;
    }
    public String getCloudPort() {
        return this.cloudPort;
    }

    public GetInternetTupleRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public GetInternetTupleRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetInternetTupleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInternetTupleRequest setInstanceList(java.util.List<String> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<String> getInstanceList() {
        return this.instanceList;
    }

    public GetInternetTupleRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetInternetTupleRequest setOtherCity(String otherCity) {
        this.otherCity = otherCity;
        return this;
    }
    public String getOtherCity() {
        return this.otherCity;
    }

    public GetInternetTupleRequest setOtherCountry(String otherCountry) {
        this.otherCountry = otherCountry;
        return this;
    }
    public String getOtherCountry() {
        return this.otherCountry;
    }

    public GetInternetTupleRequest setOtherIp(String otherIp) {
        this.otherIp = otherIp;
        return this;
    }
    public String getOtherIp() {
        return this.otherIp;
    }

    public GetInternetTupleRequest setOtherIsp(String otherIsp) {
        this.otherIsp = otherIsp;
        return this;
    }
    public String getOtherIsp() {
        return this.otherIsp;
    }

    public GetInternetTupleRequest setOtherPort(String otherPort) {
        this.otherPort = otherPort;
        return this;
    }
    public String getOtherPort() {
        return this.otherPort;
    }

    public GetInternetTupleRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public GetInternetTupleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetInternetTupleRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public GetInternetTupleRequest setTopN(Integer topN) {
        this.topN = topN;
        return this;
    }
    public Integer getTopN() {
        return this.topN;
    }

    public GetInternetTupleRequest setTupleType(Integer tupleType) {
        this.tupleType = tupleType;
        return this;
    }
    public Integer getTupleType() {
        return this.tupleType;
    }

    public GetInternetTupleRequest setUseMultiAccount(Boolean useMultiAccount) {
        this.useMultiAccount = useMultiAccount;
        return this;
    }
    public Boolean getUseMultiAccount() {
        return this.useMultiAccount;
    }

}
