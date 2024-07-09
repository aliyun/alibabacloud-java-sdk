// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddZoneRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>21079fa016944979537637959d09bc</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The logical location of the built-in authoritative module in which the zone is added. Valid values:</p>
     * <ul>
     * <li>Normal zone: regular module</li>
     * <li>Fast Zone: acceleration module</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FAST_ZONE</p>
     */
    @NameInMap("DnsGroup")
    public String dnsGroup;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <ul>
     * <li>Specifies whether to enable the recursive resolution proxy feature for the zone. Valid values: <strong>ZONE</strong>: disables the recursive resolution proxy feature for the zone.</li>
     * <li><strong>RECORD</strong>: enables the recursive resolution proxy feature for the zone.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ZONE</p>
     */
    @NameInMap("ProxyPattern")
    public String proxyPattern;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-resourcegroupid1</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the zone.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("ZoneName")
    public String zoneName;

    /**
     * <p>This parameter is not available. You can ignore it.</p>
     * 
     * <strong>example:</strong>
     * <p>BLINK</p>
     */
    @NameInMap("ZoneTag")
    public String zoneTag;

    /**
     * <p>This parameter is not available. You can ignore it.</p>
     * 
     * <strong>example:</strong>
     * <p>CLOUD_PRODUCT_ZONE</p>
     */
    @NameInMap("ZoneType")
    public String zoneType;

    public static AddZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        AddZoneRequest self = new AddZoneRequest();
        return TeaModel.build(map, self);
    }

    public AddZoneRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddZoneRequest setDnsGroup(String dnsGroup) {
        this.dnsGroup = dnsGroup;
        return this;
    }
    public String getDnsGroup() {
        return this.dnsGroup;
    }

    public AddZoneRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddZoneRequest setProxyPattern(String proxyPattern) {
        this.proxyPattern = proxyPattern;
        return this;
    }
    public String getProxyPattern() {
        return this.proxyPattern;
    }

    public AddZoneRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AddZoneRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public AddZoneRequest setZoneTag(String zoneTag) {
        this.zoneTag = zoneTag;
        return this;
    }
    public String getZoneTag() {
        return this.zoneTag;
    }

    public AddZoneRequest setZoneType(String zoneType) {
        this.zoneType = zoneType;
        return this;
    }
    public String getZoneType() {
        return this.zoneType;
    }

}
