// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class SearchProjectsByRegionResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<SearchProjectsByRegionResponseBodyData> data;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static SearchProjectsByRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchProjectsByRegionResponseBody self = new SearchProjectsByRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchProjectsByRegionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchProjectsByRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchProjectsByRegionResponseBody setData(java.util.List<SearchProjectsByRegionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SearchProjectsByRegionResponseBodyData> getData() {
        return this.data;
    }

    public SearchProjectsByRegionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SearchProjectsByRegionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchProjectsByRegionResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("AoneType")
        public String aoneType;

        @NameInMap("Stamp")
        public String stamp;

        @NameInMap("FullName")
        public String fullName;

        @NameInMap("Icons")
        public java.util.List<String> icons;

        @NameInMap("IdPath")
        public String idPath;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("AoneId")
        public Integer aoneId;

        @NameInMap("ParentId")
        public Integer parentId;

        @NameInMap("Description")
        public String description;

        @NameInMap("CustomFieldMap")
        public java.util.List<String> customFieldMap;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Integer id;

        public static SearchProjectsByRegionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchProjectsByRegionResponseBodyData self = new SearchProjectsByRegionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchProjectsByRegionResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SearchProjectsByRegionResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SearchProjectsByRegionResponseBodyData setAoneType(String aoneType) {
            this.aoneType = aoneType;
            return this;
        }
        public String getAoneType() {
            return this.aoneType;
        }

        public SearchProjectsByRegionResponseBodyData setStamp(String stamp) {
            this.stamp = stamp;
            return this;
        }
        public String getStamp() {
            return this.stamp;
        }

        public SearchProjectsByRegionResponseBodyData setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public SearchProjectsByRegionResponseBodyData setIcons(java.util.List<String> icons) {
            this.icons = icons;
            return this;
        }
        public java.util.List<String> getIcons() {
            return this.icons;
        }

        public SearchProjectsByRegionResponseBodyData setIdPath(String idPath) {
            this.idPath = idPath;
            return this;
        }
        public String getIdPath() {
            return this.idPath;
        }

        public SearchProjectsByRegionResponseBodyData setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public SearchProjectsByRegionResponseBodyData setAoneId(Integer aoneId) {
            this.aoneId = aoneId;
            return this;
        }
        public Integer getAoneId() {
            return this.aoneId;
        }

        public SearchProjectsByRegionResponseBodyData setParentId(Integer parentId) {
            this.parentId = parentId;
            return this;
        }
        public Integer getParentId() {
            return this.parentId;
        }

        public SearchProjectsByRegionResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchProjectsByRegionResponseBodyData setCustomFieldMap(java.util.List<String> customFieldMap) {
            this.customFieldMap = customFieldMap;
            return this;
        }
        public java.util.List<String> getCustomFieldMap() {
            return this.customFieldMap;
        }

        public SearchProjectsByRegionResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchProjectsByRegionResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
