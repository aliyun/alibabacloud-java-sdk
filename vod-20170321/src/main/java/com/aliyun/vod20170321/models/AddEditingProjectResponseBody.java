// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddEditingProjectResponseBody extends TeaModel {
    /**
     * <p>The time when the online editing project was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
     */
    @NameInMap("Project")
    public AddEditingProjectResponseBodyProject project;

    /**
     * <p>The thumbnail URL of the online editing project. If you do not specify this parameter and the video track in the timeline has mezzanine files, the thumbnail of the first mezzanine file in the timeline is used.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddEditingProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddEditingProjectResponseBody self = new AddEditingProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public AddEditingProjectResponseBody setProject(AddEditingProjectResponseBodyProject project) {
        this.project = project;
        return this;
    }
    public AddEditingProjectResponseBodyProject getProject() {
        return this.project;
    }

    public AddEditingProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddEditingProjectResponseBodyProject extends TeaModel {
        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>朴灵</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>58928</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>Creates an online editing project.</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        public static AddEditingProjectResponseBodyProject build(java.util.Map<String, ?> map) throws Exception {
            AddEditingProjectResponseBodyProject self = new AddEditingProjectResponseBodyProject();
            return TeaModel.build(map, self);
        }

        public AddEditingProjectResponseBodyProject setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public AddEditingProjectResponseBodyProject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddEditingProjectResponseBodyProject setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public AddEditingProjectResponseBodyProject setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public AddEditingProjectResponseBodyProject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public AddEditingProjectResponseBodyProject setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
