// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class DetailSceneResponseBody extends TeaModel {
    @NameInMap("Captures")
    public java.util.List<DetailSceneResponseBodyCaptures> captures;

    @NameInMap("Code")
    public Long code;

    @NameInMap("CoverUrl")
    public String coverUrl;

    @NameInMap("FloorPlans")
    public java.util.List<DetailSceneResponseBodyFloorPlans> floorPlans;

    @NameInMap("GmtCreate")
    public Long gmtCreate;

    @NameInMap("GmtModified")
    public Long gmtModified;

    @NameInMap("Id")
    public String id;

    @NameInMap("Message")
    public String message;

    @NameInMap("Name")
    public String name;

    @NameInMap("PreviewToken")
    public String previewToken;

    @NameInMap("Published")
    public Boolean published;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SourceNum")
    public Long sourceNum;

    @NameInMap("Status")
    public String status;

    @NameInMap("StatusName")
    public String statusName;

    @NameInMap("SubSceneNum")
    public Long subSceneNum;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Type")
    public String type;

    public static DetailSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetailSceneResponseBody self = new DetailSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public DetailSceneResponseBody setCaptures(java.util.List<DetailSceneResponseBodyCaptures> captures) {
        this.captures = captures;
        return this;
    }
    public java.util.List<DetailSceneResponseBodyCaptures> getCaptures() {
        return this.captures;
    }

    public DetailSceneResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DetailSceneResponseBody setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public DetailSceneResponseBody setFloorPlans(java.util.List<DetailSceneResponseBodyFloorPlans> floorPlans) {
        this.floorPlans = floorPlans;
        return this;
    }
    public java.util.List<DetailSceneResponseBodyFloorPlans> getFloorPlans() {
        return this.floorPlans;
    }

    public DetailSceneResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public DetailSceneResponseBody setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public DetailSceneResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DetailSceneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DetailSceneResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DetailSceneResponseBody setPreviewToken(String previewToken) {
        this.previewToken = previewToken;
        return this;
    }
    public String getPreviewToken() {
        return this.previewToken;
    }

    public DetailSceneResponseBody setPublished(Boolean published) {
        this.published = published;
        return this;
    }
    public Boolean getPublished() {
        return this.published;
    }

    public DetailSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetailSceneResponseBody setSourceNum(Long sourceNum) {
        this.sourceNum = sourceNum;
        return this;
    }
    public Long getSourceNum() {
        return this.sourceNum;
    }

    public DetailSceneResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DetailSceneResponseBody setStatusName(String statusName) {
        this.statusName = statusName;
        return this;
    }
    public String getStatusName() {
        return this.statusName;
    }

    public DetailSceneResponseBody setSubSceneNum(Long subSceneNum) {
        this.subSceneNum = subSceneNum;
        return this;
    }
    public Long getSubSceneNum() {
        return this.subSceneNum;
    }

    public DetailSceneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DetailSceneResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class DetailSceneResponseBodyCaptures extends TeaModel {
        @NameInMap("Title")
        public String title;

        @NameInMap("Url")
        public String url;

        public static DetailSceneResponseBodyCaptures build(java.util.Map<String, ?> map) throws Exception {
            DetailSceneResponseBodyCaptures self = new DetailSceneResponseBodyCaptures();
            return TeaModel.build(map, self);
        }

        public DetailSceneResponseBodyCaptures setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DetailSceneResponseBodyCaptures setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DetailSceneResponseBodyFloorPlans extends TeaModel {
        @NameInMap("ColorMapUrl")
        public String colorMapUrl;

        @NameInMap("FloorLabel")
        public String floorLabel;

        @NameInMap("FloorName")
        public String floorName;

        @NameInMap("MiniMapUrl")
        public String miniMapUrl;

        public static DetailSceneResponseBodyFloorPlans build(java.util.Map<String, ?> map) throws Exception {
            DetailSceneResponseBodyFloorPlans self = new DetailSceneResponseBodyFloorPlans();
            return TeaModel.build(map, self);
        }

        public DetailSceneResponseBodyFloorPlans setColorMapUrl(String colorMapUrl) {
            this.colorMapUrl = colorMapUrl;
            return this;
        }
        public String getColorMapUrl() {
            return this.colorMapUrl;
        }

        public DetailSceneResponseBodyFloorPlans setFloorLabel(String floorLabel) {
            this.floorLabel = floorLabel;
            return this;
        }
        public String getFloorLabel() {
            return this.floorLabel;
        }

        public DetailSceneResponseBodyFloorPlans setFloorName(String floorName) {
            this.floorName = floorName;
            return this;
        }
        public String getFloorName() {
            return this.floorName;
        }

        public DetailSceneResponseBodyFloorPlans setMiniMapUrl(String miniMapUrl) {
            this.miniMapUrl = miniMapUrl;
            return this;
        }
        public String getMiniMapUrl() {
            return this.miniMapUrl;
        }

    }

}
