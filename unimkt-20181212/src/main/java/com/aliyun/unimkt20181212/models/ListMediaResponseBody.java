// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ListMediaResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<ListMediaResponseBodyModel> model;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    public static ListMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMediaResponseBody self = new ListMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMediaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMediaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMediaResponseBody setModel(java.util.List<ListMediaResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<ListMediaResponseBodyModel> getModel() {
        return this.model;
    }

    public ListMediaResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMediaResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMediaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMediaResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListMediaResponseBodyModel extends TeaModel {
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

        public static ListMediaResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            ListMediaResponseBodyModel self = new ListMediaResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public ListMediaResponseBodyModel setAccessStatus(String accessStatus) {
            this.accessStatus = accessStatus;
            return this;
        }
        public String getAccessStatus() {
            return this.accessStatus;
        }

        public ListMediaResponseBodyModel setAccessWay(String accessWay) {
            this.accessWay = accessWay;
            return this;
        }
        public String getAccessWay() {
            return this.accessWay;
        }

        public ListMediaResponseBodyModel setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListMediaResponseBodyModel setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListMediaResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ListMediaResponseBodyModel setFirstScene(String firstScene) {
            this.firstScene = firstScene;
            return this;
        }
        public String getFirstScene() {
            return this.firstScene;
        }

        public ListMediaResponseBodyModel setKeyWords(String keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public String getKeyWords() {
            return this.keyWords;
        }

        public ListMediaResponseBodyModel setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListMediaResponseBodyModel setMediaName(String mediaName) {
            this.mediaName = mediaName;
            return this;
        }
        public String getMediaName() {
            return this.mediaName;
        }

        public ListMediaResponseBodyModel setMediaStatus(String mediaStatus) {
            this.mediaStatus = mediaStatus;
            return this;
        }
        public String getMediaStatus() {
            return this.mediaStatus;
        }

        public ListMediaResponseBodyModel setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public ListMediaResponseBodyModel setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListMediaResponseBodyModel setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public ListMediaResponseBodyModel setSecondScene(String secondScene) {
            this.secondScene = secondScene;
            return this;
        }
        public String getSecondScene() {
            return this.secondScene;
        }

        public ListMediaResponseBodyModel setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListMediaResponseBodyModel setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
