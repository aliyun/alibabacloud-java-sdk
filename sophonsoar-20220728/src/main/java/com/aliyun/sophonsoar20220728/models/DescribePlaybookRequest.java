// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybookRequest extends TeaModel {
    /**
     * <p>A flag that indicates whether the version is a published version or a debug version. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: retrieves the debug version.</p>
     * </li>
     * <li><p><strong>0</strong>: retrieves the published version.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DebugFlag")
    public Integer debugFlag;

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
     * <p>9030076b-6733-4842-b05a-xxxxx</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    /**
     * <p>The MD5 value of the playbook configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>7a8f608dc64c242632aa578xxxxx</p>
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
