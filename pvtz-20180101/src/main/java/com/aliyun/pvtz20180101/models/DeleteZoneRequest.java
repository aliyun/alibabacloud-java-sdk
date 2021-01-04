// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DeleteZoneRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static DeleteZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteZoneRequest self = new DeleteZoneRequest();
        return TeaModel.build(map, self);
    }

    public DeleteZoneRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteZoneRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DeleteZoneRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
