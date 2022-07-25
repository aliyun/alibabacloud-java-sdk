// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class DetailSubSceneResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("CoverUrl")
    public String coverUrl;

    @NameInMap("CubemapPath")
    public String cubemapPath;

    @NameInMap("GmtCreate")
    public Long gmtCreate;

    @NameInMap("GmtModified")
    public Long gmtModified;

    @NameInMap("Id")
    public String id;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("LayoutData")
    public String layoutData;

    @NameInMap("Message")
    public String message;

    @NameInMap("Name")
    public String name;

    @NameInMap("OriginUrl")
    public String originUrl;

    @NameInMap("Position")
    public String position;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("Status")
    public Long status;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Type")
    public String type;

    @NameInMap("Url")
    public String url;

    public static DetailSubSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetailSubSceneResponseBody self = new DetailSubSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public DetailSubSceneResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DetailSubSceneResponseBody setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public DetailSubSceneResponseBody setCubemapPath(String cubemapPath) {
        this.cubemapPath = cubemapPath;
        return this;
    }
    public String getCubemapPath() {
        return this.cubemapPath;
    }

    public DetailSubSceneResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public DetailSubSceneResponseBody setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public DetailSubSceneResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DetailSubSceneResponseBody setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public DetailSubSceneResponseBody setLayoutData(String layoutData) {
        this.layoutData = layoutData;
        return this;
    }
    public String getLayoutData() {
        return this.layoutData;
    }

    public DetailSubSceneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DetailSubSceneResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DetailSubSceneResponseBody setOriginUrl(String originUrl) {
        this.originUrl = originUrl;
        return this;
    }
    public String getOriginUrl() {
        return this.originUrl;
    }

    public DetailSubSceneResponseBody setPosition(String position) {
        this.position = position;
        return this;
    }
    public String getPosition() {
        return this.position;
    }

    public DetailSubSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetailSubSceneResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DetailSubSceneResponseBody setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public DetailSubSceneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DetailSubSceneResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DetailSubSceneResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
