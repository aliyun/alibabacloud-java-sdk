// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
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
        @NameInMap("dataRedundancyType")
        public java.util.List<String> dataRedundancyType;

        @NameInMap("internalEndpoint")
        public String internalEndpoint;

        /**
         * <p>The public endpoint of Simple Log Service.</p>
         */
        @NameInMap("internetEndpoint")
        public String internetEndpoint;

        /**
         * <p>The internal endpoint of Simple Log Service.</p>
         */
        @NameInMap("intranetEndpoint")
        public String intranetEndpoint;

        /**
         * <p>The name of the Simple Log Service region.</p>
         */
        @NameInMap("localName")
        public String localName;

        /**
         * <p>SLS region</p>
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
