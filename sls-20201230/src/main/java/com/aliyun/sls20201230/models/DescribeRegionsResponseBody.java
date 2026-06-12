// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    /**
     * <p>A list of available regions and their details.</p>
     */
    @NameInMap("regions")
    public java.util.List<DescribeRegionsResponseBodyRegions> regions;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setRegions(java.util.List<DescribeRegionsResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<DescribeRegionsResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public static class DescribeRegionsResponseBodyRegions extends TeaModel {
        /**
         * <p>The supported data redundancy types.</p>
         */
        @NameInMap("dataRedundancyType")
        public java.util.List<String> dataRedundancyType;

        /**
         * <p>The accelerated endpoint of the region.</p>
         */
        @NameInMap("internalEndpoint")
        public String internalEndpoint;

        /**
         * <p>The public endpoint of the region.</p>
         */
        @NameInMap("internetEndpoint")
        public String internetEndpoint;

        /**
         * <p>The intranet endpoint of the region.</p>
         */
        @NameInMap("intranetEndpoint")
        public String intranetEndpoint;

        /**
         * <p>The display name of the region.</p>
         */
        @NameInMap("localName")
        public String localName;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("region")
        public String region;

        public static DescribeRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegions self = new DescribeRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegions setDataRedundancyType(java.util.List<String> dataRedundancyType) {
            this.dataRedundancyType = dataRedundancyType;
            return this;
        }
        public java.util.List<String> getDataRedundancyType() {
            return this.dataRedundancyType;
        }

        public DescribeRegionsResponseBodyRegions setInternalEndpoint(String internalEndpoint) {
            this.internalEndpoint = internalEndpoint;
            return this;
        }
        public String getInternalEndpoint() {
            return this.internalEndpoint;
        }

        public DescribeRegionsResponseBodyRegions setInternetEndpoint(String internetEndpoint) {
            this.internetEndpoint = internetEndpoint;
            return this;
        }
        public String getInternetEndpoint() {
            return this.internetEndpoint;
        }

        public DescribeRegionsResponseBodyRegions setIntranetEndpoint(String intranetEndpoint) {
            this.intranetEndpoint = intranetEndpoint;
            return this;
        }
        public String getIntranetEndpoint() {
            return this.intranetEndpoint;
        }

        public DescribeRegionsResponseBodyRegions setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeRegionsResponseBodyRegions setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
