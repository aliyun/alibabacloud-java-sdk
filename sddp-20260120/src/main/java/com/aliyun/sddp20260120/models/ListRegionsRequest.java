// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListRegionsRequest extends TeaModel {
    /**
     * <p>Specifies whether to filter regions by assets with auditing enabled. Valid values: true: Enabled. false: Disabled. If you do not specify this parameter, this filter condition is not applied.</p>
     */
    @NameInMap("Audited")
    public Boolean audited;

    /**
     * <p>Specifies whether to filter regions by assets with detection enabled. Valid values: true: Enabled. false: Disabled. If you do not specify this parameter, this filter condition is not applied.</p>
     */
    @NameInMap("Identified")
    public Boolean identified;

    /**
     * <p>The language of the response. Valid values: zh: Chinese. en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies whether to retrieve all regions.</p>
     */
    @NameInMap("LoadAll")
    public Boolean loadAll;

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

    public ListRegionsRequest setLoadAll(Boolean loadAll) {
        this.loadAll = loadAll;
        return this;
    }
    public Boolean getLoadAll() {
        return this.loadAll;
    }

}
