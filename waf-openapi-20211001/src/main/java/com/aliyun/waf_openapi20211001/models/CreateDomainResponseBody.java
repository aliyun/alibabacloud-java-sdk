// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDomainResponseBody extends TeaModel {
    /**
     * <p>The information about the domain name.</p>
     */
    @NameInMap("DomainInfo")
    public CreateDomainResponseBodyDomainInfo domainInfo;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainResponseBody self = new CreateDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDomainResponseBody setDomainInfo(CreateDomainResponseBodyDomainInfo domainInfo) {
        this.domainInfo = domainInfo;
        return this;
    }
    public CreateDomainResponseBodyDomainInfo getDomainInfo() {
        return this.domainInfo;
    }

    public CreateDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateDomainResponseBodyDomainInfo extends TeaModel {
        /**
         * <p>The CNAME that is assigned by WAF to the domain name.</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>The domain name that you added to WAF.</p>
         */
        @NameInMap("Domain")
        public String domain;

        public static CreateDomainResponseBodyDomainInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateDomainResponseBodyDomainInfo self = new CreateDomainResponseBodyDomainInfo();
            return TeaModel.build(map, self);
        }

        public CreateDomainResponseBodyDomainInfo setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public CreateDomainResponseBodyDomainInfo setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

    }

}
