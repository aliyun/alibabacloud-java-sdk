// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class ListProjectResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("Data")
    public java.util.List<ListProjectResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("Pages")
    public Integer pages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static ListProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectResponseBody self = new ListProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProjectResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListProjectResponseBody setData(java.util.List<ListProjectResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListProjectResponseBodyData> getData() {
        return this.data;
    }

    public ListProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProjectResponseBody setPages(Integer pages) {
        this.pages = pages;
        return this;
    }
    public Integer getPages() {
        return this.pages;
    }

    public ListProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListProjectResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListProjectResponseBodyDataDataset extends TeaModel {
        @NameInMap("BuildResultUrl")
        public java.util.Map<String, ?> buildResultUrl;

        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("GlbModelUrl")
        public String glbModelUrl;

        @NameInMap("ModelUrl")
        public String modelUrl;

        @NameInMap("OriginResultUrl")
        public String originResultUrl;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("PoseUrl")
        public String poseUrl;

        @NameInMap("PreviewUrl")
        public String previewUrl;

        public static ListProjectResponseBodyDataDataset build(java.util.Map<String, ?> map) throws Exception {
            ListProjectResponseBodyDataDataset self = new ListProjectResponseBodyDataDataset();
            return TeaModel.build(map, self);
        }

        public ListProjectResponseBodyDataDataset setBuildResultUrl(java.util.Map<String, ?> buildResultUrl) {
            this.buildResultUrl = buildResultUrl;
            return this;
        }
        public java.util.Map<String, ?> getBuildResultUrl() {
            return this.buildResultUrl;
        }

        public ListProjectResponseBodyDataDataset setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public ListProjectResponseBodyDataDataset setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListProjectResponseBodyDataDataset setGlbModelUrl(String glbModelUrl) {
            this.glbModelUrl = glbModelUrl;
            return this;
        }
        public String getGlbModelUrl() {
            return this.glbModelUrl;
        }

        public ListProjectResponseBodyDataDataset setModelUrl(String modelUrl) {
            this.modelUrl = modelUrl;
            return this;
        }
        public String getModelUrl() {
            return this.modelUrl;
        }

        public ListProjectResponseBodyDataDataset setOriginResultUrl(String originResultUrl) {
            this.originResultUrl = originResultUrl;
            return this;
        }
        public String getOriginResultUrl() {
            return this.originResultUrl;
        }

        public ListProjectResponseBodyDataDataset setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public ListProjectResponseBodyDataDataset setPoseUrl(String poseUrl) {
            this.poseUrl = poseUrl;
            return this;
        }
        public String getPoseUrl() {
            return this.poseUrl;
        }

        public ListProjectResponseBodyDataDataset setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

    }

    public static class ListProjectResponseBodyDataSourceClothes extends TeaModel {
        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Type")
        public String type;

        public static ListProjectResponseBodyDataSourceClothes build(java.util.Map<String, ?> map) throws Exception {
            ListProjectResponseBodyDataSourceClothes self = new ListProjectResponseBodyDataSourceClothes();
            return TeaModel.build(map, self);
        }

        public ListProjectResponseBodyDataSourceClothes setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public ListProjectResponseBodyDataSourceClothes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectResponseBodyDataSourceClothes setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public ListProjectResponseBodyDataSourceClothes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListProjectResponseBodyDataSourceFiles extends TeaModel {
        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("Id")
        public String id;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

        public static ListProjectResponseBodyDataSourceFiles build(java.util.Map<String, ?> map) throws Exception {
            ListProjectResponseBodyDataSourceFiles self = new ListProjectResponseBodyDataSourceFiles();
            return TeaModel.build(map, self);
        }

        public ListProjectResponseBodyDataSourceFiles setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public ListProjectResponseBodyDataSourceFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListProjectResponseBodyDataSourceFiles setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListProjectResponseBodyDataSourceFiles setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListProjectResponseBodyDataSourceFiles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListProjectResponseBodyDataSourceFiles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListProjectResponseBodyDataSource extends TeaModel {
        @NameInMap("Clothes")
        public java.util.List<ListProjectResponseBodyDataSourceClothes> clothes;

        @NameInMap("Files")
        public java.util.List<ListProjectResponseBodyDataSourceFiles> files;

        @NameInMap("OssKey")
        public String ossKey;

        public static ListProjectResponseBodyDataSource build(java.util.Map<String, ?> map) throws Exception {
            ListProjectResponseBodyDataSource self = new ListProjectResponseBodyDataSource();
            return TeaModel.build(map, self);
        }

        public ListProjectResponseBodyDataSource setClothes(java.util.List<ListProjectResponseBodyDataSourceClothes> clothes) {
            this.clothes = clothes;
            return this;
        }
        public java.util.List<ListProjectResponseBodyDataSourceClothes> getClothes() {
            return this.clothes;
        }

        public ListProjectResponseBodyDataSource setFiles(java.util.List<ListProjectResponseBodyDataSourceFiles> files) {
            this.files = files;
            return this;
        }
        public java.util.List<ListProjectResponseBodyDataSourceFiles> getFiles() {
            return this.files;
        }

        public ListProjectResponseBodyDataSource setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

    }

    public static class ListProjectResponseBodyDataUser extends TeaModel {
        @NameInMap("AliyunUid")
        public String aliyunUid;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Nickname")
        public String nickname;

        public static ListProjectResponseBodyDataUser build(java.util.Map<String, ?> map) throws Exception {
            ListProjectResponseBodyDataUser self = new ListProjectResponseBodyDataUser();
            return TeaModel.build(map, self);
        }

        public ListProjectResponseBodyDataUser setAliyunUid(String aliyunUid) {
            this.aliyunUid = aliyunUid;
            return this;
        }
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        public ListProjectResponseBodyDataUser setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProjectResponseBodyDataUser setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListProjectResponseBodyDataUser setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

    }

    public static class ListProjectResponseBodyData extends TeaModel {
        @NameInMap("BizUsage")
        public String bizUsage;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Dataset")
        public ListProjectResponseBodyDataDataset dataset;

        @NameInMap("Ext")
        public String ext;

        @NameInMap("ExtInfo")
        public java.util.Map<String, ?> extInfo;

        @NameInMap("Id")
        public String id;

        @NameInMap("Intro")
        public String intro;

        @NameInMap("MaterialCoverUrl")
        public String materialCoverUrl;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Source")
        public ListProjectResponseBodyDataSource source;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        @NameInMap("User")
        public ListProjectResponseBodyDataUser user;

        public static ListProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProjectResponseBodyData self = new ListProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProjectResponseBodyData setBizUsage(String bizUsage) {
            this.bizUsage = bizUsage;
            return this;
        }
        public String getBizUsage() {
            return this.bizUsage;
        }

        public ListProjectResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProjectResponseBodyData setDataset(ListProjectResponseBodyDataDataset dataset) {
            this.dataset = dataset;
            return this;
        }
        public ListProjectResponseBodyDataDataset getDataset() {
            return this.dataset;
        }

        public ListProjectResponseBodyData setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public ListProjectResponseBodyData setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public ListProjectResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListProjectResponseBodyData setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public ListProjectResponseBodyData setMaterialCoverUrl(String materialCoverUrl) {
            this.materialCoverUrl = materialCoverUrl;
            return this;
        }
        public String getMaterialCoverUrl() {
            return this.materialCoverUrl;
        }

        public ListProjectResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListProjectResponseBodyData setSource(ListProjectResponseBodyDataSource source) {
            this.source = source;
            return this;
        }
        public ListProjectResponseBodyDataSource getSource() {
            return this.source;
        }

        public ListProjectResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListProjectResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListProjectResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListProjectResponseBodyData setUser(ListProjectResponseBodyDataUser user) {
            this.user = user;
            return this;
        }
        public ListProjectResponseBodyDataUser getUser() {
            return this.user;
        }

    }

}
