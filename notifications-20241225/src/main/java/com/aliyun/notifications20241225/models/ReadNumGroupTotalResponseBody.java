// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadNumGroupTotalResponseBody extends TeaModel {
    /**
     * <p>The error code returned when the call fails. For more information, see Error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The execution result.</p>
     */
    @NameInMap("Data")
    public java.util.List<ReadNumGroupTotalResponseBodyData> data;

    /**
     * <p>The error message returned when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A5F62766-1C2F-1F56-A39D-63E3D30F0633</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values: true and false. true: The call was successful. false: The call failed.</p>
     * 
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
        /**
         * <p>The group code.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GroupCode")
        public String groupCode;

        /**
         * <p>The message category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The number of read messages under the category.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReadCount")
        public Long readCount;

        /**
         * <p>The total number of messages under the category.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>The number of unread messages under the category.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UnReadCount")
        public Long unReadCount;

        public static ReadNumGroupTotalResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReadNumGroupTotalResponseBodyData self = new ReadNumGroupTotalResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReadNumGroupTotalResponseBodyData setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
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
