// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCAvailableResourceResponseBody extends TeaModel {
    @NameInMap("AvailableZones")
    public java.util.List<DescribeRCAvailableResourceResponseBodyAvailableZones> availableZones;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRCAvailableResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCAvailableResourceResponseBody self = new DescribeRCAvailableResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCAvailableResourceResponseBody setAvailableZones(java.util.List<DescribeRCAvailableResourceResponseBodyAvailableZones> availableZones) {
        this.availableZones = availableZones;
        return this;
    }
    public java.util.List<DescribeRCAvailableResourceResponseBodyAvailableZones> getAvailableZones() {
        return this.availableZones;
    }

    public DescribeRCAvailableResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRCAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources extends TeaModel {
        @NameInMap("Max")
        public Integer max;

        @NameInMap("Min")
        public Integer min;

        @NameInMap("QuotaStatus")
        public String quotaStatus;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusCategory")
        public String statusCategory;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("Value")
        public String value;

        public static DescribeRCAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources self = new DescribeRCAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources();
            return TeaModel.build(map, self);
        }

        public DescribeRCAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public DescribeRCAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

        public DescribeRCAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources setQuotaStatus(String quotaStatus) {
            this.quotaStatus = quotaStatus;
            return this;
        }
        public String getQuotaStatus() {
            return this.quotaStatus;
        }

        public DescribeRCAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRCAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources setStatusCategory(String statusCategory) {
            this.statusCategory = statusCategory;
            return this;
        }
        public String getStatusCategory() {
            return this.statusCategory;
        }

        public DescribeRCAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeRCAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeRCAvailableResourceResponseBodyAvailableZonesAvailableResources extends TeaModel {
        @NameInMap("SupportedResources")
        public java.util.List<DescribeRCAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources> supportedResources;

        @NameInMap("Type")
        public String type;

        public static DescribeRCAvailableResourceResponseBodyAvailableZonesAvailableResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCAvailableResourceResponseBodyAvailableZonesAvailableResources self = new DescribeRCAvailableResourceResponseBodyAvailableZonesAvailableResources();
            return TeaModel.build(map, self);
        }

        public DescribeRCAvailableResourceResponseBodyAvailableZonesAvailableResources setSupportedResources(java.util.List<DescribeRCAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources> supportedResources) {
            this.supportedResources = supportedResources;
            return this;
        }
        public java.util.List<DescribeRCAvailableResourceResponseBodyAvailableZonesAvailableResourcesSupportedResources> getSupportedResources() {
            return this.supportedResources;
        }

        public DescribeRCAvailableResourceResponseBodyAvailableZonesAvailableResources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeRCAvailableResourceResponseBodyAvailableZones extends TeaModel {
        @NameInMap("AvailableResources")
        public java.util.List<DescribeRCAvailableResourceResponseBodyAvailableZonesAvailableResources> availableResources;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusCategory")
        public String statusCategory;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeRCAvailableResourceResponseBodyAvailableZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCAvailableResourceResponseBodyAvailableZones self = new DescribeRCAvailableResourceResponseBodyAvailableZones();
            return TeaModel.build(map, self);
        }

        public DescribeRCAvailableResourceResponseBodyAvailableZones setAvailableResources(java.util.List<DescribeRCAvailableResourceResponseBodyAvailableZonesAvailableResources> availableResources) {
            this.availableResources = availableResources;
            return this;
        }
        public java.util.List<DescribeRCAvailableResourceResponseBodyAvailableZonesAvailableResources> getAvailableResources() {
            return this.availableResources;
        }

        public DescribeRCAvailableResourceResponseBodyAvailableZones setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRCAvailableResourceResponseBodyAvailableZones setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRCAvailableResourceResponseBodyAvailableZones setStatusCategory(String statusCategory) {
            this.statusCategory = statusCategory;
            return this;
        }
        public String getStatusCategory() {
            return this.statusCategory;
        }

        public DescribeRCAvailableResourceResponseBodyAvailableZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
