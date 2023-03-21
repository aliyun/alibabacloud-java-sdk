// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckDetailRequest extends TeaModel {
    @NameInMap("CheckId")
    public Long checkId;

    @NameInMap("Lang")
    public String lang;

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
