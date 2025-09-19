// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAvailableAttackPathRequest extends TeaModel {
    /**
     * <p>The language type for requests and responses. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static ListAvailableAttackPathRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableAttackPathRequest self = new ListAvailableAttackPathRequest();
        return TeaModel.build(map, self);
    }

    public ListAvailableAttackPathRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
