// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddSasModuleTrialRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ModuleCode")
    public String moduleCode;

    public static AddSasModuleTrialRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSasModuleTrialRequest self = new AddSasModuleTrialRequest();
        return TeaModel.build(map, self);
    }

    public AddSasModuleTrialRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddSasModuleTrialRequest setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
        return this;
    }
    public String getModuleCode() {
        return this.moduleCode;
    }

}
