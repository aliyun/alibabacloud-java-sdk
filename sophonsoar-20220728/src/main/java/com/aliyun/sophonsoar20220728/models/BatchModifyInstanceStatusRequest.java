// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class BatchModifyInstanceStatusRequest extends TeaModel {
    /**
     * <p>Specifies whether to start or stop the playbook.</p>
     * <ul>
     * <li><strong>0</strong>: stops the playbook.</li>
     * <li><strong>1</strong>: starts the playbook.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Active")
    public Integer active;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese (default)</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The playbook UUID. If you want to specify multiple playbooks, separate the playbook UUIDs with commas (,).</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a>operation to query the playbook UUID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8baa6cff-319e-4ede-97bc-1xxxxxx,s8df2e-s8dfs-xxxx</p>
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
