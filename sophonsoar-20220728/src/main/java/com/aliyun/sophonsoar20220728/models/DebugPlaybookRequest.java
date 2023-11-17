// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DebugPlaybookRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    @NameInMap("Record")
    public String record;

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
