// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetVbrFlowTopNRequest extends TeaModel {
    /**
     * <p>The IDs of member accounts.</p>
     */
    @NameInMap("AccountIds")
    public java.util.List<Long> accountIds;

    /**
     * <p>The CEN connection ID.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-attach-dnv870gmqzmb5u****</p>
     */
    @NameInMap("AttachmentId")
    public String attachmentId;

    /**
     * <p>The beginning of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. The maximum time range that you can query is 24 hours.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1638239092000</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The CEN instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-ia8kw1zjv4hyal****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The local IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>112.74.XX.XX</p>
     */
    @NameInMap("CloudIp")
    public String cloudIp;

    /**
     * <p>The local port.</p>
     * <blockquote>
     * <p> This parameter is required only if you set <strong>GroupBy</strong> to <strong>CloudPort</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>443</p>
     */
    @NameInMap("CloudPort")
    public String cloudPort;

    /**
     * <p>The direction of the hybrid cloud traffic in the local regions or for the local IP addresses. Valid values:</p>
     * <ul>
     * <li><strong>in</strong>: traffic from a data center to Alibaba Cloud</li>
     * <li><strong>out</strong>: traffic from Alibaba Cloud to a data center</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The end of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. The maximum time range that you can query is 24 hours.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1638239093000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The dimension for ranking hybrid cloud traffic data. The value of this parameter is case-sensitive. Valid values:</p>
     * <ul>
     * <li><strong>1Tuple</strong>: queries the rankings of hybrid cloud traffic data for the Cloud Enterprise Network (CEN) instances, CEN connections, virtual border routers (VBRs), and IP addresses.</li>
     * <li><strong>2Tuple</strong>: queries the rankings of hybrid cloud traffic data for the local and remote IP addresses.</li>
     * <li><strong>5Tuple</strong>: queries the rankings of hybrid cloud traffic data for the local and remote IP addresses, local and remote ports, and protocols.</li>
     * <li><strong>CloudPort</strong>: queries the rankings of hybrid cloud traffic data for the local ports.</li>
     * <li><strong>OtherPort</strong>: queries the rankings of hybrid cloud traffic data for the remote ports.</li>
     * <li><strong>Protocol</strong>: queries the rankings of hybrid cloud traffic data for the protocols.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1Tuple</p>
     */
    @NameInMap("GroupBy")
    public String groupBy;

    /**
     * <p>The metric for ranking hybrid cloud traffic data. Default value: Bytes. This value specifies that hybrid cloud traffic data is ranked by traffic volumes.</p>
     * 
     * <strong>example:</strong>
     * <p>Bytes</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The remote IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>122.112.XX.XX</p>
     */
    @NameInMap("OtherIp")
    public String otherIp;

    /**
     * <p>The remote port.</p>
     * <blockquote>
     * <p> This parameter is required only if you set <strong>GroupBy</strong> to <strong>OtherPort</strong>.</p>
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
     * <p> All protocols are supported. This parameter is required only if you set <strong>GroupBy</strong> to <strong>5Tuple</strong> or <strong>Protocol</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The local region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The order for ranking hybrid cloud traffic data. Valid values:</p>
     * <ul>
     * <li><strong>desc</strong>: descending order</li>
     * <li><strong>asc</strong>: ascending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>Specifies top-N traffic data to display. Default value: <strong>10</strong>. This value specifies that top-10 traffic data is displayed by default. Maximum value: <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopN")
    public Integer topN;

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

    /**
     * <p>The ID of the VBR that is associated with the Express Connect circuit.</p>
     * 
     * <strong>example:</strong>
     * <p>vbr-k1atj46citwuek42j****</p>
     */
    @NameInMap("VirtualBorderRouterId")
    public String virtualBorderRouterId;

    public static GetVbrFlowTopNRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVbrFlowTopNRequest self = new GetVbrFlowTopNRequest();
        return TeaModel.build(map, self);
    }

    public GetVbrFlowTopNRequest setAccountIds(java.util.List<Long> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<Long> getAccountIds() {
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
