// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadNumGroupTotalResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ReadNumGroupTotalResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ReadNumGroupTotalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadNumGroupTotalResponseBody self = new ReadNumGroupTotalResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadNumGroupTotalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReadNumGroupTotalResponseBody setData(java.util.List<ReadNumGroupTotalResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ReadNumGroupTotalResponseBodyData> getData() {
        return this.data;
    }

    public ReadNumGroupTotalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReadNumGroupTotalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReadNumGroupTotalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReadNumGroupTotalResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("ReadCount")
        public Long readCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("UnReadCount")
        public Long unReadCount;

        public static ReadNumGroupTotalResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReadNumGroupTotalResponseBodyData self = new ReadNumGroupTotalResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReadNumGroupTotalResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ReadNumGroupTotalResponseBodyData setReadCount(Long readCount) {
            this.readCount = readCount;
            return this;
        }
        public Long getReadCount() {
            return this.readCount;
        }

        public ReadNumGroupTotalResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ReadNumGroupTotalResponseBodyData setUnReadCount(Long unReadCount) {
            this.unReadCount = unReadCount;
            return this;
        }
        public Long getUnReadCount() {
            return this.unReadCount;
        }

    }

}
