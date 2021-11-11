// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20211110_21312586.models;

import com.aliyun.tea.*;

public class UpdateAndReleaseApiRequest extends TeaModel {
    @NameInMap("updateApiCmd")
    public java.io.InputStream updateApiCmd;

    public static UpdateAndReleaseApiRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAndReleaseApiRequest self = new UpdateAndReleaseApiRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAndReleaseApiRequest setUpdateApiCmd(java.io.InputStream updateApiCmd) {
        this.updateApiCmd = updateApiCmd;
        return this;
    }
    public java.io.InputStream getUpdateApiCmd() {
        return this.updateApiCmd;
    }

}
