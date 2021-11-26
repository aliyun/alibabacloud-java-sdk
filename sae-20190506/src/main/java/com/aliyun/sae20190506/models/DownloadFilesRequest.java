// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DownloadFilesRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Localpath")
    public String localpath;

    public static DownloadFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadFilesRequest self = new DownloadFilesRequest();
        return TeaModel.build(map, self);
    }

    public DownloadFilesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DownloadFilesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DownloadFilesRequest setLocalpath(String localpath) {
        this.localpath = localpath;
        return this;
    }
    public String getLocalpath() {
        return this.localpath;
    }

}
