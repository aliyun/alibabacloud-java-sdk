// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DeleteResolverEndpointRequest extends TeaModel {
    /**
     * <p>The unique ID of the endpoint.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hra0**</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh: Chinese.</p>
     * </li>
     * <li><p>en: English.</p>
     * </li>
     * </ul>
     * <p>Default value: en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DeleteResolverEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResolverEndpointRequest self = new DeleteResolverEndpointRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResolverEndpointRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public DeleteResolverEndpointRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
