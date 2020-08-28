// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetEditingProjectResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Project")
    @Validation(required = true)
    public GetEditingProjectResponseProject project;

    public static GetEditingProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEditingProjectResponse self = new GetEditingProjectResponse();
        return TeaModel.build(map, self);
    }

    public static class GetEditingProjectResponseProject extends TeaModel {
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

        @NameInMap("Timeline")
        @Validation(required = true)
        public String timeline;

        @NameInMap("CoverURL")
        @Validation(required = true)
        public String coverURL;

        @NameInMap("StorageLocation")
        @Validation(required = true)
        public String storageLocation;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        public static GetEditingProjectResponseProject build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectResponseProject self = new GetEditingProjectResponseProject();
            return TeaModel.build(map, self);
        }

    }

}
