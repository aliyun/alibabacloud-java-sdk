// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteCustVariableRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("createType")
    public String createType;

    @NameInMap("dataVersion")
    public Long dataVersion;

    @NameInMap("regId")
    public String regId;

    @NameInMap("variableId")
    public String variableId;

    public static DeleteCustVariableRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustVariableRequest self = new DeleteCustVariableRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustVariableRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteCustVariableRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public DeleteCustVariableRequest setDataVersion(Long dataVersion) {
        this.dataVersion = dataVersion;
        return this;
    }
    public Long getDataVersion() {
        return this.dataVersion;
    }

    public DeleteCustVariableRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DeleteCustVariableRequest setVariableId(String variableId) {
        this.variableId = variableId;
        return this;
    }
    public String getVariableId() {
        return this.variableId;
    }

}
