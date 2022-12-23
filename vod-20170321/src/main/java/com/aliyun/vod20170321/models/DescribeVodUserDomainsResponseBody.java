// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodUserDomainsResponseBody extends TeaModel {
    // The detailed information about each domain name for CDN. The returned information is displayed in the format that is specified by the PageData parameter.
    @NameInMap("Domains")
    public DescribeVodUserDomainsResponseBodyDomains domains;

    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Long pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Long pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of entries returned.
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeVodUserDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodUserDomainsResponseBody self = new DescribeVodUserDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodUserDomainsResponseBody setDomains(DescribeVodUserDomainsResponseBodyDomains domains) {
        this.domains = domains;
        return this;
    }
    public DescribeVodUserDomainsResponseBodyDomains getDomains() {
        return this.domains;
    }

    public DescribeVodUserDomainsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVodUserDomainsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeVodUserDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodUserDomainsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeVodUserDomainsResponseBodyDomainsPageDataSourcesSource extends TeaModel {
        // The address of the origin server.
        @NameInMap("Content")
        public String content;

        // The port number. Valid values: **443** and **80**.
        @NameInMap("Port")
        public Integer port;

        // The priority of the origin server.
        @NameInMap("Priority")
        public String priority;

        // The type of the origin server. Valid values:
        // 
        // *   **ipaddr**: a server that you can access by using an IP address.
        // *   **domain**: a server that you can access by using a domain name.
        // *   **oss**: an Object Storage Service (OSS) bucket.
        @NameInMap("Type")
        public String type;

        public static DescribeVodUserDomainsResponseBodyDomainsPageDataSourcesSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodUserDomainsResponseBodyDomainsPageDataSourcesSource self = new DescribeVodUserDomainsResponseBodyDomainsPageDataSourcesSource();
            return TeaModel.build(map, self);
        }

        public DescribeVodUserDomainsResponseBodyDomainsPageDataSourcesSource setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeVodUserDomainsResponseBodyDomainsPageDataSourcesSource setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeVodUserDomainsResponseBodyDomainsPageDataSourcesSource setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeVodUserDomainsResponseBodyDomainsPageDataSourcesSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeVodUserDomainsResponseBodyDomainsPageDataSources extends TeaModel {
        @NameInMap("Source")
        public java.util.List<DescribeVodUserDomainsResponseBodyDomainsPageDataSourcesSource> source;

        public static DescribeVodUserDomainsResponseBodyDomainsPageDataSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodUserDomainsResponseBodyDomainsPageDataSources self = new DescribeVodUserDomainsResponseBodyDomainsPageDataSources();
            return TeaModel.build(map, self);
        }

        public DescribeVodUserDomainsResponseBodyDomainsPageDataSources setSource(java.util.List<DescribeVodUserDomainsResponseBodyDomainsPageDataSourcesSource> source) {
            this.source = source;
            return this;
        }
        public java.util.List<DescribeVodUserDomainsResponseBodyDomainsPageDataSourcesSource> getSource() {
            return this.source;
        }

    }

    public static class DescribeVodUserDomainsResponseBodyDomainsPageData extends TeaModel {
        // The canonical domain name that is assigned to the domain name for CDN.
        @NameInMap("Cname")
        public String cname;

        // The remarks.
        @NameInMap("Description")
        public String description;

        // The domain name for CDN.
        @NameInMap("DomainName")
        public String domainName;

        // The status of the domain name for CDN. Valid values:
        // 
        // *   **online**: indicates that the domain name is enabled.
        // *   **offline**: indicates that the domain name is disabled.
        // *   **configuring**: indicates that the domain name is being configured.
        // *   **configure_failed**: indicates that the domain name failed to be configured.
        // *   **checking**: indicates that the domain name is under review.
        // *   **check_failed**: indicates that the domain name failed the review.
        @NameInMap("DomainStatus")
        public String domainStatus;

        // The time when the domain name for CDN was added. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("GmtCreated")
        public String gmtCreated;

        // The last time when the domain name for CDN was modified. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("GmtModified")
        public String gmtModified;

        // Indicates whether the domain name for CDN is in a sandbox environment.
        @NameInMap("Sandbox")
        public String sandbox;

        // The information about the origin server.
        @NameInMap("Sources")
        public DescribeVodUserDomainsResponseBodyDomainsPageDataSources sources;

        // Indicates whether HTTPS is enabled.
        // 
        // - **on**: indicates that HTTPS is enabled.
        // - **off**: indicates that HTTPS is disabled.
        @NameInMap("SslProtocol")
        public String sslProtocol;

        public static DescribeVodUserDomainsResponseBodyDomainsPageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodUserDomainsResponseBodyDomainsPageData self = new DescribeVodUserDomainsResponseBodyDomainsPageData();
            return TeaModel.build(map, self);
        }

        public DescribeVodUserDomainsResponseBodyDomainsPageData setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeVodUserDomainsResponseBodyDomainsPageData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVodUserDomainsResponseBodyDomainsPageData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeVodUserDomainsResponseBodyDomainsPageData setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public DescribeVodUserDomainsResponseBodyDomainsPageData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeVodUserDomainsResponseBodyDomainsPageData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeVodUserDomainsResponseBodyDomainsPageData setSandbox(String sandbox) {
            this.sandbox = sandbox;
            return this;
        }
        public String getSandbox() {
            return this.sandbox;
        }

        public DescribeVodUserDomainsResponseBodyDomainsPageData setSources(DescribeVodUserDomainsResponseBodyDomainsPageDataSources sources) {
            this.sources = sources;
            return this;
        }
        public DescribeVodUserDomainsResponseBodyDomainsPageDataSources getSources() {
            return this.sources;
        }

        public DescribeVodUserDomainsResponseBodyDomainsPageData setSslProtocol(String sslProtocol) {
            this.sslProtocol = sslProtocol;
            return this;
        }
        public String getSslProtocol() {
            return this.sslProtocol;
        }

    }

    public static class DescribeVodUserDomainsResponseBodyDomains extends TeaModel {
        @NameInMap("PageData")
        public java.util.List<DescribeVodUserDomainsResponseBodyDomainsPageData> pageData;

        public static DescribeVodUserDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodUserDomainsResponseBodyDomains self = new DescribeVodUserDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribeVodUserDomainsResponseBodyDomains setPageData(java.util.List<DescribeVodUserDomainsResponseBodyDomainsPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<DescribeVodUserDomainsResponseBodyDomainsPageData> getPageData() {
            return this.pageData;
        }

    }

}
