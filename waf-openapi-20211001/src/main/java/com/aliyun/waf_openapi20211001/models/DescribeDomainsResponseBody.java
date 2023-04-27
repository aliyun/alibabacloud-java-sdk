// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDomainsResponseBody extends TeaModel {
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
        @NameInMap("Http")
        public java.util.List<DescribeDomainsResponseBodyDomainsBackedsHttp> http;

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
        @NameInMap("Http")
        public java.util.List<Long> http;

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
        @NameInMap("Backeds")
        public DescribeDomainsResponseBodyDomainsBackeds backeds;

        @NameInMap("Cname")
        public String cname;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("ListenPorts")
        public DescribeDomainsResponseBodyDomainsListenPorts listenPorts;

        /**
         * <p>阿里云资源组ID。</p>
         */
        @NameInMap("ResourceManagerResourceGroupId")
        public String resourceManagerResourceGroupId;

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
