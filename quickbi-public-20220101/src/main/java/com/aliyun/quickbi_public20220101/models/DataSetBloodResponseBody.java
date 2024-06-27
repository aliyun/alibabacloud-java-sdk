// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DataSetBloodResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>46e537a5****,3dadsu****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DataSetBloodResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DataSetBloodResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DataSetBloodResponseBody self = new DataSetBloodResponseBody();
        return TeaModel.build(map, self);
    }

    public DataSetBloodResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DataSetBloodResponseBody setResult(java.util.List<DataSetBloodResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DataSetBloodResponseBodyResult> getResult() {
        return this.result;
    }

    public DataSetBloodResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DataSetBloodResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ccd3428c-<strong><strong>-</strong></strong>-a608-26bae29dffee</p>
         */
        @NameInMap("WorksId")
        public String worksId;

        /**
         * <strong>example:</strong>
         * <p>PAGE</p>
         */
        @NameInMap("WorksType")
        public String worksType;

        public static DataSetBloodResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DataSetBloodResponseBodyResult self = new DataSetBloodResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DataSetBloodResponseBodyResult setWorksId(String worksId) {
            this.worksId = worksId;
            return this;
        }
        public String getWorksId() {
            return this.worksId;
        }

        public DataSetBloodResponseBodyResult setWorksType(String worksType) {
            this.worksType = worksType;
            return this;
        }
        public String getWorksType() {
            return this.worksType;
        }

    }

}
