// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetNatTopNRequest extends TeaModel {
    /**
     * <p>The beginning of the time range to query in milliseconds. If you do not specify <strong>EndTime</strong>, the point in time specified by <strong>BeginTime</strong> is queried.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1638239092000</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The end of the time range to query in milliseconds. The time range specified by <strong>BeginTime</strong> and <strong>EndTime</strong> cannot exceed <strong>86400000</strong> milliseconds (24 hours).</p>
     * 
     * <strong>example:</strong>
     * <p>1638239093000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Query ranking statistics for a specific IP address. If you specify this parameter, you do not need to specify <strong>TopN</strong> or <strong>OrderBy</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.156.101</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The ID of the NAT gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-sample***</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The metric that is used for real-time SNAT performance ranking. Valid values:</p>
     * <ul>
     * <li><strong>InBps</strong>: inbound data transfer. Unit: bit/s.</li>
     * <li><strong>OutBps</strong>: outbound data transfer. Unit: bit/s.</li>
     * <li><strong>InPps</strong>: inbound packet forwarding rate. Unit: packets per second.</li>
     * <li><strong>OutPps</strong>: outbound packet forwarding rate. Unit: packets per second.</li>
     * <li><strong>NewSessionPerSecond</strong>: new connection creation rate. Unit: connections per second.</li>
     * <li><strong>ActiveSessionCount</strong>: number of concurrent connections. Unit: connections.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InBps</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The ID of the region in which the NAT gateway is deployed.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of entries to return for real-time SNAT performance ranking. Valid values: <strong>1 to 100</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopN")
    public Integer topN;

    public static GetNatTopNRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNatTopNRequest self = new GetNatTopNRequest();
        return TeaModel.build(map, self);
    }

    public GetNatTopNRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetNatTopNRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetNatTopNRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public GetNatTopNRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public GetNatTopNRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetNatTopNRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetNatTopNRequest setTopN(Integer topN) {
        this.topN = topN;
        return this;
    }
    public Integer getTopN() {
        return this.topN;
    }

}
