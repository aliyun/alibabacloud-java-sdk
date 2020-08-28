// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainDetail")
    @Validation(required = true)
    public DescribeVodDomainDetailResponseDomainDetail domainDetail;

    public static DescribeVodDomainDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainDetailResponse self = new DescribeVodDomainDetailResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeVodDomainDetailResponseDomainDetailSourcesSource extends TeaModel {
        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Port")
        @Validation(required = true)
        public Integer port;

        @NameInMap("Enabled")
        @Validation(required = true)
        public String enabled;

        @NameInMap("Priority")
        @Validation(required = true)
        public String priority;

        public static DescribeVodDomainDetailResponseDomainDetailSourcesSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainDetailResponseDomainDetailSourcesSource self = new DescribeVodDomainDetailResponseDomainDetailSourcesSource();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainDetailResponseDomainDetailSources extends TeaModel {
        @NameInMap("Source")
        @Validation(required = true)
        public java.util.List<DescribeVodDomainDetailResponseDomainDetailSourcesSource> source;

        public static DescribeVodDomainDetailResponseDomainDetailSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainDetailResponseDomainDetailSources self = new DescribeVodDomainDetailResponseDomainDetailSources();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeVodDomainDetailResponseDomainDetail extends TeaModel {
        @NameInMap("GmtCreated")
        @Validation(required = true)
        public String gmtCreated;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("DomainStatus")
        @Validation(required = true)
        public String domainStatus;

        @NameInMap("Cname")
        @Validation(required = true)
        public String cname;

        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("SSLProtocol")
        @Validation(required = true)
        public String SSLProtocol;

        @NameInMap("SSLPub")
        @Validation(required = true)
        public String SSLPub;

        @NameInMap("Scope")
        @Validation(required = true)
        public String scope;

        @NameInMap("CertName")
        @Validation(required = true)
        public String certName;

        @NameInMap("Weight")
        @Validation(required = true)
        public String weight;

        @NameInMap("Sources")
        @Validation(required = true)
        public DescribeVodDomainDetailResponseDomainDetailSources sources;

        public static DescribeVodDomainDetailResponseDomainDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodDomainDetailResponseDomainDetail self = new DescribeVodDomainDetailResponseDomainDetail();
            return TeaModel.build(map, self);
        }

    }

}
