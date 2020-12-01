// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationConfigQuery extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("VersionId")
    public String versionId;

    public static DescribeApplicationConfigQuery build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationConfigQuery self = new DescribeApplicationConfigQuery();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationConfigQuery setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeApplicationConfigQuery setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
