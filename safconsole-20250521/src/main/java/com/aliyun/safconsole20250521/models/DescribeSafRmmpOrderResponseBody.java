// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeSafRmmpOrderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>4A91D2D1-AEC9-1658-ABCE-5A39DE66A5C2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public DescribeSafRmmpOrderResponseBodyResultObject resultObject;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeSafRmmpOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSafRmmpOrderResponseBody self = new DescribeSafRmmpOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSafRmmpOrderResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeSafRmmpOrderResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeSafRmmpOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSafRmmpOrderResponseBody setResultObject(DescribeSafRmmpOrderResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeSafRmmpOrderResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public DescribeSafRmmpOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSafRmmpOrderResponseBodyResultObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Accessible")
        public Boolean accessible;

        public static DescribeSafRmmpOrderResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSafRmmpOrderResponseBodyResultObject self = new DescribeSafRmmpOrderResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeSafRmmpOrderResponseBodyResultObject setAccessible(Boolean accessible) {
            this.accessible = accessible;
            return this;
        }
        public Boolean getAccessible() {
            return this.accessible;
        }

    }

}
