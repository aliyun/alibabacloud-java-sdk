// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartViewRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eo85****</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("BgColor")
    public StartViewRequestBgColor bgColor;

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
    public StartViewRequestRegionColor regionColor;

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
