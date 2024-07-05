// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetEditingProjectMaterialsResponseBody extends TeaModel {
    /**
     * <p>The materials.</p>
     */
    @NameInMap("MaterialList")
    public GetEditingProjectMaterialsResponseBodyMaterialList materialList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>746FFA07-8BBB-46B1-3E94E3B2915E****</p>
     */
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
        /**
         * <p>The category ID of the material.</p>
         * 
         * <strong>example:</strong>
         * <p>100005****</p>
         */
        @NameInMap("CateId")
        public Integer cateId;

        /**
         * <p>The category name of the material.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("CateName")
        public String cateName;

        /**
         * <p>The thumbnail URL of the material.</p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The time when the material was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-10-19 10:48:17</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the material.</p>
         * 
         * <strong>example:</strong>
         * <p>test2</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The duration of the material. The value is rounded to four decimal places. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>15.16</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <p>The ID of the material.</p>
         * 
         * <strong>example:</strong>
         * <p>85befc4118b84c6723e53b80b1****</p>
         */
        @NameInMap("MaterialId")
        public String materialId;

        /**
         * <p>The type of the material. Valid values:</p>
         * <ul>
         * <li><strong>video</strong></li>
         * <li><strong>audio</strong></li>
         * <li><strong>image</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("MaterialType")
        public String materialType;

        /**
         * <p>The time when the material was last updated. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-10-19 10:48:17</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The size of the mezzanine file. Unit: byte.</p>
         * 
         * <strong>example:</strong>
         * <p>1682694</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The URLs of material snapshots. The value is an array.</p>
         */
        @NameInMap("Snapshots")
        public GetEditingProjectMaterialsResponseBodyMaterialListMaterialSnapshots snapshots;

        /**
         * <p>The source of the sprite.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The configuration of the sprite.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("SpriteConfig")
        public String spriteConfig;

        /**
         * <p>The URLs of material sprites. The value is an array.</p>
         */
        @NameInMap("Sprites")
        public GetEditingProjectMaterialsResponseBodyMaterialListMaterialSprites sprites;

        /**
         * <p>The status of the material. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: The material is in draft.</li>
         * <li><strong>Producing</strong>: The material is being produced.</li>
         * <li><strong>Produced</strong>: The material was produced.</li>
         * <li><strong>ProduceFailed</strong>: The material failed to be produced.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag of the material. Multiple tags are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>editing test</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The title of the material.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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
