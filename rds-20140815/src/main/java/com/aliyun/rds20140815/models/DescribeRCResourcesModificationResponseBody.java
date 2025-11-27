// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCResourcesModificationResponseBody extends TeaModel {
    @NameInMap("AvailableZones")
    public java.util.List<DescribeRCResourcesModificationResponseBodyAvailableZones> availableZones;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRCResourcesModificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCResourcesModificationResponseBody self = new DescribeRCResourcesModificationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCResourcesModificationResponseBody setAvailableZones(java.util.List<DescribeRCResourcesModificationResponseBodyAvailableZones> availableZones) {
        this.availableZones = availableZones;
        return this;
    }
    public java.util.List<DescribeRCResourcesModificationResponseBodyAvailableZones> getAvailableZones() {
        return this.availableZones;
    }

    public DescribeRCResourcesModificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRCResourcesModificationResponseBodyAvailableZonesAvailableResourcesSupportedResources extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("StatusCategory")
        public String statusCategory;

        @NameInMap("Value")
        public String value;

        public static DescribeRCResourcesModificationResponseBodyAvailableZonesAvailableResourcesSupportedResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCResourcesModificationResponseBodyAvailableZonesAvailableResourcesSupportedResources self = new DescribeRCResourcesModificationResponseBodyAvailableZonesAvailableResourcesSupportedResources();
            return TeaModel.build(map, self);
        }

        public DescribeRCResourcesModificationResponseBodyAvailableZonesAvailableResourcesSupportedResources setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRCResourcesModificationResponseBodyAvailableZonesAvailableResourcesSupportedResources setStatusCategory(String statusCategory) {
            this.statusCategory = statusCategory;
            return this;
        }
        public String getStatusCategory() {
            return this.statusCategory;
        }

        public DescribeRCResourcesModificationResponseBodyAvailableZonesAvailableResourcesSupportedResources setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeRCResourcesModificationResponseBodyAvailableZonesAvailableResources extends TeaModel {
        @NameInMap("SupportedResources")
        public java.util.List<DescribeRCResourcesModificationResponseBodyAvailableZonesAvailableResourcesSupportedResources> supportedResources;

        @NameInMap("Type")
        public String type;

        public static DescribeRCResourcesModificationResponseBodyAvailableZonesAvailableResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCResourcesModificationResponseBodyAvailableZonesAvailableResources self = new DescribeRCResourcesModificationResponseBodyAvailableZonesAvailableResources();
            return TeaModel.build(map, self);
        }

        public DescribeRCResourcesModificationResponseBodyAvailableZonesAvailableResources setSupportedResources(java.util.List<DescribeRCResourcesModificationResponseBodyAvailableZonesAvailableResourcesSupportedResources> supportedResources) {
            this.supportedResources = supportedResources;
            return this;
        }
        public java.util.List<DescribeRCResourcesModificationResponseBodyAvailableZonesAvailableResourcesSupportedResources> getSupportedResources() {
            return this.supportedResources;
        }

        public DescribeRCResourcesModificationResponseBodyAvailableZonesAvailableResources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeRCResourcesModificationResponseBodyAvailableZones extends TeaModel {
        @NameInMap("AvailableResources")
        public java.util.List<DescribeRCResourcesModificationResponseBodyAvailableZonesAvailableResources> availableResources;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusCategory")
        public String statusCategory;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeRCResourcesModificationResponseBodyAvailableZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCResourcesModificationResponseBodyAvailableZones self = new DescribeRCResourcesModificationResponseBodyAvailableZones();
            return TeaModel.build(map, self);
        }

        public DescribeRCResourcesModificationResponseBodyAvailableZones setAvailableResources(java.util.List<DescribeRCResourcesModificationResponseBodyAvailableZonesAvailableResources> availableResources) {
            this.availableResources = availableResources;
            return this;
        }
        public java.util.List<DescribeRCResourcesModificationResponseBodyAvailableZonesAvailableResources> getAvailableResources() {
            return this.availableResources;
        }

        public DescribeRCResourcesModificationResponseBodyAvailableZones setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRCResourcesModificationResponseBodyAvailableZones setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRCResourcesModificationResponseBodyAvailableZones setStatusCategory(String statusCategory) {
            this.statusCategory = statusCategory;
            return this;
        }
        public String getStatusCategory() {
            return this.statusCategory;
        }

        public DescribeRCResourcesModificationResponseBodyAvailableZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
