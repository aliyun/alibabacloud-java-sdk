// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetVbrFlowTopNRequest extends TeaModel {
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    @NameInMap("AttachmentId")
    public String attachmentId;

    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("CenId")
    public String cenId;

    @NameInMap("CloudIp")
    public String cloudIp;

    @NameInMap("CloudPort")
    public String cloudPort;

    @NameInMap("Direction")
    public String direction;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("GroupBy")
    public String groupBy;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("OtherIp")
    public String otherIp;

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

    @NameInMap("UseMultiAccount")
    public Boolean useMultiAccount;

    @NameInMap("VirtualBorderRouterId")
    public String virtualBorderRouterId;

    public static GetVbrFlowTopNRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVbrFlowTopNRequest self = new GetVbrFlowTopNRequest();
        return TeaModel.build(map, self);
    }

    public GetVbrFlowTopNRequest setAccountIds(java.util.List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    public GetVbrFlowTopNRequest setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }
    public String getAttachmentId() {
        return this.attachmentId;
    }

    public GetVbrFlowTopNRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetVbrFlowTopNRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public GetVbrFlowTopNRequest setCloudIp(String cloudIp) {
        this.cloudIp = cloudIp;
        return this;
    }
    public String getCloudIp() {
        return this.cloudIp;
    }

    public GetVbrFlowTopNRequest setCloudPort(String cloudPort) {
        this.cloudPort = cloudPort;
        return this;
    }
    public String getCloudPort() {
        return this.cloudPort;
    }

    public GetVbrFlowTopNRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public GetVbrFlowTopNRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetVbrFlowTopNRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public GetVbrFlowTopNRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetVbrFlowTopNRequest setOtherIp(String otherIp) {
        this.otherIp = otherIp;
        return this;
    }
    public String getOtherIp() {
        return this.otherIp;
    }

    public GetVbrFlowTopNRequest setOtherPort(String otherPort) {
        this.otherPort = otherPort;
        return this;
    }
    public String getOtherPort() {
        return this.otherPort;
    }

    public GetVbrFlowTopNRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public GetVbrFlowTopNRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetVbrFlowTopNRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public GetVbrFlowTopNRequest setTopN(Integer topN) {
        this.topN = topN;
        return this;
    }
    public Integer getTopN() {
        return this.topN;
    }

    public GetVbrFlowTopNRequest setUseMultiAccount(Boolean useMultiAccount) {
        this.useMultiAccount = useMultiAccount;
        return this;
    }
    public Boolean getUseMultiAccount() {
        return this.useMultiAccount;
    }

    public GetVbrFlowTopNRequest setVirtualBorderRouterId(String virtualBorderRouterId) {
        this.virtualBorderRouterId = virtualBorderRouterId;
        return this;
    }
    public String getVirtualBorderRouterId() {
        return this.virtualBorderRouterId;
    }

}
