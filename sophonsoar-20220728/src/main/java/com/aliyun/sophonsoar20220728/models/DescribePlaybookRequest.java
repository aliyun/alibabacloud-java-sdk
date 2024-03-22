// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybookRequest extends TeaModel {
    /**
     * <p>The flag that indicates whether the playbook is of the debugging or published version. Valid values:</p>
     * <br>
     * <p>*   **1**: playbook of the debugging version</p>
     * <p>*   **0**: playbook of the published version</p>
     */
    @NameInMap("DebugFlag")
    public Integer debugFlag;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
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
     * <p>The MD5 hash value of the playbook.</p>
     */
    @NameInMap("TaskflowMd5")
    public String taskflowMd5;

    public static DescribePlaybookRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlaybookRequest self = new DescribePlaybookRequest();
        return TeaModel.build(map, self);
    }

    public DescribePlaybookRequest setDebugFlag(Integer debugFlag) {
        this.debugFlag = debugFlag;
        return this;
    }
    public Integer getDebugFlag() {
        return this.debugFlag;
    }

    public DescribePlaybookRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePlaybookRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public DescribePlaybookRequest setTaskflowMd5(String taskflowMd5) {
        this.taskflowMd5 = taskflowMd5;
        return this;
    }
    public String getTaskflowMd5() {
        return this.taskflowMd5;
    }

}
