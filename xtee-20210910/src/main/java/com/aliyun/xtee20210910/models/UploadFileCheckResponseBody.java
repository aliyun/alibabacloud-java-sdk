// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UploadFileCheckResponseBody extends TeaModel {
    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned object</p>
     */
    @NameInMap("resultObject")
    public UploadFileCheckResponseBodyResultObject resultObject;

    public static UploadFileCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadFileCheckResponseBody self = new UploadFileCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadFileCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadFileCheckResponseBody setResultObject(UploadFileCheckResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public UploadFileCheckResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class UploadFileCheckResponseBodyResultObject extends TeaModel {
        /**
         * <p>Number of effective rows</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("effectiveNumber")
        public Integer effectiveNumber;

        /**
         * <p>Valid sample data</p>
         */
        @NameInMap("resultList")
        public java.util.List<String> resultList;

        /**
         * <p>Total number of rows</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("totalNumber")
        public Integer totalNumber;

        public static UploadFileCheckResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            UploadFileCheckResponseBodyResultObject self = new UploadFileCheckResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public UploadFileCheckResponseBodyResultObject setEffectiveNumber(Integer effectiveNumber) {
            this.effectiveNumber = effectiveNumber;
            return this;
        }
        public Integer getEffectiveNumber() {
            return this.effectiveNumber;
        }

        public UploadFileCheckResponseBodyResultObject setResultList(java.util.List<String> resultList) {
            this.resultList = resultList;
            return this;
        }
        public java.util.List<String> getResultList() {
            return this.resultList;
        }

        public UploadFileCheckResponseBodyResultObject setTotalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

    }

}
