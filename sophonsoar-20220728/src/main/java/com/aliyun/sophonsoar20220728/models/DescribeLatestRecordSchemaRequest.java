// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeLatestRecordSchemaRequest extends TeaModel {
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

    public static DescribeLatestRecordSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLatestRecordSchemaRequest self = new DescribeLatestRecordSchemaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLatestRecordSchemaRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeLatestRecordSchemaRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

}
