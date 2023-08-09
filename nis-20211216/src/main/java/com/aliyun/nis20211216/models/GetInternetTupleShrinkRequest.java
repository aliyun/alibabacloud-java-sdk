// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetInternetTupleShrinkRequest extends TeaModel {
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("CloudIp")
    public String cloudIp;

    @NameInMap("CloudIsp")
    public String cloudIsp;

    @NameInMap("CloudPort")
    public String cloudPort;

    @NameInMap("Direction")
    public String direction;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceList")
    public String instanceListShrink;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("OtherCity")
    public String otherCity;

    @NameInMap("OtherCountry")
    public String otherCountry;

    @NameInMap("OtherIp")
    public String otherIp;

    @NameInMap("OtherIsp")
    public String otherIsp;

    @NameInMap("OtherPort")
    public String otherPort;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Sort")
    public String sort;

    @NameInMap("TopN")
    public Integer topN;

    @NameInMap("TupleType")
    public Integer tupleType;

    @NameInMap("UseMultiAccount")
    public Boolean useMultiAccount;

    public static GetInternetTupleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInternetTupleShrinkRequest self = new GetInternetTupleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetInternetTupleShrinkRequest setAccountIds(java.util.List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<String> getAccountIds() {
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
