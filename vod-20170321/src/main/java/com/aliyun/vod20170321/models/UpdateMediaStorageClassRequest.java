// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateMediaStorageClassRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow storage class modification for media assets that have not met the minimum storage duration requirement. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Allowed.</li>
     * <li><strong>false (default)</strong>: Not allowed.</li>
     * </ul>
     * <blockquote>
     * <p>If the storage duration of a media asset is insufficient and you force a storage class modification, additional retrieval fees are incurred.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllowUpdateWithoutTimeLimit")
    public Boolean allowUpdateWithoutTimeLimit;

    /**
     * <p>The media IDs, which are audio or video IDs (VideoId). Separate multiple IDs with commas (,). A maximum of 20 IDs are supported. You can obtain the IDs by using the following methods:</p>
     * <ul>
     * <li>For audio or video files uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the audio or video ID.</li>
     * <li>When you call the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation to obtain the upload URL and credential, the video ID is the value of the VideoId response parameter.</li>
     * <li>After the audio or video file is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation to query the video ID, which is the value of the VideoId response parameter.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d56c2ac0cee271ed80004710b5ba****</p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    /**
     * <p>The restore priority (required only for ColdArchive media assets). If this parameter is not specified, the default value <strong>Standard</strong> is used. Valid values:</p>
     * <ul>
     * <li><strong>Expedited</strong>: Expedited</li>
     * <li><strong>Standard</strong> (default): Standard</li>
     * <li><strong>Bulk</strong>: Bulk</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("RestoreTier")
    public String restoreTier;

    /**
     * <p>The scope of the modification. If this parameter is not specified, the default value <strong>All</strong> is used. Valid values:</p>
     * <ul>
     * <li><strong>All</strong> (default): Applies tiered storage to all resources (source files and transcoded streams) of the media asset.</li>
     * <li><strong>SourceFile</strong>: Applies tiered storage only to the source file of the media asset. Resources other than the source file use Standard storage.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The storage class. Valid values:</p>
     * <ul>
     * <li><strong>Standard</strong>: Standard</li>
     * <li><strong>IA</strong>: Infrequent Access</li>
     * <li><strong>Archive</strong>: Archive</li>
     * <li><strong>ColdArchive</strong>: Cold Archive</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Archive</p>
     */
    @NameInMap("StorageClass")
    public String storageClass;

    public static UpdateMediaStorageClassRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaStorageClassRequest self = new UpdateMediaStorageClassRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMediaStorageClassRequest setAllowUpdateWithoutTimeLimit(Boolean allowUpdateWithoutTimeLimit) {
        this.allowUpdateWithoutTimeLimit = allowUpdateWithoutTimeLimit;
        return this;
    }
    public Boolean getAllowUpdateWithoutTimeLimit() {
        return this.allowUpdateWithoutTimeLimit;
    }

    public UpdateMediaStorageClassRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

    public UpdateMediaStorageClassRequest setRestoreTier(String restoreTier) {
        this.restoreTier = restoreTier;
        return this;
    }
    public String getRestoreTier() {
        return this.restoreTier;
    }

    public UpdateMediaStorageClassRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public UpdateMediaStorageClassRequest setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

}
