// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DebugPlaybookRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The playbook UUID.</p>
     * <br>
     * <p>>  You can call the [DescribePlaybooks](~~DescribePlaybooks~~)operation to query the playbook UUID.</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <p>The input parameters that you use to debug the playbook. You can define the parameters based on your business requirements.</p>
     */
    @NameInMap("Record")
    public String record;

    /**
     * <p>The XML configuration of the playbook.</p>
     * <br>
     * <p>>  You can call the [DescribePlaybook](~~DescribePlaybook~~) operation to query the XML configuration of the playbook.</p>
     */
    @NameInMap("Taskflow")
    public String taskflow;

    public static DebugPlaybookRequest build(java.util.Map<String, ?> map) throws Exception {
        DebugPlaybookRequest self = new DebugPlaybookRequest();
        return TeaModel.build(map, self);
    }

    public DebugPlaybookRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DebugPlaybookRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public DebugPlaybookRequest setRecord(String record) {
        this.record = record;
        return this;
    }
    public String getRecord() {
        return this.record;
    }

    public DebugPlaybookRequest setTaskflow(String taskflow) {
        this.taskflow = taskflow;
        return this;
    }
    public String getTaskflow() {
        return this.taskflow;
    }

}
