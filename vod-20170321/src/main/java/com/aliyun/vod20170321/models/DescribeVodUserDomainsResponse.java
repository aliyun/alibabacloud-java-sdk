// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodUserDomainsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Domains")
    @Validation(required = true)
    public DescribeVodUserDomainsResponseDomains domains;

    public static DescribeVodUserDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodUserDomainsResponse self = new DescribeVodUserDomainsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodUserDomainsResponseDomainsPageDataSourcesSource extends TeaModel {
        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("Port")
        @Validation(required = true)
        public Integer port;

        @NameInMap("Priority")
        @Validation(required = true)
        public String priority;

        public static DescribeVodUserDomainsResponseDomainsPageDataSourcesSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodUserDomainsResponseDomainsPageDataSourcesSource self = new DescribeVodUserDomainsResponseDomainsPageDataSourcesSource();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodUserDomainsResponseDomainsPageDataSources extends TeaModel {
        @NameInMap("Source")
        @Validation(required = true)
        public java.util.List<DescribeVodUserDomainsResponseDomainsPageDataSourcesSource> source;

        public static DescribeVodUserDomainsResponseDomainsPageDataSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodUserDomainsResponseDomainsPageDataSources self = new DescribeVodUserDomainsResponseDomainsPageDataSources();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodUserDomainsResponseDomainsPageData extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("Cname")
        @Validation(required = true)
        public String cname;

        @NameInMap("CdnType")
        @Validation(required = true)
        public String cdnType;

        @NameInMap("DomainStatus")
        @Validation(required = true)
        public String domainStatus;

        @NameInMap("GmtCreated")
        @Validation(required = true)
        public String gmtCreated;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("SslProtocol")
        @Validation(required = true)
        public String sslProtocol;

        @NameInMap("Weight")
        @Validation(required = true)
        public String weight;

        @NameInMap("Sandbox")
        @Validation(required = true)
        public String sandbox;

        @NameInMap("Sources")
        @Validation(required = true)
        public DescribeVodUserDomainsResponseDomainsPageDataSources sources;

        public static DescribeVodUserDomainsResponseDomainsPageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodUserDomainsResponseDomainsPageData self = new DescribeVodUserDomainsResponseDomainsPageData();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodUserDomainsResponseDomains extends TeaModel {
        @NameInMap("PageData")
        @Validation(required = true)
        public java.util.List<DescribeVodUserDomainsResponseDomainsPageData> pageData;

        public static DescribeVodUserDomainsResponseDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodUserDomainsResponseDomains self = new DescribeVodUserDomainsResponseDomains();
            return TeaModel.build(map, self);
        }

    }

}
