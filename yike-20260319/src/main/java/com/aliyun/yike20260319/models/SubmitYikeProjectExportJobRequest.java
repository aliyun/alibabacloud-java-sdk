// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SubmitYikeProjectExportJobRequest extends TeaModel {
    /**
     * <p>The export type of the editing project. Valid values:</p>
     * <ul>
     * <li>PureAudio: pure audio (the export result returns a pure audio file and a subtitle file).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PureAudio</p>
     */
    @NameInMap("ExportType")
    public String exportType;

    /**
     * <p>The ID of the online editing project.</p>
     * 
     * <strong>example:</strong>
     * <p>01a6adbbd181437eb5030d3d93e0182d</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The custom parameter in JSON string format. The callback result carries this parameter as-is (for example, newsKey).
     * The system reserved field NotifyAddress specifies the callback URL. After the task is complete, a callback is sent to this URL. Example: {&quot;NotifyAddress&quot;: &quot;<a href="http://xxx.callback.url%22%7D">http://xxx.callback.url&quot;}</a></p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;newsKey\&quot;:\&quot;NEWS_20260420_001\&quot;,\&quot;key1\&quot;:\&quot;value1\&quot;, \&quot;NotifyAddress\&quot;:\&quot;<a href="https://cms.example.com/callback/video-task%5C%5C%22%7D">https://cms.example.com/callback/video-task\\&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitYikeProjectExportJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitYikeProjectExportJobRequest self = new SubmitYikeProjectExportJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitYikeProjectExportJobRequest setExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }
    public String getExportType() {
        return this.exportType;
    }

    public SubmitYikeProjectExportJobRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SubmitYikeProjectExportJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
