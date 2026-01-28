// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class CreateDatasourceResponseBody extends TeaModel {
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
    public CreateDatasourceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>3835AA29-2298-5434-BC53-9CC377CDFD2C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateDatasourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasourceResponseBody self = new CreateDatasourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDatasourceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateDatasourceResponseBody setData(CreateDatasourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDatasourceResponseBodyData getData() {
        return this.data;
    }

    public CreateDatasourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDatasourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDatasourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateDatasourceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DatasourceId")
        public Long datasourceId;

        public static CreateDatasourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasourceResponseBodyData self = new CreateDatasourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDatasourceResponseBodyData setDatasourceId(Long datasourceId) {
            this.datasourceId = datasourceId;
            return this;
        }
        public Long getDatasourceId() {
            return this.datasourceId;
        }

    }

}
