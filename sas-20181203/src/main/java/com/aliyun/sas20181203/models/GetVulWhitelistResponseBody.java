// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetVulWhitelistResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>09969D2C-4FAD-429E-BFBF-9A60DEF8BF6F</p>
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
         * 
         * <strong>example:</strong>
         * <p>RHSA-2017:3263: curl security update</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The ID of the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>1275</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>oval:com.redhat.rhsa:def:20173263</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The reason why the vulnerability is added to the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>Ignore</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The application scope of the rule. The value is a JSON string that contains the following fields:</p>
         * <ul>
         * <li><p><strong>type</strong>: the type of the assets to which the rule is applied. Valid values:</p>
         * <ul>
         * <li><strong>Uuid</strong>: server</li>
         * <li><strong>GroupId</strong>: server group</li>
         * </ul>
         * </li>
         * <li><p><strong>groupIds</strong>: the ID of the server group</p>
         * </li>
         * <li><p><strong>uuids</strong>: the UUID of the server</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is empty, the rule is applied to all types of assets.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;type&quot;: &quot;GroupId&quot;,
         *       &quot;uuids&quot;: [],
         *       &quot;groupIds&quot;: [
         *             10782678
         *       ]
         * }</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The type of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The information about the vulnerability that is added to the whitelist. The value is a JSON string that contains the following fields:</p>
         * <ul>
         * <li><p><strong>Name</strong>: the name of the vulnerability.</p>
         * </li>
         * <li><p><strong>Type</strong>: the type of the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerability</li>
         * <li><strong>sys</strong>: Windows system vulnerability</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability</li>
         * <li><strong>app</strong>: application vulnerability</li>
         * <li><strong>emg</strong>: urgent vulnerabilities</li>
         * </ul>
         * </li>
         * <li><p><strong>AliasName</strong>: the alias of the vulnerability.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[
         *       {
         *             &quot;Name&quot;: &quot;oval:com.redhat.rhsa:def:20173263&quot;,
         *             &quot;Type&quot;: &quot;cve&quot;,
         *             &quot;AliasName&quot;: &quot;RHSA-2017:3263: curl security update&quot;
         *       }
         * ]</p>
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
