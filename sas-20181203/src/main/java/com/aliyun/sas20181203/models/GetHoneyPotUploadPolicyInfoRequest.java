// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneyPotUploadPolicyInfoRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and the response. Valid values:</p>
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
