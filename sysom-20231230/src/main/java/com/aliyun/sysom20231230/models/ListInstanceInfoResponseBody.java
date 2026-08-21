// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListInstanceInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListInstanceInfoResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>U+w1wv2R4ZWR5oZLXD0+Dp4dD+2BRJj42DLT6GrZysw=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListInstanceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceInfoResponseBody self = new ListInstanceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstanceInfoResponseBody setData(java.util.List<ListInstanceInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListInstanceInfoResponseBodyData> getData() {
        return this.data;
    }

    public ListInstanceInfoResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInstanceInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstanceInfoResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInstanceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInstanceInfoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>sysom</p>
         */
        @NameInMap("infoKey")
        public String infoKey;

        /**
         * <strong>example:</strong>
         * <p>instance_tag</p>
         */
        @NameInMap("infoType")
        public String infoType;

        /**
         * <strong>example:</strong>
         * <p>diagnosis</p>
         */
        @NameInMap("infoValue")
        public String infoValue;

        public static ListInstanceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceInfoResponseBodyData self = new ListInstanceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstanceInfoResponseBodyData setInfoKey(String infoKey) {
            this.infoKey = infoKey;
            return this;
        }
        public String getInfoKey() {
            return this.infoKey;
        }

        public ListInstanceInfoResponseBodyData setInfoType(String infoType) {
            this.infoType = infoType;
            return this;
        }
        public String getInfoType() {
            return this.infoType;
        }

        public ListInstanceInfoResponseBodyData setInfoValue(String infoValue) {
            this.infoValue = infoValue;
            return this;
        }
        public String getInfoValue() {
            return this.infoValue;
        }

    }

}
