// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class UpdateApiKeyInput extends TeaModel {
    /**
     * <p>The new name of the API key. The name can be up to 128 characters in length and can contain only letters, digits, spaces, hyphens (-), underscores (_), and periods (.).</p>
     * 
     * <strong>example:</strong>
     * <p>ci-pipeline-key-v2</p>
     */
    @NameInMap("apiKeyName")
    public String apiKeyName;

    /**
     * <p>The expiration time of the API key in UTC. The time must be in RFC 3339 format. An empty value indicates that the API key never expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2099-12-31T23:59:59Z</p>
     */
    @NameInMap("expireTime")
    public String expireTime;

    /**
     * <p>The IP address blacklist. If you specify this parameter, the existing blacklist is completely overwritten. This parameter is mutually exclusive with ipWhitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ipAddress&quot;:&quot;192.0.2.1&quot;,&quot;description&quot;:&quot;example client&quot;}]</p>
     */
    @NameInMap("ipBlacklist")
    public java.util.List<IPConfig> ipBlacklist;

    /**
     * <p>The IP address whitelist. If you specify this parameter, the existing whitelist is completely overwritten. This parameter is mutually exclusive with ipBlacklist.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ipAddress&quot;:&quot;192.0.2.1&quot;,&quot;description&quot;:&quot;example client&quot;}]</p>
     */
    @NameInMap("ipWhitelist")
    public java.util.List<IPConfig> ipWhitelist;

    /**
     * <p>The new status of the API key. Valid values:</p>
     * <ul>
     * <li>active: Enabled.</li>
     * <li>inactive: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>inactive</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The set of allowed source VPC IDs. This set is updated independently of the IP blacklists and whitelists. If you omit this parameter or set it to null, the original set is retained. A non-empty array completely replaces the original set. An explicit empty array [] purges the VPC restrictions. Updating only this parameter does not affect the IP address lists, and updating the IP address lists does not affect the VPC restrictions. An empty request body {} purges all IP address and VPC source restrictions. You can update this parameter along with other parameters such as the name.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;vpc-examplea&quot;,&quot;vpc-exampleb&quot;]</p>
     */
    @NameInMap("vpcBindings")
    public java.util.List<String> vpcBindings;

    public static UpdateApiKeyInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiKeyInput self = new UpdateApiKeyInput();
        return TeaModel.build(map, self);
    }

    public UpdateApiKeyInput setApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
        return this;
    }
    public String getApiKeyName() {
        return this.apiKeyName;
    }

    public UpdateApiKeyInput setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public UpdateApiKeyInput setIpBlacklist(java.util.List<IPConfig> ipBlacklist) {
        this.ipBlacklist = ipBlacklist;
        return this;
    }
    public java.util.List<IPConfig> getIpBlacklist() {
        return this.ipBlacklist;
    }

    public UpdateApiKeyInput setIpWhitelist(java.util.List<IPConfig> ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
        return this;
    }
    public java.util.List<IPConfig> getIpWhitelist() {
        return this.ipWhitelist;
    }

    public UpdateApiKeyInput setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateApiKeyInput setVpcBindings(java.util.List<String> vpcBindings) {
        this.vpcBindings = vpcBindings;
        return this;
    }
    public java.util.List<String> getVpcBindings() {
        return this.vpcBindings;
    }

}
