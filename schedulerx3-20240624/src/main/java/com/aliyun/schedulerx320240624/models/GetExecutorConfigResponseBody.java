// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetExecutorConfigResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The query result.</p>
     */
    @NameInMap("Data")
    public GetExecutorConfigResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>not support query script history, please upgrade engine version to 2.2.2+</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>39938688-0BAB-5AD8-BF02-F4910FAC7589</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetExecutorConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExecutorConfigResponseBody self = new GetExecutorConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExecutorConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetExecutorConfigResponseBody setData(GetExecutorConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetExecutorConfigResponseBodyData getData() {
        return this.data;
    }

    public GetExecutorConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetExecutorConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExecutorConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetExecutorConfigResponseBodyData extends TeaModel {
        /**
         * <p>The default global configuration content for the Data Integration synchronization Solutions node, which specifies the default processing policy for different DDL message types. Example:
         * {&quot;RENAMECOLUMN&quot;:&quot;WARNING&quot;,&quot;DROPTABLE&quot;:&quot;WARNING&quot;,&quot;CREATETABLE&quot;:&quot;WARNING&quot;,&quot;MODIFYCOLUMN&quot;:&quot;WARNING&quot;,&quot;TRUNCATETABLE&quot;:&quot;WARNING&quot;,&quot;DROPCOLUMN&quot;:&quot;WARNING&quot;,&quot;ADDCOLUMN&quot;:&quot;WARNING&quot;,&quot;RENAMETABLE&quot;:&quot;WARNING&quot;}</p>
         * <p>DDL message types:</p>
         * <ul>
         * <li>RENAMECOLUMN: Rename a column.</li>
         * <li>DROPTABLE: Delete a table.</li>
         * <li>CREATETABLE: Create a table.</li>
         * <li>MODIFYCOLUMN: Modify a column type.</li>
         * <li>TRUNCATETABLE: Truncate a table.</li>
         * <li>DROPCOLUMN: Delete a column.</li>
         * <li>ADDCOLUMN: Add a column.</li>
         * <li>RENAMETABLE: Rename a table.</li>
         * </ul>
         * <p>When DataWorks receives a DDL message of the corresponding type, the processing policy is as follows:</p>
         * <ul>
         * <li>WARNING: Discard the message directly and record alerting information in the real-time synchronization log, indicating that the message was discarded due to an execute error.</li>
         * <li>IGNORE: Discard the message directly without sending it to the destination data source.</li>
         * <li>CRITICAL: Set the real-time synchronization node to the error state and stop the node.</li>
         * <li>NORMAL: Forward the message to the destination data source for processing. Because different destination data sources may have a different processing policy for DDL messages, DataWorks only forwards the message.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;cluster&quot;:&quot;c2c619b5129e0400fa3df263b249622aa&quot;,&quot;namespace&quot;:&quot;default&quot;,&quot;service&quot;:&quot;xxljob-http-demo1-svc&quot;}]</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The executor type.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s_service</p>
         */
        @NameInMap("ExecutorType")
        public String executorType;

        public static GetExecutorConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetExecutorConfigResponseBodyData self = new GetExecutorConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetExecutorConfigResponseBodyData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetExecutorConfigResponseBodyData setExecutorType(String executorType) {
            this.executorType = executorType;
            return this;
        }
        public String getExecutorType() {
            return this.executorType;
        }

    }

}
