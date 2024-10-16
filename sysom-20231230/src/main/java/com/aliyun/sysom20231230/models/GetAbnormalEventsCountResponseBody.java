// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAbnormalEventsCountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<GetAbnormalEventsCountResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>result: code=1 msg=(Request failed, status_code != 200)</p>
     */
    @NameInMap("message")
    public String message;

    public static GetAbnormalEventsCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAbnormalEventsCountResponseBody self = new GetAbnormalEventsCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAbnormalEventsCountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAbnormalEventsCountResponseBody setData(java.util.List<GetAbnormalEventsCountResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAbnormalEventsCountResponseBodyData> getData() {
        return this.data;
    }

    public GetAbnormalEventsCountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class GetAbnormalEventsCountResponseBodyData extends TeaModel {
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

        public static GetAbnormalEventsCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAbnormalEventsCountResponseBodyData self = new GetAbnormalEventsCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAbnormalEventsCountResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAbnormalEventsCountResponseBodyData setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

}
