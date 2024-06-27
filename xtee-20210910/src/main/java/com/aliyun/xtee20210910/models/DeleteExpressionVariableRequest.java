// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteExpressionVariableRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dataVersion")
    public Long dataVersion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("regId")
    public String regId;

    public static DeleteExpressionVariableRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExpressionVariableRequest self = new DeleteExpressionVariableRequest();
        return TeaModel.build(map, self);
    }

    public DeleteExpressionVariableRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteExpressionVariableRequest setDataVersion(Long dataVersion) {
        this.dataVersion = dataVersion;
        return this;
    }
    public Long getDataVersion() {
        return this.dataVersion;
    }

    public DeleteExpressionVariableRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteExpressionVariableRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
