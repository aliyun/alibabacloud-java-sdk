// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class ListClothesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("Data")
    public java.util.List<ListClothesResponseBodyData> data;

    @NameInMap("ErrorName")
    public String errorName;

    @NameInMap("HttpCode")
    public Integer httpCode;

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

    public static ListClothesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClothesResponseBody self = new ListClothesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClothesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListClothesResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListClothesResponseBody setData(java.util.List<ListClothesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListClothesResponseBodyData> getData() {
        return this.data;
    }

    public ListClothesResponseBody setErrorName(String errorName) {
        this.errorName = errorName;
        return this;
    }
    public String getErrorName() {
        return this.errorName;
    }

    public ListClothesResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListClothesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListClothesResponseBody setPages(Integer pages) {
        this.pages = pages;
        return this;
    }
    public Integer getPages() {
        return this.pages;
    }

    public ListClothesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClothesResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListClothesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListClothesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListClothesResponseBodyData extends TeaModel {
        @NameInMap("CoverUrl")
        public String coverUrl;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("OssKey")
        public String ossKey;

        @NameInMap("Part")
        public String part;

        @NameInMap("Size")
        public String size;

        @NameInMap("Status")
        public java.util.Map<String, String> status;

        @NameInMap("Type")
        public String type;

        public static ListClothesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListClothesResponseBodyData self = new ListClothesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListClothesResponseBodyData setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public ListClothesResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListClothesResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListClothesResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListClothesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClothesResponseBodyData setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public ListClothesResponseBodyData setPart(String part) {
            this.part = part;
            return this;
        }
        public String getPart() {
            return this.part;
        }

        public ListClothesResponseBodyData setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public ListClothesResponseBodyData setStatus(java.util.Map<String, String> status) {
            this.status = status;
            return this;
        }
        public java.util.Map<String, String> getStatus() {
            return this.status;
        }

        public ListClothesResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
