// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class GenerateVideoRequest extends TeaModel {
    @NameInMap("FileList")
    @Validation(required = true)
    public java.util.List<GenerateVideoRequestFileList> fileList;

    @NameInMap("Scene")
    public String scene;

    @NameInMap("Width")
    public Integer width;

    @NameInMap("Height")
    public Integer height;

    @NameInMap("Style")
    public String style;

    @NameInMap("Duration")
    public Double duration;

    @NameInMap("DurationAdaption")
    public Boolean durationAdaption;

    @NameInMap("TransitionStyle")
    public String transitionStyle;

    @NameInMap("SmartEffect")
    public Boolean smartEffect;

    @NameInMap("PuzzleEffect")
    public Boolean puzzleEffect;

    @NameInMap("Mute")
    public Boolean mute;

    public static GenerateVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateVideoRequest self = new GenerateVideoRequest();
        return TeaModel.build(map, self);
    }

    public static class GenerateVideoRequestFileList extends TeaModel {
        @NameInMap("FileUrl")
        @Validation(required = true)
        public String fileUrl;

        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        public static GenerateVideoRequestFileList build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoRequestFileList self = new GenerateVideoRequestFileList();
            return TeaModel.build(map, self);
        }

    }

}
