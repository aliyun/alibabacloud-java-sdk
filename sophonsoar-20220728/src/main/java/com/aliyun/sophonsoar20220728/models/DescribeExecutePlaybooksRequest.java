// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeExecutePlaybooksRequest extends TeaModel {
    /**
     * <p>The entity type of the input parameter for the playbook. To query multiple entity types, separate them with commas.</p>
     * <ul>
     * <li><p><strong>ip</strong>: IP entity.</p>
     * </li>
     * <li><p><strong>file</strong>: file entity.</p>
     * </li>
     * <li><p><strong>process</strong>: process entity.</p>
     * </li>
     * <li><p><strong>incident</strong>: event entity.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ip,file,process,host</p>
     */
    @NameInMap("InputMode")
    public String inputMode;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
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
     * <p>The type of the input parameter for the playbook.</p>
     * <ul>
     * <li><p><strong>template-ip</strong>: IP request template.</p>
     * </li>
     * <li><p><strong>template-file</strong>: file request template.</p>
     * </li>
     * <li><p><strong>template-process</strong>: process request template.</p>
     * </li>
     * <li><p><strong>custom</strong>: custom parameter.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    /**
     * <p>The name of the playbook. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>demo_test</p>
     */
    @NameInMap("PlaybookName")
    public String playbookName;

    /**
     * <p>The UUID of the playbook.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a> operation to obtain this parameter.</p>
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
