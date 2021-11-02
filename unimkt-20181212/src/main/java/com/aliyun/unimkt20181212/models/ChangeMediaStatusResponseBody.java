// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ChangeMediaStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public ChangeMediaStatusResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ChangeMediaStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeMediaStatusResponseBody self = new ChangeMediaStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeMediaStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ChangeMediaStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChangeMediaStatusResponseBody setModel(ChangeMediaStatusResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public ChangeMediaStatusResponseBodyModel getModel() {
        return this.model;
    }

    public ChangeMediaStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeMediaStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ChangeMediaStatusResponseBodyModel extends TeaModel {
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

        public static ChangeMediaStatusResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ChangeMediaStatusResponseBodyModel self = new ChangeMediaStatusResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ChangeMediaStatusResponseBodyModel setAccessStatus(String accessStatus) {
            this.accessStatus = accessStatus;
            return this;
        }
        public String getAccessStatus() {
            return this.accessStatus;
        }

        public ChangeMediaStatusResponseBodyModel setAccessWay(String accessWay) {
            this.accessWay = accessWay;
            return this;
        }
        public String getAccessWay() {
            return this.accessWay;
        }

        public ChangeMediaStatusResponseBodyModel setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ChangeMediaStatusResponseBodyModel setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ChangeMediaStatusResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ChangeMediaStatusResponseBodyModel setFirstScene(String firstScene) {
            this.firstScene = firstScene;
            return this;
        }
        public String getFirstScene() {
            return this.firstScene;
        }

        public ChangeMediaStatusResponseBodyModel setKeyWords(String keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public String getKeyWords() {
            return this.keyWords;
        }

        public ChangeMediaStatusResponseBodyModel setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ChangeMediaStatusResponseBodyModel setMediaName(String mediaName) {
            this.mediaName = mediaName;
            return this;
        }
        public String getMediaName() {
            return this.mediaName;
        }

        public ChangeMediaStatusResponseBodyModel setMediaStatus(String mediaStatus) {
            this.mediaStatus = mediaStatus;
            return this;
        }
        public String getMediaStatus() {
            return this.mediaStatus;
        }

        public ChangeMediaStatusResponseBodyModel setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public ChangeMediaStatusResponseBodyModel setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ChangeMediaStatusResponseBodyModel setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public ChangeMediaStatusResponseBodyModel setSecondScene(String secondScene) {
            this.secondScene = secondScene;
            return this;
        }
        public String getSecondScene() {
            return this.secondScene;
        }

        public ChangeMediaStatusResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ChangeMediaStatusResponseBodyModel setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
