// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeDomainExtensionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainExtensions")
    public java.util.List<DescribeDomainExtensionsResponseBodyDomainExtensions> domainExtensions;

    public static DescribeDomainExtensionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainExtensionsResponseBody self = new DescribeDomainExtensionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainExtensionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainExtensionsResponseBody setDomainExtensions(java.util.List<DescribeDomainExtensionsResponseBodyDomainExtensions> domainExtensions) {
        this.domainExtensions = domainExtensions;
        return this;
    }
    public java.util.List<DescribeDomainExtensionsResponseBodyDomainExtensions> getDomainExtensions() {
        return this.domainExtensions;
    }

    public static class DescribeDomainExtensionsResponseBodyDomainExtensions extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("ServerCertificateId")
        public String serverCertificateId;

        @NameInMap("DomainExtensionId")
        public String domainExtensionId;

        public static DescribeDomainExtensionsResponseBodyDomainExtensions build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainExtensionsResponseBodyDomainExtensions self = new DescribeDomainExtensionsResponseBodyDomainExtensions();
            return TeaModel.build(map, self);
        }

        public DescribeDomainExtensionsResponseBodyDomainExtensions setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainExtensionsResponseBodyDomainExtensions setServerCertificateId(String serverCertificateId) {
            this.serverCertificateId = serverCertificateId;
            return this;
        }
        public String getServerCertificateId() {
            return this.serverCertificateId;
        }

        public DescribeDomainExtensionsResponseBodyDomainExtensions setDomainExtensionId(String domainExtensionId) {
            this.domainExtensionId = domainExtensionId;
            return this;
        }
        public String getDomainExtensionId() {
            return this.domainExtensionId;
        }

    }

}
