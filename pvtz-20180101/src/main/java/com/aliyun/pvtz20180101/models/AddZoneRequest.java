// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddZoneRequest extends TeaModel {
    /**
     * <p>A client token that is used to ensure the idempotence of the request. You can use the client to generate a token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>21079fa016944979537637959d09bc</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The location of the built-in authoritative zone. Valid values:</p>
     * <ul>
     * <li><p><strong>NORMAL_ZONE</strong>: Standard zone. DNS responses are cached. If a cache miss occurs, the query is sent to the built-in authoritative standard zone. The time to live (TTL) value affects the time when a DNS record change takes effect. You cannot use custom DNS lines or weighted round-robin.</p>
     * </li>
     * <li><p><strong>FAST_ZONE</strong>: Accelerated zone (recommended). DNS queries are directly responded to with the lowest latency. DNS record changes take effect in real time. You can use custom DNS lines and weighted round-robin.</p>
     * </li>
     * </ul>
     * <p>Default value: <strong>NORMAL_ZONE</strong>.</p>
     * <blockquote>
     * <p>The built-in authoritative accelerated zone is located before the cache module. DNS responses are not cached. This may increase the number of DNS queries and your costs.</p>
     * </blockquote>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>Starting from April 30, 2025 (UTC+8), when new users activate Alibaba Cloud DNS PrivateZone, added zones are set as accelerated zones by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>FAST_ZONE</p>
     */
    @NameInMap("DnsGroup")
    public String dnsGroup;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies whether to enable subdomain recursive proxy. Valid values:</p>
     * <ul>
     * <li><p><strong>ZONE</strong>: Disables the feature. If a DNS query for a subdomain that does not exist under the current domain name is received, an NXDOMAIN error is returned.</p>
     * </li>
     * <li><p><strong>RECORD</strong>: Enables the feature. If a DNS query for a subdomain that does not exist under the current domain name is received, the query is processed by the forwarding and recursion modules in sequence. The final result is used to respond to the DNS query.</p>
     * </li>
     * </ul>
     * <p>Default value: <strong>ZONE</strong>.</p>
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
     * <p>rg-acfmykd63gt****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the zone to add.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("ZoneName")
    public String zoneName;

    /**
     * <p>This parameter is not available to users. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>BLINK</p>
     */
    @NameInMap("ZoneTag")
    public String zoneTag;

    /**
     * <p>This parameter is not available to users. You do not need to specify this parameter.</p>
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
