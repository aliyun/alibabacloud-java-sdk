// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryMediaResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryMediaResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaResponseBody self = new QueryMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMediaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMediaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMediaResponseBody setModel(QueryMediaResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryMediaResponseBodyModel getModel() {
        return this.model;
    }

    public QueryMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMediaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMediaResponseBodyModel extends TeaModel {
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

        public static QueryMediaResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaResponseBodyModel self = new QueryMediaResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryMediaResponseBodyModel setAccessStatus(String accessStatus) {
            this.accessStatus = accessStatus;
            return this;
        }
        public String getAccessStatus() {
            return this.accessStatus;
        }

        public QueryMediaResponseBodyModel setAccessWay(String accessWay) {
            this.accessWay = accessWay;
            return this;
        }
        public String getAccessWay() {
            return this.accessWay;
        }

        public QueryMediaResponseBodyModel setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public QueryMediaResponseBodyModel setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryMediaResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public QueryMediaResponseBodyModel setFirstScene(String firstScene) {
            this.firstScene = firstScene;
            return this;
        }
        public String getFirstScene() {
            return this.firstScene;
        }

        public QueryMediaResponseBodyModel setKeyWords(String keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public String getKeyWords() {
            return this.keyWords;
        }

        public QueryMediaResponseBodyModel setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public QueryMediaResponseBodyModel setMediaName(String mediaName) {
            this.mediaName = mediaName;
            return this;
        }
        public String getMediaName() {
            return this.mediaName;
        }

        public QueryMediaResponseBodyModel setMediaStatus(String mediaStatus) {
            this.mediaStatus = mediaStatus;
            return this;
        }
        public String getMediaStatus() {
            return this.mediaStatus;
        }

        public QueryMediaResponseBodyModel setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public QueryMediaResponseBodyModel setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public QueryMediaResponseBodyModel setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public QueryMediaResponseBodyModel setSecondScene(String secondScene) {
            this.secondScene = secondScene;
            return this;
        }
        public String getSecondScene() {
            return this.secondScene;
        }

        public QueryMediaResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryMediaResponseBodyModel setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
