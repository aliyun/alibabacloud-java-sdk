// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopCreatePakRenderProjectResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public PopCreatePakRenderProjectResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PopCreatePakRenderProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PopCreatePakRenderProjectResponseBody self = new PopCreatePakRenderProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public PopCreatePakRenderProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PopCreatePakRenderProjectResponseBody setData(PopCreatePakRenderProjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PopCreatePakRenderProjectResponseBodyData getData() {
        return this.data;
    }

    public PopCreatePakRenderProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PopCreatePakRenderProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PopCreatePakRenderProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PopCreatePakRenderProjectResponseBodyData extends TeaModel {
        @NameInMap("AutoBuild")
        public Boolean autoBuild;

        @NameInMap("BizUsage")
        public String bizUsage;

        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("CreateMode")
        public String createMode;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Dependencies")
        public String dependencies;

        @NameInMap("Ext")
        public String ext;

        @NameInMap("Id")
        public String id;

        @NameInMap("Intro")
        public String intro;

        @NameInMap("MaterialCoverUrl")
        public String materialCoverUrl;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        public static PopCreatePakRenderProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PopCreatePakRenderProjectResponseBodyData self = new PopCreatePakRenderProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PopCreatePakRenderProjectResponseBodyData setAutoBuild(Boolean autoBuild) {
            this.autoBuild = autoBuild;
            return this;
        }
        public Boolean getAutoBuild() {
            return this.autoBuild;
        }

        public PopCreatePakRenderProjectResponseBodyData setBizUsage(String bizUsage) {
            this.bizUsage = bizUsage;
            return this;
        }
        public String getBizUsage() {
            return this.bizUsage;
        }

        public PopCreatePakRenderProjectResponseBodyData setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public PopCreatePakRenderProjectResponseBodyData setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public PopCreatePakRenderProjectResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopCreatePakRenderProjectResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopCreatePakRenderProjectResponseBodyData setDependencies(String dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public String getDependencies() {
            return this.dependencies;
        }

        public PopCreatePakRenderProjectResponseBodyData setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopCreatePakRenderProjectResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PopCreatePakRenderProjectResponseBodyData setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopCreatePakRenderProjectResponseBodyData setMaterialCoverUrl(String materialCoverUrl) {
            this.materialCoverUrl = materialCoverUrl;
            return this;
        }
        public String getMaterialCoverUrl() {
            return this.materialCoverUrl;
        }

        public PopCreatePakRenderProjectResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopCreatePakRenderProjectResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PopCreatePakRenderProjectResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public PopCreatePakRenderProjectResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
