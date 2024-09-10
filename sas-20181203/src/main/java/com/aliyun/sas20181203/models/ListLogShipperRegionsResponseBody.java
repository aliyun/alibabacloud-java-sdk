// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListLogShipperRegionsResponseBody extends TeaModel {
    /**
     * <p>The regions supported by the log delivery feature.</p>
     */
    @NameInMap("LogShipperRegionList")
    public java.util.List<ListLogShipperRegionsResponseBodyLogShipperRegionList> logShipperRegionList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F9C4DE22-D242-5ABA-87EC-325ECBDC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListLogShipperRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogShipperRegionsResponseBody self = new ListLogShipperRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogShipperRegionsResponseBody setLogShipperRegionList(java.util.List<ListLogShipperRegionsResponseBodyLogShipperRegionList> logShipperRegionList) {
        this.logShipperRegionList = logShipperRegionList;
        return this;
    }
    public java.util.List<ListLogShipperRegionsResponseBodyLogShipperRegionList> getLogShipperRegionList() {
        return this.logShipperRegionList;
    }

    public ListLogShipperRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLogShipperRegionsResponseBodyLogShipperRegionList extends TeaModel {
        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ListLogShipperRegionsResponseBodyLogShipperRegionList build(java.util.Map<String, ?> map) throws Exception {
            ListLogShipperRegionsResponseBodyLogShipperRegionList self = new ListLogShipperRegionsResponseBodyLogShipperRegionList();
            return TeaModel.build(map, self);
        }

        public ListLogShipperRegionsResponseBodyLogShipperRegionList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
