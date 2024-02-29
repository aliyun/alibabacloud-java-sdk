// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class ListDigitalHumanMaterialsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("Data")
    public java.util.List<ListDigitalHumanMaterialsResponseBodyData> data;

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

    public static ListDigitalHumanMaterialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDigitalHumanMaterialsResponseBody self = new ListDigitalHumanMaterialsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDigitalHumanMaterialsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDigitalHumanMaterialsResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListDigitalHumanMaterialsResponseBody setData(java.util.List<ListDigitalHumanMaterialsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDigitalHumanMaterialsResponseBodyData> getData() {
        return this.data;
    }

    public ListDigitalHumanMaterialsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDigitalHumanMaterialsResponseBody setPages(Integer pages) {
        this.pages = pages;
        return this;
    }
    public Integer getPages() {
        return this.pages;
    }

    public ListDigitalHumanMaterialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDigitalHumanMaterialsResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListDigitalHumanMaterialsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDigitalHumanMaterialsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListDigitalHumanMaterialsResponseBodyDataComponents extends TeaModel {
        @NameInMap("Ext")
        public String ext;

        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("Files")
        public java.util.Map<String, ?> files;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static ListDigitalHumanMaterialsResponseBodyDataComponents build(java.util.Map<String, ?> map) throws Exception {
            ListDigitalHumanMaterialsResponseBodyDataComponents self = new ListDigitalHumanMaterialsResponseBodyDataComponents();
            return TeaModel.build(map, self);
        }

        public ListDigitalHumanMaterialsResponseBodyDataComponents setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public ListDigitalHumanMaterialsResponseBodyDataComponents setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public ListDigitalHumanMaterialsResponseBodyDataComponents setFiles(java.util.Map<String, ?> files) {
            this.files = files;
            return this;
        }
        public java.util.Map<String, ?> getFiles() {
            return this.files;
        }

        public ListDigitalHumanMaterialsResponseBodyDataComponents setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDigitalHumanMaterialsResponseBodyDataComponents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDigitalHumanMaterialsResponseBodyDataComponents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDigitalHumanMaterialsResponseBodyData extends TeaModel {
        @NameInMap("Components")
        public java.util.List<ListDigitalHumanMaterialsResponseBodyDataComponents> components;

        @NameInMap("Ext")
        public String ext;

        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("Files")
        public java.util.Map<String, ?> files;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("SortOrder")
        public Integer sortOrder;

        @NameInMap("Type")
        public String type;

        public static ListDigitalHumanMaterialsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDigitalHumanMaterialsResponseBodyData self = new ListDigitalHumanMaterialsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDigitalHumanMaterialsResponseBodyData setComponents(java.util.List<ListDigitalHumanMaterialsResponseBodyDataComponents> components) {
            this.components = components;
            return this;
        }
        public java.util.List<ListDigitalHumanMaterialsResponseBodyDataComponents> getComponents() {
            return this.components;
        }

        public ListDigitalHumanMaterialsResponseBodyData setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public ListDigitalHumanMaterialsResponseBodyData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public ListDigitalHumanMaterialsResponseBodyData setFiles(java.util.Map<String, ?> files) {
            this.files = files;
            return this;
        }
        public java.util.Map<String, ?> getFiles() {
            return this.files;
        }

        public ListDigitalHumanMaterialsResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDigitalHumanMaterialsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDigitalHumanMaterialsResponseBodyData setSortOrder(Integer sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }
        public Integer getSortOrder() {
            return this.sortOrder;
        }

        public ListDigitalHumanMaterialsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
