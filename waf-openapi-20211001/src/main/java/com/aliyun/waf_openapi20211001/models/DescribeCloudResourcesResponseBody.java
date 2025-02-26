// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeCloudResourcesResponseBody extends TeaModel {
    /**
     * <p>The cloud service resources that are added to WAF.</p>
     */
    @NameInMap("CloudResources")
    public java.util.List<DescribeCloudResourcesResponseBodyCloudResources> cloudResources;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C327F81A-CCE2-5B21-817C-F93E29C5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of cloud service resources returned.</p>
     * 
     * <strong>example:</strong>
     * <p>121</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeCloudResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudResourcesResponseBody self = new DescribeCloudResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudResourcesResponseBody setCloudResources(java.util.List<DescribeCloudResourcesResponseBodyCloudResources> cloudResources) {
        this.cloudResources = cloudResources;
        return this;
    }
    public java.util.List<DescribeCloudResourcesResponseBodyCloudResources> getCloudResources() {
        return this.cloudResources;
    }

    public DescribeCloudResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudResourcesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCloudResourcesResponseBodyCloudResources extends TeaModel {
        /**
         * <p>The number of the HTTP ports that are added to WAF.</p>
         * <blockquote>
         * <p> This parameter is returned only if the cloud service is ECS or CLB.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HttpPortCount")
        public Integer httpPortCount;

        /**
         * <p>The number of the HTTPS ports that are added to WAF.</p>
         * <blockquote>
         * <p> This parameter is returned only if the cloud service is ECS or CLB.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HttpsPortCount")
        public Integer httpsPortCount;

        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>11769793******</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        /**
         * <p>The domain name. This parameter has a value only if the value of ResourceProduct is fc or sae.</p>
         * 
         * <strong>example:</strong>
         * <p>test-resource-domain</p>
         */
        @NameInMap("ResourceDomain")
        public String resourceDomain;

        /**
         * <p>The function name. This parameter has a value only if the value of ResourceProduct is fc.</p>
         * 
         * <strong>example:</strong>
         * <p>test-resource-function</p>
         */
        @NameInMap("ResourceFunction")
        public String resourceFunction;

        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-ffff****</p>
         */
        @NameInMap("ResourceInstance")
        @Deprecated
        public String resourceInstance;

        /**
         * <p>The ID of the instance that is added to WAF.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-uf60ub45fr9b***</p>
         */
        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        /**
         * <p>The IP address of the instance that is added to WAF.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("ResourceInstanceIp")
        public String resourceInstanceIp;

        /**
         * <p>The name of the instance that is added to WAF.</p>
         * 
         * <strong>example:</strong>
         * <p>test-name</p>
         */
        @NameInMap("ResourceInstanceName")
        public String resourceInstanceName;

        /**
         * <p>The name of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>test-resource-name</p>
         */
        @NameInMap("ResourceName")
        @Deprecated
        public String resourceName;

        /**
         * <p>The cloud service to which the resource belongs. Valid values:</p>
         * <ul>
         * <li><strong>alb</strong>: ALB.</li>
         * <li><strong>mse</strong>: MSE.</li>
         * <li><strong>fc</strong>: Function Compute.</li>
         * <li><strong>sae</strong>: SAE.</li>
         * <li><strong>ecs</strong>: ECS.</li>
         * <li><strong>clb4</strong>: Layer 4 CLB.</li>
         * <li><strong>clb7</strong>: Layer 7 CLB.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>alb</p>
         */
        @NameInMap("ResourceProduct")
        public String resourceProduct;

        /**
         * <p>The region ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("ResourceRegionId")
        public String resourceRegionId;

        /**
         * <p>The route name. This parameter has a value only if the value of ResourceProduct is mse.</p>
         * 
         * <strong>example:</strong>
         * <p>test-route-name</p>
         */
        @NameInMap("ResourceRouteName")
        public String resourceRouteName;

        /**
         * <p>The service name. This parameter has a value only if the value of ResourceProduct is fc.</p>
         * 
         * <strong>example:</strong>
         * <p>test-resource-service</p>
         */
        @NameInMap("ResourceService")
        public String resourceService;

        public static DescribeCloudResourcesResponseBodyCloudResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudResourcesResponseBodyCloudResources self = new DescribeCloudResourcesResponseBodyCloudResources();
            return TeaModel.build(map, self);
        }

        public DescribeCloudResourcesResponseBodyCloudResources setHttpPortCount(Integer httpPortCount) {
            this.httpPortCount = httpPortCount;
            return this;
        }
        public Integer getHttpPortCount() {
            return this.httpPortCount;
        }

        public DescribeCloudResourcesResponseBodyCloudResources setHttpsPortCount(Integer httpsPortCount) {
            this.httpsPortCount = httpsPortCount;
            return this;
        }
        public Integer getHttpsPortCount() {
            return this.httpsPortCount;
        }

        public DescribeCloudResourcesResponseBodyCloudResources setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public DescribeCloudResourcesResponseBodyCloudResources setResourceDomain(String resourceDomain) {
            this.resourceDomain = resourceDomain;
            return this;
        }
        public String getResourceDomain() {
            return this.resourceDomain;
        }

        public DescribeCloudResourcesResponseBodyCloudResources setResourceFunction(String resourceFunction) {
            this.resourceFunction = resourceFunction;
            return this;
        }
        public String getResourceFunction() {
            return this.resourceFunction;
        }

        @Deprecated
        public DescribeCloudResourcesResponseBodyCloudResources setResourceInstance(String resourceInstance) {
            this.resourceInstance = resourceInstance;
            return this;
        }
        public String getResourceInstance() {
            return this.resourceInstance;
        }

        public DescribeCloudResourcesResponseBodyCloudResources setResourceInstanceId(String resourceInstanceId) {
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        public DescribeCloudResourcesResponseBodyCloudResources setResourceInstanceIp(String resourceInstanceIp) {
            this.resourceInstanceIp = resourceInstanceIp;
            return this;
        }
        public String getResourceInstanceIp() {
            return this.resourceInstanceIp;
        }

        public DescribeCloudResourcesResponseBodyCloudResources setResourceInstanceName(String resourceInstanceName) {
            this.resourceInstanceName = resourceInstanceName;
            return this;
        }
        public String getResourceInstanceName() {
            return this.resourceInstanceName;
        }

        @Deprecated
        public DescribeCloudResourcesResponseBodyCloudResources setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public DescribeCloudResourcesResponseBodyCloudResources setResourceProduct(String resourceProduct) {
            this.resourceProduct = resourceProduct;
            return this;
        }
        public String getResourceProduct() {
            return this.resourceProduct;
        }

        public DescribeCloudResourcesResponseBodyCloudResources setResourceRegionId(String resourceRegionId) {
            this.resourceRegionId = resourceRegionId;
            return this;
        }
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        public DescribeCloudResourcesResponseBodyCloudResources setResourceRouteName(String resourceRouteName) {
            this.resourceRouteName = resourceRouteName;
            return this;
        }
        public String getResourceRouteName() {
            return this.resourceRouteName;
        }

        public DescribeCloudResourcesResponseBodyCloudResources setResourceService(String resourceService) {
            this.resourceService = resourceService;
            return this;
        }
        public String getResourceService() {
            return this.resourceService;
        }

    }

}
