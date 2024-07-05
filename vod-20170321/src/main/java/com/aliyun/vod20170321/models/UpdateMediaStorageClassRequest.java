// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateMediaStorageClassRequest extends TeaModel {
    /**
     * <p>Specifies whether to change the storage class of a media asset that is stored for less than the minimum storage duration. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <blockquote>
     * <p> If you forcibly change the storage class of a media asset that is stored for less than the minimum storage duration, additional data retrieval fees are incurred.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllowUpdateWithoutTimeLimit")
    public Boolean allowUpdateWithoutTimeLimit;

    /**
     * <p>The media asset ID. You can specify a maximum of 20 IDs. Separate multiple IDs with commas (,). You can use one of the following methods to obtain the ID:</p>
     * <ul>
     * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD</a> console. In the left-side navigation pane, choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong>. On the Video and Audio page, you can view the ID of the media asset. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</li>
     * <li>Obtain the value of the VideoId parameter from the response to the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation that you call to upload media assets.</li>
     * <li>Obtain the value of the VideoId parameter from the response to the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation that you call to query the media ID after the media asset is uploaded.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d56c2ac0cee271ed80004710b5ba****</p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    /**
     * <p>The restoration priority. This parameter is required only when you restore a Cold Archive media asset. Valid values:</p>
     * <ul>
     * <li><strong>Expedited</strong></li>
     * <li><strong>Standard</strong></li>
     * <li><strong>Bulk</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("RestoreTier")
    public String restoreTier;

    /**
     * <p>The modification range. Valid values:</p>
     * <ul>
     * <li><strong>All</strong>: modifies the storage classes of all resources including the source files and transcoded streams.</li>
     * <li><strong>SourceFile</strong>: modifies the storage classes of only the source files. The storage class of other resources is Standard.</li>
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
     * <li><strong>Standard</strong></li>
     * <li><strong>IA</strong></li>
     * <li><strong>Archive</strong></li>
     * <li><strong>ColdArchive</strong></li>
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
