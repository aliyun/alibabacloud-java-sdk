// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDatasetSwitchInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryDatasetSwitchInfoResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDatasetSwitchInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetSwitchInfoResponseBody self = new QueryDatasetSwitchInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDatasetSwitchInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDatasetSwitchInfoResponseBody setResult(QueryDatasetSwitchInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryDatasetSwitchInfoResponseBodyResult getResult() {
        return this.result;
    }

    public QueryDatasetSwitchInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDatasetSwitchInfoResponseBodyResult extends TeaModel {
        @NameInMap("CubeId")
        public String cubeId;

        @NameInMap("IsOpenColumnLevelPermission")
        public Integer isOpenColumnLevelPermission;

        @NameInMap("IsOpenRowLevelPermission")
        public Integer isOpenRowLevelPermission;

        public static QueryDatasetSwitchInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryDatasetSwitchInfoResponseBodyResult self = new QueryDatasetSwitchInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryDatasetSwitchInfoResponseBodyResult setCubeId(String cubeId) {
            this.cubeId = cubeId;
            return this;
        }
        public String getCubeId() {
            return this.cubeId;
        }

        public QueryDatasetSwitchInfoResponseBodyResult setIsOpenColumnLevelPermission(Integer isOpenColumnLevelPermission) {
            this.isOpenColumnLevelPermission = isOpenColumnLevelPermission;
            return this;
        }
        public Integer getIsOpenColumnLevelPermission() {
            return this.isOpenColumnLevelPermission;
        }

        public QueryDatasetSwitchInfoResponseBodyResult setIsOpenRowLevelPermission(Integer isOpenRowLevelPermission) {
            this.isOpenRowLevelPermission = isOpenRowLevelPermission;
            return this;
        }
        public Integer getIsOpenRowLevelPermission() {
            return this.isOpenRowLevelPermission;
        }

    }

}
