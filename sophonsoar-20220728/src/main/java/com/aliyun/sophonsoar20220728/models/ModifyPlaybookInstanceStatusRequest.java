// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ModifyPlaybookInstanceStatusRequest extends TeaModel {
    /**
     * <p>The playbook status. Valid values:</p>
     * <br>
     * <p>*   **1**: starts the playbook.</p>
     * <p>*   **0**: stops the playbook.</p>
     */
    @NameInMap("Active")
    public Integer active;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The playbook UUID.</p>
     * <br>
     * <p>>  You can call the [DescribePlaybooks](~~DescribePlaybooks~~) operation to query the playbook UUID.</p>
     */
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
