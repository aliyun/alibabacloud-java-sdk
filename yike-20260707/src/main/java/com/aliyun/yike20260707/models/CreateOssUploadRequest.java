// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class CreateOssUploadRequest extends TeaModel {
    /**
     * <p>The <strong>business configuration JSON</strong>, which includes ProductionId and FolderId.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ProductionId&quot;: &quot;pd_***&quot;, &quot;FolderId&quot;: &quot;fd_***&quot;}</p>
     */
    @NameInMap("BizConfig")
    public String bizConfig;

    /**
     * <p>The credential type. This is a reserved parameter. The current version always returns STS temporary credentials, and this parameter does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>STS</p>
     */
    @NameInMap("CredentialType")
    public String credentialType;

    /**
     * <p>The file name extension, such as mp4, wav, or png. Do not include the dot. If this parameter is missing, <code>MissingParameter</code> is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mp4</p>
     */
    @NameInMap("FileExt")
    public String fileExt;

    /**
     * <p>The file type. Valid values: <code>Media</code> (default), <code>StoryboardInput</code>, <code>ImageFusion</code>, <code>AIAppParams</code>, <code>Workflow</code>, and <code>CommonFile</code>. If an invalid value is specified, <code>InvalidParameter</code> is returned. This value is used as a path segment in the <code>ObjectKey</code> and is converted to lowercase.</p>
     * 
     * <strong>example:</strong>
     * <p>Media</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>The explicitly specified target bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>test-bucket</p>
     */
    @NameInMap("TargetBucket")
    public String targetBucket;

    public static CreateOssUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOssUploadRequest self = new CreateOssUploadRequest();
        return TeaModel.build(map, self);
    }

    public CreateOssUploadRequest setBizConfig(String bizConfig) {
        this.bizConfig = bizConfig;
        return this;
    }
    public String getBizConfig() {
        return this.bizConfig;
    }

    public CreateOssUploadRequest setCredentialType(String credentialType) {
        this.credentialType = credentialType;
        return this;
    }
    public String getCredentialType() {
        return this.credentialType;
    }

    public CreateOssUploadRequest setFileExt(String fileExt) {
        this.fileExt = fileExt;
        return this;
    }
    public String getFileExt() {
        return this.fileExt;
    }

    public CreateOssUploadRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public CreateOssUploadRequest setTargetBucket(String targetBucket) {
        this.targetBucket = targetBucket;
        return this;
    }
    public String getTargetBucket() {
        return this.targetBucket;
    }

}
