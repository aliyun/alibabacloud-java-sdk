// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20211110_21312586.models;

import com.aliyun.tea.*;

public class CreateSdkVersionRequest extends TeaModel {
    @NameInMap("createSdkCmd")
    public java.io.InputStream createSdkCmd;

    public static CreateSdkVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSdkVersionRequest self = new CreateSdkVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateSdkVersionRequest setCreateSdkCmd(java.io.InputStream createSdkCmd) {
        this.createSdkCmd = createSdkCmd;
        return this;
    }
    public java.io.InputStream getCreateSdkCmd() {
        return this.createSdkCmd;
    }

}
