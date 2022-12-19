// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetVulWhitelistResponseBody extends TeaModel {
    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The information about the whitelist.
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
        // The alias of the vulnerability.
        @NameInMap("AliasName")
        public String aliasName;

        // The ID of the whitelist.
        @NameInMap("Id")
        public Long id;

        // The name of the vulnerability.
        @NameInMap("Name")
        public String name;

        // The reason why the vulnerability is added to the whitelist.
        @NameInMap("Reason")
        public String reason;

        // The application scope of the rule. The value is a JSON string that contains the following fields:
        // 
        // *   **type**: the type of the assets to which the rule is applied. Valid values:
        // 
        //     *   **Uuid**: server
        //     *   **GroupId**: server group
        // 
        // *   **groupIds**: the IDs of server groups.
        // 
        // *   **uuids**: the UUIDs of servers.
        // 
        // >  If this parameter is empty, the rule is applied to all assets.
        @NameInMap("Target")
        public String target;

        // The type of the vulnerability.
        @NameInMap("Type")
        public String type;

        // The information about the vulnerability that is added to the whitelist. The value is a JSON string that contains the following fields:
        // 
        // *   **Name**: the name of the vulnerability.
        // 
        // *   **Type**: the type of the vulnerability. Valid values:
        // 
        //     *   **cve**: Linux software vulnerability
        //     *   **sys**: Windows system vulnerability
        //     *   **cms**: Web-CMS vulnerability
        //     *   **app**: application vulnerability
        //     *   **emg**: urgent vulnerability
        // 
        // *   **AliasName**: the alias of the vulnerability.
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
