// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class InstanceInfo extends TeaModel {
    @NameInMap("imageUrl")
    public String imageUrl;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("status")
    public String status;

    @NameInMap("versionId")
    public String versionId;

    public static InstanceInfo build(java.util.Map<String, ?> map) throws Exception {
        InstanceInfo self = new InstanceInfo();
        return TeaModel.build(map, self);
    }

    public InstanceInfo setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public InstanceInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InstanceInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public InstanceInfo setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
