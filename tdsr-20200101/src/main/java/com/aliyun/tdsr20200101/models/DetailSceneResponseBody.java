// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class DetailSceneResponseBody extends TeaModel {
    // 返回码
    @NameInMap("Code")
    public Long code;

    // 封面地址
    @NameInMap("CoverUrl")
    public String coverUrl;

    // 创建时间
    @NameInMap("GmtCreate")
    public Long gmtCreate;

    // 最后修改时间
    @NameInMap("GmtModified")
    public Long gmtModified;

    // 主场景Id
    @NameInMap("Id")
    public String id;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // 场景名称
    @NameInMap("Name")
    public String name;

    // 预览Token
    @NameInMap("PreviewToken")
    public String previewToken;

    // 是否已发布 true：已发布：false：未发布
    @NameInMap("Published")
    public Boolean published;

    // 请求ID，与入参requestId对应
    @NameInMap("RequestId")
    public String requestId;

    // 资源数
    @NameInMap("SourceNum")
    public Long sourceNum;

    // 子场景数
    @NameInMap("SubSceneNum")
    public Long subSceneNum;

    // 是否请求成功
    @NameInMap("Success")
    public Boolean success;

    // 场景类型
    @NameInMap("Type")
    public String type;

    public static DetailSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetailSceneResponseBody self = new DetailSceneResponseBody();
        return TeaModel.build(map, self);
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

}
