// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateMediaStorageClassRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow modifying the storage class of media assets whose storage duration does not meet the minimum requirement. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: allows the modification.</li>
     * <li><strong>false</strong> (default): does not allow the modification.</li>
     * </ul>
     * <blockquote>
     * <p>If the storage duration of a media asset does not meet the minimum requirement and you force the storage class modification, additional data retrieval fees are incurred.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllowUpdateWithoutTimeLimit")
    public Boolean allowUpdateWithoutTimeLimit;

    /**
     * <p>The media asset IDs, which are the audio or video IDs (VideoId). Separate multiple IDs with commas (,). You can specify up to 20 IDs. You can obtain the IDs by using one of the following methods:</p>
     * <ul>
     * <li>For audio or video files uploaded in the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Assets</strong> &gt; <strong>Audio/Video</strong> to view the audio or video IDs.</li>
     * <li>When you call the <a href="https://help.aliyun.com/document_detail/55407.html">Obtain the upload URL and credential for audio and video files</a> operation, the value of the VideoId response parameter is the media asset ID.</li>
     * <li>After an audio or video file is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">Search for media asset information</a> operation to query the media asset ID. The value of the VideoId response parameter is the media asset ID.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d56c2ac0cee271ed80004710b5ba****</p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    /**
     * <p>The restoration priority. This parameter is required only for Cold Archive media assets. If you do not specify this parameter, the default value <strong>Standard</strong> is used. Valid values:</p>
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
     * <p>The scope of the modification. If you do not specify this parameter, the default value <strong>All</strong> is used. Valid values:</p>
     * <ul>
     * <li><strong>All</strong> (default): applies tiered storage to all resources of the media asset, including the source file and transcoded streams.</li>
     * <li><strong>SourceFile</strong>: applies tiered storage only to the video source file of the media asset ID. Resources other than the source file are stored in Standard storage.</li>
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
     * <li><strong>IA</strong>: Infrequent Access (IA)</li>
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
