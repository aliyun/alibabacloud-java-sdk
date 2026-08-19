// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainDetailResponseBody extends TeaModel {
    /**
     * <p>The basic configuration information of the domain name.</p>
     */
    @NameInMap("DomainDetail")
    public DescribeVodDomainDetailResponseBodyDomainDetail domainDetail;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>09ABE829-6CD3-4FE0-556113E2****</p>
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
        @NameInMap("Content")
        public String content;

        @NameInMap("Enabled")
        public String enabled;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public String weight;

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

        public DescribeVodDomainDetailResponseBodyDomainDetailSourcesSource setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
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
         * <p>The name of the HTTPS certificate. This parameter is returned only if HTTPS secure acceleration is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>testCertName</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The CNAME assigned to the accelerated domain name. You must add a CNAME record with your DNS provider to map the accelerated domain name to this CNAME. For more information, see <a href="https://help.aliyun.com/document_detail/86075.html">Configure a CNAME record</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com.w.alikunlun.net</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>The description of the VOD acceleration domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The VOD acceleration domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The status of the accelerated domain name. Valid values:</p>
         * <ul>
         * <li><strong>online</strong>: enabled.</li>
         * <li><strong>offline</strong>: disabled.</li>
         * <li><strong>configuring</strong>: being configured.</li>
         * <li><strong>configure_failed</strong>: configuration failed.</li>
         * <li><strong>checking</strong>: being reviewed.</li>
         * <li><strong>check_failed</strong>: review failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("DomainStatus")
        public String domainStatus;

        /**
         * <p>The time when the domain name was created. The time follows the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-27T06:51:26Z</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The time when the domain name was last modified. The time follows the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-11-27T06:55:26Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Indicates whether the SSL certificate is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: Enabled.</li>
         * <li><strong>off</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("SSLProtocol")
        public String SSLProtocol;

        /**
         * <p>The public key of the HTTPS certificate. This parameter is returned only if HTTPS secure acceleration is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>yourSSLPub</p>
         */
        @NameInMap("SSLPub")
        public String SSLPub;

        /**
         * <p>The acceleration region. Valid values:</p>
         * <ul>
         * <li><strong>domestic</strong> (default): the Chinese mainland only.</li>
         * <li><strong>overseas</strong>: global (excluding the Chinese mainland).</li>
         * <li><strong>global</strong>: global.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domestic</p>
         */
        @NameInMap("Scope")
        public String scope;

        @NameInMap("Sources")
        public DescribeVodDomainDetailResponseBodyDomainDetailSources sources;

        /**
         * <p>The back-to-origin weight.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
