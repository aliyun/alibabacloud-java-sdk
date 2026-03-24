// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCloudResourceListResponseBody extends TeaModel {
    /**
     * <p>The list of resources that are added to WAF.</p>
     */
    @NameInMap("CloudResourceList")
    public java.util.List<DescribeCloudResourceListResponseBodyCloudResourceList> cloudResourceList;

    /**
     * <p>The number of entries returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     * <blockquote>
     * <p>If a value is returned for this parameter, it indicates that a next page is available. To retrieve the next page of data, include the returned <strong>NextToken</strong> in your next request. Repeat this process until no value is returned, which indicates that all data has been retrieved.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AAAAAGBgV9tolsLfijC4wam2htS*****D/46H3X2wIS</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F35F45B0-5D6B-4238-BE02-A62D****E840</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
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
         * <p>The ID of the protected resource. WAF automatically generates this ID when you add the resource to WAF.</p>
         * 
         * <strong>example:</strong>
         * <p>i-8vbdlsd********81e22-80-ecs</p>
         */
        @NameInMap("CloudResourceId")
        public String cloudResourceId;

        /**
         * <p>The port of the cloud service that is added to WAF.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li><p><strong>http</strong>: HTTP</p>
         * </li>
         * <li><p><strong>https</strong>: HTTPS</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The ID of the resource instance that is added to WAF.</p>
         * 
         * <strong>example:</strong>
         * <p>i-8vbdlsd********81e22</p>
         */
        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        /**
         * <p>The ID of the Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2uo2****lbka</p>
         */
        @NameInMap("ResourceManagerResourceGroupId")
        public String resourceManagerResourceGroupId;

        /**
         * <p>The cloud service to which the resource belongs. Valid values:</p>
         * <ul>
         * <li><p><strong>alb</strong>: ALB.</p>
         * </li>
         * <li><p><strong>mse</strong>: MSE.</p>
         * </li>
         * <li><p><strong>fc</strong>: FC.</p>
         * </li>
         * <li><p><strong>sae</strong>: SAE.</p>
         * </li>
         * <li><p><strong>ecs</strong>: ECS.</p>
         * </li>
         * <li><p><strong>clb4</strong>: CLB that uses the TCP protocol.</p>
         * </li>
         * <li><p><strong>clb7</strong>: CLB that uses the HTTP or HTTPS protocol.</p>
         * </li>
         * <li><p><strong>nlb</strong>: NLB.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ResourceProduct")
        public String resourceProduct;

        /**
         * <p>The ID of the region where the resource resides. For more information, see the &quot;Regions and supported products&quot; section in this topic.</p>
         * 
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
