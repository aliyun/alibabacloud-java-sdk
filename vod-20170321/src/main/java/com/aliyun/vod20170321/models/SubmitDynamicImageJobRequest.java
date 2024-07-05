// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitDynamicImageJobRequest extends TeaModel {
    /**
     * <p>The ID of the frame animation template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1a443dc52ef10abc4794d700*****</p>
     */
    @NameInMap("DynamicImageTemplateId")
    public String dynamicImageTemplateId;

    /**
     * <p>The override parameter. Specify the value in the JSON format. For more information, see <a href="https://help.aliyun.com/document_detail/98618.html">Parameters for media processing</a>. You can use this parameter to override configurations in the animated image template. For more information, see the &quot;DynamicImageTemplateConfig: the configurations of an animated sticker template&quot; section of the <a href="https://help.aliyun.com/document_detail/52839.html">Basic data types</a> topic.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Watermarks&quot;:[{&quot;Content&quot;:&quot;UserID: 666**&quot;,&quot;WatermarkId&quot;:&quot;8ca03c884944bd05efccc312367****&quot;}]}</p>
     */
    @NameInMap("OverrideParams")
    public String overrideParams;

    /**
     * <p>The ID of the video. You can use one of the following methods to obtain the ID:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD</a> console. In the left-side navigation pane, choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong>. On the Video and Audio page, view the ID of the media file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</li>
     * <li>Obtain the value of VideoId from the response to the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation that you call to upload media files.</li>
     * <li>Obtain the value of VideoId from the response to the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation after you upload media files.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7d2fbc3e273441bdb0e08e55f8****</p>
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
