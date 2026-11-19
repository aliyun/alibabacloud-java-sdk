// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryLlmCubeWithThemeListByUserIdResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2EE822B***************F-F5B42DDADC12</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of datasets and analysis themes.</p>
     */
    @NameInMap("Result")
    public QueryLlmCubeWithThemeListByUserIdResponseBodyResult result;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request is successful.</li>
     * <li>false: The request fails.</li>
     * </ul>
     * 
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
        /**
         * <p>The dataset map.</p>
         * <ul>
         * <li>key: The dataset ID.</li>
         * <li>value: The dataset name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;4d93****<em><strong>0-9614-c97adea37911&quot;:&quot;common</strong></em>value&quot;}</p>
         */
        @NameInMap("CubeIds")
        public java.util.Map<String, String> cubeIds;

        /**
         * <p>The analysis theme map.</p>
         * <ul>
         * <li>key: The analysis theme ID. </li>
         * <li>value: The analysis theme name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;9aefb3***<em><strong><strong><strong><strong>75abecbe&quot;:&quot;www</strong></strong></strong></strong></em>eeee&quot;}</p>
         */
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
