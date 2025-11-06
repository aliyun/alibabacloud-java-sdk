// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartViewShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eo85****</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("BgColor")
    public StartViewShrinkRequestBgColor bgColor;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CropMode")
    public Integer cropMode;

    @NameInMap("RegionColor")
    public StartViewShrinkRequestRegionColor regionColor;

    @NameInMap("StartWithoutChannel")
    public Boolean startWithoutChannel;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("StartWithoutChannelWaitTime")
    public Integer startWithoutChannelWaitTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>567</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <strong>example:</strong>
     * <p>main</p>
     */
    @NameInMap("ViewContent")
    public String viewContent;

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
         * <p>B。</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>G。</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>R。</p>
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
         * <p>B。</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("B")
        public Integer b;

        /**
         * <p>G。</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("G")
        public Integer g;

        /**
         * <p>R。</p>
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
