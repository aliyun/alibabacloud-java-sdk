// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ModifyPlaybookRequest extends TeaModel {
    /**
     * <p>The description of the playbook.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The display name of the playbook.</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh** (default): Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UUID of the playbook.</p>
     * <br>
     * <p>>  You can call the [DescribePlaybooks](~~DescribePlaybooks~~)operation to query the UUIDs of playbooks.</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <p>The XML configuration of the playbook.</p>
     */
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
