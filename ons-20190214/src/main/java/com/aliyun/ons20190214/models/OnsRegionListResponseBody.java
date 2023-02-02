// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsRegionListResponseBody extends TeaModel {
    /**
     * <p>The information about the message that is queried.</p>
     */
    @NameInMap("Data")
    public OnsRegionListResponseBodyData data;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsRegionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsRegionListResponseBody self = new OnsRegionListResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsRegionListResponseBody setData(OnsRegionListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsRegionListResponseBodyData getData() {
        return this.data;
    }

    public OnsRegionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class OnsRegionListResponseBodyDataRegionDo extends TeaModel {
        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("OnsRegionId")
        public String onsRegionId;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        public static OnsRegionListResponseBodyDataRegionDo build(java.util.Map<String, ?> map) throws Exception {
            OnsRegionListResponseBodyDataRegionDo self = new OnsRegionListResponseBodyDataRegionDo();
            return TeaModel.build(map, self);
        }

        public OnsRegionListResponseBodyDataRegionDo setOnsRegionId(String onsRegionId) {
            this.onsRegionId = onsRegionId;
            return this;
        }
        public String getOnsRegionId() {
            return this.onsRegionId;
        }

        public OnsRegionListResponseBodyDataRegionDo setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
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
