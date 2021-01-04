// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddZoneRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ZoneName")
    public String zoneName;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("ProxyPattern")
    public String proxyPattern;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ZoneType")
    public String zoneType;

    @NameInMap("ZoneTag")
    public String zoneTag;

    public static AddZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        AddZoneRequest self = new AddZoneRequest();
        return TeaModel.build(map, self);
    }

    public AddZoneRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddZoneRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public AddZoneRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
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

    public AddZoneRequest setZoneType(String zoneType) {
        this.zoneType = zoneType;
        return this;
    }
    public String getZoneType() {
        return this.zoneType;
    }

    public AddZoneRequest setZoneTag(String zoneTag) {
        this.zoneTag = zoneTag;
        return this;
    }
    public String getZoneTag() {
        return this.zoneTag;
    }

}
