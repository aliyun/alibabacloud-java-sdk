// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CreateMediaResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public CreateMediaResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaResponseBody self = new CreateMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMediaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMediaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMediaResponseBody setModel(CreateMediaResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public CreateMediaResponseBodyModel getModel() {
        return this.model;
    }

    public CreateMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMediaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateMediaResponseBodyModel extends TeaModel {
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

        public static CreateMediaResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            CreateMediaResponseBodyModel self = new CreateMediaResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public CreateMediaResponseBodyModel setAccessStatus(String accessStatus) {
            this.accessStatus = accessStatus;
            return this;
        }
        public String getAccessStatus() {
            return this.accessStatus;
        }

        public CreateMediaResponseBodyModel setAccessWay(String accessWay) {
            this.accessWay = accessWay;
            return this;
        }
        public String getAccessWay() {
            return this.accessWay;
        }

        public CreateMediaResponseBodyModel setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public CreateMediaResponseBodyModel setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateMediaResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public CreateMediaResponseBodyModel setFirstScene(String firstScene) {
            this.firstScene = firstScene;
            return this;
        }
        public String getFirstScene() {
            return this.firstScene;
        }

        public CreateMediaResponseBodyModel setKeyWords(String keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public String getKeyWords() {
            return this.keyWords;
        }

        public CreateMediaResponseBodyModel setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public CreateMediaResponseBodyModel setMediaName(String mediaName) {
            this.mediaName = mediaName;
            return this;
        }
        public String getMediaName() {
            return this.mediaName;
        }

        public CreateMediaResponseBodyModel setMediaStatus(String mediaStatus) {
            this.mediaStatus = mediaStatus;
            return this;
        }
        public String getMediaStatus() {
            return this.mediaStatus;
        }

        public CreateMediaResponseBodyModel setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public CreateMediaResponseBodyModel setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public CreateMediaResponseBodyModel setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public CreateMediaResponseBodyModel setSecondScene(String secondScene) {
            this.secondScene = secondScene;
            return this;
        }
        public String getSecondScene() {
            return this.secondScene;
        }

        public CreateMediaResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public CreateMediaResponseBodyModel setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
