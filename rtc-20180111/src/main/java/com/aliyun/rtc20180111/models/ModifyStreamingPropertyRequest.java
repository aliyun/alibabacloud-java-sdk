// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyStreamingPropertyRequest extends TeaModel {
    /**
     * <p>The application ID. You can create and query the ID in the console. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eo85****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of an existing channel. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The ID of the stream mixing task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The stream mixing content.</p>
     * 
     * <strong>example:</strong>
     * <p>main</p>
     */
    @NameInMap("ViewContent")
    public String viewContent;

    /**
     * <p>The view subscribers.</p>
     */
    @NameInMap("ViewSubscribers")
    public java.util.List<String> viewSubscribers;

    public static ModifyStreamingPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyStreamingPropertyRequest self = new ModifyStreamingPropertyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyStreamingPropertyRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ModifyStreamingPropertyRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public ModifyStreamingPropertyRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ModifyStreamingPropertyRequest setViewContent(String viewContent) {
        this.viewContent = viewContent;
        return this;
    }
    public String getViewContent() {
        return this.viewContent;
    }

    public ModifyStreamingPropertyRequest setViewSubscribers(java.util.List<String> viewSubscribers) {
        this.viewSubscribers = viewSubscribers;
        return this;
    }
    public java.util.List<String> getViewSubscribers() {
        return this.viewSubscribers;
    }

}
