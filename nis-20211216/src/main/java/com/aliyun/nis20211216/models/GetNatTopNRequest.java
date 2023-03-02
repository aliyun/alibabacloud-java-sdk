// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetNatTopNRequest extends TeaModel {
    /**
     * <p>The beginning of the time range to query in milliseconds. If you do not specify **EndTime**, the point in time specified by **BeginTime** is queried.</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The end of the time range to query in milliseconds. The time range specified by **BeginTime** and **EndTime** cannot exceed **86400000** milliseconds (24 hours).</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Query ranking statistics for a specific IP address. If you specify this parameter, you do not need to specify **TopN** or **OrderBy**.</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The ID of the NAT gateway.</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The metric that is used for real-time SNAT performance ranking. Valid values:</p>
     * <br>
     * <p>*   **InBps**: inbound data transfer. Unit: bit/s.</p>
     * <p>*   **OutBps**: outbound data transfer. Unit: bit/s.</p>
     * <p>*   **InPps**: inbound packet forwarding rate. Unit: packets per second.</p>
     * <p>*   **OutPps**: outbound packet forwarding rate. Unit: packets per second.</p>
     * <p>*   **NewSessionPerSecond**: new connection creation rate. Unit: connections per second.</p>
     * <p>*   **ActiveSessionCount**: number of concurrent connections. Unit: connections.</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The ID of the region in which the NAT gateway is deployed.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of entries to return for real-time SNAT performance ranking. Valid values: **1 to 100**. Default value: **10**.</p>
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
