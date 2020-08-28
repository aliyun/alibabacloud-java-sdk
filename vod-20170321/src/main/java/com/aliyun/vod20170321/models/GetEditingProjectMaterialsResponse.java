// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetEditingProjectMaterialsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MaterialList")
    @Validation(required = true)
    public GetEditingProjectMaterialsResponseMaterialList materialList;

    public static GetEditingProjectMaterialsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEditingProjectMaterialsResponse self = new GetEditingProjectMaterialsResponse();
        return TeaModel.build(map, self);
    }

    public static class GetEditingProjectMaterialsResponseMaterialListMaterialSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        @Validation(required = true)
        public java.util.List<String> snapshot;

        public static GetEditingProjectMaterialsResponseMaterialListMaterialSnapshots build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectMaterialsResponseMaterialListMaterialSnapshots self = new GetEditingProjectMaterialsResponseMaterialListMaterialSnapshots();
            return TeaModel.build(map, self);
        }

    }

    public static class GetEditingProjectMaterialsResponseMaterialListMaterialSprites extends TeaModel {
        @NameInMap("Sprite")
        @Validation(required = true)
        public java.util.List<String> sprite;

        public static GetEditingProjectMaterialsResponseMaterialListMaterialSprites build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectMaterialsResponseMaterialListMaterialSprites self = new GetEditingProjectMaterialsResponseMaterialListMaterialSprites();
            return TeaModel.build(map, self);
        }

    }

    public static class GetEditingProjectMaterialsResponseMaterialListMaterial extends TeaModel {
        @NameInMap("MaterialId")
        @Validation(required = true)
        public String materialId;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("Tags")
        @Validation(required = true)
        public String tags;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Size")
        @Validation(required = true)
        public Long size;

        @NameInMap("Duration")
        @Validation(required = true)
        public Double duration;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public String modifiedTime;

        @NameInMap("CoverURL")
        @Validation(required = true)
        public String coverURL;

        @NameInMap("CateId")
        @Validation(required = true)
        public Integer cateId;

        @NameInMap("CateName")
        @Validation(required = true)
        public String cateName;

        @NameInMap("Source")
        @Validation(required = true)
        public String source;

        @NameInMap("SpriteConfig")
        @Validation(required = true)
        public String spriteConfig;

        @NameInMap("Snapshots")
        @Validation(required = true)
        public GetEditingProjectMaterialsResponseMaterialListMaterialSnapshots snapshots;

        @NameInMap("Sprites")
        @Validation(required = true)
        public GetEditingProjectMaterialsResponseMaterialListMaterialSprites sprites;

        public static GetEditingProjectMaterialsResponseMaterialListMaterial build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectMaterialsResponseMaterialListMaterial self = new GetEditingProjectMaterialsResponseMaterialListMaterial();
            return TeaModel.build(map, self);
        }

    }

    public static class GetEditingProjectMaterialsResponseMaterialList extends TeaModel {
        @NameInMap("Material")
        @Validation(required = true)
        public java.util.List<GetEditingProjectMaterialsResponseMaterialListMaterial> material;

        public static GetEditingProjectMaterialsResponseMaterialList build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectMaterialsResponseMaterialList self = new GetEditingProjectMaterialsResponseMaterialList();
            return TeaModel.build(map, self);
        }

    }

}
