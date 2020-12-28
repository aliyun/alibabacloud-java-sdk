// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsRegionListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<OnsRegionListResponseBodyData> data;

    public static OnsRegionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsRegionListResponseBody self = new OnsRegionListResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsRegionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsRegionListResponseBody setData(java.util.List<OnsRegionListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<OnsRegionListResponseBodyData> getData() {
        return this.data;
    }

    public static class OnsRegionListResponseBodyData extends TeaModel {
        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("OnsRegionId")
        public String onsRegionId;

        public static OnsRegionListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsRegionListResponseBodyData self = new OnsRegionListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsRegionListResponseBodyData setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public OnsRegionListResponseBodyData setOnsRegionId(String onsRegionId) {
            this.onsRegionId = onsRegionId;
            return this;
        }
        public String getOnsRegionId() {
            return this.onsRegionId;
        }

    }

}
