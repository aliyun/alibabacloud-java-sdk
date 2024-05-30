// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class GenerateVideoAdvanceRequest extends TeaModel {
    @NameInMap("Duration")
    public Float duration;

    @NameInMap("DurationAdaption")
    public Boolean durationAdaption;

    /**
     * <p>1</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileList")
    public java.util.List<GenerateVideoAdvanceRequestFileList> fileList;

    @NameInMap("Height")
    public Integer height;

    @NameInMap("Mute")
    public Boolean mute;

    @NameInMap("PuzzleEffect")
    public Boolean puzzleEffect;

    @NameInMap("Scene")
    public String scene;

    @NameInMap("SmartEffect")
    public Boolean smartEffect;

    @NameInMap("Style")
    public String style;

    @NameInMap("TransitionStyle")
    public String transitionStyle;

    @NameInMap("Width")
    public Integer width;

    public static GenerateVideoAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateVideoAdvanceRequest self = new GenerateVideoAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public GenerateVideoAdvanceRequest setDuration(Float duration) {
        this.duration = duration;
        return this;
    }
    public Float getDuration() {
        return this.duration;
    }

    public GenerateVideoAdvanceRequest setDurationAdaption(Boolean durationAdaption) {
        this.durationAdaption = durationAdaption;
        return this;
    }
    public Boolean getDurationAdaption() {
        return this.durationAdaption;
    }

    public GenerateVideoAdvanceRequest setFileList(java.util.List<GenerateVideoAdvanceRequestFileList> fileList) {
        this.fileList = fileList;
        return this;
    }
    public java.util.List<GenerateVideoAdvanceRequestFileList> getFileList() {
        return this.fileList;
    }

    public GenerateVideoAdvanceRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public GenerateVideoAdvanceRequest setMute(Boolean mute) {
        this.mute = mute;
        return this;
    }
    public Boolean getMute() {
        return this.mute;
    }

    public GenerateVideoAdvanceRequest setPuzzleEffect(Boolean puzzleEffect) {
        this.puzzleEffect = puzzleEffect;
        return this;
    }
    public Boolean getPuzzleEffect() {
        return this.puzzleEffect;
    }

    public GenerateVideoAdvanceRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public GenerateVideoAdvanceRequest setSmartEffect(Boolean smartEffect) {
        this.smartEffect = smartEffect;
        return this;
    }
    public Boolean getSmartEffect() {
        return this.smartEffect;
    }

    public GenerateVideoAdvanceRequest setStyle(String style) {
        this.style = style;
        return this;
    }
    public String getStyle() {
        return this.style;
    }

    public GenerateVideoAdvanceRequest setTransitionStyle(String transitionStyle) {
        this.transitionStyle = transitionStyle;
        return this;
    }
    public String getTransitionStyle() {
        return this.transitionStyle;
    }

    public GenerateVideoAdvanceRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

    public static class GenerateVideoAdvanceRequestFileList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("FileUrl")
        public java.io.InputStream fileUrlObject;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Type")
        public String type;

        public static GenerateVideoAdvanceRequestFileList build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoAdvanceRequestFileList self = new GenerateVideoAdvanceRequestFileList();
            return TeaModel.build(map, self);
        }

        public GenerateVideoAdvanceRequestFileList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GenerateVideoAdvanceRequestFileList setFileUrlObject(java.io.InputStream fileUrlObject) {
            this.fileUrlObject = fileUrlObject;
            return this;
        }
        public java.io.InputStream getFileUrlObject() {
            return this.fileUrlObject;
        }

        public GenerateVideoAdvanceRequestFileList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
