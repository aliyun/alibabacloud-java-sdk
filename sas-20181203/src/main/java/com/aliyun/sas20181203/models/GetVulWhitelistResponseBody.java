// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetVulWhitelistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VulWhitelist")
    public GetVulWhitelistResponseBodyVulWhitelist vulWhitelist;

    public static GetVulWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVulWhitelistResponseBody self = new GetVulWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVulWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVulWhitelistResponseBody setVulWhitelist(GetVulWhitelistResponseBodyVulWhitelist vulWhitelist) {
        this.vulWhitelist = vulWhitelist;
        return this;
    }
    public GetVulWhitelistResponseBodyVulWhitelist getVulWhitelist() {
        return this.vulWhitelist;
    }

    public static class GetVulWhitelistResponseBodyVulWhitelist extends TeaModel {
        @NameInMap("AliasName")
        public String aliasName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Target")
        public String target;

        @NameInMap("Type")
        public String type;

        @NameInMap("Whitelist")
        public String whitelist;

        public static GetVulWhitelistResponseBodyVulWhitelist build(java.util.Map<String, ?> map) throws Exception {
            GetVulWhitelistResponseBodyVulWhitelist self = new GetVulWhitelistResponseBodyVulWhitelist();
            return TeaModel.build(map, self);
        }

        public GetVulWhitelistResponseBodyVulWhitelist setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public GetVulWhitelistResponseBodyVulWhitelist setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetVulWhitelistResponseBodyVulWhitelist setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetVulWhitelistResponseBodyVulWhitelist setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetVulWhitelistResponseBodyVulWhitelist setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public GetVulWhitelistResponseBodyVulWhitelist setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetVulWhitelistResponseBodyVulWhitelist setWhitelist(String whitelist) {
            this.whitelist = whitelist;
            return this;
        }
        public String getWhitelist() {
            return this.whitelist;
        }

    }

}
