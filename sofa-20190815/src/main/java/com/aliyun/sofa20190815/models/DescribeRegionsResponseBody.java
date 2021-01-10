// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<DescribeRegionsResponseBodyData> data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRegionsResponseBody setData(java.util.List<DescribeRegionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeRegionsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeRegionsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeRegionsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DescribeRegionsResponseBodyData extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("RegionIaasId")
        public String regionIaasId;

        @NameInMap("AvailableNetworkTypes")
        public java.util.List<String> availableNetworkTypes;

        @NameInMap("State")
        public String state;

        @NameInMap("PaasId")
        public String paasId;

        @NameInMap("Id")
        public String id;

        @NameInMap("ZoneIds")
        public java.util.List<String> zoneIds;

        public static DescribeRegionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyData self = new DescribeRegionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeRegionsResponseBodyData setRegionIaasId(String regionIaasId) {
            this.regionIaasId = regionIaasId;
            return this;
        }
        public String getRegionIaasId() {
            return this.regionIaasId;
        }

        public DescribeRegionsResponseBodyData setAvailableNetworkTypes(java.util.List<String> availableNetworkTypes) {
            this.availableNetworkTypes = availableNetworkTypes;
            return this;
        }
        public java.util.List<String> getAvailableNetworkTypes() {
            return this.availableNetworkTypes;
        }

        public DescribeRegionsResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeRegionsResponseBodyData setPaasId(String paasId) {
            this.paasId = paasId;
            return this;
        }
        public String getPaasId() {
            return this.paasId;
        }

        public DescribeRegionsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeRegionsResponseBodyData setZoneIds(java.util.List<String> zoneIds) {
            this.zoneIds = zoneIds;
            return this;
        }
        public java.util.List<String> getZoneIds() {
            return this.zoneIds;
        }

    }

}
