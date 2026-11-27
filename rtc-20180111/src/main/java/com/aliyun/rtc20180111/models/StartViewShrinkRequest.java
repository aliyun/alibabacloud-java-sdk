// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartViewShrinkRequest extends TeaModel {
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
    public StartViewShrinkRequestBgColor bgColor;

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
    public StartViewShrinkRequestRegionColor regionColor;

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
    public String viewSubscribersShrink;

    public static StartViewShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartViewShrinkRequest self = new StartViewShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartViewShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartViewShrinkRequest setBgColor(StartViewShrinkRequestBgColor bgColor) {
        this.bgColor = bgColor;
        return this;
    }
    public StartViewShrinkRequestBgColor getBgColor() {
        return this.bgColor;
    }

    public StartViewShrinkRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public StartViewShrinkRequest setCropMode(Integer cropMode) {
        this.cropMode = cropMode;
        return this;
    }
    public Integer getCropMode() {
        return this.cropMode;
    }

    public StartViewShrinkRequest setRegionColor(StartViewShrinkRequestRegionColor regionColor) {
        this.regionColor = regionColor;
        return this;
    }
    public StartViewShrinkRequestRegionColor getRegionColor() {
        return this.regionColor;
    }

    public StartViewShrinkRequest setStartWithoutChannel(Boolean startWithoutChannel) {
        this.startWithoutChannel = startWithoutChannel;
        return this;
    }
    public Boolean getStartWithoutChannel() {
        return this.startWithoutChannel;
    }

    public StartViewShrinkRequest setStartWithoutChannelWaitTime(Integer startWithoutChannelWaitTime) {
        this.startWithoutChannelWaitTime = startWithoutChannelWaitTime;
        return this;
    }
    public Integer getStartWithoutChannelWaitTime() {
        return this.startWithoutChannelWaitTime;
    }

    public StartViewShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public StartViewShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public StartViewShrinkRequest setViewContent(String viewContent) {
        this.viewContent = viewContent;
        return this;
    }
    public String getViewContent() {
        return this.viewContent;
    }

    public StartViewShrinkRequest setViewSubscribersShrink(String viewSubscribersShrink) {
        this.viewSubscribersShrink = viewSubscribersShrink;
        return this;
    }
    public String getViewSubscribersShrink() {
        return this.viewSubscribersShrink;
    }

    public static class StartViewShrinkRequestBgColor extends TeaModel {
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

        public static StartViewShrinkRequestBgColor build(java.util.Map<String, ?> map) throws Exception {
            StartViewShrinkRequestBgColor self = new StartViewShrinkRequestBgColor();
            return TeaModel.build(map, self);
        }

        public StartViewShrinkRequestBgColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartViewShrinkRequestBgColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartViewShrinkRequestBgColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

    public static class StartViewShrinkRequestRegionColor extends TeaModel {
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

        public static StartViewShrinkRequestRegionColor build(java.util.Map<String, ?> map) throws Exception {
            StartViewShrinkRequestRegionColor self = new StartViewShrinkRequestRegionColor();
            return TeaModel.build(map, self);
        }

        public StartViewShrinkRequestRegionColor setB(Integer b) {
            this.b = b;
            return this;
        }
        public Integer getB() {
            return this.b;
        }

        public StartViewShrinkRequestRegionColor setG(Integer g) {
            this.g = g;
            return this;
        }
        public Integer getG() {
            return this.g;
        }

        public StartViewShrinkRequestRegionColor setR(Integer r) {
            this.r = r;
            return this;
        }
        public Integer getR() {
            return this.r;
        }

    }

}
