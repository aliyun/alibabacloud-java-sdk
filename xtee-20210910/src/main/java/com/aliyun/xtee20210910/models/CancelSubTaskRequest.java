// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CancelSubTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SubTaskId")
    public Integer subTaskId;

    /**
     * <strong>example:</strong>
     * <p>FINANCE</p>
     */
    @NameInMap("Tab")
    public String tab;

    public static CancelSubTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelSubTaskRequest self = new CancelSubTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelSubTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CancelSubTaskRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CancelSubTaskRequest setSubTaskId(Integer subTaskId) {
        this.subTaskId = subTaskId;
        return this;
    }
    public Integer getSubTaskId() {
        return this.subTaskId;
    }

    public CancelSubTaskRequest setTab(String tab) {
        this.tab = tab;
        return this;
    }
    public String getTab() {
        return this.tab;
    }

}
