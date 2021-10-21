// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SaveClassificationConditionsResponseBody extends TeaModel {
    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TagName")
    public String tagName;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("InvalidList")
    public java.util.List<SaveClassificationConditionsResponseBodyInvalidList> invalidList;

    public static SaveClassificationConditionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveClassificationConditionsResponseBody self = new SaveClassificationConditionsResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveClassificationConditionsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public SaveClassificationConditionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveClassificationConditionsResponseBody setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public SaveClassificationConditionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SaveClassificationConditionsResponseBody setInvalidList(java.util.List<SaveClassificationConditionsResponseBodyInvalidList> invalidList) {
        this.invalidList = invalidList;
        return this;
    }
    public java.util.List<SaveClassificationConditionsResponseBodyInvalidList> getInvalidList() {
        return this.invalidList;
    }

    public static class SaveClassificationConditionsResponseBodyInvalidList extends TeaModel {
        @NameInMap("ParentCode")
        public String parentCode;

        @NameInMap("OfficialCode")
        public String officialCode;

        @NameInMap("ClassificationName")
        public String classificationName;

        @NameInMap("ClassificationCode")
        public String classificationCode;

        public static SaveClassificationConditionsResponseBodyInvalidList build(java.util.Map<String, ?> map) throws Exception {
            SaveClassificationConditionsResponseBodyInvalidList self = new SaveClassificationConditionsResponseBodyInvalidList();
            return TeaModel.build(map, self);
        }

        public SaveClassificationConditionsResponseBodyInvalidList setParentCode(String parentCode) {
            this.parentCode = parentCode;
            return this;
        }
        public String getParentCode() {
            return this.parentCode;
        }

        public SaveClassificationConditionsResponseBodyInvalidList setOfficialCode(String officialCode) {
            this.officialCode = officialCode;
            return this;
        }
        public String getOfficialCode() {
            return this.officialCode;
        }

        public SaveClassificationConditionsResponseBodyInvalidList setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

        public SaveClassificationConditionsResponseBodyInvalidList setClassificationCode(String classificationCode) {
            this.classificationCode = classificationCode;
            return this;
        }
        public String getClassificationCode() {
            return this.classificationCode;
        }

    }

}
