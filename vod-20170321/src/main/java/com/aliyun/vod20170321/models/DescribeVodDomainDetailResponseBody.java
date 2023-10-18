// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainDetailResponseBody extends TeaModel {
    /**
     * <p>The basic information about the domain name for CDN.</p>
     */
    @NameInMap("DomainDetail")
    public DescribeVodDomainDetailResponseBodyDomainDetail domainDetail;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVodDomainDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainDetailResponseBody self = new DescribeVodDomainDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainDetailResponseBody setDomainDetail(DescribeVodDomainDetailResponseBodyDomainDetail domainDetail) {
        this.domainDetail = domainDetail;
        return this;
    }
    public DescribeVodDomainDetailResponseBodyDomainDetail getDomainDetail() {
        return this.domainDetail;
    }

    public DescribeVodDomainDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVodDomainDetailResponseBodyDomainDetailSourcesSource extends TeaModel {
        /**
         * <p>The address of the origin server.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The status of the origin server. Valid values:</p>
         * <p>*   **online**: indicates that the origin server is enabled.</p>
         * <p>*   **offline**: indicates that the origin server is disabled.</p>
         */
        @NameInMap("Enabled")
        public String enabled;

        /**
         * <p>The port number. Valid values: 443 and 80.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The priority of the origin server.</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The type of the origin server. Valid values:</p>
         * <p>*   **ipaddr**: a server that you can access by using an IP address.</p>
         * <p>*   **domain**: a server that you can access by using a domain name.</p>
         * <p>*   **oss**: the URL of an Object Storage Service (OSS) bucket.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeVodDomainDetailResponseBodyDomainDetailSourcesSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainDetailResponseBodyDomainDetailSourcesSource self = new DescribeVodDomainDetailResponseBodyDomainDetailSourcesSource();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainDetailResponseBodyDomainDetailSourcesSource setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeVodDomainDetailResponseBodyDomainDetailSourcesSource setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

        public DescribeVodDomainDetailResponseBodyDomainDetailSourcesSource setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeVodDomainDetailResponseBodyDomainDetailSourcesSource setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeVodDomainDetailResponseBodyDomainDetailSourcesSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeVodDomainDetailResponseBodyDomainDetailSources extends TeaModel {
        @NameInMap("Source")
        public java.util.List<DescribeVodDomainDetailResponseBodyDomainDetailSourcesSource> source;

        public static DescribeVodDomainDetailResponseBodyDomainDetailSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainDetailResponseBodyDomainDetailSources self = new DescribeVodDomainDetailResponseBodyDomainDetailSources();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainDetailResponseBodyDomainDetailSources setSource(java.util.List<DescribeVodDomainDetailResponseBodyDomainDetailSourcesSource> source) {
            this.source = source;
            return this;
        }
        public java.util.List<DescribeVodDomainDetailResponseBodyDomainDetailSourcesSource> getSource() {
            return this.source;
        }

    }

    public static class DescribeVodDomainDetailResponseBodyDomainDetail extends TeaModel {
        /**
         * <p>The name of the certificate. The value of this parameter is returned if HTTPS is enabled.</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The CNAME that is assigned to the domain name for CDN. You must add a CNAME record in the system of your Domain Name System (DNS) service provider to map the domain name for CDN to the CNAME.</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>The description of the domain name for CDN.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The domain name for CDN.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The status of the domain name for CDN. Value values:</p>
         * <p>*   **online**: indicates that the domain name is enabled.</p>
         * <p>*   **offline**: indicates that the domain name is disabled.</p>
         * <p>*   **configuring**: indicates that the domain name is being configured.</p>
         * <p>*   **configure_failed**: indicates that the domain name failed to be configured.</p>
         * <p>*   **checking**: indicates that the domain name is under review.</p>
         * <p>*   **check_failed**: indicates that the domain name failed the review.</p>
         */
        @NameInMap("DomainStatus")
        public String domainStatus;

        /**
         * <p>The time when the domain name for CDN was added. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The last time when the domain name for CDN was modified. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Indicates whether the Secure Sockets Layer (SSL) certificate is enabled. Valid values:</p>
         * <p>*   **on**: indicates that the SSL certificate is enabled.</p>
         * <p>*   **off**: indicates that the SSL certificate is disabled.</p>
         */
        @NameInMap("SSLProtocol")
        public String SSLProtocol;

        /**
         * <p>The public key of the certificate. The value of this parameter is returned if HTTPS is enabled.</p>
         */
        @NameInMap("SSLPub")
        public String SSLPub;

        /**
         * <p>This parameter is applicable to users of level 3 or higher in mainland China and users outside mainland China. Valid values:</p>
         * <p>*   **domestic**: mainland China. This is the default value.</p>
         * <p>*   **overseas**: outside mainland China.</p>
         * <p>*   **global**: regions in and outside mainland China.</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The information about the origin server.</p>
         */
        @NameInMap("Sources")
        public DescribeVodDomainDetailResponseBodyDomainDetailSources sources;

        /**
         * <p>The weight of the origin server.</p>
         */
        @NameInMap("Weight")
        public String weight;

        public static DescribeVodDomainDetailResponseBodyDomainDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainDetailResponseBodyDomainDetail self = new DescribeVodDomainDetailResponseBodyDomainDetail();
            return TeaModel.build(map, self);
        }

        public DescribeVodDomainDetailResponseBodyDomainDetail setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeVodDomainDetailResponseBodyDomainDetail setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeVodDomainDetailResponseBodyDomainDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVodDomainDetailResponseBodyDomainDetail setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeVodDomainDetailResponseBodyDomainDetail setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public DescribeVodDomainDetailResponseBodyDomainDetail setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeVodDomainDetailResponseBodyDomainDetail setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeVodDomainDetailResponseBodyDomainDetail setSSLProtocol(String SSLProtocol) {
            this.SSLProtocol = SSLProtocol;
            return this;
        }
        public String getSSLProtocol() {
            return this.SSLProtocol;
        }

        public DescribeVodDomainDetailResponseBodyDomainDetail setSSLPub(String SSLPub) {
            this.SSLPub = SSLPub;
            return this;
        }
        public String getSSLPub() {
            return this.SSLPub;
        }

        public DescribeVodDomainDetailResponseBodyDomainDetail setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeVodDomainDetailResponseBodyDomainDetail setSources(DescribeVodDomainDetailResponseBodyDomainDetailSources sources) {
            this.sources = sources;
            return this;
        }
        public DescribeVodDomainDetailResponseBodyDomainDetailSources getSources() {
            return this.sources;
        }

        public DescribeVodDomainDetailResponseBodyDomainDetail setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

}
