// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddEditingProjectMaterialsResponseBody extends TeaModel {
    /**
     * <p>The materials.</p>
     */
    @NameInMap("MaterialList")
    public java.util.List<AddEditingProjectMaterialsResponseBodyMaterialList> materialList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>85237CDA-0B54-5CED-BA10-A8A71AA13C1A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddEditingProjectMaterialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddEditingProjectMaterialsResponseBody self = new AddEditingProjectMaterialsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddEditingProjectMaterialsResponseBody setMaterialList(java.util.List<AddEditingProjectMaterialsResponseBodyMaterialList> materialList) {
        this.materialList = materialList;
        return this;
    }
    public java.util.List<AddEditingProjectMaterialsResponseBodyMaterialList> getMaterialList() {
        return this.materialList;
    }

    public AddEditingProjectMaterialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddEditingProjectMaterialsResponseBodyMaterialList extends TeaModel {
        /**
         * <p>The ID of the category.</p>
         * 
         * <strong>example:</strong>
         * <p>1000487543</p>
         */
        @NameInMap("CateId")
        public Integer cateId;

        /**
         * <p>The category name of the material.</p>
         * 
         * <strong>example:</strong>
         * <p>cate1</p>
         */
        @NameInMap("CateName")
        public String cateName;

        /**
         * <p>The thumbnail URL.</p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The time when the material was created. The time follows the ISO 8601 standard in the <em>YYYY-MM-DD**Thh:mm:ss</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-10-02T08:26Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>1234751840694470</p>
         */
        @NameInMap("CustomerId")
        public Long customerId;

        /**
         * <p>The description of the material.</p>
         * 
         * <strong>example:</strong>
         * <p>test material</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The duration of the material. Unit: seconds. The value is accurate to four decimal places.</p>
         * 
         * <strong>example:</strong>
         * <p>3690.2332</p>
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
         * <p>The time when the material was last updated. The time follows the ISO 8601 standard in the <em>YYYY-MM-DD**Thh:mm:ss</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-25T07:28:34Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The size of the material.</p>
         * 
         * <strong>example:</strong>
         * <p>1682694</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The URLs of snapshots.</p>
         */
        @NameInMap("Snapshots")
        public java.util.List<String> snapshots;

        /**
         * <p>The configuration of the sprite snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("SpriteConfig")
        public String spriteConfig;

        /**
         * <p>The URLs of sprite snapshots.</p>
         */
        @NameInMap("Sprites")
        public java.util.List<String> sprites;

        /**
         * <p>The status of the material. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong></li>
         * <li><strong>Uploading</strong></li>
         * <li><strong>UploadFail</strong></li>
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
         * <p>tag1,tag2</p>
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

        public static AddEditingProjectMaterialsResponseBodyMaterialList build(java.util.Map<String, ?> map) throws Exception {
            AddEditingProjectMaterialsResponseBodyMaterialList self = new AddEditingProjectMaterialsResponseBodyMaterialList();
            return TeaModel.build(map, self);
        }

        public AddEditingProjectMaterialsResponseBodyMaterialList setCateId(Integer cateId) {
            this.cateId = cateId;
            return this;
        }
        public Integer getCateId() {
            return this.cateId;
        }

        public AddEditingProjectMaterialsResponseBodyMaterialList setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public AddEditingProjectMaterialsResponseBodyMaterialList setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public AddEditingProjectMaterialsResponseBodyMaterialList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public AddEditingProjectMaterialsResponseBodyMaterialList setCustomerId(Long customerId) {
            this.customerId = customerId;
            return this;
        }
        public Long getCustomerId() {
            return this.customerId;
        }

        public AddEditingProjectMaterialsResponseBodyMaterialList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddEditingProjectMaterialsResponseBodyMaterialList setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public AddEditingProjectMaterialsResponseBodyMaterialList setMaterialId(String materialId) {
            this.materialId = materialId;
            return this;
        }
        public String getMaterialId() {
            return this.materialId;
        }

        public AddEditingProjectMaterialsResponseBodyMaterialList setMaterialType(String materialType) {
            this.materialType = materialType;
            return this;
        }
        public String getMaterialType() {
            return this.materialType;
        }

        public AddEditingProjectMaterialsResponseBodyMaterialList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public AddEditingProjectMaterialsResponseBodyMaterialList setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public AddEditingProjectMaterialsResponseBodyMaterialList setSnapshots(java.util.List<String> snapshots) {
            this.snapshots = snapshots;
            return this;
        }
        public java.util.List<String> getSnapshots() {
            return this.snapshots;
        }

        public AddEditingProjectMaterialsResponseBodyMaterialList setSpriteConfig(String spriteConfig) {
            this.spriteConfig = spriteConfig;
            return this;
        }
        public String getSpriteConfig() {
            return this.spriteConfig;
        }

        public AddEditingProjectMaterialsResponseBodyMaterialList setSprites(java.util.List<String> sprites) {
            this.sprites = sprites;
            return this;
        }
        public java.util.List<String> getSprites() {
            return this.sprites;
        }

        public AddEditingProjectMaterialsResponseBodyMaterialList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public AddEditingProjectMaterialsResponseBodyMaterialList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public AddEditingProjectMaterialsResponseBodyMaterialList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
