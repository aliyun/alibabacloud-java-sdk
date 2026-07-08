// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateGroupRequest extends TeaModel {
    /**
     * <p>Application name used by the workspace. Default value: live</p>
     * 
     * <strong>example:</strong>
     * <p>live</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>Callback URL triggered when device or stream status updates in the workspace</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.com/callback">http://example.com/callback</a></p>
     */
    @NameInMap("Callback")
    public String callback;

    /**
     * <p>Workspace description</p>
     * 
     * <strong>example:</strong>
     * <p>我的视频监控</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Ingest protocol used by the workspace. Valid values:</p>
     * <ul>
     * <li><p>gb28181</p>
     * </li>
     * <li><p>rtmp</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp</p>
     */
    @NameInMap("InProtocol")
    public String inProtocol;

    /**
     * <p>Whether to enable on-demand stream pulling. Valid values:</p>
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
     * <p>Workspace name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>我的视频监控</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Playback protocols used by the workspace. Separate multiple values with commas. Valid values:</p>
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
     * <p>flv,rtmp</p>
     */
    @NameInMap("OutProtocol")
    public String outProtocol;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Streaming domain used by the workspace</p>
     * 
     * <strong>example:</strong>
     * <p>demo.aliyundoc.com</p>
     */
    @NameInMap("PlayDomain")
    public String playDomain;

    /**
     * <p>Ingest domain used by the workspace</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("PushDomain")
    public String pushDomain;

    /**
     * <p>Region where the workspace is located, that is, the service center</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("Region")
    public String region;

    public static CreateGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupRequest self = new CreateGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateGroupRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public CreateGroupRequest setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

    public CreateGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGroupRequest setInProtocol(String inProtocol) {
        this.inProtocol = inProtocol;
        return this;
    }
    public String getInProtocol() {
        return this.inProtocol;
    }

    public CreateGroupRequest setLazyPull(Boolean lazyPull) {
        this.lazyPull = lazyPull;
        return this;
    }
    public Boolean getLazyPull() {
        return this.lazyPull;
    }

    public CreateGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateGroupRequest setOutProtocol(String outProtocol) {
        this.outProtocol = outProtocol;
        return this;
    }
    public String getOutProtocol() {
        return this.outProtocol;
    }

    public CreateGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateGroupRequest setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }
    public String getPlayDomain() {
        return this.playDomain;
    }

    public CreateGroupRequest setPushDomain(String pushDomain) {
        this.pushDomain = pushDomain;
        return this;
    }
    public String getPushDomain() {
        return this.pushDomain;
    }

    public CreateGroupRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
