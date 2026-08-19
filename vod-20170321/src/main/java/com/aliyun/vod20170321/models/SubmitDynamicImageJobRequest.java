// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitDynamicImageJobRequest extends TeaModel {
    /**
     * <p>The ID of the animated image template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1a443dc52ef10abc4794d700*****</p>
     */
    @NameInMap("DynamicImageTemplateId")
    public String dynamicImageTemplateId;

    /**
     * <p>The override parameters in the JSON format. For more information, see <a href="https://help.aliyun.com/document_detail/98618.html">OverrideParams</a>. You can use this parameter to override the parameters in the animated image template. For more information, see <a href="https://help.aliyun.com/document_detail/52839.html">DynamicImageTemplateConfig</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Watermarks&quot;:[{&quot;Content&quot;:&quot;UserID: 666**&quot;,&quot;WatermarkId&quot;:&quot;8ca03c884944bd05efccc312367****&quot;}]}</p>
     */
    @NameInMap("OverrideParams")
    public String overrideParams;

    /**
     * <p>The video ID. You can obtain the video ID by using one of the following methods:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Assets</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
     * <li>Obtain the video ID from the value of the VideoId parameter returned by the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation when you obtain the upload URL and credential.</li>
     * <li>After the video is uploaded, obtain the video ID from the value of the VideoId parameter returned by the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation.</li>
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
