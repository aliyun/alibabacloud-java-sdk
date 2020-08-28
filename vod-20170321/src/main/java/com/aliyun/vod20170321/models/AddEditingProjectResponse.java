// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddEditingProjectResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Project")
    @Validation(required = true)
    public AddEditingProjectResponseProject project;

    public static AddEditingProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        AddEditingProjectResponse self = new AddEditingProjectResponse();
        return TeaModel.build(map, self);
    }

    public static class AddEditingProjectResponseProject extends TeaModel {
        @NameInMap("ProjectId")
        @Validation(required = true)
        public String projectId;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public String modifiedTime;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        public static AddEditingProjectResponseProject build(java.util.Map<String, ?> map) throws Exception {
            AddEditingProjectResponseProject self = new AddEditingProjectResponseProject();
            return TeaModel.build(map, self);
        }

    }

}
