// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListRegionsRequest extends TeaModel {
    @NameInMap("Audited")
    public Boolean audited;

    @NameInMap("Identified")
    public Boolean identified;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static ListRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRegionsRequest self = new ListRegionsRequest();
        return TeaModel.build(map, self);
    }

    public ListRegionsRequest setAudited(Boolean audited) {
        this.audited = audited;
        return this;
    }
    public Boolean getAudited() {
        return this.audited;
    }

    public ListRegionsRequest setIdentified(Boolean identified) {
        this.identified = identified;
        return this;
    }
    public Boolean getIdentified() {
        return this.identified;
    }

    public ListRegionsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
