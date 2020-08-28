// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAttachedMediaInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AttachedMediaList")
    @Validation(required = true)
    public java.util.List<GetAttachedMediaInfoResponseAttachedMediaList> attachedMediaList;

    @NameInMap("NonExistMediaIds")
    @Validation(required = true)
    public java.util.List<String> nonExistMediaIds;

    public static GetAttachedMediaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAttachedMediaInfoResponse self = new GetAttachedMediaInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class GetAttachedMediaInfoResponseAttachedMediaListCategories extends TeaModel {
        @NameInMap("CateId")
        @Validation(required = true)
        public Long cateId;

        @NameInMap("CateName")
        @Validation(required = true)
        public String cateName;

        @NameInMap("Level")
        @Validation(required = true)
        public Long level;

        @NameInMap("ParentId")
        @Validation(required = true)
        public Long parentId;

        public static GetAttachedMediaInfoResponseAttachedMediaListCategories build(java.util.Map<String, ?> map) throws Exception {
            GetAttachedMediaInfoResponseAttachedMediaListCategories self = new GetAttachedMediaInfoResponseAttachedMediaListCategories();
            return TeaModel.build(map, self);
        }

    }

    public static class GetAttachedMediaInfoResponseAttachedMediaList extends TeaModel {
        @NameInMap("MediaId")
        @Validation(required = true)
        public String mediaId;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Tags")
        @Validation(required = true)
        public String tags;

        @NameInMap("URL")
        @Validation(required = true)
        public String URL;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("FileSize")
        @Validation(required = true)
        public Long fileSize;

        @NameInMap("StorageLocation")
        @Validation(required = true)
        public String storageLocation;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ModificationTime")
        @Validation(required = true)
        public String modificationTime;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("OnlineStatus")
        @Validation(required = true)
        public String onlineStatus;

        @NameInMap("Icon")
        @Validation(required = true)
        public String icon;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Categories")
        @Validation(required = true)
        public java.util.List<GetAttachedMediaInfoResponseAttachedMediaListCategories> categories;

        public static GetAttachedMediaInfoResponseAttachedMediaList build(java.util.Map<String, ?> map) throws Exception {
            GetAttachedMediaInfoResponseAttachedMediaList self = new GetAttachedMediaInfoResponseAttachedMediaList();
            return TeaModel.build(map, self);
        }

    }

}
