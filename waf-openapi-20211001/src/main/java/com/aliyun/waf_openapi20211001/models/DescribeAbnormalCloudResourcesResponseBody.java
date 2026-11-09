// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAbnormalCloudResourcesResponseBody extends TeaModel {
    /**
     * <p>The information about resources with abnormal status in cloud native mode.</p>
     */
    @NameInMap("AbnormalCloudResources")
    public java.util.List<DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResources> abnormalCloudResources;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>66A98669-CC6E-4F3E-80A6-***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAbnormalCloudResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAbnormalCloudResourcesResponseBody self = new DescribeAbnormalCloudResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAbnormalCloudResourcesResponseBody setAbnormalCloudResources(java.util.List<DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResources> abnormalCloudResources) {
        this.abnormalCloudResources = abnormalCloudResources;
        return this;
    }
    public java.util.List<DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResources> getAbnormalCloudResources() {
        return this.abnormalCloudResources;
    }

    public DescribeAbnormalCloudResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResourcesDetails extends TeaModel {
        /**
         * <p>The type of the certificate used for the HTTPS protocol. Valid values:</p>
         * <ul>
         * <li><p><strong>default</strong>: The default certificate.</p>
         * </li>
         * <li><p><strong>extension</strong>: The extension certificate.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AppliedType")
        public String appliedType;

        /**
         * <p>The name of the certificate in Certificate Management Service.</p>
         * 
         * <strong>example:</strong>
         * <p>test-name</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The cause of the exception. Valid values:</p>
         * <p>InvalidCert: The certificate is invalid.</p>
         * <p>ClientCertOpend: Mutual authentication is enabled.</p>
         * <p>NetworkConfigLost: A network exception occurred.</p>
         * <p>UserUploadCert: A user-uploaded certificate exists.</p>
         * <p>CertNotExistInCertCenter: The certificate ID does not exist in Certificate Management Service.</p>
         * <p>CertExpired: The certificate has expired.</p>
         * <p>EmptyCertCN: The Common Name (CN) is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>CertExpired</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The Common Name (CN).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.test.com">www.test.com</a></p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The expiration time of the certificate. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1735009193</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The ID of the certificate configured in the cloud service console.</p>
         * 
         * <strong>example:</strong>
         * <p>123-cn-hangzhou</p>
         */
        @NameInMap("ProductCertId")
        public String productCertId;

        /**
         * <p>The name of the certificate configured in the cloud service console.</p>
         * 
         * <strong>example:</strong>
         * <p>test-cert-name</p>
         */
        @NameInMap("ProductCertName")
        public String productCertName;

        /**
         * <p>The domain extension configured in the cloud service console.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.test.com">www.test.com</a></p>
         */
        @NameInMap("ProductDomainExtension")
        public String productDomainExtension;

        public static DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResourcesDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResourcesDetails self = new DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResourcesDetails();
            return TeaModel.build(map, self);
        }

        public DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResourcesDetails setAppliedType(String appliedType) {
            this.appliedType = appliedType;
            return this;
        }
        public String getAppliedType() {
            return this.appliedType;
        }

        public DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResourcesDetails setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResourcesDetails setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResourcesDetails setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResourcesDetails setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResourcesDetails setProductCertId(String productCertId) {
            this.productCertId = productCertId;
            return this;
        }
        public String getProductCertId() {
            return this.productCertId;
        }

        public DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResourcesDetails setProductCertName(String productCertName) {
            this.productCertName = productCertName;
            return this;
        }
        public String getProductCertName() {
            return this.productCertName;
        }

        public DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResourcesDetails setProductDomainExtension(String productDomainExtension) {
            this.productDomainExtension = productDomainExtension;
            return this;
        }
        public String getProductDomainExtension() {
            return this.productDomainExtension;
        }

    }

    public static class DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResources extends TeaModel {
        /**
         * <p>The ID of the added resource, which is automatically generated by WAF.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-***-80-clb7</p>
         */
        @NameInMap("CloudResourceId")
        public String cloudResourceId;

        /**
         * <p>The detailed information about the exception.</p>
         */
        @NameInMap("Details")
        public java.util.List<DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResourcesDetails> details;

        /**
         * <p>The cause of the exception. Valid values:</p>
         * <ul>
         * <li><p><strong>InvalidCert</strong>: The certificate is invalid.</p>
         * </li>
         * <li><p><strong>ClientCertOpend</strong>: Mutual authentication is enabled.</p>
         * </li>
         * <li><p><strong>NetworkConfigLost</strong>: A network exception occurred.</p>
         * </li>
         * <li><p><strong>UserUploadCert</strong>: A user-uploaded certificate exists.</p>
         * </li>
         * <li><p><strong>CertNotExistInCertCenter</strong>: The certificate ID does not exist in Certificate Management Service.</p>
         * </li>
         * <li><p><strong>CertExpired</strong>: The certificate has expired.</p>
         * </li>
         * <li><p><strong>EmptyCertCN</strong>: The Common Name (CN) is empty.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CertExpired</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The instance ID added to WAF.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-***</p>
         */
        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        /**
         * <p>The name of the instance added to WAF.</p>
         * 
         * <strong>example:</strong>
         * <p>test-name</p>
         */
        @NameInMap("ResourceInstanceName")
        public String resourceInstanceName;

        /**
         * <p>The port of the instance added to WAF.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ResourceInstancePort")
        public Integer resourceInstancePort;

        /**
         * <p>The cloud service to which the resource belongs. By default, instances of ALB, MSE, FC, and SAE are returned. Valid values:</p>
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
         * <li><p><strong>clb4</strong>: CLB (TCP).</p>
         * </li>
         * <li><p><strong>clb7</strong>: CLB (HTTP/HTTPS).</p>
         * </li>
         * <li><p><strong>nlb</strong>: NLB.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Different cloud services are supported in different regions. If you specify a value for the product filter field, check the cloud services supported in the region. Otherwise, the filtering may fail.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>clb7</p>
         */
        @NameInMap("ResourceProduct")
        public String resourceProduct;

        public static DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResources self = new DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResources();
            return TeaModel.build(map, self);
        }

        public DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResources setCloudResourceId(String cloudResourceId) {
            this.cloudResourceId = cloudResourceId;
            return this;
        }
        public String getCloudResourceId() {
            return this.cloudResourceId;
        }

        public DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResources setDetails(java.util.List<DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResourcesDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResourcesDetails> getDetails() {
            return this.details;
        }

        public DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResources setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResources setResourceInstanceId(String resourceInstanceId) {
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }
        public String getResourceInstanceId() {
            return this.resourceInstanceId;
        }

        public DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResources setResourceInstanceName(String resourceInstanceName) {
            this.resourceInstanceName = resourceInstanceName;
            return this;
        }
        public String getResourceInstanceName() {
            return this.resourceInstanceName;
        }

        public DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResources setResourceInstancePort(Integer resourceInstancePort) {
            this.resourceInstancePort = resourceInstancePort;
            return this;
        }
        public Integer getResourceInstancePort() {
            return this.resourceInstancePort;
        }

        public DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResources setResourceProduct(String resourceProduct) {
            this.resourceProduct = resourceProduct;
            return this;
        }
        public String getResourceProduct() {
            return this.resourceProduct;
        }

    }

}
