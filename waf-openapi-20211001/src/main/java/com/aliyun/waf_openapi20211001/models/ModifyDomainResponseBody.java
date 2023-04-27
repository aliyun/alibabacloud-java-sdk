// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDomainResponseBody extends TeaModel {
    /**
     * <p>The information about the domain name.</p>
     */
    @NameInMap("DomainInfo")
    public ModifyDomainResponseBodyDomainInfo domainInfo;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainResponseBody self = new ModifyDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDomainResponseBody setDomainInfo(ModifyDomainResponseBodyDomainInfo domainInfo) {
        this.domainInfo = domainInfo;
        return this;
    }
    public ModifyDomainResponseBodyDomainInfo getDomainInfo() {
        return this.domainInfo;
    }

    public ModifyDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyDomainResponseBodyDomainInfo extends TeaModel {
        /**
         * <p>The CNAME that is assigned by WAF to the domain name.</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>The domain name whose access configurations you modified.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The ID of the domain name.</p>
         */
        @NameInMap("DomainId")
        public String domainId;

        public static ModifyDomainResponseBodyDomainInfo build(java.util.Map<String, ?> map) throws Exception {
            ModifyDomainResponseBodyDomainInfo self = new ModifyDomainResponseBodyDomainInfo();
            return TeaModel.build(map, self);
        }

        public ModifyDomainResponseBodyDomainInfo setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public ModifyDomainResponseBodyDomainInfo setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ModifyDomainResponseBodyDomainInfo setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

    }

}
