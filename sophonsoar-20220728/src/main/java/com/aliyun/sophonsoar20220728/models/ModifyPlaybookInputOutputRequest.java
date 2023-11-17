// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ModifyPlaybookInputOutputRequest extends TeaModel {
    @NameInMap("InputParams")
    public String inputParams;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("OutputParams")
    public String outputParams;

    @NameInMap("ParamType")
    public String paramType;

    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    public static ModifyPlaybookInputOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPlaybookInputOutputRequest self = new ModifyPlaybookInputOutputRequest();
        return TeaModel.build(map, self);
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
