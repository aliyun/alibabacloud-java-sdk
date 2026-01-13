// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCloudResourceListResponseBody extends TeaModel {
    @NameInMap("CloudResourceList")
    public java.util.List<DescribeCloudResourceListResponseBodyCloudResourceList> cloudResourceList;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAGBgV9tolsLfijC4wam2htS*****D/46H3X2wIS</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>F35F45B0-5D6B-4238-BE02-A62D****E840</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>118</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCloudResourceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudResourceListResponseBody self = new DescribeCloudResourceListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudResourceListResponseBody setCloudResourceList(java.util.List<DescribeCloudResourceListResponseBodyCloudResourceList> cloudResourceList) {
        this.cloudResourceList = cloudResourceList;
        return this;
    }
    public java.util.List<DescribeCloudResourceListResponseBodyCloudResourceList> getCloudResourceList() {
        return this.cloudResourceList;
    }

    public DescribeCloudResourceListResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeCloudResourceListResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCloudResourceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudResourceListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCloudResourceListResponseBodyCloudResourceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>i-8vbdlsd********81e22-80-ecs</p>
         */
        @NameInMap("CloudResourceId")
        public String cloudResourceId;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>i-8vbdlsd********81e22</p>
         */
        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        /**
         * <strong>example:</strong>
         * <p>rg-aek2uo2****lbka</p>
         */
        @NameInMap("ResourceManagerResourceGroupId")
        public String resourceManagerResourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ResourceProduct")
        public String resourceProduct;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("ResourceRegionId")
        public String resourceRegionId;

        public static DescribeCloudResourceListResponseBodyCloudResourceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudResourceListResponseBodyCloudResourceList self = new DescribeCloudResourceListResponseBodyCloudResourceList();
            return TeaModel.build(map, self);
        }

        public DescribeCloudResourceListResponseBodyCloudResourceList setCloudResourceId(String cloudResourceId) {
            this.cloudResourceId = cloudResourceId;
            return this;
        }
        public String getCloudResourceId() {
            return this.cloudResourceId;
        }

        public DescribeCloudResourceListResponseBodyCloudResourceList setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeCloudResourceListResponseBodyCloudResourceList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeCloudResourceListResponseBodyCloudResourceList setResourceInstanceId(String resourceInstanceId) {
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        public DescribeCloudResourceListResponseBodyCloudResourceList setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }
        public String getResourceManagerResourceGroupId() {
            return this.resourceManagerResourceGroupId;
        }

        public DescribeCloudResourceListResponseBodyCloudResourceList setResourceProduct(String resourceProduct) {
            this.resourceProduct = resourceProduct;
            return this;
        }
        public String getResourceProduct() {
            return this.resourceProduct;
        }

        public DescribeCloudResourceListResponseBodyCloudResourceList setResourceRegionId(String resourceRegionId) {
            this.resourceRegionId = resourceRegionId;
            return this;
        }
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

    }

}
