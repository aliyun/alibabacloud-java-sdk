// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UploadFilesRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("CloudUrl")
    public String cloudUrl;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Localpath")
    public String localpath;

    public static UploadFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadFilesRequest self = new UploadFilesRequest();
        return TeaModel.build(map, self);
    }

    public UploadFilesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UploadFilesRequest setCloudUrl(String cloudUrl) {
        this.cloudUrl = cloudUrl;
        return this;
    }
    public String getCloudUrl() {
        return this.cloudUrl;
    }

    public UploadFilesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UploadFilesRequest setLocalpath(String localpath) {
        this.localpath = localpath;
        return this;
    }
    public String getLocalpath() {
        return this.localpath;
    }

}
