// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartViewRequest extends TeaModel {
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
     * <p>The global background color.</p>
     */
    @NameInMap("BgColor")
    public StartViewRequestBgColor bgColor;

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
     * <p>The crop mode. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: proportional cropping</li>
     * <li><strong>2</strong>: proportional padding (default)</li>
     * <li><strong>3</strong>: stretch to fill</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CropMode")
    public Integer cropMode;

    /**
     * <p>The global pane background color.</p>
     */
    @NameInMap("RegionColor")
    public StartViewRequestRegionColor regionColor;

    /**
     * <p>Specifies whether to allow starting the task when the channel does not exist. Valid values:</p>
     * <ul>
     * <li>true: Yes.</li>
     * <li>false: No (default).</li>
     * </ul>
     */
    @NameInMap("StartWithoutChannel")
    public Boolean startWithoutChannel;

    /**
     * <p>The wait time for the task when the channel is not started, in seconds. This parameter is valid only when the StartWithoutChannel parameter is set to true. Valid values: 30 to 120.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("StartWithoutChannelWaitTime")
    public Integer startWithoutChannelWaitTime;

    /**
     * <p>The task ID for the current request. Only a single ID is supported. The ID can contain letters, digits, underscores (_), and hyphens (-), and can be up to 55 bytes in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>567</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The stream property. Valid values:</p>
     * <ul>
     * <li>main: main stream</li>
     * <li>screen-cast: shared stream</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>main</p>
     */
    @NameInMap("ViewContent")
    public String viewContent;

    /**
     * <p>The list of user IDs of Session Initiation Protocol (SIP) devices that are allowed to view the main stream or shared stream.</p>
     */
    @NameInMap("ViewSubscribers")
    public java.util.List<String> viewSubscribers;

    public static StartViewRequest build(java.util.Map<String, ?> map) throws Exception {
        StartViewRequest self = new StartViewRequest();
        return TeaModel.build(map, self);
    }

    public StartViewRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartViewRequest setBgColor(StartViewRequestBgColor bgColor) {
        this.bgColor = bgColor;
        return this;
    }
    public StartViewRequestBgColor getBgColor() {
        return this.bgColor;
    }

    public StartViewRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StartViewRequest setCropMode(Integer cropMode) {
        this.cropMode = cropMode;
        return this;
    }
    public Integer getCropMode() {
        return this.cropMode;
    }

    public StartViewRequest setRegionColor(StartViewRequestRegionColor regionColor) {
        this.regionColor = regionColor;
        return this;
    }
    public StartViewRequestRegionColor getRegionColor() {
        return this.regionColor;
    }

    public StartViewRequest setStartWithoutChannel(Boolean startWithoutChannel) {
        this.startWithoutChannel = startWithoutChannel;
        return this;
    }
    public Boolean getStartWithoutChannel() {
        return this.startWithoutChannel;
    }

    public StartViewRequest setStartWithoutChannelWaitTime(Integer startWithoutChannelWaitTime) {
        this.startWithoutChannelWaitTime = startWithoutChannelWaitTime;
        return this;
    }
    public Integer getStartWithoutChannelWaitTime() {
        return this.startWithoutChannelWaitTime;
    }

    public StartViewRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public StartViewRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public StartViewRequest setViewContent(String viewContent) {
        this.viewContent = viewContent;
        return this;
    }
    public String getViewContent() {
        return this.viewContent;
    }

    public StartViewRequest setViewSubscribers(java.util.List<String> viewSubscribers) {
        this.viewSubscribers = viewSubscribers;
        return this;
    }
    public java.util.List<String> getViewSubscribers() {
        return this.viewSubscribers;
    }

    public static class StartViewRequestBgColor extends TeaModel {
        /**
         * <p>The B value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>The G value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>The R value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static StartViewRequestBgColor build(java.util.Map<String, ?> map) throws Exception {
            StartViewRequestBgColor self = new StartViewRequestBgColor();
            return TeaModel.build(map, self);
        }

        public StartViewRequestBgColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartViewRequestBgColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartViewRequestBgColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartViewRequestRegionColor extends TeaModel {
        /**
         * <p>The B value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>The G value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>The R value.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("R")
        public Integer r;

        public static StartViewRequestRegionColor build(java.util.Map<String, ?> map) throws Exception {
            StartViewRequestRegionColor self = new StartViewRequestRegionColor();
            return TeaModel.build(map, self);
        }

        public StartViewRequestRegionColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartViewRequestRegionColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartViewRequestRegionColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

}
