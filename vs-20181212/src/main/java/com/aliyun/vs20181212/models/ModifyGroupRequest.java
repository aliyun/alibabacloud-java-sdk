// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ModifyGroupRequest extends TeaModel {
    /**
     * <p>Callback URL for device or stream status updates in the group.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.com/callback">http://example.com/callback</a></p>
     */
    @NameInMap("Callback")
    public String callback;

    /**
     * <p>Description of the space.</p>
     * 
     * <strong>example:</strong>
     * <p>用于测试使用</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Indicates whether the space is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The ID of the space.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>32388487739092994-cn-qingdao</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Ingest protocol used by the group. Valid values:</p>
     * <ul>
     * <li><p>gb28181</p>
     * </li>
     * <li><p>rtmp</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>gb28181</p>
     */
    @NameInMap("InProtocol")
    public String inProtocol;

    /**
     * <p>Whether on-demand stream pulling is enabled. Valid values:</p>
     * <ul>
     * <li><p>false (default)</p>
     * </li>
     * <li><p>true</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LazyPull")
    public Boolean lazyPull;

    /**
     * <p>Space name.</p>
     * 
     * <strong>example:</strong>
     * <p>myGroup</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Playback protocols used by the group. Separate multiple values with commas. Valid values:</p>
     * <ul>
     * <li><p>flv</p>
     * </li>
     * <li><p>hls</p>
     * </li>
     * <li><p>rtmp</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>flv,rtmp,hls</p>
     */
    @NameInMap("OutProtocol")
    public String outProtocol;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Streaming domain used by the group.</p>
     * 
     * <strong>example:</strong>
     * <p>myplay.com</p>
     */
    @NameInMap("PlayDomain")
    public String playDomain;

    /**
     * <p>Ingest domain used by the group. Applies only to groups that use the RTMP ingest protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>mypush.com</p>
     */
    @NameInMap("PushDomain")
    public String pushDomain;

    /**
     * <p>The region where the space is located. This region serves as the service center.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("Region")
    public String region;

    public static ModifyGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGroupRequest self = new ModifyGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyGroupRequest setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public ModifyGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyGroupRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ModifyGroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyGroupRequest setInProtocol(String inProtocol) {
        this.inProtocol = inProtocol;
        return this;
    }
    public String getInProtocol() {
        return this.inProtocol;
    }

    public ModifyGroupRequest setLazyPull(Boolean lazyPull) {
        this.lazyPull = lazyPull;
        return this;
    }
    public Boolean getLazyPull() {
        return this.lazyPull;
    }

    public ModifyGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyGroupRequest setOutProtocol(String outProtocol) {
        this.outProtocol = outProtocol;
        return this;
    }
    public String getOutProtocol() {
        return this.outProtocol;
    }

    public ModifyGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyGroupRequest setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }
    public String getPlayDomain() {
        return this.playDomain;
    }

    public ModifyGroupRequest setPushDomain(String pushDomain) {
        this.pushDomain = pushDomain;
        return this;
    }
    public String getPushDomain() {
        return this.pushDomain;
    }

    public ModifyGroupRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
