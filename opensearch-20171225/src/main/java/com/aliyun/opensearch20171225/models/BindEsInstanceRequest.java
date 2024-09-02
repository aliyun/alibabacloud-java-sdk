// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class BindEsInstanceRequest extends TeaModel {
    /**
     * <p>The body of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;esInstanceId&quot;: &quot;es-cn-abcde&quot;
     * }</p>
     */
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static BindEsInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        BindEsInstanceRequest self = new BindEsInstanceRequest();
        return TeaModel.build(map, self);
    }

    public BindEsInstanceRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
