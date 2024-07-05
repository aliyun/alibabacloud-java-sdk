// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RestoreMediaRequest extends TeaModel {
    /**
     * <p>The ID of the media asset (VideoId). Separate multiple IDs with commas (,). You can specify a maximum of 20 IDs. You can use one of the following methods to obtain the ID of the media asset:</p>
     * <ul>
     * <li>Log on to the ApsaraVideo VOD console. In the left-side navigation pane, choose Media Files &gt; Audio/Video. On the Video and Audio page, view the ID of the media asset. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</li>
     * <li>Obtain the value of VideoId from the response to the CreateUploadVideo operation that you call to upload media assets.</li>
     * <li>Obtain the value of VideoId from the response to the SearchMedia operation that you call to query the media ID after the media asset is uploaded.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8bc8e94fe4e55abde85718****,eb186180e989dd56****</p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    /**
     * <p>The number of days during which media assets remain in the restored state. Default value: 1. The maximum validity period of a restored Archive media asset is 7 days and the maximum validity period of a restored Cold Archive media asset is 365 days.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RestoreDays")
    public String restoreDays;

    /**
     * <p>The restoration priority. This parameter is required only when you restore a Cold Archive media file. Valid values:</p>
     * <ul>
     * <li><strong>Expedited</strong>: The file is restored within 1 hour.</li>
     * <li><strong>Standard</strong>: The file is restored within 2 to 5 hours.</li>
     * <li><strong>Bulk</strong>: The file is restored within 5 to 12 hours.</li>
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
     * <li><strong>All</strong>: restores all resources, including the source files and transcoded streams.</li>
     * <li><strong>SourceFile</strong>: restores only the source files.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>All</p>
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
