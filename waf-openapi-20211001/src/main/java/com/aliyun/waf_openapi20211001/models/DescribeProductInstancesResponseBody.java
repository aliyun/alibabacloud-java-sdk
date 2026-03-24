// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeProductInstancesResponseBody extends TeaModel {
    /**
     * <p>The information about the instances.</p>
     */
    @NameInMap("ProductInstances")
    public java.util.List<DescribeProductInstancesResponseBodyProductInstances> productInstances;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FDCBAE1E-2B3F-5C13-AD20-844B9473****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeProductInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductInstancesResponseBody self = new DescribeProductInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProductInstancesResponseBody setProductInstances(java.util.List<DescribeProductInstancesResponseBodyProductInstances> productInstances) {
        this.productInstances = productInstances;
        return this;
    }
    public java.util.List<DescribeProductInstancesResponseBodyProductInstances> getProductInstances() {
        return this.productInstances;
    }

    public DescribeProductInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProductInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeProductInstancesResponseBodyProductInstancesAccessPortAndProtocols extends TeaModel {
        /**
         * <p>The certificates.</p>
         */
        @NameInMap("CertificateIds")
        public java.util.List<String> certificateIds;

        /**
         * <p>The port of the cloud service added to WAF.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li><p><strong>http</strong>: HTTP protocol.</p>
         * </li>
         * <li><p><strong>https</strong>: HTTPS protocol.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static DescribeProductInstancesResponseBodyProductInstancesAccessPortAndProtocols build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductInstancesResponseBodyProductInstancesAccessPortAndProtocols self = new DescribeProductInstancesResponseBodyProductInstancesAccessPortAndProtocols();
            return TeaModel.build(map, self);
        }

        public DescribeProductInstancesResponseBodyProductInstancesAccessPortAndProtocols setCertificateIds(java.util.List<String> certificateIds) {
            this.certificateIds = certificateIds;
            return this;
        }
        public java.util.List<String> getCertificateIds() {
            return this.certificateIds;
        }

        public DescribeProductInstancesResponseBodyProductInstancesAccessPortAndProtocols setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeProductInstancesResponseBodyProductInstancesAccessPortAndProtocols setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeProductInstancesResponseBodyProductInstancesResourcePortsCertificates extends TeaModel {
        /**
         * <p>The type of the HTTPS certificate. Valid values:</p>
         * <ul>
         * <li><p><strong>default</strong>: Default certificate.</p>
         * </li>
         * <li><p><strong>extension</strong>: Extension certificate.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AppliedType")
        public String appliedType;

        /**
         * <p>The certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("CertificateId")
        public String certificateId;

        /**
         * <p>The name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>demoCertName</p>
         */
        @NameInMap("CertificateName")
        public String certificateName;

        /**
         * <p>The domain name bound to the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.test.com">www.test.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        public static DescribeProductInstancesResponseBodyProductInstancesResourcePortsCertificates build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductInstancesResponseBodyProductInstancesResourcePortsCertificates self = new DescribeProductInstancesResponseBodyProductInstancesResourcePortsCertificates();
            return TeaModel.build(map, self);
        }

        public DescribeProductInstancesResponseBodyProductInstancesResourcePortsCertificates setAppliedType(String appliedType) {
            this.appliedType = appliedType;
            return this;
        }
        public String getAppliedType() {
            return this.appliedType;
        }

        public DescribeProductInstancesResponseBodyProductInstancesResourcePortsCertificates setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

        public DescribeProductInstancesResponseBodyProductInstancesResourcePortsCertificates setCertificateName(String certificateName) {
            this.certificateName = certificateName;
            return this;
        }
        public String getCertificateName() {
            return this.certificateName;
        }

        public DescribeProductInstancesResponseBodyProductInstancesResourcePortsCertificates setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

    }

    public static class DescribeProductInstancesResponseBodyProductInstancesResourcePorts extends TeaModel {
        /**
         * <p>The information about the certificates.</p>
         */
        @NameInMap("Certificates")
        public java.util.List<DescribeProductInstancesResponseBodyProductInstancesResourcePortsCertificates> certificates;

        /**
         * <p>The port.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li><p><strong>http</strong>: HTTP protocol.</p>
         * </li>
         * <li><p><strong>https</strong>: HTTPS protocol.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>https</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static DescribeProductInstancesResponseBodyProductInstancesResourcePorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductInstancesResponseBodyProductInstancesResourcePorts self = new DescribeProductInstancesResponseBodyProductInstancesResourcePorts();
            return TeaModel.build(map, self);
        }

        public DescribeProductInstancesResponseBodyProductInstancesResourcePorts setCertificates(java.util.List<DescribeProductInstancesResponseBodyProductInstancesResourcePortsCertificates> certificates) {
            this.certificates = certificates;
            return this;
        }
        public java.util.List<DescribeProductInstancesResponseBodyProductInstancesResourcePortsCertificates> getCertificates() {
            return this.certificates;
        }

        public DescribeProductInstancesResponseBodyProductInstancesResourcePorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeProductInstancesResponseBodyProductInstancesResourcePorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeProductInstancesResponseBodyProductInstances extends TeaModel {
        /**
         * <p>The ID of the instance added to WAF.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2ze1tm4pvghp****cluv</p>
         */
        @NameInMap("AccessInstanceId")
        public String accessInstanceId;

        /**
         * <p>The port and protocol information of the cloud service added to WAF.</p>
         */
        @NameInMap("AccessPortAndProtocols")
        public java.util.List<DescribeProductInstancesResponseBodyProductInstancesAccessPortAndProtocols> accessPortAndProtocols;

        /**
         * <p>The list of ports added to WAF.</p>
         */
        @NameInMap("AccessPorts")
        public java.util.List<Integer> accessPorts;

        /**
         * <p>The user ID (UID) of the Alibaba Cloud account to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1704********9107</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        /**
         * <p>The protection status of WAF. Valid values:</p>
         * <ul>
         * <li><p><strong>all</strong>: All protected.</p>
         * </li>
         * <li><p><strong>any</strong>: Protected.</p>
         * </li>
         * <li><p><strong>part</strong>: Partially protected.</p>
         * </li>
         * <li><p><strong>non</strong>: Not protected.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("ResourceInstanceAccessStatus")
        public String resourceInstanceAccessStatus;

        /**
         * <p>The edition of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.e-c1m1.large</p>
         */
        @NameInMap("ResourceInstanceEdition")
        public String resourceInstanceEdition;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2ze1tm4pvghp****cluv</p>
         */
        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        /**
         * <p>The IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1.X.X.1</p>
         */
        @NameInMap("ResourceInstanceIp")
        public String resourceInstanceIp;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>demoInstanceName</p>
         */
        @NameInMap("ResourceInstanceName")
        public String resourceInstanceName;

        /**
         * <p>The public IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1.X.X.1</p>
         */
        @NameInMap("ResourceIp")
        @Deprecated
        public String resourceIp;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs-test</p>
         */
        @NameInMap("ResourceName")
        @Deprecated
        public String resourceName;

        /**
         * <p>The information about the ports.</p>
         */
        @NameInMap("ResourcePorts")
        public java.util.List<DescribeProductInstancesResponseBodyProductInstancesResourcePorts> resourcePorts;

        /**
         * <p>The type of the cloud service. Valid values:</p>
         * <ul>
         * <li><p><strong>clb4</strong>: Layer 4 CLB.</p>
         * </li>
         * <li><p><strong>clb7</strong>: Layer 7 CLB.</p>
         * </li>
         * <li><p><strong>ecs</strong>: ECS.</p>
         * </li>
         * <li><p><strong>nlb</strong>: NLB.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>clb4</p>
         */
        @NameInMap("ResourceProduct")
        public String resourceProduct;

        /**
         * <p>The region ID of the instance. Valid values:</p>
         * <ul>
         * <li><p><strong>cn-chengdu</strong>: China (Chengdu).</p>
         * </li>
         * <li><p><strong>cn-beijing</strong>: China (Beijing).</p>
         * </li>
         * <li><p><strong>cn-zhangjiakou</strong>: China (Zhangjiakou).</p>
         * </li>
         * <li><p><strong>cn-hangzhou</strong>: China (Hangzhou).</p>
         * </li>
         * <li><p><strong>cn-shanghai</strong>: China (Shanghai).</p>
         * </li>
         * <li><p><strong>cn-shenzhen</strong>: China (Shenzhen).</p>
         * </li>
         * <li><p><strong>cn-qingdao</strong>: China (Qingdao).</p>
         * </li>
         * <li><p><strong>cn-hongkong</strong>: China (Hong Kong).</p>
         * </li>
         * <li><p><strong>ap-southeast-3</strong>: Malaysia (Kuala Lumpur).</p>
         * </li>
         * <li><p><strong>ap-southeast-5</strong>: Indonesia (Jakarta).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("ResourceRegionId")
        public String resourceRegionId;

        public static DescribeProductInstancesResponseBodyProductInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeProductInstancesResponseBodyProductInstances self = new DescribeProductInstancesResponseBodyProductInstances();
            return TeaModel.build(map, self);
        }

        public DescribeProductInstancesResponseBodyProductInstances setAccessInstanceId(String accessInstanceId) {
            this.accessInstanceId = accessInstanceId;
            return this;
        }
        public String getAccessInstanceId() {
            return this.accessInstanceId;
        }

        public DescribeProductInstancesResponseBodyProductInstances setAccessPortAndProtocols(java.util.List<DescribeProductInstancesResponseBodyProductInstancesAccessPortAndProtocols> accessPortAndProtocols) {
            this.accessPortAndProtocols = accessPortAndProtocols;
            return this;
        }
        public java.util.List<DescribeProductInstancesResponseBodyProductInstancesAccessPortAndProtocols> getAccessPortAndProtocols() {
            return this.accessPortAndProtocols;
        }

        public DescribeProductInstancesResponseBodyProductInstances setAccessPorts(java.util.List<Integer> accessPorts) {
            this.accessPorts = accessPorts;
            return this;
        }
        public java.util.List<Integer> getAccessPorts() {
            return this.accessPorts;
        }

        public DescribeProductInstancesResponseBodyProductInstances setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public DescribeProductInstancesResponseBodyProductInstances setResourceInstanceAccessStatus(String resourceInstanceAccessStatus) {
            this.resourceInstanceAccessStatus = resourceInstanceAccessStatus;
            return this;
        }
        public String getResourceInstanceAccessStatus() {
            return this.resourceInstanceAccessStatus;
        }

        public DescribeProductInstancesResponseBodyProductInstances setResourceInstanceEdition(String resourceInstanceEdition) {
            this.resourceInstanceEdition = resourceInstanceEdition;
            return this;
        }
        public String getResourceInstanceEdition() {
            return this.resourceInstanceEdition;
        }

        public DescribeProductInstancesResponseBodyProductInstances setResourceInstanceId(String resourceInstanceId) {
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        public DescribeProductInstancesResponseBodyProductInstances setResourceInstanceIp(String resourceInstanceIp) {
            this.resourceInstanceIp = resourceInstanceIp;
            return this;
        }
        public String getResourceInstanceIp() {
            return this.resourceInstanceIp;
        }

        public DescribeProductInstancesResponseBodyProductInstances setResourceInstanceName(String resourceInstanceName) {
            this.resourceInstanceName = resourceInstanceName;
            return this;
        }
        public String getResourceInstanceName() {
            return this.resourceInstanceName;
        }

        @Deprecated
        public DescribeProductInstancesResponseBodyProductInstances setResourceIp(String resourceIp) {
            this.resourceIp = resourceIp;
            return this;
        }
        public String getResourceIp() {
            return this.resourceIp;
        }

        @Deprecated
        public DescribeProductInstancesResponseBodyProductInstances setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public DescribeProductInstancesResponseBodyProductInstances setResourcePorts(java.util.List<DescribeProductInstancesResponseBodyProductInstancesResourcePorts> resourcePorts) {
            this.resourcePorts = resourcePorts;
            return this;
        }
        public java.util.List<DescribeProductInstancesResponseBodyProductInstancesResourcePorts> getResourcePorts() {
            return this.resourcePorts;
        }

        public DescribeProductInstancesResponseBodyProductInstances setResourceProduct(String resourceProduct) {
            this.resourceProduct = resourceProduct;
            return this;
        }
        public String getResourceProduct() {
            return this.resourceProduct;
        }

        public DescribeProductInstancesResponseBodyProductInstances setResourceRegionId(String resourceRegionId) {
            this.resourceRegionId = resourceRegionId;
            return this;
        }
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

    }

}
