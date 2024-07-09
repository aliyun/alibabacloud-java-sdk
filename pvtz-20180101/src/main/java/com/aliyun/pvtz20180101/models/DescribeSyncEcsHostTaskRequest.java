// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeSyncEcsHostTaskRequest extends TeaModel {
    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The zone ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pvtz-test-id-2989149d628c56f00e</p>
     */
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
