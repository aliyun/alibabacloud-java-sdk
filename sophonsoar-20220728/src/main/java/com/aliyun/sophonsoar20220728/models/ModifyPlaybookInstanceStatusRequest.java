// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ModifyPlaybookInstanceStatusRequest extends TeaModel {
    @NameInMap("Active")
    public Integer active;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    public static ModifyPlaybookInstanceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPlaybookInstanceStatusRequest self = new ModifyPlaybookInstanceStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPlaybookInstanceStatusRequest setActive(Integer active) {
        this.active = active;
        return this;
    }
    public Integer getActive() {
        return this.active;
    }

    public ModifyPlaybookInstanceStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyPlaybookInstanceStatusRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

}
