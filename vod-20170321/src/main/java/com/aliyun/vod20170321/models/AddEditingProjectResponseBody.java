// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddEditingProjectResponseBody extends TeaModel {
    // The information about the online editing project. For more information about the structure, see [EditingProject](~~52839~~).
    @NameInMap("Project")
    public AddEditingProjectResponseBodyProject project;

    // The ID of the request.
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
        // The time when the online editing project was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // The description of the online editing project.
        @NameInMap("Description")
        public String description;

        // The last time when the online editing project was modified. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        // The ID of the online editing project.
        @NameInMap("ProjectId")
        public String projectId;

        // The status of the online editing project. Valid values:
        // 
        // - **Normal**: indicates that the online editing project is in draft.
        // - **Producing**: indicates that the video is being produced.
        // - **Produced**: indicates that the video was produced.
        // - **ProduceFailed**: indicates that the video failed to be produced.
        @NameInMap("Status")
        public String status;

        // The title of the online editing project.
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
