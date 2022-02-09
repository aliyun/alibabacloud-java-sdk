// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantZonesElectableResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 租户可用区信息。
    @NameInMap("TenantZones")
    public java.util.List<DescribeTenantZonesElectableResponseBodyTenantZones> tenantZones;

    public static DescribeTenantZonesElectableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantZonesElectableResponseBody self = new DescribeTenantZonesElectableResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTenantZonesElectableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTenantZonesElectableResponseBody setTenantZones(java.util.List<DescribeTenantZonesElectableResponseBodyTenantZones> tenantZones) {
        this.tenantZones = tenantZones;
        return this;
    }
    public java.util.List<DescribeTenantZonesElectableResponseBodyTenantZones> getTenantZones() {
        return this.tenantZones;
    }

    public static class DescribeTenantZonesElectableResponseBodyTenantZonesUnitInfo extends TeaModel {
        @NameInMap("IsElectable")
        public Boolean isElectable;

        @NameInMap("IsPrimary")
        public Boolean isPrimary;

        @NameInMap("ReplicaType")
        public String replicaType;

        @NameInMap("SnName")
        public String snName;

        public static DescribeTenantZonesElectableResponseBodyTenantZonesUnitInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantZonesElectableResponseBodyTenantZonesUnitInfo self = new DescribeTenantZonesElectableResponseBodyTenantZonesUnitInfo();
            return TeaModel.build(map, self);
        }

        public DescribeTenantZonesElectableResponseBodyTenantZonesUnitInfo setIsElectable(Boolean isElectable) {
            this.isElectable = isElectable;
            return this;
        }
        public Boolean getIsElectable() {
            return this.isElectable;
        }

        public DescribeTenantZonesElectableResponseBodyTenantZonesUnitInfo setIsPrimary(Boolean isPrimary) {
            this.isPrimary = isPrimary;
            return this;
        }
        public Boolean getIsPrimary() {
            return this.isPrimary;
        }

        public DescribeTenantZonesElectableResponseBodyTenantZonesUnitInfo setReplicaType(String replicaType) {
            this.replicaType = replicaType;
            return this;
        }
        public String getReplicaType() {
            return this.replicaType;
        }

        public DescribeTenantZonesElectableResponseBodyTenantZonesUnitInfo setSnName(String snName) {
            this.snName = snName;
            return this;
        }
        public String getSnName() {
            return this.snName;
        }

    }

    public static class DescribeTenantZonesElectableResponseBodyTenantZones extends TeaModel {
        // 是否可选为主库。
        @NameInMap("IsElectable")
        public Boolean isElectable;

        // 是否为主可用区。
        @NameInMap("IsPrimary")
        public Boolean isPrimary;

        // 是否已经创建只读连接。
        @NameInMap("IsReadOnlyAddressMaster")
        public Boolean isReadOnlyAddressMaster;

        // 是否可以设置为只读。
        @NameInMap("IsReadable")
        public String isReadable;

        @NameInMap("UnitInfo")
        public java.util.List<DescribeTenantZonesElectableResponseBodyTenantZonesUnitInfo> unitInfo;

        // 可用区ID。
        @NameInMap("Zone")
        public String zone;

        public static DescribeTenantZonesElectableResponseBodyTenantZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantZonesElectableResponseBodyTenantZones self = new DescribeTenantZonesElectableResponseBodyTenantZones();
            return TeaModel.build(map, self);
        }

        public DescribeTenantZonesElectableResponseBodyTenantZones setIsElectable(Boolean isElectable) {
            this.isElectable = isElectable;
            return this;
        }
        public Boolean getIsElectable() {
            return this.isElectable;
        }

        public DescribeTenantZonesElectableResponseBodyTenantZones setIsPrimary(Boolean isPrimary) {
            this.isPrimary = isPrimary;
            return this;
        }
        public Boolean getIsPrimary() {
            return this.isPrimary;
        }

        public DescribeTenantZonesElectableResponseBodyTenantZones setIsReadOnlyAddressMaster(Boolean isReadOnlyAddressMaster) {
            this.isReadOnlyAddressMaster = isReadOnlyAddressMaster;
            return this;
        }
        public Boolean getIsReadOnlyAddressMaster() {
            return this.isReadOnlyAddressMaster;
        }

        public DescribeTenantZonesElectableResponseBodyTenantZones setIsReadable(String isReadable) {
            this.isReadable = isReadable;
            return this;
        }
        public String getIsReadable() {
            return this.isReadable;
        }

        public DescribeTenantZonesElectableResponseBodyTenantZones setUnitInfo(java.util.List<DescribeTenantZonesElectableResponseBodyTenantZonesUnitInfo> unitInfo) {
            this.unitInfo = unitInfo;
            return this;
        }
        public java.util.List<DescribeTenantZonesElectableResponseBodyTenantZonesUnitInfo> getUnitInfo() {
            return this.unitInfo;
        }

        public DescribeTenantZonesElectableResponseBodyTenantZones setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

}
