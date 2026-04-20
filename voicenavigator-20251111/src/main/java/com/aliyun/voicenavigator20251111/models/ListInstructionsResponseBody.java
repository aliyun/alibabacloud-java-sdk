// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListInstructionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListInstructionsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>e48e45dd-e47a-4744-a063-f08cbebb1c5a</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListInstructionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstructionsResponseBody self = new ListInstructionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstructionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstructionsResponseBody setData(ListInstructionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInstructionsResponseBodyData getData() {
        return this.data;
    }

    public ListInstructionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListInstructionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstructionsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListInstructionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInstructionsResponseBodyDataInstructions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Transfer00</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>{
         *     &quot;providerId&quot;: &quot;xxxxxxxxx&quot;,
         *     &quot;transferMethod&quot;: &quot;BYE&quot;,
         *     &quot;transferType&quot;: &quot;External&quot;,
         *     &quot;transferTarget&quot;: &quot;152******&quot;,
         *     &quot;transferor&quot;: &quot;01*****&quot;,
         *     &quot;timeoutSeconds&quot;: &quot;10&quot;
         * }</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <strong>example:</strong>
         * <p>36e9a4cd-a821-4f78-86fa-a9a4aefeea2e</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>TRANSFER</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListInstructionsResponseBodyDataInstructions build(java.util.Map<String, ?> map) throws Exception {
            ListInstructionsResponseBodyDataInstructions self = new ListInstructionsResponseBodyDataInstructions();
            return TeaModel.build(map, self);
        }

        public ListInstructionsResponseBodyDataInstructions setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListInstructionsResponseBodyDataInstructions setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListInstructionsResponseBodyDataInstructions setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstructionsResponseBodyDataInstructions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInstructionsResponseBodyDataInstructions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListInstructionsResponseBodyData extends TeaModel {
        @NameInMap("Instructions")
        public java.util.List<ListInstructionsResponseBodyDataInstructions> instructions;

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
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListInstructionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstructionsResponseBodyData self = new ListInstructionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstructionsResponseBodyData setInstructions(java.util.List<ListInstructionsResponseBodyDataInstructions> instructions) {
            this.instructions = instructions;
            return this;
        }
        public java.util.List<ListInstructionsResponseBodyDataInstructions> getInstructions() {
            return this.instructions;
        }

        public ListInstructionsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListInstructionsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListInstructionsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
