// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryLlmCubeWithThemeListByUserIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2EE822B***************F-F5B42DDADC12</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryLlmCubeWithThemeListByUserIdResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryLlmCubeWithThemeListByUserIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLlmCubeWithThemeListByUserIdResponseBody self = new QueryLlmCubeWithThemeListByUserIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLlmCubeWithThemeListByUserIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLlmCubeWithThemeListByUserIdResponseBody setResult(QueryLlmCubeWithThemeListByUserIdResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryLlmCubeWithThemeListByUserIdResponseBodyResult getResult() {
        return this.result;
    }

    public QueryLlmCubeWithThemeListByUserIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryLlmCubeWithThemeListByUserIdResponseBodyResult extends TeaModel {
        @NameInMap("CubeIds")
        public java.util.Map<String, String> cubeIds;

        @NameInMap("ThemeIds")
        public java.util.Map<String, String> themeIds;

        public static QueryLlmCubeWithThemeListByUserIdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLlmCubeWithThemeListByUserIdResponseBodyResult self = new QueryLlmCubeWithThemeListByUserIdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLlmCubeWithThemeListByUserIdResponseBodyResult setCubeIds(java.util.Map<String, String> cubeIds) {
            this.cubeIds = cubeIds;
            return this;
        }
        public java.util.Map<String, String> getCubeIds() {
            return this.cubeIds;
        }

        public QueryLlmCubeWithThemeListByUserIdResponseBodyResult setThemeIds(java.util.Map<String, String> themeIds) {
            this.themeIds = themeIds;
            return this;
        }
        public java.util.Map<String, String> getThemeIds() {
            return this.themeIds;
        }

    }

}
