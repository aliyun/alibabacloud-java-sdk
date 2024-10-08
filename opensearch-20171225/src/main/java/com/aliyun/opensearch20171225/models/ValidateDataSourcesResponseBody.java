// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ValidateDataSourcesResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8FA2B338-AFDC-46B4-A132-B5487820C2BF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result returned.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("result")
    public java.util.List<ValidateDataSourcesResponseBodyResult> result;

    public static ValidateDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateDataSourcesResponseBody self = new ValidateDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateDataSourcesResponseBody setResult(java.util.List<ValidateDataSourcesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ValidateDataSourcesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ValidateDataSourcesResponseBodyResultDataSource extends TeaModel {
        /**
         * <p>The parameters of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("parameters")
        public java.util.Map<String, ?> parameters;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>user_activity_decision</p>
         */
        @NameInMap("tableName")
        public String tableName;

        /**
         * <p>The type of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("type")
        public String type;

        public static ValidateDataSourcesResponseBodyResultDataSource build(java.util.Map<String, ?> map) throws Exception {
            ValidateDataSourcesResponseBodyResultDataSource self = new ValidateDataSourcesResponseBodyResultDataSource();
            return TeaModel.build(map, self);
        }

        public ValidateDataSourcesResponseBodyResultDataSource setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

        public ValidateDataSourcesResponseBodyResultDataSource setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ValidateDataSourcesResponseBodyResultDataSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ValidateDataSourcesResponseBodyResult extends TeaModel {
        /**
         * <p>The code returned for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEED</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The data source.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("dataSource")
        public ValidateDataSourcesResponseBodyResultDataSource dataSource;

        /**
         * <p>The status of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        @NameInMap("message")
        public String message;

        public static ValidateDataSourcesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ValidateDataSourcesResponseBodyResult self = new ValidateDataSourcesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ValidateDataSourcesResponseBodyResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ValidateDataSourcesResponseBodyResult setDataSource(ValidateDataSourcesResponseBodyResultDataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public ValidateDataSourcesResponseBodyResultDataSource getDataSource() {
            return this.dataSource;
        }

        public ValidateDataSourcesResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
