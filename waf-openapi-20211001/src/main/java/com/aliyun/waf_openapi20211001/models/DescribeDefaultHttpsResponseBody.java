// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefaultHttpsResponseBody extends TeaModel {
    /**
     * <p>The default SSL/TLS settings.</p>
     */
    @NameInMap("DefaultHttps")
    public DescribeDefaultHttpsResponseBodyDefaultHttps defaultHttps;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F35F45B0-5D6B-4238-BE02-A62D****E840</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDefaultHttpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefaultHttpsResponseBody self = new DescribeDefaultHttpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefaultHttpsResponseBody setDefaultHttps(DescribeDefaultHttpsResponseBodyDefaultHttps defaultHttps) {
        this.defaultHttps = defaultHttps;
        return this;
    }
    public DescribeDefaultHttpsResponseBodyDefaultHttps getDefaultHttps() {
        return this.defaultHttps;
    }

    public DescribeDefaultHttpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDefaultHttpsResponseBodyDefaultHttps extends TeaModel {
        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>123-cn-hangzhou</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <p>The type of the cipher suite. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: All cipher suites are added.</p>
         * </li>
         * <li><p><strong>2</strong>: Strong cipher suites are added. This value is available only when TLSVersion is set to tlsv1.2.</p>
         * </li>
         * <li><p><strong>99</strong>: Custom cipher suites are added. This value is available only when TLSVersion is not set to tlsv1.3.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CipherSuite")
        public String cipherSuite;

        /**
         * <p>The custom cipher suites.</p>
         * 
         * <strong>example:</strong>
         * <p>ECDHE-ECDSA-AES128-GCM-SHA256:ECDHE-ECDSA-AES256-GCM-SHA384:ECDHE-RSA-AES128-GCM-SHA256:ECDHE-RSA-AES256-GCM-SHA384</p>
         */
        @NameInMap("CustomCiphers")
        public String customCiphers;

        /**
         * <p>Indicates whether TLS 1.3 is supported. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: TLS 1.3 is supported.</p>
         * </li>
         * <li><p><strong>false</strong>: TLS 1.3 is not supported.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when HttpsPorts is not empty, which indicates that the domain name uses the HTTPS protocol. When TLSVersion is set to tlsv1.3, this value must be true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableTLSv3")
        public Boolean enableTLSv3;

        /**
         * <p>The TLS version. Valid values:</p>
         * <ul>
         * <li><p><strong>tlsv1</strong>: TLS 1.0 and later are supported. This value provides the highest compatibility and the lowest security.</p>
         * </li>
         * <li><p><strong>tlsv1.1</strong>: TLS 1.1 and later are supported. This value provides good compatibility and security.</p>
         * </li>
         * <li><p><strong>tlsv1.2</strong>: TLS 1.2 and later are supported. This value provides good compatibility and the highest security.</p>
         * </li>
         * <li><p><strong>tlsv1.3</strong>: Only TLS 1.3 is supported. This value provides the highest security and the lowest compatibility.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tlsv1</p>
         */
        @NameInMap("TLSVersion")
        public String TLSVersion;

        public static DescribeDefaultHttpsResponseBodyDefaultHttps build(java.util.Map<String, ?> map) throws Exception {
            DescribeDefaultHttpsResponseBodyDefaultHttps self = new DescribeDefaultHttpsResponseBodyDefaultHttps();
            return TeaModel.build(map, self);
        }

        public DescribeDefaultHttpsResponseBodyDefaultHttps setCertId(String certId) {
            this.certId = certId;
            return this;
        }
        public String getCertId() {
            return this.certId;
        }

        public DescribeDefaultHttpsResponseBodyDefaultHttps setCipherSuite(String cipherSuite) {
            this.cipherSuite = cipherSuite;
            return this;
        }
        public String getCipherSuite() {
            return this.cipherSuite;
        }

        public DescribeDefaultHttpsResponseBodyDefaultHttps setCustomCiphers(String customCiphers) {
            this.customCiphers = customCiphers;
            return this;
        }
        public String getCustomCiphers() {
            return this.customCiphers;
        }

        public DescribeDefaultHttpsResponseBodyDefaultHttps setEnableTLSv3(Boolean enableTLSv3) {
            this.enableTLSv3 = enableTLSv3;
            return this;
        }
        public Boolean getEnableTLSv3() {
            return this.enableTLSv3;
        }

        public DescribeDefaultHttpsResponseBodyDefaultHttps setTLSVersion(String TLSVersion) {
            this.TLSVersion = TLSVersion;
            return this;
        }
        public String getTLSVersion() {
            return this.TLSVersion;
        }

    }

}
