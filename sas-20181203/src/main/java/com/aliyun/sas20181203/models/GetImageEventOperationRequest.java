// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetImageEventOperationRequest extends TeaModel {
    /**
     * <p>The primary key of the alert handling rule.</p>
     * 
     * <strong>example:</strong>
     * <p>814163</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
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

    public static GetImageEventOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageEventOperationRequest self = new GetImageEventOperationRequest();
        return TeaModel.build(map, self);
    }

    public GetImageEventOperationRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetImageEventOperationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
