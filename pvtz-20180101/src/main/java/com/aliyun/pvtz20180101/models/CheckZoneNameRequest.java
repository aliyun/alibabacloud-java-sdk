// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class CheckZoneNameRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ZoneName")
    public String zoneName;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static CheckZoneNameRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckZoneNameRequest self = new CheckZoneNameRequest();
        return TeaModel.build(map, self);
    }

    public CheckZoneNameRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CheckZoneNameRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public CheckZoneNameRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
