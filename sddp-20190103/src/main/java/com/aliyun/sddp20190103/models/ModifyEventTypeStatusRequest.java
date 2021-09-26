// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyEventTypeStatusRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("SubTypeIds")
    public String subTypeIds;

    public static ModifyEventTypeStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEventTypeStatusRequest self = new ModifyEventTypeStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEventTypeStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyEventTypeStatusRequest setSubTypeIds(String subTypeIds) {
        this.subTypeIds = subTypeIds;
        return this;
    }
    public String getSubTypeIds() {
        return this.subTypeIds;
    }

}
