// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateMediaStorageClassRequest extends TeaModel {
    /**
     * <p>The media asset ID. You can specify a maximum of 20 IDs. Separate multiple IDs with commas (,). You can use one of the following methods to obtain the ID:</p>
     * <br>
     * <p>*   Log on to the [ApsaraVideo VOD](https://vod.console.aliyun.com) console. In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the Video and Audio page, you can view the ID of the media asset. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</p>
     * <p>*   Obtain the value of the VideoId parameter from the response to the [CreateUploadVideo](~~55407~~) operation that you call to upload media assets.</p>
     * <p>*   Obtain the value of the VideoId parameter from the response to the [SearchMedia](~~86044~~) operation that you call to query the media ID after the media asset is uploaded.</p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    /**
     * <p>The restoration priority. This parameter is required only when you restore a Cold Archive media asset. Valid values:</p>
     * <br>
     * <p>*   **Expedited**</p>
     * <p>*   **Standard**</p>
     * <p>*   **Bulk**</p>
     */
    @NameInMap("RestoreTier")
    public String restoreTier;

    /**
     * <p>The modification range. Valid values:</p>
     * <br>
     * <p>*   **All**: modifies the storage classes of all resources including the source files and transcoded streams.</p>
     * <p>*   **SourceFile**: modifies the storage classes of only the source files. The storage class of other resources is Standard.</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The storage class to which you want to modify. Valid values:</p>
     * <br>
     * <p>*   **Standard**</p>
     * <p>*   **IA**</p>
     * <p>*   **Archive**</p>
     * <p>*   **ColdArchive**</p>
     */
    @NameInMap("StorageClass")
    public String storageClass;

    public static UpdateMediaStorageClassRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaStorageClassRequest self = new UpdateMediaStorageClassRequest();
        return TeaModel.build(map, self);
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
