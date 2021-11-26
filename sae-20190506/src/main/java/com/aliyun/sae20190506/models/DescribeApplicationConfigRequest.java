// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationConfigRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("VersionId")
    public String versionId;

    public static DescribeApplicationConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationConfigRequest self = new DescribeApplicationConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeApplicationConfigRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
