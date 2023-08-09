// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetInternetTupleRequest extends TeaModel {
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
    public java.util.List<String> instanceList;

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
