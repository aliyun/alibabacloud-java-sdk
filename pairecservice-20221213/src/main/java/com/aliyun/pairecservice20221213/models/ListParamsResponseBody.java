// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListParamsResponseBody extends TeaModel {
    @NameInMap("Params")
    public java.util.List<ListParamsResponseBodyParams> params;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Environment")
        public String environment;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParamId")
        public String paramId;

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
