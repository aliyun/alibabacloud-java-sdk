// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsDomainDetailResponseBody extends TeaModel {
    /**
     * <p>Domain configuration details.</p>
     */
    @NameInMap("DomainConfig")
    public DescribeVsDomainDetailResponseBodyDomainConfig domainConfig;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9BEC5E85-C76B-56EF-A922-860EFDB8B64B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVsDomainDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsDomainDetailResponseBody self = new DescribeVsDomainDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVsDomainDetailResponseBody setDomainConfig(DescribeVsDomainDetailResponseBodyDomainConfig domainConfig) {
        this.domainConfig = domainConfig;
        return this;
    }
    public DescribeVsDomainDetailResponseBodyDomainConfig getDomainConfig() {
        return this.domainConfig;
    }

    public DescribeVsDomainDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVsDomainDetailResponseBodyDomainConfig extends TeaModel {
        /**
         * <p>The CNAME assigned to the Visual Edge Computing Service domain. You must configure your DNS provider to point your domain to this CNAME.</p>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com.*****.com</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>The domain description.</p>
         * 
         * <strong>example:</strong>
         * <p>测试使用</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The Visual Edge Computing Service domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The status of the Visual Edge Computing Service accelerated domain. Valid values:</p>
         * <ul>
         * <li><p><strong>online</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>offline</strong>: Disabled.</p>
         * </li>
         * <li><p><strong>configuring</strong>: Being configured.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("DomainStatus")
        public String domainStatus;

        /**
         * <p>The domain type.</p>
         * <blockquote>
         * <p>Static value: vs</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vs</p>
         */
        @NameInMap("DomainType")
        public String domainType;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-19T10:27:23Z</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The most recent modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-19T10:27:23Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The region where the domain is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>Indicates whether HTTPS is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>off</strong> (default): Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("SSLProtocol")
        public String SSLProtocol;

        /**
         * <p>The acceleration region. Valid values:</p>
         * <ul>
         * <li><p><strong>domestic</strong></p>
         * </li>
         * <li><p><strong>overseas</strong></p>
         * </li>
         * <li><p><strong>global</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domestic</p>
         */
        @NameInMap("Scope")
        public String scope;

        public static DescribeVsDomainDetailResponseBodyDomainConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVsDomainDetailResponseBodyDomainConfig self = new DescribeVsDomainDetailResponseBodyDomainConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setSSLProtocol(String SSLProtocol) {
            this.SSLProtocol = SSLProtocol;
            return this;
        }
        public String getSSLProtocol() {
            return this.SSLProtocol;
        }

        public DescribeVsDomainDetailResponseBodyDomainConfig setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

    }

}
