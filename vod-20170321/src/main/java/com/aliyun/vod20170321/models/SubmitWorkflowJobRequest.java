// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitWorkflowJobRequest extends TeaModel {
    /**
     * <p>The ID of the media file. You can use one of the following methods to obtain the ID:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD</a> console. In the left-side navigation pane, choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong>. On the Video and Audio page, view the ID of the audio or video file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</li>
     * <li>Obtain the value of the VideoId parameter when you call the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation to upload media files.</li>
     * <li>Obtain the value of the VideoId parameter when you call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation after you upload media files.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>058b39e75269da42b08f00459****</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The ID of the workflow. To view the ID of the workflow, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Configuration Management</strong> &gt; <strong>Media Processing</strong> &gt; <strong>Workflows</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>34d577eade633860bdf1237****</p>
     */
    @NameInMap("WorkflowId")
    public String workflowId;

    public static SubmitWorkflowJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitWorkflowJobRequest self = new SubmitWorkflowJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitWorkflowJobRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public SubmitWorkflowJobRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

}
