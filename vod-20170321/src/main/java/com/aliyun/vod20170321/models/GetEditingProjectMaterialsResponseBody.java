// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetEditingProjectMaterialsResponseBody extends TeaModel {
    // The materials.
    @NameInMap("MaterialList")
    public GetEditingProjectMaterialsResponseBodyMaterialList materialList;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static GetEditingProjectMaterialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEditingProjectMaterialsResponseBody self = new GetEditingProjectMaterialsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEditingProjectMaterialsResponseBody setMaterialList(GetEditingProjectMaterialsResponseBodyMaterialList materialList) {
        this.materialList = materialList;
        return this;
    }
    public GetEditingProjectMaterialsResponseBodyMaterialList getMaterialList() {
        return this.materialList;
    }

    public GetEditingProjectMaterialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public static class GetEditingProjectMaterialsResponseBodyMaterialListMaterial extends TeaModel {
        // The category ID of the material.
        @NameInMap("CateId")
        public Integer cateId;

        // The category name of the material.
        @NameInMap("CateName")
        public String cateName;

        // The thumbnail URL of the material.
        @NameInMap("CoverURL")
        public String coverURL;

        // The time when the material was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // The description of the material.
        @NameInMap("Description")
        public String description;

        // The duration of the material. The value is rounded to four decimal places. Unit: seconds.
        @NameInMap("Duration")
        public Float duration;

        // The ID of the material.
        @NameInMap("MaterialId")
        public String materialId;

        // The type of the material. Valid values:
        // 
        // *   **video**
        // *   **audio**
        // *   **image**
        @NameInMap("MaterialType")
        public String materialType;

        // The time when the material was last updated. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        // The size of the mezzanine file. Unit: byte.
        @NameInMap("Size")
        public Long size;

        // The URLs of material snapshots. The value is an array.
        @NameInMap("Snapshots")
        public GetEditingProjectMaterialsResponseBodyMaterialListMaterialSnapshots snapshots;

        // The source of the sprite.
        @NameInMap("Source")
        public String source;

        // The configuration of the sprite.
        @NameInMap("SpriteConfig")
        public String spriteConfig;

        // The URLs of material sprites. The value is an array.
        @NameInMap("Sprites")
        public GetEditingProjectMaterialsResponseBodyMaterialListMaterialSprites sprites;

        // The status of the material. Valid values:
        // 
        // *   **Normal**: The material is in draft.
        // *   **Producing**: The material is being produced.
        // *   **Produced**: The material was produced.
        // *   **ProduceFailed**: The material failed to be produced.
        @NameInMap("Status")
        public String status;

        // The tag of the material. Multiple tags are separated by commas (,).
        @NameInMap("Tags")
        public String tags;

        // The title of the material.
        @NameInMap("Title")
        public String title;

        public static GetEditingProjectMaterialsResponseBodyMaterialListMaterial build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectMaterialsResponseBodyMaterialListMaterial self = new GetEditingProjectMaterialsResponseBodyMaterialListMaterial();
            return TeaModel.build(map, self);
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setCateId(Integer cateId) {
            this.cateId = cateId;
            return this;
        }
        public Integer getCateId() {
            return this.cateId;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setMaterialId(String materialId) {
            this.materialId = materialId;
            return this;
        }
        public String getMaterialId() {
            return this.materialId;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setMaterialType(String materialType) {
            this.materialType = materialType;
            return this;
        }
        public String getMaterialType() {
            return this.materialType;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setSnapshots(GetEditingProjectMaterialsResponseBodyMaterialListMaterialSnapshots snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public GetEditingProjectMaterialsResponseBodyMaterialListMaterialSnapshots getSnapshots() {
            return this.snapshots;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setSpriteConfig(String spriteConfig) {
            this.spriteConfig = spriteConfig;
            return this;
        }
        public String getSpriteConfig() {
            return this.spriteConfig;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setSprites(GetEditingProjectMaterialsResponseBodyMaterialListMaterialSprites sprites) {
            this.sprites = sprites;
            return this;
        }
        public GetEditingProjectMaterialsResponseBodyMaterialListMaterialSprites getSprites() {
            return this.sprites;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEditingProjectMaterialsResponseBodyMaterialListMaterial setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
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
