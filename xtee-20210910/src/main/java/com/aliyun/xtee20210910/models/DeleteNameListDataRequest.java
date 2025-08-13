// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteNameListDataRequest extends TeaModel {
    /**
     * <p>Set the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Variable ID</p>
     * 
     * <strong>example:</strong>
     * <p>239</p>
     */
    @NameInMap("variableId")
    public String variableId;

    public static DeleteNameListDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNameListDataRequest self = new DeleteNameListDataRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNameListDataRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteNameListDataRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DeleteNameListDataRequest setVariableId(String variableId) {
        this.variableId = variableId;
        return this;
    }
    public String getVariableId() {
        return this.variableId;
    }

}
