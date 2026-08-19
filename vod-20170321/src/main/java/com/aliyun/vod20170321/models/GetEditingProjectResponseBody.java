// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetEditingProjectResponseBody extends TeaModel {
    /**
     * <p>The online editing project.</p>
     */
    @NameInMap("Project")
    public GetEditingProjectResponseBodyProject project;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>63E8B7C7-4812-46*****AD-0FA56029AC86</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetEditingProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEditingProjectResponseBody self = new GetEditingProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEditingProjectResponseBody setProject(GetEditingProjectResponseBodyProject project) {
        this.project = project;
        return this;
    }
    public GetEditingProjectResponseBodyProject getProject() {
        return this.project;
    }

    public GetEditingProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetEditingProjectResponseBodyProject extends TeaModel {
        /**
         * <p>The thumbnail URL of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>https://<strong><strong>.com/6AB4D0E1E1C74468883516C2349</strong></strong>.png</p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The time when the online editing project was created. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2017-10-23T13:33:40Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>testdescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the online editing project was last modified. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2017-10-23T14:27:26Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The online editing project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fb2101bf24b27*****54cb318787dc</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the online editing project. Multiple statuses are separated by commas (,). By default, all online editing projects are returned. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: draft.</li>
         * <li><strong>Producing</strong>: being produced.</li>
         * <li><strong>Produced</strong>: produced.</li>
         * <li><strong>ProduceFailed</strong>: failed to be produced.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The storage address.</p>
         * <blockquote>
         * <p>You can log on to the <a href="https://vod.console.aliyun.com/?spm=a2c4g.11186623.2.15.6948257eaZ4m54#/vod/settings/censored">ApsaraVideo VOD console</a> and choose <strong>Configuration Management</strong> &gt; <strong>Media Asset Management Configuration</strong> &gt; <strong>Storage Management</strong> to view the storage address.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>location_s</p>
         */
        @NameInMap("StorageLocation")
        public String storageLocation;

        /**
         * <p>The timeline of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;TimelineIn\&quot;:0,\&quot;TimelineOut\&quot;:9.42}</p>
         */
        @NameInMap("Timeline")
        public String timeline;

        /**
         * <p>The title of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>Video_1508736815000</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetEditingProjectResponseBodyProject build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectResponseBodyProject self = new GetEditingProjectResponseBodyProject();
            return TeaModel.build(map, self);
        }

        public GetEditingProjectResponseBodyProject setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public GetEditingProjectResponseBodyProject setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetEditingProjectResponseBodyProject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetEditingProjectResponseBodyProject setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetEditingProjectResponseBodyProject setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetEditingProjectResponseBodyProject setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetEditingProjectResponseBodyProject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEditingProjectResponseBodyProject setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public GetEditingProjectResponseBodyProject setTimeline(String timeline) {
            this.timeline = timeline;
            return this;
        }
        public String getTimeline() {
            return this.timeline;
        }

        public GetEditingProjectResponseBodyProject setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
