// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAbnormalCloudResourcesResponseBody extends TeaModel {
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
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AppliedType")
        public String appliedType;

        /**
         * <strong>example:</strong>
         * <p>test-name</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <strong>example:</strong>
         * <p>CertExpired</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.test.com">www.test.com</a></p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <strong>example:</strong>
         * <p>1735009193</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <strong>example:</strong>
         * <p>123-cn-hangzhou</p>
         */
        @NameInMap("ProductCertId")
        public String productCertId;

        /**
         * <strong>example:</strong>
         * <p>test-name</p>
         */
        @NameInMap("ProductCertName")
        public String productCertName;

        /**
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
        @NameInMap("Details")
        public java.util.List<DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResourcesDetails> details;

        /**
         * <strong>example:</strong>
         * <p>CertExpired</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>lb-***</p>
         */
        @NameInMap("ResourceInstanceId")
        public String resourceInstanceId;

        /**
         * <strong>example:</strong>
         * <p>test-name</p>
         */
        @NameInMap("ResourceInstanceName")
        public String resourceInstanceName;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ResourceInstancePort")
        public Integer resourceInstancePort;

        /**
         * <strong>example:</strong>
         * <p>clb7</p>
         */
        @NameInMap("ResourceProduct")
        public String resourceProduct;

        public static DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResources self = new DescribeAbnormalCloudResourcesResponseBodyAbnormalCloudResources();
            return TeaModel.build(map, self);
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
