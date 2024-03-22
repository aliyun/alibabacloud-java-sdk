// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeExecutePlaybooksRequest extends TeaModel {
    /**
     * <p>The entity type of the script input parameter. When you want to query multiple entity types, separate them with commas.</p>
     * <p>- **ip**: IP entity.</p>
     * <p>- **file**: file entity.</p>
     * <p>- **process**: process entity.</p>
     * <p>- **incident**: incident entity.</p>
     */
    @NameInMap("InputMode")
    public String inputMode;

    /**
     * <p>The language of the content within the request and the response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The input parameter type of the playbook.</p>
     * <br>
     * <p>*   **template-ip**</p>
     * <p>*   **template-file**</p>
     * <p>*   **template-process**</p>
     * <p>*   **custom**</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    /**
     * <p>The playbook name. Fuzzy search is supported.</p>
     */
    @NameInMap("PlaybookName")
    public String playbookName;

    /**
     * <p>The playbook UUID.</p>
     * <br>
     * <p>>  You can call the [DescribePlaybooks](~~DescribePlaybooks~~) operation to query the playbook UUID.</p>
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
