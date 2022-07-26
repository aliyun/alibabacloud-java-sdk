// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetAdvanceConfigResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetAdvanceConfigResponseBodyResult result;

    public static GetAdvanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAdvanceConfigResponseBody self = new GetAdvanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAdvanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAdvanceConfigResponseBody setResult(GetAdvanceConfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetAdvanceConfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetAdvanceConfigResponseBodyResultFiles extends TeaModel {
        @NameInMap("fullPathName")
        public String fullPathName;

        @NameInMap("isDir")
        public Boolean isDir;

        @NameInMap("isTemplate")
        public Boolean isTemplate;

        @NameInMap("name")
        public String name;

        public static GetAdvanceConfigResponseBodyResultFiles build(java.util.Map<String, ?> map) throws Exception {
            GetAdvanceConfigResponseBodyResultFiles self = new GetAdvanceConfigResponseBodyResultFiles();
            return TeaModel.build(map, self);
        }

        public GetAdvanceConfigResponseBodyResultFiles setFullPathName(String fullPathName) {
            this.fullPathName = fullPathName;
            return this;
        }
        public String getFullPathName() {
            return this.fullPathName;
        }

        public GetAdvanceConfigResponseBodyResultFiles setIsDir(Boolean isDir) {
            this.isDir = isDir;
            return this;
        }
        public Boolean getIsDir() {
            return this.isDir;
        }

        public GetAdvanceConfigResponseBodyResultFiles setIsTemplate(Boolean isTemplate) {
            this.isTemplate = isTemplate;
            return this;
        }
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        public GetAdvanceConfigResponseBodyResultFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetAdvanceConfigResponseBodyResult extends TeaModel {
        @NameInMap("desc")
        public String desc;

        @NameInMap("files")
        public java.util.List<GetAdvanceConfigResponseBodyResultFiles> files;

        @NameInMap("name")
        public String name;

        @NameInMap("status")
        public String status;

        @NameInMap("updateTime")
        public String updateTime;

        public static GetAdvanceConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetAdvanceConfigResponseBodyResult self = new GetAdvanceConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetAdvanceConfigResponseBodyResult setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetAdvanceConfigResponseBodyResult setFiles(java.util.List<GetAdvanceConfigResponseBodyResultFiles> files) {
            this.files = files;
            return this;
        }
        public java.util.List<GetAdvanceConfigResponseBodyResultFiles> getFiles() {
            return this.files;
        }

        public GetAdvanceConfigResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAdvanceConfigResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAdvanceConfigResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
