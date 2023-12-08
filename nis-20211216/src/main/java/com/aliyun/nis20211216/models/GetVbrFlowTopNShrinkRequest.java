// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetVbrFlowTopNShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of member accounts.</p>
     */
    @NameInMap("AccountIds")
    public String accountIdsShrink;

    /**
     * <p>The CEN connection ID.</p>
     */
    @NameInMap("AttachmentId")
    public String attachmentId;

    /**
     * <p>The beginning of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. The maximum time range that you can query is 24 hours.</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The CEN instance ID.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The local IP address.</p>
     */
    @NameInMap("CloudIp")
    public String cloudIp;

    /**
     * <p>The local port.</p>
     * <br>
     * <p>>  This parameter is required only if you set GroupBy to CloudPort.</p>
     */
    @NameInMap("CloudPort")
    public String cloudPort;

    /**
     * <p>The direction of the hybrid cloud traffic in the local regions or for the local IP addresses. Valid values:</p>
     * <br>
     * <p>*   in: traffic from a data center to Alibaba Cloud</p>
     * <p>*   out: traffic from Alibaba Cloud to a data center</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The end of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. The maximum time range that you can query is 24 hours.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The dimension for ranking hybrid cloud traffic data. The value of this parameter is case-sensitive. Valid values:</p>
     * <br>
     * <p>*   1Tuple: queries the rankings of hybrid cloud traffic data for the Cloud Enterprise Network (CEN) instances, CEN connections, virtual border routers (VBRs), and IP addresses.</p>
     * <p>*   2Tuple: queries the rankings of hybrid cloud traffic data for the local and remote IP addresses.</p>
     * <p>*   5Tuple: queries the rankings of hybrid cloud traffic data for the local and remote IP addresses, local and remote ports, and protocols.</p>
     * <p>*   CloudPort: queries the rankings of hybrid cloud traffic data for the local ports.</p>
     * <p>*   OtherPort: queries the rankings of hybrid cloud traffic data for the remote ports.</p>
     * <p>*   Protocol: queries the rankings of hybrid cloud traffic data for the protocols.</p>
     */
    @NameInMap("GroupBy")
    public String groupBy;

    /**
     * <p>The metric for ranking hybrid cloud traffic data. Default value: Bytes. This value specifies that hybrid cloud traffic data is ranked by traffic volumes.</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The remote IP address.</p>
     */
    @NameInMap("OtherIp")
    public String otherIp;

    /**
     * <p>The remote port.</p>
     * <br>
     * <p>>  This parameter is required only if you set GroupBy to OtherPort.</p>
     */
    @NameInMap("OtherPort")
    public String otherPort;

    /**
     * <p>The protocol number.</p>
     * <br>
     * <p>>  All protocols are supported. This parameter is required only if you set GroupBy to 5Tuple or Protocol.</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The local region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The order for ranking hybrid cloud traffic data. Valid values:</p>
     * <br>
     * <p>*   desc: descending order</p>
     * <p>*   asc: ascending order</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>Specifies top-N traffic data to display. Default value: **10**. This value specifies that top-10 traffic data is displayed by default. Maximum value: **100**.</p>
     */
    @NameInMap("TopN")
    public Integer topN;

    /**
     * <p>Specifies whether to enable the multi-account management feature. Default value: **false**. This value specifies that the multi-account management feature is disabled.</p>
     * <br>
     * <p>>  By default, the multi-account management feature is not available. If you want to use this feature, contact your account manager to apply for permissions.</p>
     */
    @NameInMap("UseMultiAccount")
    public Boolean useMultiAccount;

    /**
     * <p>The ID of the VBR that is associated with the Express Connect circuit.</p>
     */
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
