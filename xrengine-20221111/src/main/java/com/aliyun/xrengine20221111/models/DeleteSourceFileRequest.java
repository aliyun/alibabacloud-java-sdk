// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class DeleteSourceFileRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileId")
    public String fileId;

    @NameInMap("JwtToken")
    public String jwtToken;

    public static DeleteSourceFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSourceFileRequest self = new DeleteSourceFileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSourceFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public DeleteSourceFileRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

}
