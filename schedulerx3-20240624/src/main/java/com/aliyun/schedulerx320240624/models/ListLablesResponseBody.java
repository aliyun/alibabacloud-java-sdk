// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListLablesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public java.util.List<ListLablesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>Parameter check error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9079A828-9138-50F1-801E-F2BC3D222A06</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListLablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLablesResponseBody self = new ListLablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLablesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListLablesResponseBody setData(java.util.List<ListLablesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListLablesResponseBodyData> getData() {
        return this.data;
    }

    public ListLablesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLablesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDesignated")
        public Boolean isDesignated;

        /**
         * <strong>example:</strong>
         * <p>gray</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Size")
        public Integer size;

        public static ListLablesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLablesResponseBodyData self = new ListLablesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLablesResponseBodyData setIsDesignated(Boolean isDesignated) {
            this.isDesignated = isDesignated;
            return this;
        }
        public Boolean getIsDesignated() {
            return this.isDesignated;
        }

        public ListLablesResponseBodyData setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListLablesResponseBodyData setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public ListLablesResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

    }

}
