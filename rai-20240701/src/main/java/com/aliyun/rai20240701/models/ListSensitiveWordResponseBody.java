// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ListSensitiveWordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>00000</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListSensitiveWordResponseBodyData data;

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

    public static ListSensitiveWordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSensitiveWordResponseBody self = new ListSensitiveWordResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSensitiveWordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSensitiveWordResponseBody setData(ListSensitiveWordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSensitiveWordResponseBodyData getData() {
        return this.data;
    }

    public ListSensitiveWordResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSensitiveWordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSensitiveWordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSensitiveWordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSensitiveWordResponseBodyDataSensitiveWordList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>387907</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("Label")
        public String label;

        @NameInMap("Word")
        public String word;

        public static ListSensitiveWordResponseBodyDataSensitiveWordList build(java.util.Map<String, ?> map) throws Exception {
            ListSensitiveWordResponseBodyDataSensitiveWordList self = new ListSensitiveWordResponseBodyDataSensitiveWordList();
            return TeaModel.build(map, self);
        }

        public ListSensitiveWordResponseBodyDataSensitiveWordList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSensitiveWordResponseBodyDataSensitiveWordList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListSensitiveWordResponseBodyDataSensitiveWordList setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class ListSensitiveWordResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("MaxCount")
        public Integer maxCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("SensitiveWordList")
        public java.util.List<ListSensitiveWordResponseBodyDataSensitiveWordList> sensitiveWordList;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSensitiveWordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSensitiveWordResponseBodyData self = new ListSensitiveWordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSensitiveWordResponseBodyData setMaxCount(Integer maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public Integer getMaxCount() {
            return this.maxCount;
        }

        public ListSensitiveWordResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListSensitiveWordResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSensitiveWordResponseBodyData setSensitiveWordList(java.util.List<ListSensitiveWordResponseBodyDataSensitiveWordList> sensitiveWordList) {
            this.sensitiveWordList = sensitiveWordList;
            return this;
        }
        public java.util.List<ListSensitiveWordResponseBodyDataSensitiveWordList> getSensitiveWordList() {
            return this.sensitiveWordList;
        }

        public ListSensitiveWordResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
