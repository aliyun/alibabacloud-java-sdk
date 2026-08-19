// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddVodDomainRequest extends TeaModel {
    /**
     * <p>The health check URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com/test.html">www.example.com/test.html</a></p>
     */
    @NameInMap("CheckUrl")
    public String checkUrl;

    /**
     * <p>The accelerated domain name to be added to ApsaraVideo VOD. Wildcard domain names are supported, starting with a period (.), such as .example.com.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is valid for international users and Chinese mainland users of L3 or higher. Valid values:</p>
     * <ul>
     * <li><strong>domestic</strong> (default): the Chinese mainland.</li>
     * <li><strong>overseas</strong>: Hong Kong (China), Macao (China), Taiwan (China), and regions outside China.</li>
     * <li><strong>global</strong>: global acceleration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>domestic</p>
     */
    @NameInMap("Scope")
    public String scope;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The list of origin addresses. For more information about the parameters, see the <strong>Sources</strong> table below.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;content&quot;:&quot;1.1.1.1&quot;,&quot;type&quot;:&quot;ipaddr&quot;,&quot;priority&quot;:&quot;20&quot;,&quot;port&quot;:80}]</p>
     */
    @NameInMap("Sources")
    public String sources;

    /**
     * <p>The top-level domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("TopLevelDomain")
    public String topLevelDomain;

    public static AddVodDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        AddVodDomainRequest self = new AddVodDomainRequest();
        return TeaModel.build(map, self);
    }

    public AddVodDomainRequest setCheckUrl(String checkUrl) {
        this.checkUrl = checkUrl;
        return this;
    }
    public String getCheckUrl() {
        return this.checkUrl;
    }

    public AddVodDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddVodDomainRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddVodDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddVodDomainRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public AddVodDomainRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public AddVodDomainRequest setSources(String sources) {
        this.sources = sources;
        return this;
    }
    public String getSources() {
        return this.sources;
    }

    public AddVodDomainRequest setTopLevelDomain(String topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
        return this;
    }
    public String getTopLevelDomain() {
        return this.topLevelDomain;
    }

}
