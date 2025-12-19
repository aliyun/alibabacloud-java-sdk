// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListBusinessRegionsResponseBody extends TeaModel {
    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>The list of regions available for Express Connect circuits.</p>
     */
    @NameInMap("GeographicSubRegions")
    public java.util.List<ListBusinessRegionsResponseBodyGeographicSubRegions> geographicSubRegions;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>304FE68E-16D8-5B90-B2B3-FE5C5C08C24B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListBusinessRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBusinessRegionsResponseBody self = new ListBusinessRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBusinessRegionsResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListBusinessRegionsResponseBody setGeographicSubRegions(java.util.List<ListBusinessRegionsResponseBodyGeographicSubRegions> geographicSubRegions) {
        this.geographicSubRegions = geographicSubRegions;
        return this;
    }
    public java.util.List<ListBusinessRegionsResponseBodyGeographicSubRegions> getGeographicSubRegions() {
        return this.geographicSubRegions;
    }

    public ListBusinessRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListBusinessRegionsResponseBodyGeographicSubRegions extends TeaModel {
        /**
         * <p>The name of the region where circuits are available.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the region where circuits are available.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ListBusinessRegionsResponseBodyGeographicSubRegions build(java.util.Map<String, ?> map) throws Exception {
            ListBusinessRegionsResponseBodyGeographicSubRegions self = new ListBusinessRegionsResponseBodyGeographicSubRegions();
            return TeaModel.build(map, self);
        }

        public ListBusinessRegionsResponseBodyGeographicSubRegions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListBusinessRegionsResponseBodyGeographicSubRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
