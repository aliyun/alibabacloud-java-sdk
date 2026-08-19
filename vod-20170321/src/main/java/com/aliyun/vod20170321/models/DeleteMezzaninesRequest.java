// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMezzaninesRequest extends TeaModel {
    /**
     * <p>Specifies whether to force delete the source file. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): No.</li>
     * <li><strong>true</strong>: Yes.</li>
     * </ul>
     * <blockquote>
     * <p>If the video transcoding pattern is set to no transcoding or asynchronous transcoding, the source file is used as the original stream for playback and cannot be deleted by default. To force delete the source file of such a video, go to Settings and set this parameter to <strong>true</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The list of custom IDs. Specify one or more custom IDs separated by commas (,). A maximum of 20 IDs are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>123-123,1234-1234</p>
     */
    @NameInMap("ReferenceIds")
    public String referenceIds;

    /**
     * <p>The list of audio or video IDs whose source files you want to delete. You can specify a maximum of 20 IDs at a time. Separate multiple IDs with commas (,). You can obtain the IDs by using the following methods:</p>
     * <ul>
     * <li>For audio or video files uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the audio or video IDs.</li>
     * <li>When you call the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation to obtain the upload URL and credential, the audio or video ID is the value of the VideoId response parameter.</li>
     * <li>After the audio or video file is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the audio or video ID, which is the value of the VideoId response parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>23ab850b4f654b6e91d24d8157****,93ab850b4f6f4b6e91d24d81d4****</p>
     */
    @NameInMap("VideoIds")
    public String videoIds;

    public static DeleteMezzaninesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMezzaninesRequest self = new DeleteMezzaninesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMezzaninesRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteMezzaninesRequest setReferenceIds(String referenceIds) {
        this.referenceIds = referenceIds;
        return this;
    }
    public String getReferenceIds() {
        return this.referenceIds;
    }

    public DeleteMezzaninesRequest setVideoIds(String videoIds) {
        this.videoIds = videoIds;
        return this;
    }
    public String getVideoIds() {
        return this.videoIds;
    }

}
