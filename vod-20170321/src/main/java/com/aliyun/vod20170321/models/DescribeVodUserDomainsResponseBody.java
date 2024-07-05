// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodUserDomainsResponseBody extends TeaModel {
    /**
     * <p>The detailed information about each domain name for CDN. The returned information is displayed in the format that is specified by the PageData parameter.</p>
     */
    @NameInMap("Domains")
    public DescribeVodUserDomainsResponseBodyDomains domains;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E4EBD2BF-5EB0-4476-****-9D94E1B15267</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
        /**
         * <p>The address of the origin server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The port number. Valid values: <strong>443</strong> and <strong>80</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The priority of the origin server.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The type of the origin server. Valid values:</p>
         * <ul>
         * <li><strong>ipaddr</strong>: an IP address.</li>
         * <li><strong>domain</strong>: an origin domain name</li>
         * <li><strong>oss</strong>: the OSS domain of an Object Storage Service (OSS) bucket</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
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
         * <p>The CNAME that is assigned to the domain name for CDN.</p>
         * 
         * <strong>example:</strong>
         * <p>learn.developer.aliyundoc.com</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhejiang ICP Filing No. ****</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The domain name for CDN.</p>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The status of the domain name for CDN. Valid values:</p>
         * <ul>
         * <li><strong>online</strong>: indicates that the domain name is enabled.</li>
         * <li><strong>offline</strong>: indicates that the domain name is disabled.</li>
         * <li><strong>configuring</strong>: indicates that the domain name is being configured.</li>
         * <li><strong>configure_failed</strong>: indicates that the domain name failed to be configured.</li>
         * <li><strong>checking</strong>: indicates that the domain name is under review.</li>
         * <li><strong>check_failed</strong>: indicates that the domain name failed the review.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("DomainStatus")
        public String domainStatus;

        /**
         * <p>The time when the domain name for CDN was added. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-08-29T08:40:53Z</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The last time when the domain name for CDN was modified. The time is in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-29T09:24:12Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Indicates whether the accelerated domain name was in a sandbox.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Sandbox")
        public String sandbox;

        /**
         * <p>The information about the origin server.</p>
         */
        @NameInMap("Sources")
        public DescribeVodUserDomainsResponseBodyDomainsPageDataSources sources;

        /**
         * <p>Indicates whether HTTPS is enabled.</p>
         * <ul>
         * <li><strong>on</strong>: HTTPS is enabled.</li>
         * <li><strong>off</strong>: HTTPS is not eabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
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
