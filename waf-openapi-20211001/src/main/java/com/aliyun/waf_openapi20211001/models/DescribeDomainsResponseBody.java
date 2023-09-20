// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDomainsResponseBody extends TeaModel {
    /**
     * <p>The domain names that are added to WAF in CNAME record mode.</p>
     */
    @NameInMap("Domains")
    public java.util.List<DescribeDomainsResponseBodyDomains> domains;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainsResponseBody self = new DescribeDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainsResponseBody setDomains(java.util.List<DescribeDomainsResponseBodyDomains> domains) {
        this.domains = domains;
        return this;
    }
    public java.util.List<DescribeDomainsResponseBodyDomains> getDomains() {
        return this.domains;
    }

    public DescribeDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDomainsResponseBodyDomainsBackedsHttp extends TeaModel {
        /**
         * <p>The HTTP address of the origin server.</p>
         */
        @NameInMap("Backend")
        public String backend;

        public static DescribeDomainsResponseBodyDomainsBackedsHttp build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseBodyDomainsBackedsHttp self = new DescribeDomainsResponseBodyDomainsBackedsHttp();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseBodyDomainsBackedsHttp setBackend(String backend) {
            this.backend = backend;
            return this;
        }
        public String getBackend() {
            return this.backend;
        }

    }

    public static class DescribeDomainsResponseBodyDomainsBackedsHttps extends TeaModel {
        /**
         * <p>The HTTPS address of the origin server.</p>
         */
        @NameInMap("Backend")
        public String backend;

        public static DescribeDomainsResponseBodyDomainsBackedsHttps build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseBodyDomainsBackedsHttps self = new DescribeDomainsResponseBodyDomainsBackedsHttps();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseBodyDomainsBackedsHttps setBackend(String backend) {
            this.backend = backend;
            return this;
        }
        public String getBackend() {
            return this.backend;
        }

    }

    public static class DescribeDomainsResponseBodyDomainsBackeds extends TeaModel {
        /**
         * <p>The HTTP addresses of the origin server.</p>
         */
        @NameInMap("Http")
        public java.util.List<DescribeDomainsResponseBodyDomainsBackedsHttp> http;

        /**
         * <p>The HTTPS addresses of the origin server.</p>
         */
        @NameInMap("Https")
        public java.util.List<DescribeDomainsResponseBodyDomainsBackedsHttps> https;

        public static DescribeDomainsResponseBodyDomainsBackeds build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseBodyDomainsBackeds self = new DescribeDomainsResponseBodyDomainsBackeds();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseBodyDomainsBackeds setHttp(java.util.List<DescribeDomainsResponseBodyDomainsBackedsHttp> http) {
            this.http = http;
            return this;
        }
        public java.util.List<DescribeDomainsResponseBodyDomainsBackedsHttp> getHttp() {
            return this.http;
        }

        public DescribeDomainsResponseBodyDomainsBackeds setHttps(java.util.List<DescribeDomainsResponseBodyDomainsBackedsHttps> https) {
            this.https = https;
            return this;
        }
        public java.util.List<DescribeDomainsResponseBodyDomainsBackedsHttps> getHttps() {
            return this.https;
        }

    }

    public static class DescribeDomainsResponseBodyDomainsListenPorts extends TeaModel {
        /**
         * <p>The HTTP listener ports.</p>
         */
        @NameInMap("Http")
        public java.util.List<Long> http;

        /**
         * <p>The HTTPS listener ports.</p>
         */
        @NameInMap("Https")
        public java.util.List<Long> https;

        public static DescribeDomainsResponseBodyDomainsListenPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseBodyDomainsListenPorts self = new DescribeDomainsResponseBodyDomainsListenPorts();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseBodyDomainsListenPorts setHttp(java.util.List<Long> http) {
            this.http = http;
            return this;
        }
        public java.util.List<Long> getHttp() {
            return this.http;
        }

        public DescribeDomainsResponseBodyDomainsListenPorts setHttps(java.util.List<Long> https) {
            this.https = https;
            return this;
        }
        public java.util.List<Long> getHttps() {
            return this.https;
        }

    }

    public static class DescribeDomainsResponseBodyDomains extends TeaModel {
        /**
         * <p>The back-to-origin settings.</p>
         */
        @NameInMap("Backeds")
        public DescribeDomainsResponseBodyDomainsBackeds backeds;

        /**
         * <p>The CNAME assigned by WAF to the domain name.</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>The domain name that is added to WAF in CNAME record mode.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The configurations of the listeners.</p>
         */
        @NameInMap("ListenPorts")
        public DescribeDomainsResponseBodyDomainsListenPorts listenPorts;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceManagerResourceGroupId")
        public String resourceManagerResourceGroupId;

        /**
         * <p>The status of the domain name. Valid values:</p>
         * <br>
         * <p>*   **1:** The domain name is in a normal state.</p>
         * <p>*   **2:** The domain name is being created.</p>
         * <p>*   **3:** The domain name is being modified.</p>
         * <p>*   **4:** The domain name is being released.</p>
         * <p>*   **5:** WAF no longer forwards traffic that is sent to the domain name.</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseBodyDomains self = new DescribeDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseBodyDomains setBackeds(DescribeDomainsResponseBodyDomainsBackeds backeds) {
            this.backeds = backeds;
            return this;
        }
        public DescribeDomainsResponseBodyDomainsBackeds getBackeds() {
            return this.backeds;
        }

        public DescribeDomainsResponseBodyDomains setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeDomainsResponseBodyDomains setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainsResponseBodyDomains setListenPorts(DescribeDomainsResponseBodyDomainsListenPorts listenPorts) {
            this.listenPorts = listenPorts;
            return this;
        }
        public DescribeDomainsResponseBodyDomainsListenPorts getListenPorts() {
            return this.listenPorts;
        }

        public DescribeDomainsResponseBodyDomains setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }
        public String getResourceManagerResourceGroupId() {
            return this.resourceManagerResourceGroupId;
        }

        public DescribeDomainsResponseBodyDomains setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
