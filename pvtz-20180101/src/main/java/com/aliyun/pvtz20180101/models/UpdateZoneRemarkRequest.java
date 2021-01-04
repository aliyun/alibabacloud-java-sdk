// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateZoneRemarkRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static UpdateZoneRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateZoneRemarkRequest self = new UpdateZoneRemarkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateZoneRemarkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateZoneRemarkRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public UpdateZoneRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateZoneRemarkRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
