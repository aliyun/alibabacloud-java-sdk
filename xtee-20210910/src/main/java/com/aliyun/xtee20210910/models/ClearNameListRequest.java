// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ClearNameListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("regId")
    public String regId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("variableId")
    public Long variableId;

    public static ClearNameListRequest build(java.util.Map<String, ?> map) throws Exception {
        ClearNameListRequest self = new ClearNameListRequest();
        return TeaModel.build(map, self);
    }

    public ClearNameListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ClearNameListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public ClearNameListRequest setVariableId(Long variableId) {
        this.variableId = variableId;
        return this;
    }
    public Long getVariableId() {
        return this.variableId;
    }

}
