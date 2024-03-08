// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartStreamingOutRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("Panes")
    public java.util.List<StartStreamingOutRequestPanes> panes;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("Url")
    public String url;

    public static StartStreamingOutRequest build(java.util.Map<String, ?> map) throws Exception {
        StartStreamingOutRequest self = new StartStreamingOutRequest();
        return TeaModel.build(map, self);
    }

    public StartStreamingOutRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartStreamingOutRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StartStreamingOutRequest setPanes(java.util.List<StartStreamingOutRequestPanes> panes) {
        this.panes = panes;
        return this;
    }
    public java.util.List<StartStreamingOutRequestPanes> getPanes() {
        return this.panes;
    }

    public StartStreamingOutRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public StartStreamingOutRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public StartStreamingOutRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public static class StartStreamingOutRequestPanes extends TeaModel {
        @NameInMap("PaneId")
        public String paneId;

        @NameInMap("Source")
        public String source;

        @NameInMap("SourceType")
        public String sourceType;

        public static StartStreamingOutRequestPanes build(java.util.Map<String, ?> map) throws Exception {
            StartStreamingOutRequestPanes self = new StartStreamingOutRequestPanes();
            return TeaModel.build(map, self);
        }

        public StartStreamingOutRequestPanes setPaneId(String paneId) {
            this.paneId = paneId;
            return this;
        }
        public String getPaneId() {
            return this.paneId;
        }

        public StartStreamingOutRequestPanes setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public StartStreamingOutRequestPanes setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

}
