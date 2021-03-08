// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetEditingProjectMaterialsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaterialList")
    public GetEditingProjectMaterialsResponseBodyMaterialList materialList;

    public static GetEditingProjectMaterialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEditingProjectMaterialsResponseBody self = new GetEditingProjectMaterialsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEditingProjectMaterialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEditingProjectMaterialsResponseBody setMaterialList(GetEditingProjectMaterialsResponseBodyMaterialList materialList) {
        this.materialList = materialList;
        return this;
    }
    public GetEditingProjectMaterialsResponseBodyMaterialList getMaterialList() {
        return this.materialList;
    }

    public static class GetEditingProjectMaterialsResponseBodyMaterialListMaterialSprites extends TeaModel {
        @NameInMap("Sprite")
        public java.util.List<String> sprite;

        public static GetEditingProjectMaterialsResponseBodyMaterialListMaterialSprites build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectMaterialsResponseBodyMaterialListMaterialSprites self = new GetEditingProjectMaterialsResponseBodyMaterialListMaterialSprites();
            return TeaModel.build(map, self);
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterialSprites setSprite(java.util.List<String> sprite) {
            this.sprite = sprite;
            return this;
        }
        public java.util.List<String> getSprite() {
            return this.sprite;
        }

    }

    public static class GetEditingProjectMaterialsResponseBodyMaterialListMaterialSnapshots extends TeaModel {
        @NameInMap("Snapshot")
        public java.util.List<String> snapshot;

        public static GetEditingProjectMaterialsResponseBodyMaterialListMaterialSnapshots build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectMaterialsResponseBodyMaterialListMaterialSnapshots self = new GetEditingProjectMaterialsResponseBodyMaterialListMaterialSnapshots();
            return TeaModel.build(map, self);
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterialSnapshots setSnapshot(java.util.List<String> snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public java.util.List<String> getSnapshot() {
            return this.snapshot;
        }

    }

    public static class GetEditingProjectMaterialsResponseBodyMaterialListMaterial extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Sprites")
        public GetEditingProjectMaterialsResponseBodyMaterialListMaterialSprites sprites;

        @NameInMap("CateId")
        public Integer cateId;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("MaterialType")
        public String materialType;

        @NameInMap("SpriteConfig")
        public String spriteConfig;

        @NameInMap("Source")
        public String source;

        @NameInMap("Snapshots")
        public GetEditingProjectMaterialsResponseBodyMaterialListMaterialSnapshots snapshots;

        @NameInMap("CateName")
        public String cateName;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("MaterialId")
        public String materialId;

        @NameInMap("Size")
        public Long size;

        @NameInMap("CoverURL")
        public String coverURL;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("Title")
        public String title;

        public static GetEditingProjectMaterialsResponseBodyMaterialListMaterial build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectMaterialsResponseBodyMaterialListMaterial self = new GetEditingProjectMaterialsResponseBodyMaterialListMaterial();
            return TeaModel.build(map, self);
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setSprites(GetEditingProjectMaterialsResponseBodyMaterialListMaterialSprites sprites) {
            this.sprites = sprites;
            return this;
        }
        public GetEditingProjectMaterialsResponseBodyMaterialListMaterialSprites getSprites() {
            return this.sprites;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setCateId(Integer cateId) {
            this.cateId = cateId;
            return this;
        }
        public Integer getCateId() {
            return this.cateId;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setMaterialType(String materialType) {
            this.materialType = materialType;
            return this;
        }
        public String getMaterialType() {
            return this.materialType;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setSpriteConfig(String spriteConfig) {
            this.spriteConfig = spriteConfig;
            return this;
        }
        public String getSpriteConfig() {
            return this.spriteConfig;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setSnapshots(GetEditingProjectMaterialsResponseBodyMaterialListMaterialSnapshots snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public GetEditingProjectMaterialsResponseBodyMaterialListMaterialSnapshots getSnapshots() {
            return this.snapshots;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setMaterialId(String materialId) {
            this.materialId = materialId;
            return this;
        }
        public String getMaterialId() {
            return this.materialId;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetEditingProjectMaterialsResponseBodyMaterialList extends TeaModel {
        @NameInMap("Material")
        public java.util.List<GetEditingProjectMaterialsResponseBodyMaterialListMaterial> material;

        public static GetEditingProjectMaterialsResponseBodyMaterialList build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectMaterialsResponseBodyMaterialList self = new GetEditingProjectMaterialsResponseBodyMaterialList();
            return TeaModel.build(map, self);
        }

        public GetEditingProjectMaterialsResponseBodyMaterialList setMaterial(java.util.List<GetEditingProjectMaterialsResponseBodyMaterialListMaterial> material) {
            this.material = material;
            return this;
        }
        public java.util.List<GetEditingProjectMaterialsResponseBodyMaterialListMaterial> getMaterial() {
            return this.material;
        }

    }

}
