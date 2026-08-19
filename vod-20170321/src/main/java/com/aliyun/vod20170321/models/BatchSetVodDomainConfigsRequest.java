// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class BatchSetVodDomainConfigsRequest extends TeaModel {
    /**
     * <p>The accelerated domain names for ApsaraVideo VOD. Separate multiple domain names with commas (,). You can configure up to 50 domain names at a time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainNames")
    public String domainNames;

    /**
     * <p>The list of features.</p>
     * <ul>
     * <li>functionName (feature name, required): For the features that can be configured and their feature name parameters, see <a href="https://help.aliyun.com/document_detail/2411639.html">Domain name configuration features</a>.</li>
     * <li>argName (parameter name, required): The configuration items of functionName. You can configure multiple configuration items.</li>
     * <li>argValue (parameter value, required): The values of the configuration items of functionName.</li>
     * </ul>
     * <p>For detailed information about the features that can be configured for accelerated domain names, including feature names and parameter names, see <a href="https://help.aliyun.com/document_detail/2411639.html">Domain name configuration features</a>.</p>
     * <blockquote>
     * <p>Some features, such as filetype_based_ttl_set (file expiration time), support multiple configuration rules. To update a specific configuration rule, specify the configId of that rule. Example:
     * <code>[{&quot;functionArgs&quot;:[{&quot;argName&quot;:&quot;file_type&quot;,&quot;argValue&quot;:&quot;jpg&quot;},{&quot;argName&quot;:&quot;ttl&quot;,&quot;argValue&quot;:&quot;18&quot;},{&quot;argName&quot;:&quot;weight&quot;,&quot;argValue&quot;:&quot;30&quot;}],&quot;functionName&quot;:&quot;filetype_based_ttl_set&quot;,&quot;configId&quot;:5068995}]</code></p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;functionArgs&quot;:[{&quot;argName&quot;:&quot;domain_name&quot;,&quot;argValue&quot;:&quot;<a href="http://www.example.com%22%7D%5D,%22functionName%22:%22set_req_host_header%22%7D%5D">www.example.com&quot;}],&quot;functionName&quot;:&quot;set_req_host_header&quot;}]</a></p>
     */
    @NameInMap("Functions")
    public String functions;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static BatchSetVodDomainConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSetVodDomainConfigsRequest self = new BatchSetVodDomainConfigsRequest();
        return TeaModel.build(map, self);
    }

    public BatchSetVodDomainConfigsRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

    public BatchSetVodDomainConfigsRequest setFunctions(String functions) {
        this.functions = functions;
        return this;
    }
    public String getFunctions() {
        return this.functions;
    }

    public BatchSetVodDomainConfigsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public BatchSetVodDomainConfigsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchSetVodDomainConfigsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
