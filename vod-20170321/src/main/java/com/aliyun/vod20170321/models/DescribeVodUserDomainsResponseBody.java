// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodUserDomainsResponseBody extends TeaModel {
    /**
     * <p>The status of the domain name. The value of this parameter is used as a condition to filter domain names. Value values:</p>
     * <br>
     * <p>*   **online**: indicates that the domain name is enabled.</p>
     * <p>*   **offline**: indicates that the domain name is disabled.</p>
     * <p>*   **configuring**: indicates that the domain name is being configured.</p>
     * <p>*   **configure_failed**: indicates that the domain name failed to be configured.</p>
     * <p>*   **checking**: indicates that the domain name is under review.</p>
     * <p>*   **check_failed**: indicates that the domain name failed the review.</p>
     */
    @NameInMap("Domains")
    public DescribeVodUserDomainsResponseBodyDomains domains;

    /**
     * <p>The domain name. The value of this parameter is used as a filter condition for a fuzzy match.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The time when the domain name for CDN was added. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether HTTPS is enabled.</p>
     * <br>
     * <p>- **on**: indicates that HTTPS is enabled.</p>
     * <p>- **off**: indicates that HTTPS is disabled.</p>
     */
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
        @NameInMap("Content")
        public String content;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Priority")
        public String priority;

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
        /**
         * <p>Queries the domain names for CDN within your Alibaba Cloud account. You can filter domain names by name or by state. When you filter domain names by name, a fuzzy match is supported.</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainStatus")
        public String domainStatus;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Sandbox")
        public String sandbox;

        @NameInMap("Sources")
        public DescribeVodUserDomainsResponseBodyDomainsPageDataSources sources;

        /**
         * <p>The key of tag N. Valid values of N: **1** to **20**.</p>
         * <br>
         * <p>If you do not specify this parameter, all tag keys are queried.</p>
         */
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
