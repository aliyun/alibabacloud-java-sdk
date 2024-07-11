// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateApplicationShrinkRequest extends TeaModel {
    /**
     * <p>The configurations of application alerts.</p>
     */
    @NameInMap("AlarmConfig")
    public String alarmConfigShrink;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>TF-CreateApplication-1647587475-84104b89-eba5-47a8-b2fd-807b8b7d</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>application</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The application name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyApplication</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID. Set the value to cn-hangzhou.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxsn4m******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>service-79538e30e44541b699d8</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The tags.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;k1&quot;:&quot;v1&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static CreateApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationShrinkRequest self = new CreateApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationShrinkRequest setAlarmConfigShrink(String alarmConfigShrink) {
        this.alarmConfigShrink = alarmConfigShrink;
        return this;
    }
    public String getAlarmConfigShrink() {
        return this.alarmConfigShrink;
    }

    public CreateApplicationShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateApplicationShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApplicationShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateApplicationShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateApplicationShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateApplicationShrinkRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public CreateApplicationShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
