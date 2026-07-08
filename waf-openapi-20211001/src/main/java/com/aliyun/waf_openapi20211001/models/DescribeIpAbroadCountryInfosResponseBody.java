// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeIpAbroadCountryInfosResponseBody extends TeaModel {
    /**
     * <p>The list of country information outside China.</p>
     */
    @NameInMap("AbroadInfos")
    public java.util.List<DescribeIpAbroadCountryInfosResponseBodyAbroadInfos> abroadInfos;

    /**
     * <p>The number of entries per page in a paged query. Valid values: 1 to 500. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0*****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID</p>
     * 
     * <strong>example:</strong>
     * <p>66A98669-CC6E-4F3E-80A6-3014697B11AE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeIpAbroadCountryInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpAbroadCountryInfosResponseBody self = new DescribeIpAbroadCountryInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpAbroadCountryInfosResponseBody setAbroadInfos(java.util.List<DescribeIpAbroadCountryInfosResponseBodyAbroadInfos> abroadInfos) {
        this.abroadInfos = abroadInfos;
        return this;
    }
    public java.util.List<DescribeIpAbroadCountryInfosResponseBodyAbroadInfos> getAbroadInfos() {
        return this.abroadInfos;
    }

    public DescribeIpAbroadCountryInfosResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeIpAbroadCountryInfosResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeIpAbroadCountryInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpAbroadCountryInfosResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeIpAbroadCountryInfosResponseBodyAbroadInfosRegions extends TeaModel {
        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>US-CA</p>
         */
        @NameInMap("AbroadRegionId")
        public String abroadRegionId;

        /**
         * <p>The name of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>California</p>
         */
        @NameInMap("AbroadRegionName")
        public String abroadRegionName;

        public static DescribeIpAbroadCountryInfosResponseBodyAbroadInfosRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpAbroadCountryInfosResponseBodyAbroadInfosRegions self = new DescribeIpAbroadCountryInfosResponseBodyAbroadInfosRegions();
            return TeaModel.build(map, self);
        }

        public DescribeIpAbroadCountryInfosResponseBodyAbroadInfosRegions setAbroadRegionId(String abroadRegionId) {
            this.abroadRegionId = abroadRegionId;
            return this;
        }
        public String getAbroadRegionId() {
            return this.abroadRegionId;
        }

        public DescribeIpAbroadCountryInfosResponseBodyAbroadInfosRegions setAbroadRegionName(String abroadRegionName) {
            this.abroadRegionName = abroadRegionName;
            return this;
        }
        public String getAbroadRegionName() {
            return this.abroadRegionName;
        }

    }

    public static class DescribeIpAbroadCountryInfosResponseBodyAbroadInfos extends TeaModel {
        /**
         * <p>The continent to which the country belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>North America</p>
         */
        @NameInMap("Continent")
        public String continent;

        /**
         * <p>The ID of the country.</p>
         * 
         * <strong>example:</strong>
         * <p>US</p>
         */
        @NameInMap("Country")
        public String country;

        /**
         * <p>The name of the country.</p>
         * 
         * <strong>example:</strong>
         * <p>United States</p>
         */
        @NameInMap("CountryName")
        public String countryName;

        /**
         * <p>The list of region information outside China.</p>
         */
        @NameInMap("Regions")
        public java.util.List<DescribeIpAbroadCountryInfosResponseBodyAbroadInfosRegions> regions;

        public static DescribeIpAbroadCountryInfosResponseBodyAbroadInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpAbroadCountryInfosResponseBodyAbroadInfos self = new DescribeIpAbroadCountryInfosResponseBodyAbroadInfos();
            return TeaModel.build(map, self);
        }

        public DescribeIpAbroadCountryInfosResponseBodyAbroadInfos setContinent(String continent) {
            this.continent = continent;
            return this;
        }
        public String getContinent() {
            return this.continent;
        }

        public DescribeIpAbroadCountryInfosResponseBodyAbroadInfos setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public DescribeIpAbroadCountryInfosResponseBodyAbroadInfos setCountryName(String countryName) {
            this.countryName = countryName;
            return this;
        }
        public String getCountryName() {
            return this.countryName;
        }

        public DescribeIpAbroadCountryInfosResponseBodyAbroadInfos setRegions(java.util.List<DescribeIpAbroadCountryInfosResponseBodyAbroadInfosRegions> regions) {
            this.regions = regions;
            return this;
        }
        public java.util.List<DescribeIpAbroadCountryInfosResponseBodyAbroadInfosRegions> getRegions() {
            return this.regions;
        }

    }

}
