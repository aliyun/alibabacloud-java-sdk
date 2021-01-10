// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCZoneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Zones")
    public java.util.List<ListLDCZoneResponseBodyZones> zones;

    public static ListLDCZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLDCZoneResponseBody self = new ListLDCZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLDCZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLDCZoneResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLDCZoneResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLDCZoneResponseBody setZones(java.util.List<ListLDCZoneResponseBodyZones> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<ListLDCZoneResponseBodyZones> getZones() {
        return this.zones;
    }

    public static class ListLDCZoneResponseBodyZones extends TeaModel {
        @NameInMap("DataCenter")
        public String dataCenter;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Region")
        public String region;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ListLDCZoneResponseBodyZones build(java.util.Map<String, ?> map) throws Exception {
            ListLDCZoneResponseBodyZones self = new ListLDCZoneResponseBodyZones();
            return TeaModel.build(map, self);
        }

        public ListLDCZoneResponseBodyZones setDataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            return this;
        }
        public String getDataCenter() {
            return this.dataCenter;
        }

        public ListLDCZoneResponseBodyZones setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListLDCZoneResponseBodyZones setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLDCZoneResponseBodyZones setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListLDCZoneResponseBodyZones setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListLDCZoneResponseBodyZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
