// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RestoreMediaRequest extends TeaModel {
    /**
     * <p>The ID of the media asset. You can specify a maximum of 20 IDs. Separate multiple IDs with commas (,). You can use one of the following methods to obtain the ID of the media asset.</p>
     * <br>
     * <p>*   Log on to the ApsaraVideo VOD console. In the left-side navigation pane, choose Media Files > Audio/Video. On the Video and Audio page, view the ID of the media asset. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</p>
     * <p>*   Obtain the value of VideoId from the response to the CreateUploadVideo operation that you call to upload media assets.</p>
     * <p>*   Obtain the value of VideoId from the response to the SearchMedia operation that you call to query the media ID after the media asset is uploaded.</p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    /**
     * <p>The number of days during which media assets remain in the restored state. Default value: 1. The maximum validity period of a restored Archive media asset is 7 days and the maximum validity period of a restored Cold Archive media asset is 365 days.</p>
     */
    @NameInMap("RestoreDays")
    public String restoreDays;

    /**
     * <p>The restoration priority. This parameter is required only when you restore a Cold Archive media file. Valid values:</p>
     * <br>
     * <p>*   **Expedited**: The file is restored within 1 hour.</p>
     * <p>*   **Standard**: The file is restored within 2 to 5 hours.</p>
     * <p>*   **Bulk**: The file is restored within 5 to 12 hours.</p>
     */
    @NameInMap("RestoreTier")
    public String restoreTier;

    /**
     * <p>The modification range. Valid values:</p>
     * <br>
     * <p>*   **All**: restores all resources, including the source files and transcoded streams.</p>
     * <p>*   **SourceFile**: restores only the source files.</p>
     */
    @NameInMap("Scope")
    public String scope;

    public static RestoreMediaRequest build(java.util.Map<String, ?> map) throws Exception {
        RestoreMediaRequest self = new RestoreMediaRequest();
        return TeaModel.build(map, self);
    }

    public RestoreMediaRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

    public RestoreMediaRequest setRestoreDays(String restoreDays) {
        this.restoreDays = restoreDays;
        return this;
    }
    public String getRestoreDays() {
        return this.restoreDays;
    }

    public RestoreMediaRequest setRestoreTier(String restoreTier) {
        this.restoreTier = restoreTier;
        return this;
    }
    public String getRestoreTier() {
        return this.restoreTier;
    }

    public RestoreMediaRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
