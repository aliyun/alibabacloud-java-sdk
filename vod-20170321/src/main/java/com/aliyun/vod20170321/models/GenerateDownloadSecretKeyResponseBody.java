// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GenerateDownloadSecretKeyResponseBody extends TeaModel {
    /**
     * <p>The key file for secure download.</p>
     */
    @NameInMap("AppEncryptKey")
    public String appEncryptKey;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateDownloadSecretKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateDownloadSecretKeyResponseBody self = new GenerateDownloadSecretKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateDownloadSecretKeyResponseBody setAppEncryptKey(String appEncryptKey) {
        this.appEncryptKey = appEncryptKey;
        return this;
    }
    public String getAppEncryptKey() {
        return this.appEncryptKey;
    }

    public GenerateDownloadSecretKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
