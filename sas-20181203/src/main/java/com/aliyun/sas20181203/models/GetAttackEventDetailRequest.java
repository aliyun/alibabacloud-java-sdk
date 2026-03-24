// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAttackEventDetailRequest extends TeaModel {
    /**
     * <p>The unique identifier ID for the alert event.</p>
     * 
     * <strong>example:</strong>
     * <p>18825544674********</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The language type for requesting and receiving messages. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static GetAttackEventDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAttackEventDetailRequest self = new GetAttackEventDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetAttackEventDetailRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetAttackEventDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
