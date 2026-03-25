// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ImportKMSSecretsForHostShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HostId")
    public Integer hostId;

    /**
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Secrets")
    public String secretsShrink;

    public static ImportKMSSecretsForHostShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportKMSSecretsForHostShrinkRequest self = new ImportKMSSecretsForHostShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ImportKMSSecretsForHostShrinkRequest setHostId(Integer hostId) {
        this.hostId = hostId;
        return this;
    }
    public Integer getHostId() {
        return this.hostId;
    }

    public ImportKMSSecretsForHostShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ImportKMSSecretsForHostShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ImportKMSSecretsForHostShrinkRequest setSecretsShrink(String secretsShrink) {
        this.secretsShrink = secretsShrink;
        return this;
    }
    public String getSecretsShrink() {
        return this.secretsShrink;
    }

}
