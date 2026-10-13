// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetSkillRequest extends TeaModel {
    /**
     * <p>Specifies whether to obtain a temporary download URL for the specified version. Default value: false.</p>
     */
    @NameInMap("Download")
    public Boolean download;

    /**
     * <p>The supported language. Valid values:</p>
     * <ul>
     * <li>zh-CN: Simplified Chinese</li>
     * <li>zh-TW: Traditional Chinese</li>
     * <li>en-US: English</li>
     * <li>ja-JP: Japanese</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The file path within the package, such as SKILL.md. The body is in File.text, and the full Markdown is in SkillMarkdown.</p>
     * 
     * <strong>example:</strong>
     * <p>SKILL.md</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The unique identifier of the skill.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-44665544****</p>
     */
    @NameInMap("SkillId")
    public String skillId;

    /**
     * <p>The version UUID (Versions[].Id), not a version number such as 1.0.0. If omitted, the currently active version is read.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-4000-8000-000000000002</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    /**
     * <p>The ContextDB workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-4000-8000-000000000001</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSkillRequest self = new GetSkillRequest();
        return TeaModel.build(map, self);
    }

    public GetSkillRequest setDownload(Boolean download) {
        this.download = download;
        return this;
    }
    public Boolean getDownload() {
        return this.download;
    }

    public GetSkillRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetSkillRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public GetSkillRequest setSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }
    public String getSkillId() {
        return this.skillId;
    }

    public GetSkillRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public GetSkillRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
