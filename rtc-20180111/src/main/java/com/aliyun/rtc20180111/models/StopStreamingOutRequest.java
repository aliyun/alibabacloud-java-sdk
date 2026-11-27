// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StopStreamingOutRequest extends TeaModel {
    /**
     * <p>The application ID, which is created and queried via the console. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eo85****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>An existing channel ID. Only a single ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The ID of an existing bypass stream ingest job. Only a single ID is supported. It can contain uppercase and lowercase letters, digits, underscores, and hyphens (-), with a maximum length of 55 bytes. If not specified, the system will automatically generate one.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static StopStreamingOutRequest build(java.util.Map<String, ?> map) throws Exception {
        StopStreamingOutRequest self = new StopStreamingOutRequest();
        return TeaModel.build(map, self);
    }

    public StopStreamingOutRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StopStreamingOutRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StopStreamingOutRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
