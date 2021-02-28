// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnUserDomainsResponseBody extends TeaModel {
    @NameInMap("Domains")
    public DescribeScdnUserDomainsResponseBodyDomains domains;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PageNumber")
    public Long pageNumber;

    public static DescribeScdnUserDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnUserDomainsResponseBody self = new DescribeScdnUserDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnUserDomainsResponseBody setDomains(DescribeScdnUserDomainsResponseBodyDomains domains) {
        this.domains = domains;
        return this;
    }
    public DescribeScdnUserDomainsResponseBodyDomains getDomains() {
        return this.domains;
    }

    public DescribeScdnUserDomainsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeScdnUserDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnUserDomainsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeScdnUserDomainsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeScdnUserDomainsResponseBodyDomainsPageDataSourcesSource extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Content")
        public String content;

        public static DescribeScdnUserDomainsResponseBodyDomainsPageDataSourcesSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnUserDomainsResponseBodyDomainsPageDataSourcesSource self = new DescribeScdnUserDomainsResponseBodyDomainsPageDataSourcesSource();
            return TeaModel.build(map, self);
        }

        public DescribeScdnUserDomainsResponseBodyDomainsPageDataSourcesSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeScdnUserDomainsResponseBodyDomainsPageDataSourcesSource setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeScdnUserDomainsResponseBodyDomainsPageDataSourcesSource setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeScdnUserDomainsResponseBodyDomainsPageDataSourcesSource setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class DescribeScdnUserDomainsResponseBodyDomainsPageDataSources extends TeaModel {
        @NameInMap("Source")
        public java.util.List<DescribeScdnUserDomainsResponseBodyDomainsPageDataSourcesSource> source;

        public static DescribeScdnUserDomainsResponseBodyDomainsPageDataSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnUserDomainsResponseBodyDomainsPageDataSources self = new DescribeScdnUserDomainsResponseBodyDomainsPageDataSources();
            return TeaModel.build(map, self);
        }

        public DescribeScdnUserDomainsResponseBodyDomainsPageDataSources setSource(java.util.List<DescribeScdnUserDomainsResponseBodyDomainsPageDataSourcesSource> source) {
            this.source = source;
            return this;
        }
        public java.util.List<DescribeScdnUserDomainsResponseBodyDomainsPageDataSourcesSource> getSource() {
            return this.source;
        }

    }

    public static class DescribeScdnUserDomainsResponseBodyDomainsPageData extends TeaModel {
        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("Description")
        public String description;

        @NameInMap("SSLProtocol")
        public String SSLProtocol;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Sandbox")
        public String sandbox;

        @NameInMap("DomainStatus")
        public String domainStatus;

        @NameInMap("Cname")
        public String cname;

        @NameInMap("Sources")
        public DescribeScdnUserDomainsResponseBodyDomainsPageDataSources sources;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("DomainName")
        public String domainName;

        public static DescribeScdnUserDomainsResponseBodyDomainsPageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnUserDomainsResponseBodyDomainsPageData self = new DescribeScdnUserDomainsResponseBodyDomainsPageData();
            return TeaModel.build(map, self);
        }

        public DescribeScdnUserDomainsResponseBodyDomainsPageData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeScdnUserDomainsResponseBodyDomainsPageData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeScdnUserDomainsResponseBodyDomainsPageData setSSLProtocol(String SSLProtocol) {
            this.SSLProtocol = SSLProtocol;
            return this;
        }
        public String getSSLProtocol() {
            return this.SSLProtocol;
        }

        public DescribeScdnUserDomainsResponseBodyDomainsPageData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeScdnUserDomainsResponseBodyDomainsPageData setSandbox(String sandbox) {
            this.sandbox = sandbox;
            return this;
        }
        public String getSandbox() {
            return this.sandbox;
        }

        public DescribeScdnUserDomainsResponseBodyDomainsPageData setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public DescribeScdnUserDomainsResponseBodyDomainsPageData setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeScdnUserDomainsResponseBodyDomainsPageData setSources(DescribeScdnUserDomainsResponseBodyDomainsPageDataSources sources) {
            this.sources = sources;
            return this;
        }
        public DescribeScdnUserDomainsResponseBodyDomainsPageDataSources getSources() {
            return this.sources;
        }

        public DescribeScdnUserDomainsResponseBodyDomainsPageData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeScdnUserDomainsResponseBodyDomainsPageData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

    public static class DescribeScdnUserDomainsResponseBodyDomains extends TeaModel {
        @NameInMap("PageData")
        public java.util.List<DescribeScdnUserDomainsResponseBodyDomainsPageData> pageData;

        public static DescribeScdnUserDomainsResponseBodyDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnUserDomainsResponseBodyDomains self = new DescribeScdnUserDomainsResponseBodyDomains();
            return TeaModel.build(map, self);
        }

        public DescribeScdnUserDomainsResponseBodyDomains setPageData(java.util.List<DescribeScdnUserDomainsResponseBodyDomainsPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<DescribeScdnUserDomainsResponseBodyDomainsPageData> getPageData() {
            return this.pageData;
        }

    }

}
