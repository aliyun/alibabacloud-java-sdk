// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebInstanceInfo extends TeaModel {
    /**
     * <p>The instance image.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-hangzhou.aliyuncs.com/sae_test/******:0.0.1</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The ID of the application instance.</p>
     * 
     * <strong>example:</strong>
     * <p>c-66691780-1522405d-3021e1******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance status.</p>
     * 
     * <strong>example:</strong>
     * <p>Idle</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the application version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static WebInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
        WebInstanceInfo self = new WebInstanceInfo();
        return TeaModel.build(map, self);
    }

    public WebInstanceInfo setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public WebInstanceInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public WebInstanceInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public WebInstanceInfo setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
