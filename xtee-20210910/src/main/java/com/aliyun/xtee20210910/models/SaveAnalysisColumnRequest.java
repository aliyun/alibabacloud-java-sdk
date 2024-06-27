// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class SaveAnalysisColumnRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("columns")
    public String columns;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("regId")
    public String regId;

    public static SaveAnalysisColumnRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveAnalysisColumnRequest self = new SaveAnalysisColumnRequest();
        return TeaModel.build(map, self);
    }

    public SaveAnalysisColumnRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveAnalysisColumnRequest setColumns(String columns) {
        this.columns = columns;
        return this;
    }
    public String getColumns() {
        return this.columns;
    }

    public SaveAnalysisColumnRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
