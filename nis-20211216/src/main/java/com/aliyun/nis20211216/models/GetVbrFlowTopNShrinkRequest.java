// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetVbrFlowTopNShrinkRequest extends TeaModel {
    @NameInMap("AccountIds")
    public String accountIdsShrink;

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

    public static GetVbrFlowTopNShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVbrFlowTopNShrinkRequest self = new GetVbrFlowTopNShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetVbrFlowTopNShrinkRequest setAccountIdsShrink(String accountIdsShrink) {
        this.accountIdsShrink = accountIdsShrink;
        return this;
    }
    public String getAccountIdsShrink() {
        return this.accountIdsShrink;
    }

    public GetVbrFlowTopNShrinkRequest setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }
    public String getAttachmentId() {
        return this.attachmentId;
    }

    public GetVbrFlowTopNShrinkRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetVbrFlowTopNShrinkRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public GetVbrFlowTopNShrinkRequest setCloudIp(String cloudIp) {
        this.cloudIp = cloudIp;
        return this;
    }
    public String getCloudIp() {
        return this.cloudIp;
    }

    public GetVbrFlowTopNShrinkRequest setCloudPort(String cloudPort) {
        this.cloudPort = cloudPort;
        return this;
    }
    public String getCloudPort() {
        return this.cloudPort;
    }

    public GetVbrFlowTopNShrinkRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public GetVbrFlowTopNShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetVbrFlowTopNShrinkRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public GetVbrFlowTopNShrinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetVbrFlowTopNShrinkRequest setOtherIp(String otherIp) {
        this.otherIp = otherIp;
        return this;
    }
    public String getOtherIp() {
        return this.otherIp;
    }

    public GetVbrFlowTopNShrinkRequest setOtherPort(String otherPort) {
        this.otherPort = otherPort;
        return this;
    }
    public String getOtherPort() {
        return this.otherPort;
    }

    public GetVbrFlowTopNShrinkRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public GetVbrFlowTopNShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetVbrFlowTopNShrinkRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public GetVbrFlowTopNShrinkRequest setTopN(Integer topN) {
        this.topN = topN;
        return this;
    }
    public Integer getTopN() {
        return this.topN;
    }

    public GetVbrFlowTopNShrinkRequest setUseMultiAccount(Boolean useMultiAccount) {
        this.useMultiAccount = useMultiAccount;
        return this;
    }
    public Boolean getUseMultiAccount() {
        return this.useMultiAccount;
    }

    public GetVbrFlowTopNShrinkRequest setVirtualBorderRouterId(String virtualBorderRouterId) {
        this.virtualBorderRouterId = virtualBorderRouterId;
        return this;
    }
    public String getVirtualBorderRouterId() {
        return this.virtualBorderRouterId;
    }

}
