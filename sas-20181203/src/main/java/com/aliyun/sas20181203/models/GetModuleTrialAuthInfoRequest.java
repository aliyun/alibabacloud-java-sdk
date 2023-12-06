// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetModuleTrialAuthInfoRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The module code. Valid values:</p>
     * <br>
     * <p>*   **vulFix**: vulnerability fixing</p>
     * <p>*   **cloudSiem**: threat analysis</p>
     */
    @NameInMap("ModuleCode")
    public String moduleCode;

    public static GetModuleTrialAuthInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModuleTrialAuthInfoRequest self = new GetModuleTrialAuthInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetModuleTrialAuthInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetModuleTrialAuthInfoRequest setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
        return this;
    }
    public String getModuleCode() {
        return this.moduleCode;
    }

}
