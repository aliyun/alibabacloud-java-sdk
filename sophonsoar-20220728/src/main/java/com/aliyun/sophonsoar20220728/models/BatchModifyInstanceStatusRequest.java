// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class BatchModifyInstanceStatusRequest extends TeaModel {
    /**
     * <p>Specifies whether to start or stop the playbook.</p>
     * <br>
     * <p>*   **0**: stops the playbook.</p>
     * <p>*   **1**: starts the playbook.</p>
     */
    @NameInMap("Active")
    public Integer active;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The playbook UUID. If you want to specify multiple playbooks, separate the playbook UUIDs with commas (,).</p>
     * <br>
     * <p>>  You can call the [DescribePlaybooks](~~DescribePlaybooks~~)operation to query the playbook UUID.</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    public static BatchModifyInstanceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchModifyInstanceStatusRequest self = new BatchModifyInstanceStatusRequest();
        return TeaModel.build(map, self);
    }

    public BatchModifyInstanceStatusRequest setActive(Integer active) {
        this.active = active;
        return this;
    }
    public Integer getActive() {
        return this.active;
    }

    public BatchModifyInstanceStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public BatchModifyInstanceStatusRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

}
