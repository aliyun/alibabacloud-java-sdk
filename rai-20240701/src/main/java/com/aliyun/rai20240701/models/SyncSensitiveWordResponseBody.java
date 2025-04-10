// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class SyncSensitiveWordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SyncSensitiveWordResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SyncSensitiveWordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncSensitiveWordResponseBody self = new SyncSensitiveWordResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncSensitiveWordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SyncSensitiveWordResponseBody setData(SyncSensitiveWordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SyncSensitiveWordResponseBodyData getData() {
        return this.data;
    }

    public SyncSensitiveWordResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SyncSensitiveWordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SyncSensitiveWordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncSensitiveWordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SyncSensitiveWordResponseBodyDataSensitiveWordErrorList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ErrMessage")
        public String errMessage;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ErrStatus")
        public Integer errStatus;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
         * <strong>example:</strong>
         * <p>contraband</p>
         */
        @NameInMap("Label")
        public String label;

        @NameInMap("Word")
        public String word;

        public static SyncSensitiveWordResponseBodyDataSensitiveWordErrorList build(java.util.Map<String, ?> map) throws Exception {
            SyncSensitiveWordResponseBodyDataSensitiveWordErrorList self = new SyncSensitiveWordResponseBodyDataSensitiveWordErrorList();
            return TeaModel.build(map, self);
        }

        public SyncSensitiveWordResponseBodyDataSensitiveWordErrorList setErrMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }
        public String getErrMessage() {
            return this.errMessage;
        }

        public SyncSensitiveWordResponseBodyDataSensitiveWordErrorList setErrStatus(Integer errStatus) {
            this.errStatus = errStatus;
            return this;
        }
        public Integer getErrStatus() {
            return this.errStatus;
        }

        public SyncSensitiveWordResponseBodyDataSensitiveWordErrorList setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public SyncSensitiveWordResponseBodyDataSensitiveWordErrorList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public SyncSensitiveWordResponseBodyDataSensitiveWordErrorList setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class SyncSensitiveWordResponseBodyData extends TeaModel {
        @NameInMap("SensitiveWordErrorList")
        public java.util.List<SyncSensitiveWordResponseBodyDataSensitiveWordErrorList> sensitiveWordErrorList;

        public static SyncSensitiveWordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SyncSensitiveWordResponseBodyData self = new SyncSensitiveWordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SyncSensitiveWordResponseBodyData setSensitiveWordErrorList(java.util.List<SyncSensitiveWordResponseBodyDataSensitiveWordErrorList> sensitiveWordErrorList) {
            this.sensitiveWordErrorList = sensitiveWordErrorList;
            return this;
        }
        public java.util.List<SyncSensitiveWordResponseBodyDataSensitiveWordErrorList> getSensitiveWordErrorList() {
            return this.sensitiveWordErrorList;
        }

    }

}
