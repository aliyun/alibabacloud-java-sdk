// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeExecutePlaybooksRequest extends TeaModel {
    /**
     * <p>The entity type of the script input parameter. When you want to query multiple entity types, separate them with commas.</p>
     * <ul>
     * <li><strong>ip</strong>: IP entity.</li>
     * <li><strong>file</strong>: file entity.</li>
     * <li><strong>process</strong>: process entity.</li>
     * <li><strong>incident</strong>: incident entity.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ip,file,process,host</p>
     */
    @NameInMap("InputMode")
    public String inputMode;

    /**
     * <p>The language of the content within the request and the response. Valid values:</p>
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
     * <p>The input parameter type of the playbook.</p>
     * <ul>
     * <li><strong>template-ip</strong></li>
     * <li><strong>template-file</strong></li>
     * <li><strong>template-process</strong></li>
     * <li><strong>custom</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    /**
     * <p>The playbook name. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_test</p>
     */
    @NameInMap("PlaybookName")
    public String playbookName;

    /**
     * <p>The playbook UUID.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a> operation to query the playbook UUID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>f916b93e-e814-459f-9662-xxxxxx</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribeExecutePlaybooksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExecutePlaybooksRequest self = new DescribeExecutePlaybooksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExecutePlaybooksRequest setInputMode(String inputMode) {
        this.inputMode = inputMode;
        return this;
    }
    public String getInputMode() {
        return this.inputMode;
    }

    public DescribeExecutePlaybooksRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeExecutePlaybooksRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public DescribeExecutePlaybooksRequest setPlaybookName(String playbookName) {
        this.playbookName = playbookName;
        return this;
    }
    public String getPlaybookName() {
        return this.playbookName;
    }

    public DescribeExecutePlaybooksRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
