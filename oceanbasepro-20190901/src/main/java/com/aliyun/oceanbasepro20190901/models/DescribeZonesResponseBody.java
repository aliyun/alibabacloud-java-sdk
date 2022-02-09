// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeZonesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    // 可用区列表信息
    @NameInMap("Zones")
    public java.util.List<DescribeZonesResponseBodyZones> zones;

    public static DescribeZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesResponseBody self = new DescribeZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeZonesResponseBody setZones(java.util.List<DescribeZonesResponseBodyZones> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<DescribeZonesResponseBodyZones> getZones() {
        return this.zones;
    }

    public static class DescribeZonesResponseBodyZones extends TeaModel {
        // 部署模式
        @NameInMap("DeployType")
        public String deployType;

        // Oceanbase集群的系列  - NORMAL（默认）：高可用版本  - BASIC：基础版本
        @NameInMap("Series")
        public String series;

        // 在各可用区的库存状态。其取值为：  WithStock：库存充足。 ClosedWithStock：库存供应保障能力低，建议选用WithStock状态的产品规格。 WithoutStock：库存售罄，将会补充资源，建议选用WithStock状态的产品规格
        @NameInMap("StockStatus")
        public String stockStatus;

        // 可用区ID列表。对于多可用区集群，其可用区名称以逗号连接
        @NameInMap("ZoneId")
        public String zoneId;

        // 可用区名称
        @NameInMap("ZoneName")
        public String zoneName;

        public static DescribeZonesResponseBodyZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZones self = new DescribeZonesResponseBodyZones();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZones setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public DescribeZonesResponseBodyZones setSeries(String series) {
            this.series = series;
            return this;
        }
        public String getSeries() {
            return this.series;
        }

        public DescribeZonesResponseBodyZones setStockStatus(String stockStatus) {
            this.stockStatus = stockStatus;
            return this;
        }
        public String getStockStatus() {
            return this.stockStatus;
        }

        public DescribeZonesResponseBodyZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeZonesResponseBodyZones setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

}
