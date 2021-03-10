// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class LoadDataToExternalAudienceRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("AudienceId")
    public String audienceId;

    @NameInMap("OssPath")
    public String ossPath;

    public static LoadDataToExternalAudienceRequest build(java.util.Map<String, ?> map) throws Exception {
        LoadDataToExternalAudienceRequest self = new LoadDataToExternalAudienceRequest();
        return TeaModel.build(map, self);
    }

    public LoadDataToExternalAudienceRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public LoadDataToExternalAudienceRequest setAudienceId(String audienceId) {
        this.audienceId = audienceId;
        return this;
    }
    public String getAudienceId() {
        return this.audienceId;
    }

    public LoadDataToExternalAudienceRequest setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

}
