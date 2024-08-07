// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SearchEditingProjectResponseBody extends TeaModel {
    /**
     * <p>The list of online editing projects.</p>
     */
    @NameInMap("ProjectList")
    public SearchEditingProjectResponseBodyProjectList projectList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9262E3DA-07FA-48*****62-FCBB6BC61D08</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of online editing projects returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static SearchEditingProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchEditingProjectResponseBody self = new SearchEditingProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchEditingProjectResponseBody setProjectList(SearchEditingProjectResponseBodyProjectList projectList) {
        this.projectList = projectList;
        return this;
    }
    public SearchEditingProjectResponseBodyProjectList getProjectList() {
        return this.projectList;
    }

    public SearchEditingProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchEditingProjectResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class SearchEditingProjectResponseBodyProjectListProject extends TeaModel {
        /**
         * <p>The thumbnail URL of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>cover_url</p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The time when the online editing project was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T12:00:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>test project 001</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The duration of the online editing project, which must be consistent with the duration of the timeline.</p>
         * <blockquote>
         * <p>The Timeline parameter is not included in response parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>22.65</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <p>The last time when the online editing project was modified. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T13:00:00Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The ID of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>25cfc178d2de4*****e77aebed6afcd</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The region where the online editing project was created.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the online editing project. Separate multiple states with commas (,). By default, all online editing projects were queried. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: indicates that the online editing project is in draft.</li>
         * <li><strong>Producing</strong>: indicates that the video is being produced.</li>
         * <li><strong>Produced</strong>: indicates that the video was produced.</li>
         * <li><strong>ProduceFailed</strong>: indicates that the video failed to be produced.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The path of the Object Storage Service (OSS) bucket where the produced video is stored.</p>
         * <blockquote>
         * <p>To view the path of the OSS bucket, log on to the <a href="https://vod.console.aliyun.com/?spm=a2c4g.11186623.2.15.6948257eaZ4m54#/vod/settings/censored">ApsaraVideo VOD console</a>, and choose <strong>Configuration Management</strong> &gt; <strong>Media Management</strong> &gt; <strong>Storage</strong>. On the Storage page, you can view the path of the OSS bucket.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>location_s</p>
         */
        @NameInMap("StorageLocation")
        public String storageLocation;

        /**
         * <p>The title of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>video_150873681****</p>
         */
        @NameInMap("Title")
        public String title;

        public static SearchEditingProjectResponseBodyProjectListProject build(java.util.Map<String, ?> map) throws Exception {
            SearchEditingProjectResponseBodyProjectListProject self = new SearchEditingProjectResponseBodyProjectListProject();
            return TeaModel.build(map, self);
        }

        public SearchEditingProjectResponseBodyProjectListProject setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public SearchEditingProjectResponseBodyProjectListProject setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SearchEditingProjectResponseBodyProjectListProject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchEditingProjectResponseBodyProjectListProject setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public SearchEditingProjectResponseBodyProjectListProject setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public SearchEditingProjectResponseBodyProjectListProject setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public SearchEditingProjectResponseBodyProjectListProject setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public SearchEditingProjectResponseBodyProjectListProject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SearchEditingProjectResponseBodyProjectListProject setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public SearchEditingProjectResponseBodyProjectListProject setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class SearchEditingProjectResponseBodyProjectList extends TeaModel {
        @NameInMap("Project")
        public java.util.List<SearchEditingProjectResponseBodyProjectListProject> project;

        public static SearchEditingProjectResponseBodyProjectList build(java.util.Map<String, ?> map) throws Exception {
            SearchEditingProjectResponseBodyProjectList self = new SearchEditingProjectResponseBodyProjectList();
            return TeaModel.build(map, self);
        }

        public SearchEditingProjectResponseBodyProjectList setProject(java.util.List<SearchEditingProjectResponseBodyProjectListProject> project) {
            this.project = project;
            return this;
        }
        public java.util.List<SearchEditingProjectResponseBodyProjectListProject> getProject() {
            return this.project;
        }

    }

}
