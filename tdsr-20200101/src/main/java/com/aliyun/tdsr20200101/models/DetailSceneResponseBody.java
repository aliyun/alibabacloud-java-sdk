// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class DetailSceneResponseBody extends TeaModel {
    // 请求ID，与入参requestId对应
    @NameInMap("RequestId")
    public String requestId;

    // 返回码
    @NameInMap("Code")
    public Long code;

    // 是否请求成功
    @NameInMap("Success")
    public Boolean success;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // 主场景Id
    @NameInMap("Id")
    public String id;

    // 场景名称
    @NameInMap("Name")
    public String name;

    // 场景类型
    @NameInMap("Type")
    public String type;

    // 子场景数
    @NameInMap("SubSceneNum")
    public Long subSceneNum;

    // 资源数
    @NameInMap("SourceNum")
    public Long sourceNum;

    // 是否已发布 true：已发布：false：未发布
    @NameInMap("Published")
    public Boolean published;

    // 创建时间
    @NameInMap("GmtCreate")
    public Long gmtCreate;

    // 最后修改时间
    @NameInMap("GmtModified")
    public Long gmtModified;

    // 预览Token
    @NameInMap("PreviewToken")
    public String previewToken;

    public static DetailSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetailSceneResponseBody self = new DetailSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public DetailSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetailSceneResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DetailSceneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DetailSceneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DetailSceneResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DetailSceneResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DetailSceneResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DetailSceneResponseBody setSubSceneNum(Long subSceneNum) {
        this.subSceneNum = subSceneNum;
        return this;
    }
    public Long getSubSceneNum() {
        return this.subSceneNum;
    }

    public DetailSceneResponseBody setSourceNum(Long sourceNum) {
        this.sourceNum = sourceNum;
        return this;
    }
    public Long getSourceNum() {
        return this.sourceNum;
    }

    public DetailSceneResponseBody setPublished(Boolean published) {
        this.published = published;
        return this;
    }
    public Boolean getPublished() {
        return this.published;
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

    public DetailSceneResponseBody setPreviewToken(String previewToken) {
        this.previewToken = previewToken;
        return this;
    }
    public String getPreviewToken() {
        return this.previewToken;
    }

}
