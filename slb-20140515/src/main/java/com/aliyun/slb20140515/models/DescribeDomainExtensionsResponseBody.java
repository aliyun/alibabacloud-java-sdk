// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeDomainExtensionsResponseBody extends TeaModel {
    /**
     * <p>The list of additional certificates.</p>
     */
    @NameInMap("DomainExtensions")
    public DescribeDomainExtensionsResponseBodyDomainExtensions domainExtensions;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainExtensionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainExtensionsResponseBody self = new DescribeDomainExtensionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainExtensionsResponseBody setDomainExtensions(DescribeDomainExtensionsResponseBodyDomainExtensions domainExtensions) {
        this.domainExtensions = domainExtensions;
        return this;
    }
    public DescribeDomainExtensionsResponseBodyDomainExtensions getDomainExtensions() {
        return this.domainExtensions;
    }

    public DescribeDomainExtensionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainExtensionsResponseBodyDomainExtensionsDomainExtension extends TeaModel {
        /**
         * <p>The domain name.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The ID of the additional certificate.</p>
         */
        @NameInMap("DomainExtensionId")
        public String domainExtensionId;

        /**
         * <p>The ID of the server certificate that is used by the domain name.</p>
         */
        @NameInMap("ServerCertificateId")
        public String serverCertificateId;

        public static DescribeDomainExtensionsResponseBodyDomainExtensionsDomainExtension build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainExtensionsResponseBodyDomainExtensionsDomainExtension self = new DescribeDomainExtensionsResponseBodyDomainExtensionsDomainExtension();
            return TeaModel.build(map, self);
        }

        public DescribeDomainExtensionsResponseBodyDomainExtensionsDomainExtension setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainExtensionsResponseBodyDomainExtensionsDomainExtension setDomainExtensionId(String domainExtensionId) {
            this.domainExtensionId = domainExtensionId;
            return this;
        }
        public String getDomainExtensionId() {
            return this.domainExtensionId;
        }

        public DescribeDomainExtensionsResponseBodyDomainExtensionsDomainExtension setServerCertificateId(String serverCertificateId) {
            this.serverCertificateId = serverCertificateId;
            return this;
        }
        public String getServerCertificateId() {
            return this.serverCertificateId;
        }

    }

    public static class DescribeDomainExtensionsResponseBodyDomainExtensions extends TeaModel {
        @NameInMap("DomainExtension")
        public java.util.List<DescribeDomainExtensionsResponseBodyDomainExtensionsDomainExtension> domainExtension;

        public static DescribeDomainExtensionsResponseBodyDomainExtensions build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainExtensionsResponseBodyDomainExtensions self = new DescribeDomainExtensionsResponseBodyDomainExtensions();
            return TeaModel.build(map, self);
        }

        public DescribeDomainExtensionsResponseBodyDomainExtensions setDomainExtension(java.util.List<DescribeDomainExtensionsResponseBodyDomainExtensionsDomainExtension> domainExtension) {
            this.domainExtension = domainExtension;
            return this;
        }
        public java.util.List<DescribeDomainExtensionsResponseBodyDomainExtensionsDomainExtension> getDomainExtension() {
            return this.domainExtension;
        }

    }

}
