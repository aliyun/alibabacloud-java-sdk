// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetSignalRequest extends TeaModel {
    /**
     * <p>The temporary token used for authentication.</p>
     * 
     * <strong>example:</strong>
     * <p>eyXXXX-XXXX.XXXXX</p>
     */
    @NameInMap("Token")
    public String token;

    public static GetSignalRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSignalRequest self = new GetSignalRequest();
        return TeaModel.build(map, self);
    }

    public GetSignalRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
