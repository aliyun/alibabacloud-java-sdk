// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class QueryTreeDataRequest extends TeaModel {
    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static QueryTreeDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTreeDataRequest self = new QueryTreeDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryTreeDataRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
