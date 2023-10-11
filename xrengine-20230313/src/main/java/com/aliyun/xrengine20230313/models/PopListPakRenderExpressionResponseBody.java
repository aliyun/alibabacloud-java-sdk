// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopListPakRenderExpressionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("Data")
    public java.util.List<PopListPakRenderExpressionResponseBodyData> data;

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

    public static PopListPakRenderExpressionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PopListPakRenderExpressionResponseBody self = new PopListPakRenderExpressionResponseBody();
        return TeaModel.build(map, self);
    }

    public PopListPakRenderExpressionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PopListPakRenderExpressionResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public PopListPakRenderExpressionResponseBody setData(java.util.List<PopListPakRenderExpressionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PopListPakRenderExpressionResponseBodyData> getData() {
        return this.data;
    }

    public PopListPakRenderExpressionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PopListPakRenderExpressionResponseBody setPages(Integer pages) {
        this.pages = pages;
        return this;
    }
    public Integer getPages() {
        return this.pages;
    }

    public PopListPakRenderExpressionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PopListPakRenderExpressionResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public PopListPakRenderExpressionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PopListPakRenderExpressionResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class PopListPakRenderExpressionResponseBodyData extends TeaModel {
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

        public static PopListPakRenderExpressionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PopListPakRenderExpressionResponseBodyData self = new PopListPakRenderExpressionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PopListPakRenderExpressionResponseBodyData setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public PopListPakRenderExpressionResponseBodyData setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public PopListPakRenderExpressionResponseBodyData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public PopListPakRenderExpressionResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PopListPakRenderExpressionResponseBodyData setIntro(String intro) {
            this.intro = intro;
            return this;
        }
        public String getIntro() {
            return this.intro;
        }

        public PopListPakRenderExpressionResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
