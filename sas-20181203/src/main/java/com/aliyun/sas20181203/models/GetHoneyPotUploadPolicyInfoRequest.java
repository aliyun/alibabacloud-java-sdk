// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneyPotUploadPolicyInfoRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static GetHoneyPotUploadPolicyInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHoneyPotUploadPolicyInfoRequest self = new GetHoneyPotUploadPolicyInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetHoneyPotUploadPolicyInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
