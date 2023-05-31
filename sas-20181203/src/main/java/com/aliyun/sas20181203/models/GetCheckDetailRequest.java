// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckDetailRequest extends TeaModel {
    /**
     * <p>The ID of the check item.</p>
     */
    @NameInMap("CheckId")
    public Long checkId;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the region in which the server resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetCheckDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCheckDetailRequest self = new GetCheckDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetCheckDetailRequest setCheckId(Long checkId) {
        this.checkId = checkId;
        return this;
    }
    public Long getCheckId() {
        return this.checkId;
    }

    public GetCheckDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetCheckDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
