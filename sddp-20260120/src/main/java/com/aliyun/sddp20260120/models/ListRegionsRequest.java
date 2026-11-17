// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListRegionsRequest extends TeaModel {
    /**
     * <p>Specifies whether to filter regions based on assets for which auditing is enabled. Valid values: true: Auditing is enabled. false: Auditing is not enabled. If you do not specify this parameter, this condition is not used.</p>
     */
    @NameInMap("Audited")
    public Boolean audited;

    /**
     * <p>Specifies whether to filter regions based on assets for which detection is enabled. Valid values: true: Detection is enabled. false: Detection is not enabled. If you do not specify this parameter, this condition is not used.</p>
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
