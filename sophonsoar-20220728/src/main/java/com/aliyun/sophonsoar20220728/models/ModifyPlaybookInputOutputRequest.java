// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ModifyPlaybookInputOutputRequest extends TeaModel {
    /**
     * <p>The executed mode of a playbook. The value is a JSON array.</p>
     */
    @NameInMap("ExeConfig")
    public String exeConfig;

    /**
     * <p>The configuration of the input parameters. The value is a JSON array.</p>
     */
    @NameInMap("InputParams")
    public String inputParams;

    /**
     * <p>The language of the content within the request and response.</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The configuration of the output parameters. This parameter is unavailable. Leave it empty.</p>
     */
    @NameInMap("OutputParams")
    public String outputParams;

    /**
     * <p>The input parameter type.</p>
     * <br>
     * <p>*   **template-ip**</p>
     * <p>*   **template-file**</p>
     * <p>*   **template-process**</p>
     * <p>*   **custom**</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    /**
     * <p>The UUID of the playbook.</p>
     * <br>
     * <p>>  You can call the [DescribePlaybooks](~~DescribePlaybooks~~)operation to query the playbook UUID.</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    public static ModifyPlaybookInputOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPlaybookInputOutputRequest self = new ModifyPlaybookInputOutputRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPlaybookInputOutputRequest setExeConfig(String exeConfig) {
        this.exeConfig = exeConfig;
        return this;
    }
    public String getExeConfig() {
        return this.exeConfig;
    }

    public ModifyPlaybookInputOutputRequest setInputParams(String inputParams) {
        this.inputParams = inputParams;
        return this;
    }
    public String getInputParams() {
        return this.inputParams;
    }

    public ModifyPlaybookInputOutputRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyPlaybookInputOutputRequest setOutputParams(String outputParams) {
        this.outputParams = outputParams;
        return this;
    }
    public String getOutputParams() {
        return this.outputParams;
    }

    public ModifyPlaybookInputOutputRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public ModifyPlaybookInputOutputRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

}
