// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationSSLResponseBody extends TeaModel {
    /**
     * <p>The Common Name of the certificate. This field is empty when SSL is not enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx.polarclaw.rds.aliyuncs.com</p>
     */
    @NameInMap("CertCommonName")
    public String certCommonName;

    /**
     * <p>The certificate expiration time in UTC. This field is empty when SSL is not enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>2027-08-09T10:23:26Z</p>
     */
    @NameInMap("CertExpiredTime")
    public String certExpiredTime;

    /**
     * <p>The SHA-256 (DER) fingerprint of the server certificate in lowercase hex. Use this value for client pinning. This is consistent with openssl -fingerprint -sha256. This field is empty when SSL is not enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>20769803152bf6a3abed626f6b8cae3a1f0d0f2c3b4a59687776655443322110</p>
     */
    @NameInMap("CertFingerprintSha256Der")
    public String certFingerprintSha256Der;

    /**
     * <p>The most recent certificate installation time in UTC. This field is empty when SSL is not enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-09T10:23:49Z</p>
     */
    @NameInMap("CertModifiedTime")
    public String certModifiedTime;

    /**
     * <p>The certificate source. Valid values:</p>
     * <ul>
     * <li>ca: issued by the platform.</li>
     * <li>customer: provided by the user.</li>
     * </ul>
     * <p>This field is empty when SSL is not enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>ca</p>
     */
    @NameInMap("CertSource")
    public String certSource;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2F029645-FED9-4FE8-A6D3-488954******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether automatic rotation of platform-issued certificates is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SSLAutoRotate")
    public Boolean SSLAutoRotate;

    /**
     * <p>Indicates whether SSL is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SSLEnabled")
    public Boolean SSLEnabled;

    public static DescribeApplicationSSLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationSSLResponseBody self = new DescribeApplicationSSLResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationSSLResponseBody setCertCommonName(String certCommonName) {
        this.certCommonName = certCommonName;
        return this;
    }
    public String getCertCommonName() {
        return this.certCommonName;
    }

    public DescribeApplicationSSLResponseBody setCertExpiredTime(String certExpiredTime) {
        this.certExpiredTime = certExpiredTime;
        return this;
    }
    public String getCertExpiredTime() {
        return this.certExpiredTime;
    }

    public DescribeApplicationSSLResponseBody setCertFingerprintSha256Der(String certFingerprintSha256Der) {
        this.certFingerprintSha256Der = certFingerprintSha256Der;
        return this;
    }
    public String getCertFingerprintSha256Der() {
        return this.certFingerprintSha256Der;
    }

    public DescribeApplicationSSLResponseBody setCertModifiedTime(String certModifiedTime) {
        this.certModifiedTime = certModifiedTime;
        return this;
    }
    public String getCertModifiedTime() {
        return this.certModifiedTime;
    }

    public DescribeApplicationSSLResponseBody setCertSource(String certSource) {
        this.certSource = certSource;
        return this;
    }
    public String getCertSource() {
        return this.certSource;
    }

    public DescribeApplicationSSLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationSSLResponseBody setSSLAutoRotate(Boolean SSLAutoRotate) {
        this.SSLAutoRotate = SSLAutoRotate;
        return this;
    }
    public Boolean getSSLAutoRotate() {
        return this.SSLAutoRotate;
    }

    public DescribeApplicationSSLResponseBody setSSLEnabled(Boolean SSLEnabled) {
        this.SSLEnabled = SSLEnabled;
        return this;
    }
    public Boolean getSSLEnabled() {
        return this.SSLEnabled;
    }

}
