// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListImageRegistryRegionResponseBody extends TeaModel {
    /**
     * <p>An array that consists of regions.</p>
     */
    @NameInMap("Regions")
    public java.util.List<ListImageRegistryRegionResponseBodyRegions> regions;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListImageRegistryRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImageRegistryRegionResponseBody self = new ListImageRegistryRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImageRegistryRegionResponseBody setRegions(java.util.List<ListImageRegistryRegionResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<ListImageRegistryRegionResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public ListImageRegistryRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListImageRegistryRegionResponseBodyRegions extends TeaModel {
        /**
         * <p>The region ID of the image.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the region.</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        public static ListImageRegistryRegionResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            ListImageRegistryRegionResponseBodyRegions self = new ListImageRegistryRegionResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public ListImageRegistryRegionResponseBodyRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListImageRegistryRegionResponseBodyRegions setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

    }

}
