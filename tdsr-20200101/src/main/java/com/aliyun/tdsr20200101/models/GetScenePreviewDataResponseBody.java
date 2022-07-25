// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetScenePreviewDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetScenePreviewDataResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetScenePreviewDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScenePreviewDataResponseBody self = new GetScenePreviewDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScenePreviewDataResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetScenePreviewDataResponseBody setData(GetScenePreviewDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetScenePreviewDataResponseBodyData getData() {
        return this.data;
    }

    public GetScenePreviewDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetScenePreviewDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScenePreviewDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetScenePreviewDataResponseBodyDataModelPanoListPosition extends TeaModel {
        @NameInMap("Rotation")
        public java.util.List<Double> rotation;

        @NameInMap("Spot")
        public java.util.List<Double> spot;

        @NameInMap("Viewpoint")
        public java.util.List<Double> viewpoint;

        public static GetScenePreviewDataResponseBodyDataModelPanoListPosition build(java.util.Map<String, ?> map) throws Exception {
            GetScenePreviewDataResponseBodyDataModelPanoListPosition self = new GetScenePreviewDataResponseBodyDataModelPanoListPosition();
            return TeaModel.build(map, self);
        }

        public GetScenePreviewDataResponseBodyDataModelPanoListPosition setRotation(java.util.List<Double> rotation) {
            this.rotation = rotation;
            return this;
        }
        public java.util.List<Double> getRotation() {
            return this.rotation;
        }

        public GetScenePreviewDataResponseBodyDataModelPanoListPosition setSpot(java.util.List<Double> spot) {
            this.spot = spot;
            return this;
        }
        public java.util.List<Double> getSpot() {
            return this.spot;
        }

        public GetScenePreviewDataResponseBodyDataModelPanoListPosition setViewpoint(java.util.List<Double> viewpoint) {
            this.viewpoint = viewpoint;
            return this;
        }
        public java.util.List<Double> getViewpoint() {
            return this.viewpoint;
        }

    }

    public static class GetScenePreviewDataResponseBodyDataModelPanoList extends TeaModel {
        @NameInMap("CurRoomPicList")
        public java.util.List<String> curRoomPicList;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("FloorIdx")
        public String floorIdx;

        @NameInMap("Id")
        public String id;

        @NameInMap("MainImage")
        public Boolean mainImage;

        @NameInMap("Neighbours")
        public java.util.List<String> neighbours;

        @NameInMap("Position")
        public GetScenePreviewDataResponseBodyDataModelPanoListPosition position;

        @NameInMap("RawName")
        public String rawName;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("RoomIdx")
        public String roomIdx;

        @NameInMap("SubSceneId")
        public String subSceneId;

        @NameInMap("Token")
        public String token;

        @NameInMap("VirtualId")
        public String virtualId;

        @NameInMap("VirtualName")
        public String virtualName;

        public static GetScenePreviewDataResponseBodyDataModelPanoList build(java.util.Map<String, ?> map) throws Exception {
            GetScenePreviewDataResponseBodyDataModelPanoList self = new GetScenePreviewDataResponseBodyDataModelPanoList();
            return TeaModel.build(map, self);
        }

        public GetScenePreviewDataResponseBodyDataModelPanoList setCurRoomPicList(java.util.List<String> curRoomPicList) {
            this.curRoomPicList = curRoomPicList;
            return this;
        }
        public java.util.List<String> getCurRoomPicList() {
            return this.curRoomPicList;
        }

        public GetScenePreviewDataResponseBodyDataModelPanoList setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetScenePreviewDataResponseBodyDataModelPanoList setFloorIdx(String floorIdx) {
            this.floorIdx = floorIdx;
            return this;
        }
        public String getFloorIdx() {
            return this.floorIdx;
        }

        public GetScenePreviewDataResponseBodyDataModelPanoList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetScenePreviewDataResponseBodyDataModelPanoList setMainImage(Boolean mainImage) {
            this.mainImage = mainImage;
            return this;
        }
        public Boolean getMainImage() {
            return this.mainImage;
        }

        public GetScenePreviewDataResponseBodyDataModelPanoList setNeighbours(java.util.List<String> neighbours) {
            this.neighbours = neighbours;
            return this;
        }
        public java.util.List<String> getNeighbours() {
            return this.neighbours;
        }

        public GetScenePreviewDataResponseBodyDataModelPanoList setPosition(GetScenePreviewDataResponseBodyDataModelPanoListPosition position) {
            this.position = position;
            return this;
        }
        public GetScenePreviewDataResponseBodyDataModelPanoListPosition getPosition() {
            return this.position;
        }

        public GetScenePreviewDataResponseBodyDataModelPanoList setRawName(String rawName) {
            this.rawName = rawName;
            return this;
        }
        public String getRawName() {
            return this.rawName;
        }

        public GetScenePreviewDataResponseBodyDataModelPanoList setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public GetScenePreviewDataResponseBodyDataModelPanoList setRoomIdx(String roomIdx) {
            this.roomIdx = roomIdx;
            return this;
        }
        public String getRoomIdx() {
            return this.roomIdx;
        }

        public GetScenePreviewDataResponseBodyDataModelPanoList setSubSceneId(String subSceneId) {
            this.subSceneId = subSceneId;
            return this;
        }
        public String getSubSceneId() {
            return this.subSceneId;
        }

        public GetScenePreviewDataResponseBodyDataModelPanoList setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public GetScenePreviewDataResponseBodyDataModelPanoList setVirtualId(String virtualId) {
            this.virtualId = virtualId;
            return this;
        }
        public String getVirtualId() {
            return this.virtualId;
        }

        public GetScenePreviewDataResponseBodyDataModelPanoList setVirtualName(String virtualName) {
            this.virtualName = virtualName;
            return this;
        }
        public String getVirtualName() {
            return this.virtualName;
        }

    }

    public static class GetScenePreviewDataResponseBodyDataModel extends TeaModel {
        @NameInMap("ModelPath")
        public String modelPath;

        @NameInMap("PanoList")
        public java.util.List<GetScenePreviewDataResponseBodyDataModelPanoList> panoList;

        @NameInMap("TextureModelPath")
        public String textureModelPath;

        @NameInMap("TexturePanoPath")
        public String texturePanoPath;

        public static GetScenePreviewDataResponseBodyDataModel build(java.util.Map<String, ?> map) throws Exception {
            GetScenePreviewDataResponseBodyDataModel self = new GetScenePreviewDataResponseBodyDataModel();
            return TeaModel.build(map, self);
        }

        public GetScenePreviewDataResponseBodyDataModel setModelPath(String modelPath) {
            this.modelPath = modelPath;
            return this;
        }
        public String getModelPath() {
            return this.modelPath;
        }

        public GetScenePreviewDataResponseBodyDataModel setPanoList(java.util.List<GetScenePreviewDataResponseBodyDataModelPanoList> panoList) {
            this.panoList = panoList;
            return this;
        }
        public java.util.List<GetScenePreviewDataResponseBodyDataModelPanoList> getPanoList() {
            return this.panoList;
        }

        public GetScenePreviewDataResponseBodyDataModel setTextureModelPath(String textureModelPath) {
            this.textureModelPath = textureModelPath;
            return this;
        }
        public String getTextureModelPath() {
            return this.textureModelPath;
        }

        public GetScenePreviewDataResponseBodyDataModel setTexturePanoPath(String texturePanoPath) {
            this.texturePanoPath = texturePanoPath;
            return this;
        }
        public String getTexturePanoPath() {
            return this.texturePanoPath;
        }

    }

    public static class GetScenePreviewDataResponseBodyDataTagsConfigButtonConfig extends TeaModel {
        @NameInMap("CustomText")
        public String customText;

        @NameInMap("Type")
        public String type;

        public static GetScenePreviewDataResponseBodyDataTagsConfigButtonConfig build(java.util.Map<String, ?> map) throws Exception {
            GetScenePreviewDataResponseBodyDataTagsConfigButtonConfig self = new GetScenePreviewDataResponseBodyDataTagsConfigButtonConfig();
            return TeaModel.build(map, self);
        }

        public GetScenePreviewDataResponseBodyDataTagsConfigButtonConfig setCustomText(String customText) {
            this.customText = customText;
            return this;
        }
        public String getCustomText() {
            return this.customText;
        }

        public GetScenePreviewDataResponseBodyDataTagsConfigButtonConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetScenePreviewDataResponseBodyDataTagsConfig extends TeaModel {
        @NameInMap("BackgroundColor")
        public String backgroundColor;

        @NameInMap("ButtonConfig")
        public GetScenePreviewDataResponseBodyDataTagsConfigButtonConfig buttonConfig;

        @NameInMap("Content")
        public String content;

        @NameInMap("FormImgSize")
        public java.util.List<Long> formImgSize;

        @NameInMap("FormJumpType")
        public Boolean formJumpType;

        @NameInMap("FormSelectImgType")
        public String formSelectImgType;

        @NameInMap("Images")
        public java.util.List<String> images;

        @NameInMap("IsTagVisibleBy3d")
        public Boolean isTagVisibleBy3d;

        @NameInMap("Link")
        public String link;

        @NameInMap("PanoId")
        public String panoId;

        @NameInMap("Position")
        public java.util.List<Double> position;

        @NameInMap("PositionPanoCube")
        public java.util.List<Double> positionPanoCube;

        @NameInMap("RelatedPanoIds")
        public java.util.List<String> relatedPanoIds;

        @NameInMap("SceneId")
        public Long sceneId;

        @NameInMap("Title")
        public String title;

        @NameInMap("Video")
        public String video;

        public static GetScenePreviewDataResponseBodyDataTagsConfig build(java.util.Map<String, ?> map) throws Exception {
            GetScenePreviewDataResponseBodyDataTagsConfig self = new GetScenePreviewDataResponseBodyDataTagsConfig();
            return TeaModel.build(map, self);
        }

        public GetScenePreviewDataResponseBodyDataTagsConfig setBackgroundColor(String backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }
        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        public GetScenePreviewDataResponseBodyDataTagsConfig setButtonConfig(GetScenePreviewDataResponseBodyDataTagsConfigButtonConfig buttonConfig) {
            this.buttonConfig = buttonConfig;
            return this;
        }
        public GetScenePreviewDataResponseBodyDataTagsConfigButtonConfig getButtonConfig() {
            return this.buttonConfig;
        }

        public GetScenePreviewDataResponseBodyDataTagsConfig setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetScenePreviewDataResponseBodyDataTagsConfig setFormImgSize(java.util.List<Long> formImgSize) {
            this.formImgSize = formImgSize;
            return this;
        }
        public java.util.List<Long> getFormImgSize() {
            return this.formImgSize;
        }

        public GetScenePreviewDataResponseBodyDataTagsConfig setFormJumpType(Boolean formJumpType) {
            this.formJumpType = formJumpType;
            return this;
        }
        public Boolean getFormJumpType() {
            return this.formJumpType;
        }

        public GetScenePreviewDataResponseBodyDataTagsConfig setFormSelectImgType(String formSelectImgType) {
            this.formSelectImgType = formSelectImgType;
            return this;
        }
        public String getFormSelectImgType() {
            return this.formSelectImgType;
        }

        public GetScenePreviewDataResponseBodyDataTagsConfig setImages(java.util.List<String> images) {
            this.images = images;
            return this;
        }
        public java.util.List<String> getImages() {
            return this.images;
        }

        public GetScenePreviewDataResponseBodyDataTagsConfig setIsTagVisibleBy3d(Boolean isTagVisibleBy3d) {
            this.isTagVisibleBy3d = isTagVisibleBy3d;
            return this;
        }
        public Boolean getIsTagVisibleBy3d() {
            return this.isTagVisibleBy3d;
        }

        public GetScenePreviewDataResponseBodyDataTagsConfig setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public GetScenePreviewDataResponseBodyDataTagsConfig setPanoId(String panoId) {
            this.panoId = panoId;
            return this;
        }
        public String getPanoId() {
            return this.panoId;
        }

        public GetScenePreviewDataResponseBodyDataTagsConfig setPosition(java.util.List<Double> position) {
            this.position = position;
            return this;
        }
        public java.util.List<Double> getPosition() {
            return this.position;
        }

        public GetScenePreviewDataResponseBodyDataTagsConfig setPositionPanoCube(java.util.List<Double> positionPanoCube) {
            this.positionPanoCube = positionPanoCube;
            return this;
        }
        public java.util.List<Double> getPositionPanoCube() {
            return this.positionPanoCube;
        }

        public GetScenePreviewDataResponseBodyDataTagsConfig setRelatedPanoIds(java.util.List<String> relatedPanoIds) {
            this.relatedPanoIds = relatedPanoIds;
            return this;
        }
        public java.util.List<String> getRelatedPanoIds() {
            return this.relatedPanoIds;
        }

        public GetScenePreviewDataResponseBodyDataTagsConfig setSceneId(Long sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public Long getSceneId() {
            return this.sceneId;
        }

        public GetScenePreviewDataResponseBodyDataTagsConfig setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetScenePreviewDataResponseBodyDataTagsConfig setVideo(String video) {
            this.video = video;
            return this;
        }
        public String getVideo() {
            return this.video;
        }

    }

    public static class GetScenePreviewDataResponseBodyDataTags extends TeaModel {
        @NameInMap("Config")
        public GetScenePreviewDataResponseBodyDataTagsConfig config;

        @NameInMap("Id")
        public String id;

        @NameInMap("Position")
        public java.util.List<Double> position;

        @NameInMap("PositionPanoCube")
        public java.util.List<Double> positionPanoCube;

        @NameInMap("Type")
        public String type;

        public static GetScenePreviewDataResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            GetScenePreviewDataResponseBodyDataTags self = new GetScenePreviewDataResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public GetScenePreviewDataResponseBodyDataTags setConfig(GetScenePreviewDataResponseBodyDataTagsConfig config) {
            this.config = config;
            return this;
        }
        public GetScenePreviewDataResponseBodyDataTagsConfig getConfig() {
            return this.config;
        }

        public GetScenePreviewDataResponseBodyDataTags setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetScenePreviewDataResponseBodyDataTags setPosition(java.util.List<Double> position) {
            this.position = position;
            return this;
        }
        public java.util.List<Double> getPosition() {
            return this.position;
        }

        public GetScenePreviewDataResponseBodyDataTags setPositionPanoCube(java.util.List<Double> positionPanoCube) {
            this.positionPanoCube = positionPanoCube;
            return this;
        }
        public java.util.List<Double> getPositionPanoCube() {
            return this.positionPanoCube;
        }

        public GetScenePreviewDataResponseBodyDataTags setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetScenePreviewDataResponseBodyData extends TeaModel {
        @NameInMap("Model")
        public GetScenePreviewDataResponseBodyDataModel model;

        @NameInMap("Tags")
        public java.util.List<GetScenePreviewDataResponseBodyDataTags> tags;

        public static GetScenePreviewDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetScenePreviewDataResponseBodyData self = new GetScenePreviewDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetScenePreviewDataResponseBodyData setModel(GetScenePreviewDataResponseBodyDataModel model) {
            this.model = model;
            return this;
        }
        public GetScenePreviewDataResponseBodyDataModel getModel() {
            return this.model;
        }

        public GetScenePreviewDataResponseBodyData setTags(java.util.List<GetScenePreviewDataResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetScenePreviewDataResponseBodyDataTags> getTags() {
            return this.tags;
        }

    }

}
