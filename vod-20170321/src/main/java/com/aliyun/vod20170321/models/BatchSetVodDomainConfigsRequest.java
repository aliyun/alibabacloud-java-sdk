// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class BatchSetVodDomainConfigsRequest extends TeaModel {
    /**
     * <p>The domain name for CDN. Separate multiple domain names with commas (,).</p>
     */
    @NameInMap("DomainNames")
    public String domainNames;

    /**
     * <p>The features to configure.</p>
     * <br>
     * <p>*   Set this parameter in the following format: `[{"functionArgs":[{"argName":"domain_name","argValue":"www.example.com"}],"functionName":"set_req_host_header"}]`.</p>
     * <p>*   Specific features, such as filetype_based_ttl_set, support more than one configuration record. To update one of the configuration records, use the configId field to specify the record. `[{"functionArgs":[{"argName":"file_type","argValue":"jpg"},{"argName":"ttl","argValue":"18"},{"argName":"weight","argValue":"30"}],"functionName":"filetype_based_ttl_set","configId":5068995}]`</p>
     * <p>*   For more information, see the **Feature description** section.</p>
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
