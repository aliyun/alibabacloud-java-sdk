// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDomainDetailResponseBody extends TeaModel {
    @NameInMap("DomainDetail")
    public DescribeScdnDomainDetailResponseBodyDomainDetail domainDetail;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeScdnDomainDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDomainDetailResponseBody self = new DescribeScdnDomainDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDomainDetailResponseBody setDomainDetail(DescribeScdnDomainDetailResponseBodyDomainDetail domainDetail) {
        this.domainDetail = domainDetail;
        return this;
    }
    public DescribeScdnDomainDetailResponseBodyDomainDetail getDomainDetail() {
        return this.domainDetail;
    }

    public DescribeScdnDomainDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeScdnDomainDetailResponseBodyDomainDetailSourcesSource extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Enabled")
        public String enabled;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Content")
        public String content;

        public static DescribeScdnDomainDetailResponseBodyDomainDetailSourcesSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainDetailResponseBodyDomainDetailSourcesSource self = new DescribeScdnDomainDetailResponseBodyDomainDetailSourcesSource();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainDetailResponseBodyDomainDetailSourcesSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeScdnDomainDetailResponseBodyDomainDetailSourcesSource setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

        public DescribeScdnDomainDetailResponseBodyDomainDetailSourcesSource setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeScdnDomainDetailResponseBodyDomainDetailSourcesSource setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeScdnDomainDetailResponseBodyDomainDetailSourcesSource setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class DescribeScdnDomainDetailResponseBodyDomainDetailSources extends TeaModel {
        @NameInMap("Source")
        public java.util.List<DescribeScdnDomainDetailResponseBodyDomainDetailSourcesSource> source;

        public static DescribeScdnDomainDetailResponseBodyDomainDetailSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainDetailResponseBodyDomainDetailSources self = new DescribeScdnDomainDetailResponseBodyDomainDetailSources();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainDetailResponseBodyDomainDetailSources setSource(java.util.List<DescribeScdnDomainDetailResponseBodyDomainDetailSourcesSource> source) {
            this.source = source;
            return this;
        }
        public java.util.List<DescribeScdnDomainDetailResponseBodyDomainDetailSourcesSource> getSource() {
            return this.source;
        }

    }

    public static class DescribeScdnDomainDetailResponseBodyDomainDetail extends TeaModel {
        @NameInMap("SSLPub")
        public String SSLPub;

        @NameInMap("Sources")
        public DescribeScdnDomainDetailResponseBodyDomainDetailSources sources;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("Description")
        public String description;

        @NameInMap("SSLProtocol")
        public String SSLProtocol;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("Cname")
        public String cname;

        @NameInMap("DomainStatus")
        public String domainStatus;

        public static DescribeScdnDomainDetailResponseBodyDomainDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnDomainDetailResponseBodyDomainDetail self = new DescribeScdnDomainDetailResponseBodyDomainDetail();
            return TeaModel.build(map, self);
        }

        public DescribeScdnDomainDetailResponseBodyDomainDetail setSSLPub(String SSLPub) {
            this.SSLPub = SSLPub;
            return this;
        }
        public String getSSLPub() {
            return this.SSLPub;
        }

        public DescribeScdnDomainDetailResponseBodyDomainDetail setSources(DescribeScdnDomainDetailResponseBodyDomainDetailSources sources) {
            this.sources = sources;
            return this;
        }
        public DescribeScdnDomainDetailResponseBodyDomainDetailSources getSources() {
            return this.sources;
        }

        public DescribeScdnDomainDetailResponseBodyDomainDetail setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeScdnDomainDetailResponseBodyDomainDetail setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeScdnDomainDetailResponseBodyDomainDetail setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeScdnDomainDetailResponseBodyDomainDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeScdnDomainDetailResponseBodyDomainDetail setSSLProtocol(String SSLProtocol) {
            this.SSLProtocol = SSLProtocol;
            return this;
        }
        public String getSSLProtocol() {
            return this.SSLProtocol;
        }

        public DescribeScdnDomainDetailResponseBodyDomainDetail setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeScdnDomainDetailResponseBodyDomainDetail setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeScdnDomainDetailResponseBodyDomainDetail setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeScdnDomainDetailResponseBodyDomainDetail setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeScdnDomainDetailResponseBodyDomainDetail setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

    }

}
