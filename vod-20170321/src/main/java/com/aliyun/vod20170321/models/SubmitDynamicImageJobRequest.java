// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitDynamicImageJobRequest extends TeaModel {
    /**
     * <p>The ID of the frame animation template.</p>
     */
    @NameInMap("DynamicImageTemplateId")
    public String dynamicImageTemplateId;

    /**
     * <p>The override parameter. Specify the value in the JSON format. For more information, see [Parameters for media processing](~~98618~~). You can use this parameter to override configurations in the animated image template. For more information, see the "DynamicImageTemplateConfig: the configurations of an animated sticker template" section of the [Basic data types](~~52839~~) topic.</p>
     */
    @NameInMap("OverrideParams")
    public String overrideParams;

    /**
     * <p>The ID of the video. You can use one of the following methods to obtain the ID:</p>
     * <br>
     * <p>*   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, view the ID of the media file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</p>
     * <p>*   Obtain the value of VideoId from the response to the [CreateUploadVideo](~~55407~~) operation that you call to upload media files.</p>
     * <p>*   Obtain the value of VideoId from the response to the [SearchMedia](~~86044~~) operation after you upload media files.</p>
     */
    @NameInMap("VideoId")
    public String videoId;

    public static SubmitDynamicImageJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDynamicImageJobRequest self = new SubmitDynamicImageJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDynamicImageJobRequest setDynamicImageTemplateId(String dynamicImageTemplateId) {
        this.dynamicImageTemplateId = dynamicImageTemplateId;
        return this;
    }
    public String getDynamicImageTemplateId() {
        return this.dynamicImageTemplateId;
    }

    public SubmitDynamicImageJobRequest setOverrideParams(String overrideParams) {
        this.overrideParams = overrideParams;
        return this;
    }
    public String getOverrideParams() {
        return this.overrideParams;
    }

    public SubmitDynamicImageJobRequest setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

}
