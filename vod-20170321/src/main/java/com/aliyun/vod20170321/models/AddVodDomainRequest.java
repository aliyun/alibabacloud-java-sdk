// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddVodDomainRequest extends TeaModel {
    /**
     * <p>## Common errors</p>
     * <br>
     * <p>The following table describes the error codes that this operation can return.</p>
     * <br>
     * <p>|Error code|Error message|HTTP status code|Description|</p>
     * <p>|---|---|---|---|</p>
     * <p>|InvalidDomainName.Malformed|Specified DomainName is malformed.|400|The error message returned because the value of the DomainName parameter is invalid.|</p>
     * <p>|InvalidCdnType.Malformed|Specified CdnType is malformed.|400|The error message returned because the value of the CdnType parameter is invalid.|</p>
     * <p>|InvalidSourceType.Malformed|Specified SourceType is malformed.|400|The error message returned because the value of the SourceType parameter is invalid.|</p>
     * <p>|InvalidSources.Malformed|Specified Sources is malformed.|400|The error message returned because the origin address does not match the origin type.|</p>
     * <p>|InvalidScope.Malformed|Specified Scope is malformed.|400|The error message returned because the value of the Scope parameter is invalid.|</p>
     * <p>|InvaildParameter|The Certificate you provided is malformed!|400|The error message returned because the total length of the HTTPS certificate and private key exceeds the upper limit.|</p>
     * <p>|BusinessExist|Business exist do not repeated submission|400|The error message returned because the domain name is being added. You cannot add duplicate domain names.|</p>
     * <p>|DomainAlreadyExist|This domain name is exist already|400|The error message returned because the domain name is already added.|</p>
     * <p>|DomainOverLimit|The Number of Domain is over the limit|403|The error message returned because the number of accelerated domain names exceeds the upper limit.|</p>
     * <p>|DomainNotRegistration|The Domain name is not registered|404|The error message returned because the domain name does not have an ICP filing.|</p>
     * <p>|IllegalOperation|Illegal domain operate is not permitted.|403|The error message returned because you are not authorized to perform this operation.|</p>
     * <p>|ServiceBusy|The specified Domain is configuring, please retry later.|403|The error message returned because the domain name is being configured. Try again later.|</p>
     * <p>|InvalidDomain.NotFound|The domain provided does not belong to you.|404|The error message returned because the specified domain name does not exist or does not belong to the current account.|</p>
     * <p>|InnerAddDomainDenied|Your account haven\"t bind aoneId, can not add domain.|400|The error message returned because an internal account is not bound to an Aone ID. You cannot add a domain name by using the internal account.|</p>
     * <p>|ExtensiveAndAllBothExist|Extensive domain and the domain begins with \"all.\" can not exist at the same time.|400|The error message returned because a wildcard domain name and a domain name that starts with all. exist. They cannot exist at the same time.|</p>
     * <p>|CdnTypeNotSupportExtensiveDomain|Extensive domain not supported for this cdn type.|400|The error message returned because wildcard domain names are not supported for the specified business type.|</p>
     * <p>|ExtensiveAndSpecificDomainConflict|Extensive domain and corresponding specific domain are mutually exclusive.|400|The error message returned because the specified domain name is an exact match of an existing wildcard domain name at the same level.|</p>
     * <p>|InvalidParameter|Add live region parameters have error.|400|The error message returned because the system failed to specify the region for live streaming.|</p>
     * <p>|InvalidRegion.Malformed|Specified Region is malformed.|400|The error message returned because the value of the region parameter is invalid.|</p>
     * <p>|InvalidResourceGroupId.Malformed|Specified ResourceGroupId is malformed.|400|The error message returned because the value of the ResourceGroupId parameter is invalid.|</p>
     * <p>|EntityNotExists.ResourceGroup|The resource group does not exist.|400|The error message returned because the specified resource group does not exist.|</p>
     * <p>|InvalidStatus.ResourceGroup|It\"s now allowed to do this operation because of the current status of resource-group.|400|The error message returned because the resource group is in an invalid state.|</p>
     * <p>|InvalidPriorities.Malformed|The length of priorities is not the same with source.|400|The error message returned because the number of priorities does not match the number of origin servers.|</p>
     * <p>|NotInternationRealIdentity|You need to do real name authentication when you use Chinese mainland resources.|400|The error message returned because you have not completed real-name verification that is required to use resources in the Chinese mainland.|</p>
     */
    @NameInMap("CheckUrl")
    public String checkUrl;

    /**
     * <p>*   This operation is available only in the **China (Shanghai)** region.</p>
     * <p>*   Before you add a domain name to accelerate, you must activate ApsaraVideo VOD and apply for an Internet content provider (ICP) filing for the domain name. For more information about how to activate ApsaraVideo VOD, see [Activate ApsaraVideo VOD](~~51512~~).</p>
     * <p>*   If the content on the origin server is not stored on Alibaba Cloud, the content must be reviewed by Alibaba Cloud. The review will be complete by the end of the next business day after you submit an application.</p>
     * <p>*   You can add only one domain name to accelerate in a request. You can add a maximum of 20 accelerated domain names within an Alibaba Cloud account.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The domain name that you want to accelerate. Wildcard domain names that start with periods (.) are supported. Example: .example.com.</p>
     */
    @NameInMap("Scope")
    public String scope;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>## Sources</p>
     * <br>
     * <p>|Parameter|Type|Required|Description|</p>
     * <p>|---|---|---|---|</p>
     * <p>|type|String|Yes|The type of the origin server. Valid values: <br>**ipaddr**: an IP address. <br>**domain**: a domain name. <br>**oss**: the domain of an Object Storage Service (OSS) bucket.|</p>
     * <p>|content|String|Yes|The address of the origin server. You can specify an IP address or a domain name.|</p>
     * <p>|port|Integer|No|The port number. Valid values: **443** and **80**. <br>Default value: **80**. If you specify **443**, requests are redirected to the origin server over HTTPS. You can also specify a custom port.|</p>
     * <p>|priority|String|No|The priority of the origin server if multiple origin servers are specified. Valid values: **20** and **30**. Default value: **20**. **20** indicates that the origin server is the primary origin server. **30** indicates that the origin server is a secondary origin server.|</p>
     */
    @NameInMap("Sources")
    public String sources;

    /**
     * <p>The information about the addresses of origin servers. For more information, see the **Sources** table in this topic.</p>
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
