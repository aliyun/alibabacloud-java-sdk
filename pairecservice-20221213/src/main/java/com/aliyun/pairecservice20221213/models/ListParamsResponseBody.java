// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListParamsResponseBody extends TeaModel {
    /**
     * <p>A list of parameters.</p>
     */
    @NameInMap("Params")
    public java.util.List<ListParamsResponseBodyParams> params;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A2D07551-38DA-531E-9B22-877D1D86A579</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListParamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListParamsResponseBody self = new ListParamsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListParamsResponseBody setParams(java.util.List<ListParamsResponseBodyParams> params) {
        this.params = params;
        return this;
    }
    public java.util.List<ListParamsResponseBodyParams> getParams() {
        return this.params;
    }

    public ListParamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListParamsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListParamsResponseBodyParams extends TeaModel {
        /**
         * <p>The environment to which the parameter belongs. Valid values:</p>
         * <ul>
         * <li><p>Daily: A test environment for daily use.</p>
         * </li>
         * <li><p>Prepub: A staging environment that mirrors the production environment.</p>
         * </li>
         * <li><p>Product: The production environment.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        @NameInMap("Environment")
        public String environment;

        /**
         * <p>The time when the parameter was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>home</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ParamId")
        public String paramId;

        /**
         * <p>The parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>house</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListParamsResponseBodyParams build(java.util.Map<String, ?> map) throws Exception {
            ListParamsResponseBodyParams self = new ListParamsResponseBodyParams();
            return TeaModel.build(map, self);
        }

        public ListParamsResponseBodyParams setEnvironment(String environment) {
            this.environment = environment;
            return this;
        }
        public String getEnvironment() {
            return this.environment;
        }

        public ListParamsResponseBodyParams setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListParamsResponseBodyParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListParamsResponseBodyParams setParamId(String paramId) {
            this.paramId = paramId;
            return this;
        }
        public String getParamId() {
            return this.paramId;
        }

        public ListParamsResponseBodyParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
