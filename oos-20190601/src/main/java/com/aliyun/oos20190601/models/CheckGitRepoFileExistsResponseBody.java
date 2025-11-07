// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CheckGitRepoFileExistsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("FileExists")
    public Boolean fileExists;

    /**
     * <strong>example:</strong>
     * <p>A5320F1D-92D9-44BB-A416-5FC525ED6D57</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckGitRepoFileExistsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckGitRepoFileExistsResponseBody self = new CheckGitRepoFileExistsResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckGitRepoFileExistsResponseBody setFileExists(Boolean fileExists) {
        this.fileExists = fileExists;
        return this;
    }
    public Boolean getFileExists() {
        return this.fileExists;
    }

    public CheckGitRepoFileExistsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
