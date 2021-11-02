// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ModifyMediaResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public ModifyMediaResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ModifyMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMediaResponseBody self = new ModifyMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMediaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyMediaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyMediaResponseBody setModel(ModifyMediaResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public ModifyMediaResponseBodyModel getModel() {
        return this.model;
    }

    public ModifyMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyMediaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifyMediaResponseBodyModel extends TeaModel {
        @NameInMap("AccessStatus")
        public String accessStatus;

        @NameInMap("AccessWay")
        public String accessWay;

        @NameInMap("Config")
        public String config;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("FirstScene")
        public String firstScene;

        @NameInMap("KeyWords")
        public String keyWords;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("MediaName")
        public String mediaName;

        @NameInMap("MediaStatus")
        public String mediaStatus;

        @NameInMap("MediaType")
        public String mediaType;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("Os")
        public String os;

        @NameInMap("SecondScene")
        public String secondScene;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Version")
        public Long version;

        public static ModifyMediaResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ModifyMediaResponseBodyModel self = new ModifyMediaResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ModifyMediaResponseBodyModel setAccessStatus(String accessStatus) {
            this.accessStatus = accessStatus;
            return this;
        }
        public String getAccessStatus() {
            return this.accessStatus;
        }

        public ModifyMediaResponseBodyModel setAccessWay(String accessWay) {
            this.accessWay = accessWay;
            return this;
        }
        public String getAccessWay() {
            return this.accessWay;
        }

        public ModifyMediaResponseBodyModel setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ModifyMediaResponseBodyModel setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ModifyMediaResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ModifyMediaResponseBodyModel setFirstScene(String firstScene) {
            this.firstScene = firstScene;
            return this;
        }
        public String getFirstScene() {
            return this.firstScene;
        }

        public ModifyMediaResponseBodyModel setKeyWords(String keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public String getKeyWords() {
            return this.keyWords;
        }

        public ModifyMediaResponseBodyModel setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ModifyMediaResponseBodyModel setMediaName(String mediaName) {
            this.mediaName = mediaName;
            return this;
        }
        public String getMediaName() {
            return this.mediaName;
        }

        public ModifyMediaResponseBodyModel setMediaStatus(String mediaStatus) {
            this.mediaStatus = mediaStatus;
            return this;
        }
        public String getMediaStatus() {
            return this.mediaStatus;
        }

        public ModifyMediaResponseBodyModel setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public ModifyMediaResponseBodyModel setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ModifyMediaResponseBodyModel setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public ModifyMediaResponseBodyModel setSecondScene(String secondScene) {
            this.secondScene = secondScene;
            return this;
        }
        public String getSecondScene() {
            return this.secondScene;
        }

        public ModifyMediaResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ModifyMediaResponseBodyModel setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
