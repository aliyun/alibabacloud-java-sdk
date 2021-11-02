// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainDetailResponseBody extends TeaModel {
    @NameInMap("DomainDetail")
    public DescribeVodDomainDetailResponseBodyDomainDetail domainDetail;

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
        @NameInMap("CertName")
        public String certName;

        @NameInMap("Cname")
        public String cname;

        @NameInMap("Description")
        public String description;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainStatus")
        public String domainStatus;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("SSLProtocol")
        public String SSLProtocol;

        @NameInMap("SSLPub")
        public String SSLPub;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("Sources")
        public DescribeVodDomainDetailResponseBodyDomainDetailSources sources;

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
