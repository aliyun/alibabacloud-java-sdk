// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class TokenSettings extends TeaModel {
    @NameInMap("EnableCrossAccountAccess")
    public Boolean enableCrossAccountAccess;

    @NameInMap("EnableLogDownloadJob")
    public Boolean enableLogDownloadJob;

    public static TokenSettings build(java.util.Map<String, ?> map) throws Exception {
        TokenSettings self = new TokenSettings();
        return TeaModel.build(map, self);
    }

    public TokenSettings setEnableCrossAccountAccess(Boolean enableCrossAccountAccess) {
        this.enableCrossAccountAccess = enableCrossAccountAccess;
        return this;
    }
    public Boolean getEnableCrossAccountAccess() {
        return this.enableCrossAccountAccess;
    }

    public TokenSettings setEnableLogDownloadJob(Boolean enableLogDownloadJob) {
        this.enableLogDownloadJob = enableLogDownloadJob;
        return this;
    }
    public Boolean getEnableLogDownloadJob() {
        return this.enableLogDownloadJob;
    }

}
