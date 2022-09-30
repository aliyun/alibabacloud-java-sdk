// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantZonesReadResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TenantZones")
    public java.util.List<DescribeTenantZonesReadResponseBodyTenantZones> tenantZones;

    public static DescribeTenantZonesReadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantZonesReadResponseBody self = new DescribeTenantZonesReadResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTenantZonesReadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTenantZonesReadResponseBody setTenantZones(java.util.List<DescribeTenantZonesReadResponseBodyTenantZones> tenantZones) {
        this.tenantZones = tenantZones;
        return this;
    }
    public java.util.List<DescribeTenantZonesReadResponseBodyTenantZones> getTenantZones() {
        return this.tenantZones;
    }

    public static class DescribeTenantZonesReadResponseBodyTenantZones extends TeaModel {
        @NameInMap("IsElectable")
        public Boolean isElectable;

        @NameInMap("IsPrimary")
        public Boolean isPrimary;

        @NameInMap("IsReadOnlyAddressMaster")
        public Boolean isReadOnlyAddressMaster;

        @NameInMap("IsReadable")
        public String isReadable;

        @NameInMap("Zone")
        public String zone;

        public static DescribeTenantZonesReadResponseBodyTenantZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantZonesReadResponseBodyTenantZones self = new DescribeTenantZonesReadResponseBodyTenantZones();
            return TeaModel.build(map, self);
        }

        public DescribeTenantZonesReadResponseBodyTenantZones setIsElectable(Boolean isElectable) {
            this.isElectable = isElectable;
            return this;
        }
        public Boolean getIsElectable() {
            return this.isElectable;
        }

        public DescribeTenantZonesReadResponseBodyTenantZones setIsPrimary(Boolean isPrimary) {
            this.isPrimary = isPrimary;
            return this;
        }
        public Boolean getIsPrimary() {
            return this.isPrimary;
        }

        public DescribeTenantZonesReadResponseBodyTenantZones setIsReadOnlyAddressMaster(Boolean isReadOnlyAddressMaster) {
            this.isReadOnlyAddressMaster = isReadOnlyAddressMaster;
            return this;
        }
        public Boolean getIsReadOnlyAddressMaster() {
            return this.isReadOnlyAddressMaster;
        }

        public DescribeTenantZonesReadResponseBodyTenantZones setIsReadable(String isReadable) {
            this.isReadable = isReadable;
            return this;
        }
        public String getIsReadable() {
            return this.isReadable;
        }

        public DescribeTenantZonesReadResponseBodyTenantZones setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

}
