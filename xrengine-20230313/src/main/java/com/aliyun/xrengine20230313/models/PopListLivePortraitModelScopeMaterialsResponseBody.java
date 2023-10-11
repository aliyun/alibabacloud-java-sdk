// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopListLivePortraitModelScopeMaterialsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("Data")
    public java.util.List<PopListLivePortraitModelScopeMaterialsResponseBodyData> data;

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

    public static PopListLivePortraitModelScopeMaterialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PopListLivePortraitModelScopeMaterialsResponseBody self = new PopListLivePortraitModelScopeMaterialsResponseBody();
        return TeaModel.build(map, self);
    }

    public PopListLivePortraitModelScopeMaterialsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PopListLivePortraitModelScopeMaterialsResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public PopListLivePortraitModelScopeMaterialsResponseBody setData(java.util.List<PopListLivePortraitModelScopeMaterialsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PopListLivePortraitModelScopeMaterialsResponseBodyData> getData() {
        return this.data;
    }

    public PopListLivePortraitModelScopeMaterialsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PopListLivePortraitModelScopeMaterialsResponseBody setPages(Integer pages) {
        this.pages = pages;
        return this;
    }
    public Integer getPages() {
        return this.pages;
    }

    public PopListLivePortraitModelScopeMaterialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PopListLivePortraitModelScopeMaterialsResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public PopListLivePortraitModelScopeMaterialsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PopListLivePortraitModelScopeMaterialsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class PopListLivePortraitModelScopeMaterialsResponseBodyData extends TeaModel {
        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("Ext")
        public String ext;

        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("Id")
        public String id;

        @NameInMap("Intro")
        public String intro;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static PopListLivePortraitModelScopeMaterialsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PopListLivePortraitModelScopeMaterialsResponseBodyData self = new PopListLivePortraitModelScopeMaterialsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PopListLivePortraitModelScopeMaterialsResponseBodyData setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopListLivePortraitModelScopeMaterialsResponseBodyData setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopListLivePortraitModelScopeMaterialsResponseBodyData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public PopListLivePortraitModelScopeMaterialsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PopListLivePortraitModelScopeMaterialsResponseBodyData setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopListLivePortraitModelScopeMaterialsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PopListLivePortraitModelScopeMaterialsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
