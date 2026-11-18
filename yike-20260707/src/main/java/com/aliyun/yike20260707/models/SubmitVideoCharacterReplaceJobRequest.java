// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitVideoCharacterReplaceJobRequest extends TeaModel {
    /**
     * <p>The ID of the video character replacement application. Use a configured application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The input parameters of the application, serialized as a JSON string. The field names and material requirements are subject to the input definition of the corresponding AppId.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;LoadImage.1.TargetImage&quot;:&quot;1a7852b032c371f0b64fe6f6c74b****&quot;}</p>
     */
    @NameInMap("AppParams")
    public String appParams;

    /**
     * <p>The folder ID.</p>
     * 
     * <strong>example:</strong>
     * <p>folder-u3ilwhoc36ux9a****</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pd_061716****</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    public static SubmitVideoCharacterReplaceJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoCharacterReplaceJobRequest self = new SubmitVideoCharacterReplaceJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitVideoCharacterReplaceJobRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SubmitVideoCharacterReplaceJobRequest setAppParams(String appParams) {
        this.appParams = appParams;
        return this;
    }
    public String getAppParams() {
        return this.appParams;
    }

    public SubmitVideoCharacterReplaceJobRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public SubmitVideoCharacterReplaceJobRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
