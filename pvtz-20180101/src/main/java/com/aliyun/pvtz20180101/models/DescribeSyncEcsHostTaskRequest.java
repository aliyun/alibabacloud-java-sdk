// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeSyncEcsHostTaskRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeSyncEcsHostTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncEcsHostTaskRequest self = new DescribeSyncEcsHostTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSyncEcsHostTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSyncEcsHostTaskRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
