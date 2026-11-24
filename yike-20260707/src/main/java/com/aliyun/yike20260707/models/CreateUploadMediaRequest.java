// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class CreateUploadMediaRequest extends TeaModel {
    /**
     * <p>The type of the upload credential. Valid values:</p>
     * <ul>
     * <li><code>STS_TOKEN</code>: the default value, used for direct upload by using the OSS SDK.</li>
     * <li><code>POST_POLICY</code>: used for form-based upload.</li>
     * <li><code>PRESIGNED_URL</code>: used for pre-signed PUT upload.</li>
     * <li><code>UPLOAD_TICKET</code>: the ticket mode, where a real credential is issued only when the ticket is exchanged.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>STS_TOKEN</p>
     */
    @NameInMap("CredentialType")
    public String credentialType;

    /**
     * <p>The entity ID. The default value is AiSaasMediaAsset. You can ignore this parameter for general calls.</p>
     * 
     * <strong>example:</strong>
     * <p>AiSaasMediaAsset</p>
     */
    @NameInMap("EntityId")
    public String entityId;

    /**
     * <p>The file information in JSON string format. This parameter is required when you create a media asset. The <strong>Type</strong> field is required and can be set to video, audio, or image. The <strong>Name</strong> (file name), <strong>Ext</strong> (file name extension without the dot), and <strong>Size</strong> (size in bytes) fields are optional. This parameter can be omitted when you overwrite an existing media asset (Overwrite=true). If omitted, the original media asset type and source file name extension are used.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Type&quot;:&quot;video&quot;,&quot;Name&quot;:&quot;demo.mp4&quot;,&quot;Ext&quot;:&quot;mp4&quot;,&quot;Size&quot;:10485760}</p>
     */
    @NameInMap("FileInfo")
    public String fileInfo;

    /**
     * <p>The ID of the existing media asset. This parameter is required when Overwrite is set to true to overwrite the media asset. If CredentialType is set to UPLOAD_TICKET, this parameter indicates a ticket exchange. Do not specify this parameter in other credential modes.</p>
     * 
     * <strong>example:</strong>
     * <p>b7e94fc0e*****6e7c5486601</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The media asset metadata in JSON string format. This parameter is required when you create a media asset. It can contain the following fields: <strong>Title</strong> (title, defaults to FileInfo.Name if not specified), <strong>Description</strong>, <strong>CateId</strong> (category ID), <strong>Tags</strong> (comma-separated), <strong>BusinessType</strong> (falls back to general for invalid values), <strong>CoverURL</strong>, <strong>DynamicMetaData</strong> (JSON string, such as ProductionId), <strong>ReferenceId</strong> (external reference ID), and <strong>RegisterConfig</strong> (object containing SearchLibName to specify the search library). This parameter can be omitted when you overwrite an existing media asset.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Title&quot;:&quot;demo&quot;,&quot;Description&quot;:&quot;test&quot;,&quot;Tags&quot;:&quot;test,demo&quot;,&quot;BusinessType&quot;:&quot;general&quot;,&quot;DynamicMetaData&quot;:&quot;{\&quot;ProductionId\&quot;:\&quot;pd_123456\&quot;}&quot;}</p>
     */
    @NameInMap("MediaMetaData")
    public String mediaMetaData;

    /**
     * <p>Specifies whether to overwrite the existing media asset. Default value: false. If this parameter is set to true, you must specify MediaId. The original media asset is reset (old files, snapshots, and analysis artifacts are cleared, and the status is set to uploading), and a new credential is issued as if it were the first upload.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Overwrite")
    public Boolean overwrite;

    /**
     * <p>The project ID. This parameter is written to dynamicMetaData.ProductionId with the highest priority, overwriting the value with the same name in DynamicMetaData, and is automatically paired with the default folder <code>fd__default</code>. This parameter is supported only by the default entity. If you specify this parameter for a non-default entity, an <code>InvalidParameter</code> error is returned. If you do not specify this parameter, the <code>ProductionId</code> is obtained from the existing fallback chain.</p>
     * 
     * <strong>example:</strong>
     * <p>pd_123456</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The specified storage location in the <code>bucket.endpoint</code> format. If you do not specify this parameter, a bucket is selected based on the default bucket selection policy.</p>
     * 
     * <strong>example:</strong>
     * <p>yike-shared-ap-southeast-1-1.oss-ap-southeast-1.aliyuncs.com</p>
     */
    @NameInMap("StorageLocation")
    public String storageLocation;

    /**
     * <p>The custom user data in JSON string format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;bizId&quot;:&quot;order-123&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateUploadMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadMediaRequest self = new CreateUploadMediaRequest();
        return TeaModel.build(map, self);
    }

    public CreateUploadMediaRequest setCredentialType(String credentialType) {
        this.credentialType = credentialType;
        return this;
    }
    public String getCredentialType() {
        return this.credentialType;
    }

    public CreateUploadMediaRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public CreateUploadMediaRequest setFileInfo(String fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }
    public String getFileInfo() {
        return this.fileInfo;
    }

    public CreateUploadMediaRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public CreateUploadMediaRequest setMediaMetaData(String mediaMetaData) {
        this.mediaMetaData = mediaMetaData;
        return this;
    }
    public String getMediaMetaData() {
        return this.mediaMetaData;
    }

    public CreateUploadMediaRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public CreateUploadMediaRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateUploadMediaRequest setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }
    public String getStorageLocation() {
        return this.storageLocation;
    }

    public CreateUploadMediaRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
