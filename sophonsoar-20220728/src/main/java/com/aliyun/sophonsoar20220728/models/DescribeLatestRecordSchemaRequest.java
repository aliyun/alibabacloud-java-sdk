// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeLatestRecordSchemaRequest extends TeaModel {
    /**
     * <p>The language of the request and response. The default value is <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UUID of the playbook.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c5c88b5e-97ca-435d-8c20-xxxxxx</p>
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
