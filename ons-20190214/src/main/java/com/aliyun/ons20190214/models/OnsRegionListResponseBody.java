// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsRegionListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public OnsRegionListResponseBodyData data;

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

    public OnsRegionListResponseBody setData(OnsRegionListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsRegionListResponseBodyData getData() {
        return this.data;
    }

    public static class OnsRegionListResponseBodyDataRegionDo extends TeaModel {
        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("OnsRegionId")
        public String onsRegionId;

        public static OnsRegionListResponseBodyDataRegionDo build(java.util.Map<String, ?> map) throws Exception {
            OnsRegionListResponseBodyDataRegionDo self = new OnsRegionListResponseBodyDataRegionDo();
            return TeaModel.build(map, self);
        }

        public OnsRegionListResponseBodyDataRegionDo setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public OnsRegionListResponseBodyDataRegionDo setOnsRegionId(String onsRegionId) {
            this.onsRegionId = onsRegionId;
            return this;
        }
        public String getOnsRegionId() {
            return this.onsRegionId;
        }

    }

    public static class OnsRegionListResponseBodyData extends TeaModel {
        @NameInMap("RegionDo")
        public java.util.List<OnsRegionListResponseBodyDataRegionDo> regionDo;

        public static OnsRegionListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsRegionListResponseBodyData self = new OnsRegionListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsRegionListResponseBodyData setRegionDo(java.util.List<OnsRegionListResponseBodyDataRegionDo> regionDo) {
            this.regionDo = regionDo;
            return this;
        }
        public java.util.List<OnsRegionListResponseBodyDataRegionDo> getRegionDo() {
            return this.regionDo;
        }

    }

}
