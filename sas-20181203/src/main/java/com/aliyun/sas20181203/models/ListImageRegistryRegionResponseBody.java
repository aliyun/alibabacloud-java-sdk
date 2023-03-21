// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListImageRegistryRegionResponseBody extends TeaModel {
    @NameInMap("Regions")
    public java.util.List<ListImageRegistryRegionResponseBodyRegions> regions;

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
        @NameInMap("RegionId")
        public String regionId;

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
