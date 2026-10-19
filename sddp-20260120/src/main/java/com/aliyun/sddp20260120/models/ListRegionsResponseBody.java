// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListRegionsResponseBody extends TeaModel {
    /**
     * <p>The list of regions where the assets are located.</p>
     */
    @NameInMap("RegionList")
    public java.util.List<ListRegionsResponseBodyRegionList> regionList;

    /**
     * <p>The request ID. You can use this ID to locate the API call.</p>
     * 
     * <strong>example:</strong>
     * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRegionsResponseBody self = new ListRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRegionsResponseBody setRegionList(java.util.List<ListRegionsResponseBodyRegionList> regionList) {
        this.regionList = regionList;
        return this;
    }
    public java.util.List<ListRegionsResponseBodyRegionList> getRegionList() {
        return this.regionList;
    }

    public ListRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRegionsResponseBodyRegionList extends TeaModel {
        /**
         * <p>The ID of the region where the assets are located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the region where the assets are located.</p>
         * 
         * <strong>example:</strong>
         * <p>China (Zhangjiakou)</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        public static ListRegionsResponseBodyRegionList build(java.util.Map<String, ?> map) throws Exception {
            ListRegionsResponseBodyRegionList self = new ListRegionsResponseBodyRegionList();
            return TeaModel.build(map, self);
        }

        public ListRegionsResponseBodyRegionList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListRegionsResponseBodyRegionList setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

    }

}
