// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopListCommonMaterialsAllResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<PopListCommonMaterialsAllResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PopListCommonMaterialsAllResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PopListCommonMaterialsAllResponseBody self = new PopListCommonMaterialsAllResponseBody();
        return TeaModel.build(map, self);
    }

    public PopListCommonMaterialsAllResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PopListCommonMaterialsAllResponseBody setData(java.util.List<PopListCommonMaterialsAllResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PopListCommonMaterialsAllResponseBodyData> getData() {
        return this.data;
    }

    public PopListCommonMaterialsAllResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PopListCommonMaterialsAllResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PopListCommonMaterialsAllResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PopListCommonMaterialsAllResponseBodyData extends TeaModel {
        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("Common")
        public Boolean common;

        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Ext")
        public String ext;

        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("Id")
        public String id;

        @NameInMap("Intro")
        public String intro;

        @NameInMap("ListStatus")
        public String listStatus;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("PreviewUrl")
        public String previewUrl;

        @NameInMap("Type")
        public String type;

        public static PopListCommonMaterialsAllResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PopListCommonMaterialsAllResponseBodyData self = new PopListCommonMaterialsAllResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PopListCommonMaterialsAllResponseBodyData setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public PopListCommonMaterialsAllResponseBodyData setCommon(Boolean common) {
            this.common = common;
            return this;
        }
        public Boolean getCommon() {
            return this.common;
        }

        public PopListCommonMaterialsAllResponseBodyData setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopListCommonMaterialsAllResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public PopListCommonMaterialsAllResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListCommonMaterialsAllResponseBodyData setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopListCommonMaterialsAllResponseBodyData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public PopListCommonMaterialsAllResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PopListCommonMaterialsAllResponseBodyData setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopListCommonMaterialsAllResponseBodyData setListStatus(String listStatus) {
            this.listStatus = listStatus;
            return this;
        }
        public String getListStatus() {
            return this.listStatus;
        }

        public PopListCommonMaterialsAllResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public PopListCommonMaterialsAllResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PopListCommonMaterialsAllResponseBodyData setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public PopListCommonMaterialsAllResponseBodyData setPreviewUrl(String previewUrl) {
            this.previewUrl = previewUrl;
            return this;
        }
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        public PopListCommonMaterialsAllResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
