// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAvailableResourcesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AvailableZones")
    @Validation(required = true)
    public java.util.List<DescribeDBClusterAvailableResourcesResponseAvailableZones> availableZones;

    public static DescribeDBClusterAvailableResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAvailableResourcesResponse self = new DescribeDBClusterAvailableResourcesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeDBClusterAvailableResourcesResponseAvailableZonesSupportedEnginesAvailableResources extends TeaModel {
        @NameInMap("DBNodeClass")
        @Validation(required = true)
        public String DBNodeClass;

        @NameInMap("Category")
        @Validation(required = true)
        public String category;

        public static DescribeDBClusterAvailableResourcesResponseAvailableZonesSupportedEnginesAvailableResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAvailableResourcesResponseAvailableZonesSupportedEnginesAvailableResources self = new DescribeDBClusterAvailableResourcesResponseAvailableZonesSupportedEnginesAvailableResources();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBClusterAvailableResourcesResponseAvailableZonesSupportedEngines extends TeaModel {
        @NameInMap("Engine")
        @Validation(required = true)
        public String engine;

        @NameInMap("AvailableResources")
        @Validation(required = true)
        public java.util.List<DescribeDBClusterAvailableResourcesResponseAvailableZonesSupportedEnginesAvailableResources> availableResources;

        public static DescribeDBClusterAvailableResourcesResponseAvailableZonesSupportedEngines build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAvailableResourcesResponseAvailableZonesSupportedEngines self = new DescribeDBClusterAvailableResourcesResponseAvailableZonesSupportedEngines();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDBClusterAvailableResourcesResponseAvailableZones extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("SupportedEngines")
        @Validation(required = true)
        public java.util.List<DescribeDBClusterAvailableResourcesResponseAvailableZonesSupportedEngines> supportedEngines;

        public static DescribeDBClusterAvailableResourcesResponseAvailableZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAvailableResourcesResponseAvailableZones self = new DescribeDBClusterAvailableResourcesResponseAvailableZones();
            return TeaModel.build(map, self);
        }

    }

}
