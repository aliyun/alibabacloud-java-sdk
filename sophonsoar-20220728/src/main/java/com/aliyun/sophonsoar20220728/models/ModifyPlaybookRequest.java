// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ModifyPlaybookRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    @NameInMap("Taskflow")
    public String taskflow;

    public static ModifyPlaybookRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPlaybookRequest self = new ModifyPlaybookRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPlaybookRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyPlaybookRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ModifyPlaybookRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyPlaybookRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public ModifyPlaybookRequest setTaskflow(String taskflow) {
        this.taskflow = taskflow;
        return this;
    }
    public String getTaskflow() {
        return this.taskflow;
    }

}
