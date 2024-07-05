// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddEditingProjectResponseBody extends TeaModel {
    /**
     * <p>The information about the online editing project. For more information about the structure, see <a href="https://help.aliyun.com/document_detail/52839.html">EditingProject</a>.</p>
     */
    @NameInMap("Project")
    public AddEditingProjectResponseBodyProject project;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E4EBD2BF-5EB0-4476-8829-9D94E1B1****</p>
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
         * <p>testtimeline001desciption</p>
         */
        @NameInMap("Description")
        public String description;

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
         * <p>fb2101bf24bf4df34c4cb3187****</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The status of the online editing project. Valid values:</p>
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
         * <p>The title of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>testtimeline</p>
         */
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
