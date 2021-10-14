// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyDefaultLevelRequest extends TeaModel {
    @NameInMap("DefaultId")
    public Long defaultId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SensitiveIds")
    public String sensitiveIds;

    public static ModifyDefaultLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefaultLevelRequest self = new ModifyDefaultLevelRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDefaultLevelRequest setDefaultId(Long defaultId) {
        this.defaultId = defaultId;
        return this;
    }
    public Long getDefaultId() {
        return this.defaultId;
    }

    public ModifyDefaultLevelRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyDefaultLevelRequest setSensitiveIds(String sensitiveIds) {
        this.sensitiveIds = sensitiveIds;
        return this;
    }
    public String getSensitiveIds() {
        return this.sensitiveIds;
    }

}
