// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetExecutorConfigResponseBody extends TeaModel {
    /**
     * <p>The status code returned for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The configuration data for the Executor.</p>
     */
    @NameInMap("Data")
    public GetExecutorConfigResponseBodyData data;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>not support query script history, please upgrade engine version to 2.2.2+</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The default global configuration for Data Integration tasks. This configuration specifies the default handling policies for different types of DDL messages. Example:
         * <code>{&quot;RENAMECOLUMN&quot;:&quot;WARNING&quot;,&quot;DROPTABLE&quot;:&quot;WARNING&quot;,&quot;CREATETABLE&quot;:&quot;WARNING&quot;,&quot;MODIFYCOLUMN&quot;:&quot;WARNING&quot;,&quot;TRUNCATETABLE&quot;:&quot;WARNING&quot;,&quot;DROPCOLUMN&quot;:&quot;WARNING&quot;,&quot;ADDCOLUMN&quot;:&quot;WARNING&quot;,&quot;RENAMETABLE&quot;:&quot;WARNING&quot;}</code></p>
         * <p>The DDL message types are as follows:</p>
         * <ul>
         * <li><p>RENAMECOLUMN: <code>RENAME COLUMN</code></p>
         * </li>
         * <li><p>DROPTABLE: <code>DROP TABLE</code></p>
         * </li>
         * <li><p>CREATETABLE: <code>CREATE TABLE</code></p>
         * </li>
         * <li><p>MODIFYCOLUMN: <code>MODIFY COLUMN</code></p>
         * </li>
         * <li><p>TRUNCATETABLE: <code>TRUNCATE TABLE</code></p>
         * </li>
         * <li><p>DROPCOLUMN: <code>DROP COLUMN</code></p>
         * </li>
         * <li><p>ADDCOLUMN: <code>ADD COLUMN</code></p>
         * </li>
         * <li><p>RENAMETABLE: <code>RENAME TABLE</code></p>
         * </li>
         * </ul>
         * <p>When DataWorks receives a DDL message, it applies one of the following handling policies:</p>
         * <ul>
         * <li><p>WARNING: Discards the message and logs a warning in the Real-time Synchronization Task log.</p>
         * </li>
         * <li><p>IGNORE: Discards the message without sending it to the Destination Data Source.</p>
         * </li>
         * <li><p>CRITICAL: Causes the Real-time Synchronization Task to fail.</p>
         * </li>
         * <li><p>NORMAL: Forwards the message to the Destination Data Source. Because handling of DDL messages can vary by Destination Data Source, DataWorks only forwards the message.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;cluster&quot;:&quot;c2c619b5129e0400fa3df263b249622aa&quot;,&quot;namespace&quot;:&quot;default&quot;,&quot;service&quot;:&quot;xxljob-http-demo1-svc&quot;}]</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The type of the Executor.</p>
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
