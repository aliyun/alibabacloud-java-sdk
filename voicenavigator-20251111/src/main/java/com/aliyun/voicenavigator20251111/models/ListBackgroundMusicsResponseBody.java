// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListBackgroundMusicsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListBackgroundMusicsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Instance af81a389-91f0-4157-8d82-720edd02b66a
     *  does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>7401D698-0AAC-5909-B68E-88C68805FFB8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListBackgroundMusicsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBackgroundMusicsResponseBody self = new ListBackgroundMusicsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBackgroundMusicsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBackgroundMusicsResponseBody setData(ListBackgroundMusicsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListBackgroundMusicsResponseBodyData getData() {
        return this.data;
    }

    public ListBackgroundMusicsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBackgroundMusicsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBackgroundMusicsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListBackgroundMusicsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListBackgroundMusicsResponseBodyDataBackgroundMusics extends TeaModel {
        /**
         * <p>ID</p>
         * 
         * <strong>example:</strong>
         * <p>3258b551-4847-45fa-bbd8-838d90b90080</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static ListBackgroundMusicsResponseBodyDataBackgroundMusics build(java.util.Map<String, ?> map) throws Exception {
            ListBackgroundMusicsResponseBodyDataBackgroundMusics self = new ListBackgroundMusicsResponseBodyDataBackgroundMusics();
            return TeaModel.build(map, self);
        }

        public ListBackgroundMusicsResponseBodyDataBackgroundMusics setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListBackgroundMusicsResponseBodyDataBackgroundMusics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListBackgroundMusicsResponseBodyData extends TeaModel {
        @NameInMap("BackgroundMusics")
        public java.util.List<ListBackgroundMusicsResponseBodyDataBackgroundMusics> backgroundMusics;

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

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListBackgroundMusicsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBackgroundMusicsResponseBodyData self = new ListBackgroundMusicsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBackgroundMusicsResponseBodyData setBackgroundMusics(java.util.List<ListBackgroundMusicsResponseBodyDataBackgroundMusics> backgroundMusics) {
            this.backgroundMusics = backgroundMusics;
            return this;
        }
        public java.util.List<ListBackgroundMusicsResponseBodyDataBackgroundMusics> getBackgroundMusics() {
            return this.backgroundMusics;
        }

        public ListBackgroundMusicsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListBackgroundMusicsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListBackgroundMusicsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
