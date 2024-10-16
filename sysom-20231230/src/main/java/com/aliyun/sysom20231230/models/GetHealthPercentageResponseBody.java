// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetHealthPercentageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SysomOpenAPI.ServerError</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<GetHealthPercentageResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("message")
    public String message;

    public static GetHealthPercentageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHealthPercentageResponseBody self = new GetHealthPercentageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHealthPercentageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHealthPercentageResponseBody setData(java.util.List<GetHealthPercentageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetHealthPercentageResponseBodyData> getData() {
        return this.data;
    }

    public GetHealthPercentageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class GetHealthPercentageResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>health</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("value")
        public Long value;

        public static GetHealthPercentageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHealthPercentageResponseBodyData self = new GetHealthPercentageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHealthPercentageResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHealthPercentageResponseBodyData setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

}
