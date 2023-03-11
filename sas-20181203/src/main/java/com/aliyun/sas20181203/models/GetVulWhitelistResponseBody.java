// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetVulWhitelistResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the whitelist.</p>
     */
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
        /**
         * <p>The alias of the vulnerability.</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The ID of the whitelist.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the vulnerability.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The reason why the vulnerability is added to the whitelist.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The application scope of the rule. The value is a JSON string that contains the following fields:</p>
         * <br>
         * <p>*   **type**: the type of the assets to which the rule is applied. Valid values:</p>
         * <br>
         * <p>    *   **Uuid**: server</p>
         * <p>    *   **GroupId**: server group</p>
         * <br>
         * <p>*   **groupIds**: the ID of the server group</p>
         * <br>
         * <p>*   **uuids**: the UUID of the server</p>
         * <br>
         * <p>> If this parameter is empty, the rule is applied to all types of assets.</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The type of the vulnerability.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The information about the vulnerability that is added to the whitelist. The value is a JSON string that contains the following fields:</p>
         * <br>
         * <p>*   **Name**: the name of the vulnerability.</p>
         * <br>
         * <p>*   **Type**: the type of the vulnerability. Valid values:</p>
         * <br>
         * <p>    *   **cve**: Linux software vulnerability</p>
         * <p>    *   **sys**: Windows system vulnerability</p>
         * <p>    *   **cms**: Web-CMS vulnerability</p>
         * <p>    *   **app**: application vulnerability</p>
         * <p>    *   **emg**: urgent vulnerabilities</p>
         * <br>
         * <p>*   **AliasName**: the alias of the vulnerability.</p>
         */
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
