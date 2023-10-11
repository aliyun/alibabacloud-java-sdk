// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopListFeatureToAvatarMaterialsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("Data")
    public java.util.List<PopListFeatureToAvatarMaterialsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("Pages")
    public Integer pages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static PopListFeatureToAvatarMaterialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PopListFeatureToAvatarMaterialsResponseBody self = new PopListFeatureToAvatarMaterialsResponseBody();
        return TeaModel.build(map, self);
    }

    public PopListFeatureToAvatarMaterialsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PopListFeatureToAvatarMaterialsResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public PopListFeatureToAvatarMaterialsResponseBody setData(java.util.List<PopListFeatureToAvatarMaterialsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PopListFeatureToAvatarMaterialsResponseBodyData> getData() {
        return this.data;
    }

    public PopListFeatureToAvatarMaterialsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PopListFeatureToAvatarMaterialsResponseBody setPages(Integer pages) {
        this.pages = pages;
        return this;
    }
    public Integer getPages() {
        return this.pages;
    }

    public PopListFeatureToAvatarMaterialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PopListFeatureToAvatarMaterialsResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public PopListFeatureToAvatarMaterialsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PopListFeatureToAvatarMaterialsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class PopListFeatureToAvatarMaterialsResponseBodyData extends TeaModel {
        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("Common")
        public Boolean common;

        @NameInMap("CoverUrl")
        public String coverUrl;

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

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static PopListFeatureToAvatarMaterialsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PopListFeatureToAvatarMaterialsResponseBodyData self = new PopListFeatureToAvatarMaterialsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PopListFeatureToAvatarMaterialsResponseBodyData setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public PopListFeatureToAvatarMaterialsResponseBodyData setCommon(Boolean common) {
            this.common = common;
            return this;
        }
        public Boolean getCommon() {
            return this.common;
        }

        public PopListFeatureToAvatarMaterialsResponseBodyData setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopListFeatureToAvatarMaterialsResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PopListFeatureToAvatarMaterialsResponseBodyData setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopListFeatureToAvatarMaterialsResponseBodyData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public PopListFeatureToAvatarMaterialsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PopListFeatureToAvatarMaterialsResponseBodyData setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopListFeatureToAvatarMaterialsResponseBodyData setListStatus(String listStatus) {
            this.listStatus = listStatus;
            return this;
        }
        public String getListStatus() {
            return this.listStatus;
        }

        public PopListFeatureToAvatarMaterialsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PopListFeatureToAvatarMaterialsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
