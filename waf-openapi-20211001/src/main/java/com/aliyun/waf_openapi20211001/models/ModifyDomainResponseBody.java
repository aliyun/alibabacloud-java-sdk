// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDomainResponseBody extends TeaModel {
    @NameInMap("DomainInfo")
    public ModifyDomainResponseBodyDomainInfo domainInfo;

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
        @NameInMap("Cname")
        public String cname;

        @NameInMap("Domain")
        public String domain;

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

    }

}
