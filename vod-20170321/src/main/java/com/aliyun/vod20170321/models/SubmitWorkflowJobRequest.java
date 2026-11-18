// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitWorkflowJobRequest extends TeaModel {
    @NameInMap("ExtraInputs")
    public String extraInputs;

    /**
     * <p>The media asset ID, which is the video ID. You can obtain the ID by using one of the following methods:</p>
     * <ul>
     * <li>For videos uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Assets</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
     * <li>When you call the <a href="https://help.aliyun.com/document_detail/55407.html">Get the upload URL and credential for a video</a> operation to obtain the upload URL and credential, the video ID is the value of the VideoId response parameter.</li>
     * <li>After a video is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">Search for media information</a> operation to query the video ID. The video ID is the value of the VideoId response parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>058b39e75269da42b08f00459****</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The workflow ID. You can log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Processing Configuration</strong> &gt; <strong>Workflow Management</strong> to view the ID.</p>
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

    public SubmitWorkflowJobRequest setExtraInputs(String extraInputs) {
        this.extraInputs = extraInputs;
        return this;
    }
    public String getExtraInputs() {
        return this.extraInputs;
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
