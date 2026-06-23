// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ImportKMSSecretsForHostShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the host to import the KMS secrets to.</p>
     * <blockquote>
     * <p>Only ECS hosts can import KMS secrets. You can call the <a href="https://help.aliyun.com/document_detail/200665.html">ListHosts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HostId")
    public Integer hostId;

    /**
     * <p>The ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>For more information about region IDs and names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and availability zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The KMS secrets to import.</p>
     */
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
