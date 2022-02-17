// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetScenePreviewDataResponseBody extends TeaModel {
    // 返回码
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetScenePreviewDataResponseBodyData data;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 是否请求成功
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
        // 当前点位在场景中的旋转四元素
        @NameInMap("Rotation")
        public java.util.List<Double> rotation;

        // 当前点位在场景中的坐标
        @NameInMap("Spot")
        public java.util.List<Double> spot;

        // 当前子场景名标签在场景中的坐标
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
        // 当前房间的所有点位
        @NameInMap("CurRoomPicList")
        public java.util.List<String> curRoomPicList;

        // 当前点位是否渲染，false不渲染，场景无法跳转
        @NameInMap("Enabled")
        public Boolean enabled;

        // 楼层号
        @NameInMap("FloorIdx")
        public String floorIdx;

        // 点位ID
        @NameInMap("Id")
        public String id;

        // 单房间多图情况下，是否为主图，默认true
        @NameInMap("MainImage")
        public Boolean mainImage;

        // 当前房间邻近可视的点位id
        @NameInMap("Neighbours")
        public java.util.List<String> neighbours;

        // 位置数据
        @NameInMap("Position")
        public GetScenePreviewDataResponseBodyDataModelPanoListPosition position;

        // 一个名称，无实际意义
        @NameInMap("RawName")
        public String rawName;

        // 全景贴图路径
        @NameInMap("Resource")
        public String resource;

        // 房间号
        @NameInMap("RoomIdx")
        public String roomIdx;

        // 子场景ID
        @NameInMap("SubSceneId")
        public String subSceneId;

        // token
        @NameInMap("Token")
        public String token;

        // 图片虚拟ID
        @NameInMap("VirtualId")
        public String virtualId;

        // 图片名称
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
        // 模型地址
        @NameInMap("ModelPath")
        public String modelPath;

        // 点位数据
        @NameInMap("PanoList")
        public java.util.List<GetScenePreviewDataResponseBodyDataModelPanoList> panoList;

        // 模型的贴图路径
        @NameInMap("TextureModelPath")
        public String textureModelPath;

        // 漫游后预览图片路径
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
        // 背景色
        @NameInMap("BackgroundColor")
        public String backgroundColor;

        // 按钮配置
        @NameInMap("ButtonConfig")
        public GetScenePreviewDataResponseBodyDataTagsConfigButtonConfig buttonConfig;

        // 内容
        @NameInMap("Content")
        public String content;

        @NameInMap("FormImgSize")
        public java.util.List<Long> formImgSize;

        @NameInMap("FormJumpType")
        public Boolean formJumpType;

        @NameInMap("FormSelectImgType")
        public String formSelectImgType;

        // 图片链接
        @NameInMap("Images")
        public java.util.List<String> images;

        // 是否在鸟瞰模式下显示
        @NameInMap("IsTagVisibleBy3d")
        public Boolean isTagVisibleBy3d;

        // 超链接
        @NameInMap("Link")
        public String link;

        // 点位ID
        @NameInMap("PanoId")
        public String panoId;

        // 坐标
        @NameInMap("Position")
        public java.util.List<Double> position;

        @NameInMap("PositionPanoCube")
        public java.util.List<Double> positionPanoCube;

        @NameInMap("RelatedPanoIds")
        public java.util.List<String> relatedPanoIds;

        // 场景ID
        @NameInMap("SceneId")
        public Long sceneId;

        // 标题
        @NameInMap("Title")
        public String title;

        // 视频链接
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
        // 配置
        @NameInMap("Config")
        public GetScenePreviewDataResponseBodyDataTagsConfig config;

        // 标签ID
        @NameInMap("Id")
        public String id;

        // 坐标
        @NameInMap("Position")
        public java.util.List<Double> position;

        @NameInMap("PositionPanoCube")
        public java.util.List<Double> positionPanoCube;

        // 热点类型
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
        // 模型数据
        @NameInMap("Model")
        public GetScenePreviewDataResponseBodyDataModel model;

        // 热点数据
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
