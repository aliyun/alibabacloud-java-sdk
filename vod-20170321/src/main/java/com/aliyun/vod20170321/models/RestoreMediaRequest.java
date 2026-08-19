// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RestoreMediaRequest extends TeaModel {
    /**
     * <p>The media IDs, which are audio or video IDs (VideoId). Separate multiple IDs with commas (,). A maximum of 20 IDs are supported. You can obtain the IDs by using the following methods:</p>
     * <ul>
     * <li>For audio or video files uploaded in the console, log on to the ApsaraVideo VOD console and choose Media Files &gt; Audio/Video to view the audio or video ID.</li>
     * <li>When you call the CreateUploadVideo operation to obtain the upload URL and credential, the video ID is the value of the VideoId parameter in the response.</li>
     * <li>After the audio or video file is uploaded, you can call the SearchMedia operation to query the video ID, which is the value of the VideoId parameter in the response.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8bc8e94fe4e55abde85718****,eb186180e989dd56****</p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    /**
     * <p>The restoration duration. Default value: 1 day. Maximum value for Archive media assets: 7 days. Maximum value for Cold Archive media assets: 365 days.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RestoreDays")
    public String restoreDays;

    /**
     * <p>The restoration priority. This parameter is required only for Cold Archive media assets. If this parameter is not specified, the default value <strong>Standard</strong> is used. Valid values:</p>
     * <ul>
     * <li><strong>Expedited</strong>: High priority. The restoration is completed within 1 hour.</li>
     * <li><strong>Standard</strong> (default): Standard priority. The restoration is completed within 2 to 5 hours.</li>
     * <li><strong>Bulk</strong>: Batch priority. The restoration is completed within 5 to 12 hours.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("RestoreTier")
    public String restoreTier;

    /**
     * <p>The scope of the change. If this parameter is not specified, the default value <strong>All</strong> is used. Valid values:</p>
     * <ul>
     * <li><strong>All</strong> (default): Applies tiered storage to all resources (source files and transcoded streams) of the media asset.</li>
     * <li><strong>SourceFile</strong>: Applies tiered storage only to the video source file of the media asset ID. Resources other than the source file use Standard storage.</li>
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
