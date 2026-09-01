// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeDistinctReleasesRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
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
     * <p>bc0b8424-535c-4ed5-bd94-xxxxxx</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <p>The MD5 value of the playbook\&quot;s XML configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>be0a4ef084dd174abe47xxxxx</p>
     */
    @NameInMap("TaskflowMd5")
    public String taskflowMd5;

    public static DescribeDistinctReleasesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDistinctReleasesRequest self = new DescribeDistinctReleasesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDistinctReleasesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDistinctReleasesRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public DescribeDistinctReleasesRequest setTaskflowMd5(String taskflowMd5) {
        this.taskflowMd5 = taskflowMd5;
        return this;
    }
    public String getTaskflowMd5() {
        return this.taskflowMd5;
    }

}
