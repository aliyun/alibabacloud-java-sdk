// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SearchEditingProjectResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("ProjectList")
    @Validation(required = true)
    public SearchEditingProjectResponseProjectList projectList;

    public static SearchEditingProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchEditingProjectResponse self = new SearchEditingProjectResponse();
        return TeaModel.build(map, self);
    }

    public static class SearchEditingProjectResponseProjectListProject extends TeaModel {
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

        @NameInMap("CoverURL")
        @Validation(required = true)
        public String coverURL;

        @NameInMap("StorageLocation")
        @Validation(required = true)
        public String storageLocation;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Duration")
        @Validation(required = true)
        public Double duration;

        public static SearchEditingProjectResponseProjectListProject build(java.util.Map<String, ?> map) throws Exception {
            SearchEditingProjectResponseProjectListProject self = new SearchEditingProjectResponseProjectListProject();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchEditingProjectResponseProjectList extends TeaModel {
        @NameInMap("Project")
        @Validation(required = true)
        public java.util.List<SearchEditingProjectResponseProjectListProject> project;

        public static SearchEditingProjectResponseProjectList build(java.util.Map<String, ?> map) throws Exception {
            SearchEditingProjectResponseProjectList self = new SearchEditingProjectResponseProjectList();
            return TeaModel.build(map, self);
        }

    }

}
