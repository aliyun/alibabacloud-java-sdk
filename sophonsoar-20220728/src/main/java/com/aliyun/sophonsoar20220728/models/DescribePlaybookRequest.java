// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybookRequest extends TeaModel {
    @NameInMap("DebugFlag")
    public Integer debugFlag;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PlaybookUuid")
    public String playbookUuid;

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
